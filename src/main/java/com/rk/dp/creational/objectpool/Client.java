package com.rk.dp.creational.objectpool;

import java.util.function.Supplier;

public class Client {
    
    private static final String userName = "postgres";
    private static final String password = "root";
    private static final String url = "jdbc://localhost:5432/am_txnx";
    
    public static void main(String []args) {
        Supplier<Connection> connectionSupplier = () -> {
            return new Connection(url,userName,password);
            };
        
        ConnectionPool<Connection> connectionPool = new ConnectionPool<>(connectionSupplier, 5);
        
        for(int i=0;i<6;i++) {
            Connection con1 = connectionPool.getObject();
            if(con1 == null) {
                System.out.println("No connection available in the pool");
                return;
            }
            con1.executeQuery("Query "+i);
            System.out.println("Executed query "+con1.getCachedQuery());
            connectionPool.release(con1);
            System.out.println("Available connection "+connectionPool.getAvailableConnection());
        }
        
    }

}

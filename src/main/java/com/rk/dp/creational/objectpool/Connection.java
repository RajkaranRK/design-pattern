package com.rk.dp.creational.objectpool;

public class Connection implements ReleaseResource{
    
    private String url;
    
    private String userName;
    
    private String password;
    
    private String cachedQuery;
    
    public Connection(String url, String userName, String password) {
        this.url = url;
        this.userName = userName;
        this.password = password;
    }
    

    @Override
    public void release() {
        this.cachedQuery = null;
    }
    
    public String executeQuery(String query) {
        this.cachedQuery = query;
        return new StringBuilder("Executed").append(query).toString();
    }


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getCachedQuery() {
        return cachedQuery;
    }
}

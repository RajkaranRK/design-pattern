package com.rk.dp.creational.builder;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public final class User {
    
    private String name;
    private LocalDate dob;
    private int age;
    
    
    private User() {}
    
    public static class Builder {
        private String name;
        private int year;
        private int day;
        private int month;
        
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        
        public Builder year(int year) {
            this.year = year;
            return this;
        }
        
        public Builder day(int day) {
            this.day = day;
            return this;
        }
        
        public Builder month(int month) {
            this.month = month;
            return this;
        }
        public User build() {
            User user = new User();
            user.name = this.name;
            user.dob =  LocalDate.of(year, month, day);
            user.age = (int) ChronoUnit.YEARS.between(user.dob, LocalDate.now());
            return user;
        }
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", dob=" + dob + ", age=" + age + "]";
    }
    
    
}

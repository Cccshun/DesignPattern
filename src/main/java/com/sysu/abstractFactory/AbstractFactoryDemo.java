package com.sysu.abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        SqlserverFactory mysqlFactory = new MysqlFactory();
        SqlserverUser sqlserverUser = mysqlFactory.getSqlserverUser();

        User user = new User(10, "James");
        sqlserverUser.insertUser(user);
        User result = sqlserverUser.queryUserById(3);
        System.out.println(result);
    }
}

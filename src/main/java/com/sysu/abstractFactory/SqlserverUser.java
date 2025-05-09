package com.sysu.abstractFactory;

public interface SqlserverUser {

    void insertUser(User user);

    User queryUserById(Integer id);
}

class MysqlUser implements SqlserverUser {
    @Override
    public void insertUser(User user) {
        System.out.printf("insert into MySQL server [%s]\n", user.toString());
    }

    @Override
    public User queryUserById(Integer id) {
        System.out.printf("query from MySQL server id:%d\n", id);
        return null;
    }
}

class OracleUser implements SqlserverUser {
    @Override
    public void insertUser(User user) {
        System.out.printf("insert into Oracle server [%s]\n", user.toString());
    }

    @Override
    public User queryUserById(Integer id) {
        System.out.printf("query from Oracle server id:%d\n", id);
        return null;
    }
}



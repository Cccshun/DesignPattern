package com.sysu.abstractFactory;

public interface SqlserverDepartment {
    void insert(Department department);

    Department queryById(Integer id);
}

class MysqlDepartment implements SqlserverDepartment {
    @Override
    public void insert(Department department) {
        System.out.printf("insert into MySQL server [%s]\n", department.toString());
    }

    @Override
    public Department queryById(Integer id) {
        System.out.printf("query from MySQL server id:%d\n", id);
        return null;
    }
}

class OracleDepartment implements SqlserverDepartment {
    @Override
    public void insert(Department department) {
        System.out.printf("insert into Oracle server [%s]\n", department.toString());
    }

    @Override
    public Department queryById(Integer id) {
        System.out.printf("query from Oracle server id:%d\n", id);
        return null;
    }
}

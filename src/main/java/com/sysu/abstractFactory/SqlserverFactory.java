package com.sysu.abstractFactory;

public interface SqlserverFactory {
    SqlserverUser getSqlserverUser();

    SqlserverDepartment getSqlserverDepartment();
}

class MysqlFactory implements SqlserverFactory {
    @Override
    public SqlserverUser getSqlserverUser() {
        return new MysqlUser();
    }

    @Override
    public SqlserverDepartment getSqlserverDepartment() {
        return new MysqlDepartment();
    }
}

class OracleFactory implements SqlserverFactory {
    @Override
    public SqlserverUser getSqlserverUser() {
        return new OracleUser();
    }

    @Override
    public SqlserverDepartment getSqlserverDepartment() {
        return new OracleDepartment();
    }
}

package com.sysu.simpleFacotry;

public class OperationFactory {
    public static Operator createOperate(String operate) {
        Operator op = switch (operate) {
            case "+" -> new OperationAdd();
            case "-" -> new OperationSub();
            case "*" -> new OperationMul();
            case "/" -> new OperationDiv();
            default -> throw new IllegalArgumentException("无效运算符:" + operate);
        };
        return op;
    }
}

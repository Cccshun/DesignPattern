package com.sysu.simpleFacotry;

import lombok.Data;

@Data
public abstract class Operator {
    private Double num1;
    private Double num2;

    public abstract Double getResult();
}

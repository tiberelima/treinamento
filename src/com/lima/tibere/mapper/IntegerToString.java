package com.lima.tibere.mapper;

public class IntegerToString implements Mapper<Integer, String> {

    @Override
    public String mapElement(Integer from) {
        return String.valueOf(from);
    }
}

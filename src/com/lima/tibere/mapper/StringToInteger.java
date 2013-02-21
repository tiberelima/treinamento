package com.lima.tibere.mapper;

class StringToInteger implements Mapper<String, Integer> {

    @Override
    public Integer mapElement(String from) throws NumberFormatException {
        return Integer.valueOf(from);
    }
}

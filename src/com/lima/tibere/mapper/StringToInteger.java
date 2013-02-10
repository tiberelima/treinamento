package com.lima.tibere.mapper;

import java.util.ArrayList;
import java.util.List;

class StringToInteger implements Mapper<Object, Object> {

    private static StringToInteger instance;

    private StringToInteger() {
    }

    public static StringToInteger getInstance() {
        if (instance == null) {
            instance = new StringToInteger();
        }
        return instance;
    }

    @Override
    public Object map(Object from) throws NumberFormatException {

        List<Integer> out = new ArrayList<>();

        for (String in : (List<String>) from) {
            out.add(Integer.valueOf(in));
        }

        return out;
    }
}

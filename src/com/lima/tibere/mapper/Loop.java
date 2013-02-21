package com.lima.tibere.mapper;

import java.util.ArrayList;
import java.util.List;

public class Loop<F, T> {

    public List<T> mapear(List<F> lista, Mapper<F, T> mapper) {
        List<T> out = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            out.add(mapper.mapElement(lista.get(i)));
        }
        return out;
    }
}

package com.lima.tibere.mapper;

public interface Mapper<F, T> {

    T mapElement(F from);
}

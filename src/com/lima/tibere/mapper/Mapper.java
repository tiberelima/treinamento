package com.lima.tibere.mapper;

public interface Mapper<F, T> {

    T map(F from);
}

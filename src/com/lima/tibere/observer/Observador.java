package com.lima.tibere.observer;

import com.lima.tibere.terreno.ForaDeTerrenoException;

public interface Observador {

    public void atualizar() throws ForaDeTerrenoException;
}

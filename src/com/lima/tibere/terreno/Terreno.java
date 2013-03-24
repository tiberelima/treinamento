package com.lima.tibere.terreno;

import com.lima.tibere.observer.Observador;
import com.lima.tibere.robo.ObjetoDeCenario;

public interface Terreno extends Observador {

    public void inserirObjeto(ObjetoDeCenario objeto);
}

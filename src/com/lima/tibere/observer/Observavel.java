package com.lima.tibere.observer;

import com.lima.tibere.terreno.ForaDeTerrenoException;
import java.util.ArrayList;
import java.util.List;

public abstract class Observavel {

    protected List<Observador> observadores;

    public Observavel() {
        observadores = new ArrayList<>();
    }

    public void serObservadoPor(Observador observador) {
        observadores.add(observador);
    }

    public void deixarDeSerObservadoPor(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() throws ForaDeTerrenoException {
        for (Observador observador : observadores) {
            observador.atualizar();
        }
    }
}

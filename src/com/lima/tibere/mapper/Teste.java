package com.lima.tibere.mapper;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("1120");
        lista.add("8724");
        lista.add("1233");

        try {
            List<Integer> map = (List) StringToInteger.getInstance().map(lista);

            for (Integer i : map) {
                System.out.println("Elemento: " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Não foi possível mapear : " + e.getMessage());
        }
    }
}

package com.example.manana.a06_pizza;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by manana on 26/5/16.
 */
public class TiposPizzas {


    public static List<Pizza>MenuPizzas(){

        LinkedList<Pizza> pizzas = new LinkedList<>();
        List<String>ingredientes = new LinkedList<>();
        ingredientes.add("queso");
        ingredientes.add("tomate");
        ingredientes.add("mozarrella");
        pizzas.add(new Pizza("Bolognesa",ingredientes));
        ingredientes.add("chorizo");
        ingredientes.add("ternera");
        ingredientes.add("bacon");
        pizzas.add(new Pizza("Barbacoa",ingredientes));


      return pizzas;
    }
}

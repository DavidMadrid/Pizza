package com.example.manana.a06_pizza;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by manana on 26/5/16.
 */
public class Pizza implements Serializable {


    private String nombrePizza= null;
    private List<String>ingredientes= new LinkedList<>();


    public Pizza (String nombrePizza,List<String>ingredientes){

        this.ingredientes.addAll(ingredientes);
        this.nombrePizza=nombrePizza;

    }


    public String getNombrePizza() {
        return nombrePizza;
    }

    public void setNombrePizza(String nombrePizza) {
        this.nombrePizza = nombrePizza;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    public String toString() {
        return this.getNombrePizza();

    }
}

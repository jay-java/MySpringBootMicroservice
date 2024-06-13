package net.javaguides.springannotations.service;

public class NonVegPizza implements Pizza{

    @Override
    public String getPizza() {
        return "Non-veg Pizza";
    }
}

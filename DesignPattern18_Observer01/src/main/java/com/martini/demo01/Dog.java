package com.martini.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author martini at 2020/11/10 17:23
 */
public class Dog implements Pet {
    private String name;
    private String color;
    private int hungry;
    private List<Owner> owners;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public Dog() {
    }

    public Dog(String name, String color, int hungry) {
        this.name = name;
        this.color = color;
        this.hungry = hungry;
        owners = new ArrayList<Owner>();
    }

    public void timePass(int hours) {
        this.hungry -= hours / 3;
        System.out.printf("Time passed %d hours, now hungry is %d.%n", hours, this.hungry);
        if (this.hungry < 3) {
            System.out.println(this.name + " feel hungry, notifies all owners.");
            notifyOwners();
        }
    }

    public void registerOwner(Owner owner) {
        owners.add(owner);
    }

    public void notifyOwners() {
        for (Owner aOwner : owners) {
            aOwner.feed(name, color, hungry);
        }
    }

    public void removeOwner(Owner owner) {
        owners.remove(owner);
    }
}

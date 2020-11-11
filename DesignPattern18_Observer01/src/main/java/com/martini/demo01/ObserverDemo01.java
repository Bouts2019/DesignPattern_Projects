package com.martini.demo01;

/**
 * @author martini at 2020/11/10 17:16
 */
public class ObserverDemo01 {
    public static void main(String[] args) {
        Owner owner1 = new Alice();
        Dog pet1 = new Dog("Dog1", "white", 20);
        pet1.registerOwner(owner1);

        pet1.timePass(10);
        pet1.timePass(10);
        pet1.timePass(10);
        pet1.timePass(10);
        pet1.timePass(10);
        pet1.timePass(10);
        pet1.timePass(10);
    }
}

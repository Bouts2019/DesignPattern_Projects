package com.martini.type01;

/**
 * @author martini at 2020/11/8 11:16
 */
public class AdapterDemo01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setPhone(new Phone());
        person.getPhone().charging(new AcAdapter());

    }
}

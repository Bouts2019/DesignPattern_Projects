package com.martini.demo01;

/**
 * @author martini at 2020/11/10 17:16
 */
public interface Pet {
    void registerOwner(Owner owner);
    void notifyOwners();
    void removeOwner(Owner owner);
}

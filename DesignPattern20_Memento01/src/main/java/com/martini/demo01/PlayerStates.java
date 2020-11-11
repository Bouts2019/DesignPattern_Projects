package com.martini.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author martini at 2020/11/10 22:01
 */
public class PlayerStates {
    private List<PlayerMemento> mementos = new ArrayList<PlayerMemento>();

    public void add(PlayerMemento memento) {
        mementos.add(memento);
    }

    public PlayerMemento get(int index) {
        return mementos.get(index);
    }
}

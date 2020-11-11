package com.martini.demo01;

/**
 * @author martini at 2020/11/10 21:56
 */
public class Player {
    private int hp;
    private int mp;

    public Player() {
    }

    public Player(int hp, int mp) {
        this.hp = hp;
        this.mp = mp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    @Override
    public String toString() {
        return "Player{" +
                "hp=" + hp +
                ", mp=" + mp +
                '}';
    }

    public PlayerMemento saveStateMemento() {
        return new PlayerMemento(hp, mp);
    }

    public void rollbackStateFromMemento(PlayerMemento memento) {
        this.hp = memento.getHpState();
        this.mp = memento.getMpState();
    }
}

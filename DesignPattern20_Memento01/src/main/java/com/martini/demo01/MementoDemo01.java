package com.martini.demo01;

/**
 * @author martini at 2020/11/10 21:55
 */
public class MementoDemo01 {
    public static void main(String[] args) {
        Player player = new Player(1000, 200);

        int cur = 0;

        PlayerStates playerStates = new PlayerStates();
        System.out.println("[" + ++cur + "]" + player.toString());
        playerStates.add(player.saveStateMemento());

        player.setHp(player.getHp() - 110);
        System.out.println("[" + ++cur + "]" + player.toString());
        playerStates.add(player.saveStateMemento());

        player.setHp(player.getHp() - 200);
        player.setMp(player.getMp() - 10);
        System.out.println("[" + ++cur + "]" + player.toString());
        playerStates.add(player.saveStateMemento());

        player.setHp(player.getHp() - 300);
        player.setMp(player.getMp() - 20);
        System.out.println("[" + ++cur + "]" + player.toString());
        playerStates.add(player.saveStateMemento());

        int rollbackTo = 2;
        player.rollbackStateFromMemento(playerStates.get(rollbackTo - 1));
        System.out.println(rollbackTo + ": " + player);
    }
}

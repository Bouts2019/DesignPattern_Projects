package com.martini.demo01;

/**
 * @author martini at 2020/11/9 11:07
 */
public class CommandDemo01 {
    public static void main(String[] args) {
        LightReceiver light = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        Remote remote = new Remote();
        // 给遥控器设置命令，比如第0组是电灯的命令
        remote.setCommand(0, lightOnCommand, lightOffCommand);
        System.out.println("======= Light On Button =======");
        remote.onButtonPushed(0);
        System.out.println("======= Light Off Button =======");
        remote.offButtonPushed(0);
        System.out.println("======= Undo Last =======");
        remote.undoButtonPushed();

        TvReceiver tv = new TvReceiver();
        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);
        // 设置命令，现在将第1组设置为tv的命令
        remote.setCommand(1, tvOnCommand, tvOffCommand);
        System.out.println("======= TV On Button =======");
        remote.onButtonPushed(1);
        System.out.println("======= TV Off Button =======");
        remote.offButtonPushed(1);
        System.out.println("======= Undo Button =======");
        remote.undoButtonPushed();
    }
}

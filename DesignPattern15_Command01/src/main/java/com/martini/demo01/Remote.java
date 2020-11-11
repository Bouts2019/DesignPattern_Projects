package com.martini.demo01;

/**
 * @author martini at 2020/11/10 13:05
 */
public class Remote {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public Remote() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void onButtonPushed(int no) {
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    public void offButtonPushed(int no) {
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    public void undoButtonPushed() {
        undoCommand.undo();
    }
}

package com.martini.demo01;

/**
 * @author martini at 2020/11/11 8:30
 */
public class StateDemo01 {
    public static void main(String[] args) {
        Context context = new Context();

        new StartState().doAction(context);
        System.out.println(context.getState().toString());

        new StopState().doAction(context);
        System.out.println(context.getState().toString());

    }
}

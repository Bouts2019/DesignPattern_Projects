package com.martini.demo02;

/**
 * @author martini at 2020/11/8 09:10
 */
public class Box implements Cloneable {
    private int size;
    private Ball ball;

    public Box() {
    }

    public Box(int size, Ball ball) {
        this.size = size;
        this.ball = ball;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                ", ball=" + ball +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
         return super.clone();
//        Box clone = (Box) super.clone();
//        clone.setBall((Ball)clone.getBall().clone());
//        return clone;
    }
}

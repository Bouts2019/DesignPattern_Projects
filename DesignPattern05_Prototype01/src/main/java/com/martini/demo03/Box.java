package com.martini.demo03;

import java.io.*;

/**
 * @author martini at 2020/11/8 09:10
 */
public class Box implements Serializable, Cloneable {
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
    }

    public Box deepClone() {
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        Box box = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            box = (Box)ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return box;
    }
}

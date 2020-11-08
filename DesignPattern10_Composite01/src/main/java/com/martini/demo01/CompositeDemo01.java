package com.martini.demo01;

/**
 * @author martini at 2020/11/8 16:50
 */
public class CompositeDemo01 {
    public static void main(String[] args) {

        Node root = new RootNode("root", "root");

        Node mid1 = new MiddleNode("  middle", "middle");
        Node mid2 = new MiddleNode("  middle", "middle");
        Node mid3 = new MiddleNode("  middle", "middle");

        Node leaf1 = new LeafNode("    leaf", "leaf");
        Node leaf2 = new LeafNode("    leaf", "leaf");
        Node leaf3 = new LeafNode("    leaf", "leaf");
        Node leaf4 = new LeafNode("    leaf", "leaf");
        Node leaf5 = new LeafNode("    leaf", "leaf");
        Node leaf6 = new LeafNode("    leaf", "leaf");
        Node leaf7 = new LeafNode("    leaf", "leaf");

        mid1.add(leaf1);
        mid1.add(leaf2);
        mid2.add(leaf3);
        mid2.add(leaf4);
        mid3.add(leaf5);
        mid3.add(leaf6);
        mid3.add(leaf7);

        root.add(mid1);
        root.add(mid2);
        root.add(mid3);

        root.print();
    }
}

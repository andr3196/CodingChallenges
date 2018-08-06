package Challenge3;

public class Driver3 {

    public static void main(String[] args) {

        Node root = new Node("root", new Node("left", new Node("left.left"), null), new Node("right"));

        String s = Challenge3.serialize(root);

        System.out.println(s);

        Node newRoot = Challenge3.deserialize(s);

        System.out.println(newRoot.getVal());
        System.out.println("left child: " + newRoot.getLeft().getVal());
        System.out.println("left grand child: " + newRoot.getLeft().getLeft().getVal());
        System.out.println("right child: " + newRoot.getRight().getVal() );

    }


}

package Challenge3;

public class Challenge3 {

    // Given the root of a binary tree, implement "s = serialize(root)" that serializes the tree into a string and
    // "root deserialize(s)" which does the inverse


    public static String serialize(Node root){

        StringBuilder sb = new StringBuilder();
        recSerilize(root, sb);
        return sb.toString();
    }

    private static void recSerilize(Node node, StringBuilder sb){
        sb.append("(").append(node.getVal()).append(",");
        if (node.getLeft() != null){
            recSerilize(node.getLeft(), sb);
        }
        sb.append(",");
        if(node.getRight() != null){
            recSerilize(node.getRight(), sb);
        }
        sb.append(")");
    }

    // assumes s does not contain ",", "(" or ")"

    public static Node deserialize(String s){

        // precond: s format "(VAL,LEFT,RIGHT)"
        int i = 1; // val start index
        int j = s.indexOf(","); // val end index
        String val = s.substring(i,j);
        i = j + 1; // LEFT begin
        int numParentheses = 0;
        do{
            j++;
            if (s.charAt(j) == '('){
                numParentheses++;
            }else if (s.charAt(j) == ')'){
                numParentheses--;
                if (numParentheses == 0){
                    j++;
                }
            }

        }while(numParentheses > 0);
        // j = last
        String left = s.substring(i,j);
        i = ++j; // right begin index
        j = s.length() - 1; // right end index
        String right = s.substring(i,j);

        Node leftNode;
        Node rightNode;
        if (!left.isEmpty()){
            leftNode = deserialize(left);
        }else{
            leftNode = null;
        }
        if (!right.isEmpty()){
            rightNode = deserialize(right);
        }else {
            rightNode = null;
        }
        return new Node(val, leftNode, rightNode);


    }




}

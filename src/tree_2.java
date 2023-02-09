public class tree_2 {
    int data;
    tree_2 left;
    tree_2 right;

    public tree_2(int data, tree_2 left, tree_2 right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public static void preOrder(tree_2 tree){
        if(tree == null){
            return;
        }
        System.out.println("tree.data = "+tree.data);
        preOrder(tree.left);
        preOrder(tree.right);
    }

    public static void inOrder(tree_2 tree){
        if(tree == null){
            return;
        }

        inOrder(tree.left);
        System.out.println("tree.data = " + tree.data);
        inOrder(tree.right);
    }

    public static void poOrder(tree_2 tree){
        if(tree == null){
            return;
        }

        poOrder(tree.left);
        poOrder(tree.right);
        System.out.println("tree.data = "+ tree.data);
    }

    public static void main(String[] args) {
        tree_2 tree = new tree_2(10,null,null);
        tree_2 tree_left = new tree_2(15,null,null);
        tree_2 tree_right = new tree_2(18,null,null);
        tree_2 tree_left_left = new tree_2(22,null,null);
        tree_2 tree_left_right = new tree_2(64,null,null);
        tree_2 tree_right_left = new tree_2(41,null,null);
        tree_2 tree_right_right = new tree_2(56,null,null);
        tree_2 tree_left_left_left = new tree_2(81,null,null);
        tree_2 tree_left_left_right = new tree_2(54,null,null);
        tree_2 tree_right_left_left = new tree_2(48,null,null);
        tree_2 tree_right_left_right = new tree_2(89,null,null);
        tree_2 tree_left_right_left = new tree_2(22,null,null);
        tree_2 tree_left_right_right = new tree_2(29,null,null);
        tree_2 tree_right_right_left = new tree_2(66,null,null);
        tree_2 tree_right_right_right = new tree_2(57,null,null);


        tree.left = tree_left;
        tree.right = tree_right;

        tree_left.left = tree_left_left;
        tree_left.right = tree_left_right;

        tree_right.left = tree_right_left;
        tree_right.right = tree_right_right;

        tree_left_left.left = tree_left_left_left;
        tree_left_left.right = tree_left_left_right;

        tree_right_left.left = tree_right_left_left;
        tree_right_left.right = tree_right_left_right;

        tree_left_right.left = tree_left_right_left;
        tree_left_right.right = tree_left_right_right;

        tree_right_right.left =  tree_right_right_left;
        tree_right_right.right = tree_right_right_right;

        preOrder(tree);
//        inOrder(tree);
//        poOrder(tree);

//        System.out.println(tree_left_left);
//        System.out.println(tree_left_left_left);

    }
}

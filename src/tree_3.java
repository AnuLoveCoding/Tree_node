public class tree_3 {
    int data;
    tree_3 left;
    tree_3 right;

    public tree_3(int data, tree_3 left, tree_3 right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public static void Inorder(tree_3 tree){
        if(tree == null){
            return;
        }
        Inorder(tree.left);
        System.out.println(tree.data);
        Inorder(tree.right);
    }

    public static void PoOrder(tree_3 tree){
        if(tree == null){
            return;
        }
        PoOrder(tree.left);
        PoOrder(tree.right);
        System.out.println(tree.data);
    }

    public static void preorder(tree_3 tree){
        if(tree == null){
            return;
        }
        System.out.println(tree.data);
        preorder(tree.left);
        preorder(tree.right);
    }

    public static void main(String[] args) {
        tree_3 tree = new tree_3(55,null,null);
        tree_3 tree_left = new tree_3(10,null,null);
        tree_3 tree_right = new tree_3(61,null,null);
        tree_3 tree_left_left = new tree_3(24,null,null);
        tree_3 tree_left_right = new tree_3(68,null,null);
        tree_3 tree_right_right = new tree_3(25,null,null);
        tree_3 tree_left_right_right = new tree_3(3,null,null);
        tree_3 tree_right_right_left = new tree_3(40,null,null);

        tree.left = tree_left;
        tree.right = tree_right;

        tree_left.left = tree_left_left;
        tree_left.right = tree_left_right;

        tree_left_right.right = tree_left_right_right;

        tree_right.right = tree_right_right;

        tree_right_right.left = tree_right_right_left;

        Inorder(tree);
//        PoOrder(tree);
//        preorder(tree);

    }
}

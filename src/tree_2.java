public class tree_2 {
    int data;
    tree_2 left;
    tree_2 right;

    public tree_2(int data, tree_2 left, tree_2 right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        tree_2 tree = new tree_2(10,null,null);
        tree_2 tree_left = new tree_2(15,null,null);
        tree_2 tree_right = new tree_2(18,null,null);

        tree.left = tree_left;
        tree_right = tree_right;
    }
}

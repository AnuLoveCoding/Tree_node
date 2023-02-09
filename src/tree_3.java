public class tree_3 {
    int data;
    tree_3 left;
    tree_3 right;

    public tree_3(int data, tree_3 left, tree_3 right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
    public static void main(String[] args) {
        tree_3 tree = new tree_3(55,null,null);
        tree_3 tree_left = new tree_3(10,null,null);
        tree_3 tree_right = new tree_3(61,null,null);

        tree.left = tree_left;
        tree.right = tree_right;

        

    }
}

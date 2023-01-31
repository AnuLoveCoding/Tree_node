import java.util.Scanner;

public class tee_1 {
    int val;
    tee_1 left;
    tee_1 right;

    tee_1(int val, tee_1 left, tee_1 right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public static void preOrder(tee_1 tree_node){

    }

    public static void inOrder(tee_1 tree_node){

    }

    public static void poOrder(tee_1 tree_node){

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        tee_1 tree_node = new tee_1(1,null,null);
        tee_1 tree_node_left = new tee_1(6,null,null);
        tee_1 tree_node_right = new tee_1(2,null,null);
        tee_1 tree_node_right_left = new tee_1(3,null,null);

        tree_node.left = tree_node_left;
        tree_node.right = tree_node_right;

        tree_node_right.left = tree_node_right_left;

    }
}

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

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        tee_1 tree_node = new tee_1(1,null,null);
    }
}

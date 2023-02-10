import java.util.Scanner;

public class tree_4 {
    int value;
   tree_4 left;
   tree_4 right;

  public tree_4(int value){
      this.value = value;
  }

//  Insert a value in a binary tree;
  public static tree_4 insert(tree_4 tree, int value){
        if(tree == null){
            tree = new tree_4(value);
            return tree;
        }

        if(value < tree.value){
            tree.left = insert(tree.left, value);
        }

        if(value > tree.value){
            tree.right = insert(tree.right, value);
        }

        return tree;
  }

  public static void inOrder(tree_4 tree){
      if(tree == null){
          return;
      }
      inOrder(tree.left);
      System.out.println(tree.value);
      inOrder(tree.right);
  }

  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
     tree_4 tree = new tree_4(15);

//      System.out.println("Enter the value of binary tree");
//      int  value = scn.nextInt();


//      System.out.println(insert(tree,value));
      insert(tree,60);
      insert(tree,65);
      insert(tree,20);

      inOrder(tree);
  }
}

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

    public static void preorder(tree_4 tree){
        if(tree == null){
            return;
        }
        System.out.println(tree.value);
        preorder(tree.left);
        preorder(tree.right);
    }

    public static int count_nodes(tree_4 tree){
      if(tree == null){
          return 0;
      }

      int l = count_nodes(tree.left);
      int r = count_nodes(tree.right);

      return  l + r + 1;
    }
  public static int height(tree_4 tree){
      if(tree == null){
          return 0;
      }
      int l = height(tree.left);
      int r = height(tree.right);

      return Math.max(l, r) + 1;
  }

  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      tree_4 tree = new tree_4(15);

      tree.left = new tree_4(25);

//      System.out.println("Enter the value of binary tree");
//      int  value = scn.nextInt();


//      System.out.println(insert(tree,value));


      tree.insert(tree,84);
      tree.insert(tree,64);
      tree.insert(tree,4);
      tree.insert(tree,10);
      tree.insert(tree,65);
      tree.insert(tree,87);
      tree.insert(tree,3);
      tree.insert(tree,8);
      tree.insert(tree,16);
      tree.insert(tree,21);





//      inOrder(tree);
      preorder(tree);
      System.out.println("\t");
      System.out.println("count of node is : "+ count_nodes(tree));
      System.out.println("\t");
      System.out.println("height of node is : "+ height(tree));
  }
}

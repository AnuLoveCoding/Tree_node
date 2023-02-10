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

//  find the height of tree is this way;
    public static int height(tree_3 tree){
       if(tree == null) {
           return 0;
       }
       int l = height(tree.left);
       int r = height(tree.right);

       return Math.max(l,r) + 1;
    }

//    count the nodes of tree of this way;
    public static int nodes(tree_3 tree){
        if(tree == null){
            return 0;
        }
        int l = nodes(tree.left);
        int r = nodes(tree.right);

        return l + r + 1;
    }

//    find the maximun data in tree node;
    public static int maximum(tree_3 tree){
        if(tree == null){
            return Integer.MIN_VALUE;
        }
        int ans = tree.data;
        int left = maximum(tree.left);
        int right = maximum(tree.right);

        if(left > ans){
            ans = left;
        }

        if(right > ans){
            ans = right;
        }

        return ans;
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

//        Inorder(tree);
//        PoOrder(tree);
//        preorder(tree);

//        System.out.println("The height of tree is : "+ height(tree));

//        System.out.println("count of nodes : " + nodes(tree));

        System.out.println("maximum value in tree node : "+maximum(tree));
    }
}

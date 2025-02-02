import java.util.Scanner;
class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class Binary_tree_implementation_using_Linked_list {

    static Node create()
    {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("enter data");
        int data = sc.nextInt();
        if (data==-1)
            return null;
        root = new Node(data);
        System.out.println("Enter the left child of the root"+root.data);
        root.left=create();
        System.out.println("Enter the right child of the root"+root.data);
        root.right=create();
        return root;
    }
    static void inorder(Node root){ // LNR
        if (root==null)
            return;
        inorder(root.left); // L
        System.out.println(root.data); // N
        inorder(root.right); // R
    }static void preorder(Node root){ // NLR
        if (root==null)
            return;
        System.out.println(root.data); // N
        preorder(root.left); // L
        preorder(root.right); // R
    }static void postorder(Node root){ // LRN
        if (root==null)
            return;
        postorder(root.left); // L
        postorder(root.right); // R
        System.out.println(root.data); // N
    }
    public static void main(String[] args) {
        Node root = create();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
    }
}

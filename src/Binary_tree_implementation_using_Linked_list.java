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
    public static void main(String[] args) {
        Node root = create();
    }
}

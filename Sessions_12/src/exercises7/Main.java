package exercises7;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] elements = {20, 10, 30, 5, 15, 25, 35, 16};

        for (int element : elements) {
            bst.insert(element);
        }

        System.out.println("Inorder traversal before deletion:");
        bst.inorder();

        bst.delete(20);
        System.out.println("Inorder traversal after deleting 20:");
        bst.inorder();

        bst.delete(16);
        System.out.println("Inorder traversal after deleting 16:");
        bst.inorder();
    }
}

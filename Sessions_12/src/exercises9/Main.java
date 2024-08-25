package exercises9;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] elements = {20, 10, 30, 5, 15, 25, 35, 16};

        for (int element : elements) {
            bst.insert(element);
        }

        System.out.println("Inorder traversal of the BST:");
        bst.inorder();

        int keyToSearch = 15;
        if (bst.search(keyToSearch)) {
            System.out.println("Element " + keyToSearch + " found in the BST.");
        } else {
            System.out.println("Element " + keyToSearch + " not found in the BST.");
        }

        keyToSearch = 100;
        if (bst.search(keyToSearch)) {
            System.out.println("Element " + keyToSearch + " found in the BST.");
        } else {
            System.out.println("Element " + keyToSearch + " not found in the BST.");
        }
    }
}

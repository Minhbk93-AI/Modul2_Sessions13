package exercises7;

public class BinarySearchTree {
    TreeNode root;

    BinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }
    public boolean delete(int value) {
        root = deleteRec(root, value);
        return root != null; // Trả về true nếu phần tử đã được xóa
    }

    private TreeNode deleteRec(TreeNode root, int value) {
        if (root == null) {
            return null;
        }

        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {

            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            TreeNode rightMost = findRightMost(root.left);

            root.value = rightMost.value;

            root.left = deleteRec(root.left, rightMost.value);
        }
        return root;
    }

    private TreeNode findRightMost(TreeNode root) {
        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }
}

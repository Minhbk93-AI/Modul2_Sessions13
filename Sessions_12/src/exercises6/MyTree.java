package exercises6;
import java.util.List;

public class MyTree<E extends Comparable> {
    private Node<E> root;

    public MyTree()
    {
    }
    public MyTree(List<E> arr)
    {
    }

    public void inOrder(Node<E> curr)
    {
        if (curr != null)
        {
            inOrder(curr.getLeft());
            System.out.println(curr.getData());
            inOrder(curr.getRight());
        }
    }
    public void postOrder(Node<E> curr)
    {
        if (curr != null)
        {
            postOrder(curr.getLeft());
            postOrder(curr.getRight());
            System.out.println(curr.getData());
        }
    }

}

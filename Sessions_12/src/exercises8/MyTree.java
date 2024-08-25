package exercises8;

import exercises6.Node;

import java.util.List;

public class MyTree<E extends Comparable> {
    private exercises6.Node<E> root;

    public MyTree()
    {
    }
    public MyTree(List<E> arr)
    {
    }

    public void preOrder(Node<E> curr)
    {
        if (curr != null)
        {
            System.out.println(curr.getData());
            preOrder(curr.getLeft());
            preOrder(curr.getRight());
        }
    }

}

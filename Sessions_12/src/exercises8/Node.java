package exercises8;

public class Node<E> {
    private E data;
    private exercises6.Node<E> left;
    private exercises6.Node<E> right;

    public Node()
    {
    }

    public Node(E data, exercises6.Node<E> left, exercises6.Node<E> right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public E getData()
    {
        return data;
    }

    public void setData(E data)
    {
        this.data = data;
    }

    public exercises6.Node<E> getLeft()
    {
        return left;
    }

    public void setLeft(exercises6.Node<E> left)
    {
        this.left = left;
    }

    public exercises6.Node<E> getRight()
    {
        return right;
    }

    public void setRight(exercises6.Node<E> right)
    {
        this.right = right;
    }
}

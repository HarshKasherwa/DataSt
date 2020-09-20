public class Node   {

    public int key;
    public Node next, prev, ptrdiff;

    public Node() {
        this.key = 0;
        this.next = null;
        this.prev = null;
    }

    public Node(int key) {
        this.key = key;
        this.next = null;
        this.prev = null;
    }

    public Node newNode(int key)
    {
        Node obj = new Node(key);
        final Node obj1 = obj;
        return obj1;
    }
}
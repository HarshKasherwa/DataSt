public class Sample {
    Node[] nodes = new Node[3];

    public void set(int[] key)  {

        for (int i = 0; i < key.length; i++)    {
            nodes[i] = new Node();
            nodes[i].key = key[i];
        }
    }

    public int[] get() {

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = nodes[i].key;
        }
        return arr;
    }
}

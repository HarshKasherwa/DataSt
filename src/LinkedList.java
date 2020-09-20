public class LinkedList extends Node{

    Node head = null;

    public void new_node(int key) {

        if (head == null)
            head = newNode(key);
        else {
            Node temp = head;
            int flag = 1;
            while (flag == 1) {
                if (temp.next == null) {
                    temp.next = newNode(key);
                    flag = -1;
                } else
                    temp = temp.next;
            }
        }
    }

    public void display()   {

        if(head == null)
            System.out.println("List is empty");
        else
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.println(temp.key);
                temp = temp.next;
            }
        }

    }


}
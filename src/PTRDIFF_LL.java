import java.util.Scanner;

class PTRDIFF_LL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Node head = null;

        for (int i = 0; i < 5; i++) {
            Node node = new Node();
            node = node.newNode(i);
            if (head == null)   {

                head = node;
            }
            else {

                Node temp =  head;
                while (temp.next != null)  {
                    temp = temp.next;
                }
                temp.next = node;
            }
        }
        Node temp = head;
        while (true)    {

            System.out.print(temp.key + " ");
            char ch = sc.next().charAt(0);
            if (ch == 'f')  {
                temp = temp.next;
                if (temp != null)   {
                    System.out.print(temp.key + " ");
                }
                else    {
                    System.out.println("List is empty");
                    break;
                }
            }

            if (ch == 'b')  {

                if (temp == head)   {
                    System.out.println("At start of the list already");
                }
                else {
                    //temp = temp ^ temp.next;
                }
            }
        }
        sc.close();
    }
}

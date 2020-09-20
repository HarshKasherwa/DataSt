import java.util.Scanner;

class Circular_LL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Node head = null;
        //System.out.println("Enter i, d, p");
        while (true)  {

            System.out.println("Enter i, d, p, e");
            char ch = sc.next().charAt(0);
            if (ch == 'e')  {
                break;
            }
            if (ch == 'i')  {

                System.out.println("Enter key");
                int x = sc.nextInt();

                System.out.println("Front or rear?");
                char c = sc.next().charAt(0);
                Node node = new Node();
                node = node.newNode(x);

                if (c == 'f')   {

                    if (head == null)   {
                        head = node;
                        head.next = head;
                    }
                    else {

                        Node temp = head;
                        while (temp.next != head)   {
                            temp = temp.next;
                        }
                        temp.next = node;
                        node.next = head;
                        head = node;
                    }
                }

                if (c == 'r')   {

                    if (head == null)   {
                        head = node;
                        head.next = head;
                    }
                    else {
                        Node temp = head;
                        while (temp.next != head)    {
                            temp = temp.next;
                        }
                        temp.next = node;
                        node.next = head;
                    }

                }


            }

            if (ch == 'p')  {

                Node temp = head;
                if (head == null)
                    System.out.println("List is empty");
                else {

                    while (temp.next != head)   {
                        System.out.print(temp.key + " ");
                        temp = temp.next;
                    }
                    System.out.print(temp.key);
                    System.out.println();
                }
            }
            if (ch == 'd')  {

                if (head == null)
                    System.out.println("List is empty");
                else {

                    System.out.println("Front or rear?");

                    char c = sc.next().charAt(0);
                    if (c == 'f')   {
                        System.out.println("Node deleted: " + head.key);
                        Node temp2 = head;
                        head = head.next;
                        Node temp = head;
                        while (temp.next != temp2)   {
                            temp = temp.next;
                        }
                        temp.next = head;
                    }

                    if (c == 'r')   {
                        Node temp = head;
                        if (temp.next == head)  {
                            System.out.println("Node deleted: " + head.key);
                            System.out.println("List now empty");
                            head = null;
                        }
                        else    {

                            while (temp.next.next != head)   {
                                temp = temp.next;
                            }
                            System.out.println("Node deleted: " + temp.next.key);
                            temp.next = head;
                        }
                    }
                }

            }
        }
        sc.close();
    }
}

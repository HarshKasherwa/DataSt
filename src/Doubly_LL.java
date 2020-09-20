import java.util.Scanner;

class Doubly_LL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch;
        Node head = null;
        while (true)    {

            System.out.println("Enter i, d, p, e");
            ch = sc.next().charAt(0);
            if (ch == 'e')  {
                break;
            }

            if (ch == 'i')  {

                System.out.println("Enter key");
                int x = sc.nextInt();
                Node node = new Node();
                node = node.newNode(x);

                System.out.println("Front or rear");
                char c = sc.next().charAt(0);
                if (c == 'f') {

                    if (head != null) {

                        node.next = head;
                        head.prev = node;
                    }
                    head = node;
                }

                if (c == 'r')   {

                    if (head == null)   {

                        head = node;
                    }
                    else {

                        Node temp = head;
                        while (temp.next != null)   {
                            temp = temp.next;
                        }

                        temp.next = node;
                        node.prev = temp;
                    }
                }
            }

            if (ch == 'd')  {

                if (head == null)   {
                    System.out.println("List is empty");
                }
                else {

                    System.out.println("Front or rear?");
                    char c = sc.next().charAt(0);

                    if (c == 'f')   {

                        head = head.next;
                        if (head != null)
                            head.prev = null;
                    }

                    if (c == 'r')   {

                        Node temp = head;
                        while (temp.next != null)   {
                            temp = temp.next;
                        }
                        temp = temp.prev;
                        if (temp != null)
                            temp.next = null;
                    }
                }
            }

            if (ch == 'p')  {

                Node temp = head;

                if (head != null)   {

                    while (temp !=  null)   {

                        System.out.print(temp.key + " ");
                        temp = temp.next;
                    }
                    System.out.println();
                }
                else
                    System.out.println("List is empty");
            }
        }
        sc.close();
    }
}

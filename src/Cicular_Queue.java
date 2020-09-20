import java.util.Scanner;

class Cicular_Queue {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int front = -1, rear = -1;
        while (true)    {
            System.out.println("Enter choice.");
            char ch = sc.next().charAt(0);
            if (ch == 'e')
                break;
            if (ch == 'i') {

                if (front == -1){
                    arr[++front] = sc.nextInt();
                    rear++;
                    continue;
                }

                int x = rear + 1;
                if (x == n) {
                    x = 0;
                }
                if (front == x){
                    System.out.println("Queue if full");
                }
                else {
                    rear+=1;
                    if (rear == n)
                        rear = 0;
                    arr[rear] = sc.nextInt();
                }
            }
            if (ch == 'd')  {
                if (front == -1)
                    System.out.println("Queue is empty");
                else{
                    int x;
                    if (front == rear)  {

                        x = arr[front];
                        front = -1;
                        rear = -1;
                    }
                    else {
                        x = arr[front];
                        front++;
                        if (front == n)
                            front = 0;
                    }
                    System.out.println("Deleted item: " + x);
                }
            }
            if (ch == 'P')  {
                for (int i = front;;) {


                    System.out.print(arr[i] + " ");
                    if (i == rear)
                        break;
                    i++;
                    if (i == n)
                        i = 0;
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

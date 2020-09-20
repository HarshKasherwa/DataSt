import java.util.Scanner;

class TOH {

    static void tower_of_hanoi(int n, char source, char aux, char dest)    {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + dest);
            return;
        }
        tower_of_hanoi(n-1, source, dest, aux);
        System.out.println("Move disk " + n + " from " + source + " to " + dest);
        tower_of_hanoi(n-1, aux, source, dest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char source = 'A', aux = 'B', dest = 'C';
        tower_of_hanoi(n, source, aux, dest);
        sc.close();
    }
}

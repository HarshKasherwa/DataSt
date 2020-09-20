import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] key = {1,2,3};
        Sample obj = new Sample();
        obj.set(key);
        int[] node = obj.get();
        for (int i : node) {
            System.out.println(i);
        }
    }
}

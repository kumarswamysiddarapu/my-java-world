package basics;

public class MainRecursion {
    static int count = 0;
    public static void main(String[] a) {

        if (count <= 5) {
            System.out.println(count);
            count++;
            main(a);
        }

    }
}

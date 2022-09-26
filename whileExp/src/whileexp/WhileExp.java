package whileexp;

public class WhileExp {

    public static void main(String[] args) {
        //Loop that prints numbers from 1 to 10.
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("Loop is over");

        //Loop that prints odd numbers from 1 to 10.
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j += 2;
        }
        System.out.println("Loop is over");

        //Loop that prints even numbers from 0 to 10.
        int k = 0;
        while (k <= 10) {
            System.out.println(k);
            k += 2;
        }
        System.out.println("Loop is over");
    }

}

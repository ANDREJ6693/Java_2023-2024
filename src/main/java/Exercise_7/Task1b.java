package Exercise_7;

public class Task1b {
    public static void main(String[] args) {


        char x = 'O';            // je črka O
        final char y = 'A';      // to je konstanta
        while (x > y) {
            x--;
            x--;
            System.out.print(x);
        }
    }
}
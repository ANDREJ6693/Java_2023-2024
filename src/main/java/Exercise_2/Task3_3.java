package Exercise_2;

public class Task3_3 {
    public static void main(String[] args){
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);

        int difference = arg1 - arg2;

        System.out.printf("Razlika števil %s in %s znaša %s", arg1, arg2, difference);
    }
}
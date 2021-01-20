import java.util.Scanner;

public class SwitchCase {
    public static void main (String args []){
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        System.out.println("Enter a number:[0-4] ");
        switch (i){
            case 0:
                System.out.println("I is 0");
                break;
            case 1:
                System.out.println("I is 1");
                break;
            case 2:
                System.out.println("I is 2");
                break;
            case 3:
                System.out.println("I is 3");
                break;
            default:
                System.out.println("I is 4 or greater than");

        }
    }
}

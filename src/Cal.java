import java.util.Scanner;

public class Cal {
    int add (int x , int y){
        int c=x+y;
        System.out.println(c);
        return c;
    }

    public static void main (String args []){
        int x;
        int y;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        x=sc.nextInt();
        System.out.println("Enter the other number:");
        y= sc.nextInt();
        Cal casio = new Cal();
        int sum =casio.add(x,y);

        System.out.println("Sum : "+sum);
    }
}

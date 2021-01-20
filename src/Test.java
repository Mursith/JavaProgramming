import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Test
{public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements to be stored :");
    n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the elements: ");
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Array elements are :");
    for (int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
    Arrays.sort(arr);
    int y= arr.length;
    for (int x: arr){
        System.out.println(x);

    }
    System.out.println("Second largest:"+arr[arr.length-2]);
    }
}




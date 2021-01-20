public class ForEach {
//    static int [] arr={12,34,54,29,61};
//
//    public static int max(){
//        int max=arr[0];
//        for(int i=1;i<arr.length;i++)
//            if (arr[i] > max)
//                max = arr[i];
//        return max;
//    }
//
//    public static void main (String args []){
//        int highest=ForEach.max();
//        System.out.println("Highest number: "+highest);
////        System.out.println("Highest number: "+max());
//    }

    public static void main(String[] arg)
    {
        {
            int[] marks = { 125, 132, 95, 116, 110 };

            int highest_marks = maximum(marks);
            System.out.println("The highest score is " + highest_marks);
        }
    }
    public static int maximum(int[] marks)
    {
        int maxSoFar = marks[0];

        // for each loop
        for (int num : marks)
        {
            if (num > maxSoFar)
            {
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }

}

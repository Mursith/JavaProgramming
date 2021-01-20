public class Variable_access {
    int engMarks;
    int mathMarks;
    static int fees = 300;

    public static class Variable_access_demo {
        public static void main(String args[]) {
            Variable_access mursith = new Variable_access();
            mursith.engMarks = 60;
            mursith.mathMarks = 80;
            int engMarks;
            engMarks = 26;
            Variable_access akram = new Variable_access();
            akram.engMarks = 73;
            akram.mathMarks = 37;

            System.out.println("Mursith's marks are below");
            System.out.println("English" + engMarks);
            System.out.println("Maths" + mursith.mathMarks);
            System.out.println("Fees" + Variable_access.fees);


        }
    }


}

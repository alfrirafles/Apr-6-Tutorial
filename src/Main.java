public class Main {
    public static void main(String[] args) {
//        // Variables
//
//        // integer
//        // can contain only whole numbers.
//        int myVariable = 12; // variable declaration, can only be done once.
//        myVariable = 14;
//
//        // String
//        // can contain words, sentences and paragraphs.
//        String myString = "Fred";
//
//        // float
//        // can contain whole numbers or decimal separated values
//        double myFloat = 24.5;
//
//        // char
//        // can only contain one letter
//        char myChar = 'a';
//
//        // boolean
//        // can only contain true or false
//        boolean myBoolean = true;
//
//        // printing out to console
////        System.out.println(myVariable + 1);
//
//        int myNumber = 12;
//        double result = (int) myNumber; //type casting from int -> double
////        System.out.println(result);
//
//        String myString2 = "12";
//        int integerCasting = Integer.parseInt(myString2);
//        // System.out.println(integerCasting)
//
//        // operators
//
//        // +
//        int addition = 2 + 3;
//
//        // -
//        int substraction = 2 - 3;
//
//        // *
//
//        // /
//
//        // % - modulus operator
//        substraction = 5 % 4;
//
//        // ++ - increment
//        substraction = 12;
//        substraction++;
//
//        // -- - decrement
//
//        substraction--;
//
//        System.out.println(substraction);
//
        ParkingPermit parent = new ParkingPermit();

        StudentParking student = new StudentParking();

        student.type = "residential";
        student.semester = "Fall 2017";

        FacultyStaffParking staff = new FacultyStaffParking();

        parent.issuePermit();
        student.issuePermit();
        staff.issuePermit();

    }
}

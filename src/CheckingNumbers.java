public class CheckingNumbers extends ArraysAdd {
    static int n = 5;
    boolean found = false;

    public CheckingNumbers() {

        if (checkNumber(numbers4, n)) {
            System.out.println("Number 5 exists inside an array");
        }else {
            System.out.println("No. I couldn't find it.");
        }

//        int n = 5;
//        boolean found = false;
//        System.out.println("Now I'm going to look for the number 5 in the array.");
//        for (int i = 0; i < numbers4.length; i++) {
//            if (n == numbers4[i]){
//                System.out.println("Number 5 exists inside an array");
//            } else {
//                System.out.println("No. I couldn't find it.");
//            }
//            if (n == numbers4[i]){
//                found = true;
//            }

//            for (int check : numbers4) {
//                if (check == n) {
//                    found = true;
//                    break;
//                }
//                if (found) System.out.println("Number 5 exists inside an array");
//                else System.out.println("No. I couldn't find it.");
//
//            }
//        }

//        System.out.println("Number 5 exists inside an array" + found);
    }
    public static boolean checkNumber(int[] numbers4, int n){
        boolean found = false;
        for (int i = 0; i < numbers4.length; i++) {

            if (n == numbers4[i]){
                return true;
            }
        }
        return false;
    }
}

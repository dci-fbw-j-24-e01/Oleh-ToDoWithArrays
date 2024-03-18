public class CheckingNumbers extends ArraysAdd{
    int n = 5;
    boolean found = false;

    public  CheckingNumbers(){
        System.out.println("Now I'm going to look for the number 5 in the array.");
        for (int check: numbers4){
            if (check == n){
                found = true;
                break;

            }
            if (found) System.out.println("Number 5 exists inside an array");
            else System.out.println("No. I couldn't find it.");

        }

    }
}

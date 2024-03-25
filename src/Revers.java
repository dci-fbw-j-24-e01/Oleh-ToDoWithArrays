import java.util.Arrays;

public class Revers extends ArraysAdd{

    public  Revers() {

        reversAktion1(numbers);
        reversAktion1(numbers2);
    }
    public static void reversAktion1(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int srebmun = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = srebmun;

        }
        System.out.println(Arrays.toString(numbers));
    }
}

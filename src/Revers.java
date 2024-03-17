import java.util.Arrays;

public class Revers extends ArraysAdd{

    public  Revers() {

        for (int i = 0; i < numbers.length / 2; i++) {
            int srebmun = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = srebmun;
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers2.length / 2; i++) {
            int srebmun = numbers2[i];
            numbers2[i] = numbers2[numbers2.length - 1 - i];
            numbers2[numbers2.length - 1 - i] = srebmun;
        }
        System.out.println(Arrays.toString(numbers2));

    }

}

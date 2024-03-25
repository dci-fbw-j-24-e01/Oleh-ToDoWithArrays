public class Choice extends ArraysAdd {
    public Choice() {

        int chouce = choiceAktion1(numbers);
        System.out.println(choiceAktion1(numbers));
        int chouce2 = choiceAktion1(numbers2);
        System.out.println(choiceAktion1(numbers2));
    }

    public static int choiceAktion1(int[] numbers) {
        if (numbers.length % 2 == 0) {
            int left = numbers[numbers.length / 2 - 1];
            int right = numbers[numbers.length / 2];
            int sum = left + right;
            return sum;
        } else {
            int middle = numbers.length / 2;
            return  numbers[middle];
        }
    }

}
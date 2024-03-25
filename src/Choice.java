public class Choice extends ArraysAdd {
    public Choice() {

        int chouce = choiceAktion(numbers);
        System.out.println(choiceAktion(numbers));
        int chouce2 = choiceAktion(numbers2);
        System.out.println(choiceAktion(numbers2));
    }

    public static int choiceAktion(int[] numbers) {
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
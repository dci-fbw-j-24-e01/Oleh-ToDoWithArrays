public class Choice extends ArraysAdd {
    public Choice()    {

        if (numbers.length % 2 == 0) {
            int left = numbers2[numbers2.length / 2 - 1];
            int right = numbers2[numbers2.length / 2 ];
            int sum = left + right;
            System.out.println(sum);
        } else {
            int middle = numbers.length / 2;
            System.out.println(numbers[middle]);
        }
        if (numbers2.length % 2 == 0) {
            int left = numbers2[numbers2.length / 2 - 1];
            int right = numbers2[numbers2.length / 2 ];
            int sum = left + right;
            System.out.println(sum);
        } else {
            int middle = numbers2.length / 2;
            System.out.println(numbers2[middle]);
        }

    }
}
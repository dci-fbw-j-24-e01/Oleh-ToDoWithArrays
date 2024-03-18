public class Fibonacci{
    public Fibonacci() {
        int limit = 20;
        int[] numbers = new int[limit];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i < limit; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        for (int i = 0; i < limit; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

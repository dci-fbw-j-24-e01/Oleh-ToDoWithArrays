public class SummarizeInAnArray extends ArraysAdd{
    public SummarizeInAnArray() {
        int sum = 0;
        for (int i = 0; i < numbers3.length; i++){
            sum = numbers3[0]+numbers3[numbers3.length - 1];
        }
        System.out.println(sum);
    }
}

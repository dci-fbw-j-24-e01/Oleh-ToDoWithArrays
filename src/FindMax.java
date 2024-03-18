public class FindMax extends ArraysAdd{
    public FindMax(){

        int x = 0;
        String max = "";


        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > x) {
                x = names[i].length();
                max = names[i];

            }
        }
        System.out.println("The biggest name in the array is - " + max + ". Hmmm... It's no big deal. In other arrays I've seen a much bigger.....");
    }
}

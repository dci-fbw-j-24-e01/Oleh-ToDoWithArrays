import java.util.StringJoiner;

public class GetNames extends ArraysAdd {
    public GetNames() {

        for (int i = 0; i < names.length; i = i + 2) {
            System.out.println(names[i]);
        }

    }
}

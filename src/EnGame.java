import java.util.ArrayList;
import java.util.Arrays;

public class EnGame extends AbstractGame{
    @Override
    ArrayList<String> generateCharList() {
        return new ArrayList<>(Arrays.asList("A","B","C","D","E",
                "F","G","H","I","J","K","L","M","N","O","P","Q",
                "R" ,"S","T","U","V","W","X","Y","Z"));
    }
}

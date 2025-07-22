package Level_1.Exercici_2;
import java.util.List;

public class StringsLetterSelector {

    public static List<String> selectLetterO(List<String> list) {

        return list.stream().filter(x -> x.length() > 5 && x.contains("o")).toList();
    }
}

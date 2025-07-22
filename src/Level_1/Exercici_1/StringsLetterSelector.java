package Level_1.Exercici_1;
import java.util.List;

public class StringsLetterSelector {

    public static List<String> selectLetterO(List<String> list) {

        return list.stream().filter(x -> x.contains("o")).toList();
    }
}

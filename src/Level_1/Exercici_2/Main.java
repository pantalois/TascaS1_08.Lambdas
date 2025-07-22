package Level_1.Exercici_2;
import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<String> list = Arrays.asList("Hello", "Worlds", "Laia", "Filipo", "Lois");
    List<String> newList = StringsLetterSelector.selectLetterO(list);
    System.out.println(newList);
    }
}

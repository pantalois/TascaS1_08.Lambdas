package Level_1.Exercici_1;
import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<String> list = Arrays.asList("Hello", "World", "Laia", "Felipe", "Lois");
    List<String> newList = StringsLetterSelector.selectLetterO(list);
    System.out.println(newList);
    }
}

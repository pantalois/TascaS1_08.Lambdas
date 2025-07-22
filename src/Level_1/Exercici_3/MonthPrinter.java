package Level_1.Exercici_3;
import java.util.List;

public class MonthPrinter {
    public static void monthPrinterLambda(List<String> list) {
        list.forEach(month -> {
            System.out.println(month);
        });
    }
}

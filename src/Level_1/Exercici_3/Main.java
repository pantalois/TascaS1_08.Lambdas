package Level_1.Exercici_3;

import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        MonthPrinter.monthPrinterLambda(list);
    }
}

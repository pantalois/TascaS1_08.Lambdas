package Level_1.Exercici_8;

public class Main {
    public static void main(String[] args){

        StringReverser myStringInversor;

        myStringInversor = (inputString) -> {
            StringBuilder stringBuilder = new StringBuilder(inputString);
            stringBuilder.reverse();
            return stringBuilder.toString();
        };

        String stringToReverse = "Hello World";
        String reversed;
        reversed = myStringInversor.reverse(stringToReverse);
        System.out.println(reversed);
        }
    }

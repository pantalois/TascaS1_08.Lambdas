public class Main {
    public static void main(String[] args)  {

        Interface impl = () -> System.out.println("Print");
        printThing(impl);
    }



    static void printThing(Interface thing){
        thing.print();
    }

}

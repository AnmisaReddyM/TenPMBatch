package arithmetic;

public class add1 {
    public static void main(String args[]) {

    System.out.println("Anmisa here");

    //code changes to main directly
      //functions with parameters and return type//

        System.out.println("Result is "+add(1094,34));
        System.out.println("Subresult is "+sub(123,12));
        printName();
        System.out.println("Completed");
    }
    ///with parameter and return tyoe
    private static int  add(int a,int b){
        int c =a+b;
        return c;
    }
    ///no return+parameter
    private static void   printName(){
        System.out.println("ANMISA REDDY");
    }
    ///with parameter and return type
    private static int  sub(int a,int b){
        int c = a-b;
        return c;
    }
}

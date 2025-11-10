// creating a class
class Calculator { 
    int a;
    public int  sub(int a, int b){
        return  b-a;
    }
    // writing methods
    public int add(int num1, int num2){
        int res  = num1 + num2;
        System.out.println(a);
        return res;
    }
}


public class CreatingObj {
    public static void main(String arg[]){
        int a = 40;
        int b = 50;

        Calculator calc = new Calculator(); // defining a new Object
        int result =  calc.add(a,b); 
        System.err.println(calc.sub(a, b));
        System.out.println(result);
    }
}

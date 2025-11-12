class Computer{
    public int add(int a, int b){
        return  a + b;
    }
    public int add(int a, int b, int c){
        return  a + b + c;
    }
    public void add(String a, int b, int c, int d){
        System.err.println("a"+b+c+d);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Computer comp = new Computer();

        int res1 = comp.add(2, 2);    
        System.err.println(res1);

        int res2 = comp.add(2, 2, 2);
        System.err.println(res2);

        comp.add("a", 2, 2, 2);
    }
}

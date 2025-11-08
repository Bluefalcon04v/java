public class TypeConversionCastingPromotional {
    public static void main(String args[]){
        // conversion of data type 
        byte a = 124;
        int b = 342;
        b = a;
        
        // casting of data type
        int x = 270;
        byte y = (byte) x;
        System.out.println(y);


        // promotional of data type
        byte c = 120; 
        byte d = 30;
        int res = c * d;
        System.out.println(res);
    }
}
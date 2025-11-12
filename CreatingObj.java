// blueprint of the Object
class Computer{
    public void greeting(String user){ // using void because it is not returning anything
        System.err.println("Hello "+ user);
    }

    public int noOfDeviceConnected(){ // using int because it is returning the integer
        return 4; 
    }    
}

public class CreatingObj{
    public static void main(String args[]){
        Computer comp = new Computer(); // creating new object
        comp.greeting("World");

        int deviceConnected = comp.noOfDeviceConnected();
        System.err.println(deviceConnected);
    }
} 
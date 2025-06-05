package javaprograms;

// Abstract base class
abstract class Vehicle {
    abstract void display();
    abstract void startEngine(); 
    abstract void stopEngine();
    abstract void Drive();
}


 class abc extends Vehicle {
   
    void display() {
        System.out.println("Displaying Css vehicle");
    }

    
    public void startEngine() {
        System.out.println("Starting Css engine");
    }

   
    public void stopEngine() {
        System.out.println("Stopping Css engine");
    }

   
    public void Drive() {
        System.out.println("Driving Css vehicle");
    }

   
    void show() {
        System.out.println("bxhdc");
    }
}

// Main class to test the implementation
public class Abstract {
    public static void main(String[] args) {
        abc obj = new abc();
        obj.display();
        obj.show();
        obj.startEngine();
        obj.Drive();
        obj.stopEngine();
    }
}

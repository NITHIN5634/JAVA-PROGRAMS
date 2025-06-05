class Car{
	public void BMW() {
		for(int i=1;i<=3;i++) {
			System.out.println("Car moving"+i);
		}
	}
}
class Bike{
	public void Ninja() {
		for(int i=1;i<=3;i++) {
			System.out.println("Bike is moving"+i);
		}
	}
}
public class SimpleRac {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.Ninja();
		Car c=new Car();
		c.BMW();
	}
}
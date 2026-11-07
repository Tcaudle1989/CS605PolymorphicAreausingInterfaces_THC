
public class Main {

	public static void main(String[] args) {
		AreaInterface square = new Square(2.0);
		AreaInterface circle = new Circle(2.0);
		
		System.out.println(square.getInteriorArea());
		System.out.printf("%.2f", circle.getInteriorArea());

	}

}

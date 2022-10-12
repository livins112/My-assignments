package week1day1;

public class Car {
	public static void printCarName()
	{
		System.out.println("Honda");
	}
	private static short getRegNum()
	{
		short RegNo =7787;
		return RegNo;
	
	}
	public static String getColor() {
		return "Pure Black";
	}
	public static void main(String[]args) {
		printCarName();
		System.out.println(getRegNum());
		System.out.println(getColor());
		}

}

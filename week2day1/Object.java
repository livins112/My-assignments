package week2day1;

public class Object {
	public int addThreeNum(int x, int y, int z)
	{
		int a = x + y + z;
		return a;
	}
	public int subTwoNum(int x, int y)
	{
		int z = x - y;
		return z;
	}	
	public float multiplyThreeNum(float x, float y, float z)
	{
		float a = x*y*z;
		return a;
	}	
    public int divideTwoNum(int a, int b)
    {
    	int z= a/b;
    	return z;
    }
    public static void main(String[]args) {
    	Object O=new Object();
		System.out.println("Addition:" +O.addThreeNum(9, 8 , 7));
		System.out.println("Subtraction:" +O.subTwoNum(9, 3));		
		System.out.println("Multiplication " +O.multiplyThreeNum(10.01f, 3.0201101f , 3.03f));
		System.out.println("Division " +O.divideTwoNum(19, 3));
    	
    }
	
}

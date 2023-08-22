package day1.first1;

public class Calculator1 {
	
	private int addTwoNumber(int a, int b) 
	{
		return a+b;
	}
	
	public float mul(int a, float b)
	{
		return a*b;
	}
	
	public void sub()
	{
		int a = 5;
		int b = 6;
		int c = a-b;
		System.out.println("The subraction value is" +c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 CL = new Calculator1();
		System.out.println(CL.addTwoNumber(5, 8));
	
		}
	

}

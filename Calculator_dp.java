
import java.util.Scanner;

interface cal1{
	void cal();
}

public class Calculator_dp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first operand :");
		int x=sc.nextInt();
		System.out.println("Enter the operator :");
		char op=sc.next().charAt(0);
		System.out.println("Enter the second operand :");
		int y=sc.nextInt();
		//System.out.println("The string is :"+x+op+y);
		if(op=='+')
		{
			addition ad = new addition(x,y);
			ad.cal();
		}
		else if(op=='-')
		{
			subtraction ad = new subtraction(x,y);
			ad.cal();
		}
		else if(op=='*')
		{
			multiply ad = new multiply(x,y);
			ad.cal();
		}
		else if(op=='/')
		{
			division ad = new division(x,y);
			ad.cal();
		}
		else
		{
			System.out.println("Not a correct operator");
		}
		
		
	}

}

class addition implements cal1 {
	int x,y;
	addition(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void cal()
	{
		System.out.println("Addition of "+x+" and "+y+" is : "+(x+y));
	}
}


class division implements cal1{
	int x,y;
	division(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void cal()
	{
		System.out.println("Addition of "+x+" and "+y+" is : "+(x+y));
	}
}


class subtraction implements cal1{
	int x,y;
	subtraction(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void cal()
	{
		System.out.println("Addition of "+x+" and "+y+" is : "+(x+y));
	}
}


class multiply implements cal1{
	int x,y;
	multiply(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void cal()
	{
		System.out.println("Multiplication of "+x+" and "+y+" is : "+(x*y));
	}
}
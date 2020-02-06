import java.io.*;
public class armstrong {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number :");
		int n=Integer.parseInt(br.readLine());
		int z=n,sum=0;
		while(z!=0)
		{
			int rem=z%10;
			z=z/10;
			sum=sum+(int)Math.pow(rem, 3);
		}
		if(sum==n)
		{
			System.out.println("The number "+n+" is an armstrong number");
		}
		else
		{
			System.out.println("The number "+n+" is not an armstrong number");
		}
	}

}

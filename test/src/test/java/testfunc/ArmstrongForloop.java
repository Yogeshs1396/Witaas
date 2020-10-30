package testfunc;

public class ArmstrongForloop {

	public static void main(String[] args) {
		
		
		int num=371;
		
		int rem;
		int res=0;
		
		int n=num;
		
		for(;n!=0;n/=10)
			
		{
			rem=n%10;
			res+=Math.pow(rem, 3);
		
		}
		
		if(res==num)
			
		{
			System.out.println("Armstrong");
		}

		else

		{
			System.out.println(" not Armstrong");
		}


	}

}

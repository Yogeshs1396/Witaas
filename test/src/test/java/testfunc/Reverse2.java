package testfunc;

public class Reverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="yogesh";
		
		byte[] bname= name.getBytes();
		
		byte[] res=new byte[bname.length];
		
				
		for (int i=0;i<bname.length;i++)
			
		{
			res[i]=bname[bname.length-i-1];
			
		}
		
		System.out.println(new String(res));
		
	}

}

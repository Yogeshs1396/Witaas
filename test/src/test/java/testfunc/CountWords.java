package testfunc;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="LEARNING JAVA PROGRAM";
		String word="JAVA";
		System.out.println("The Word JAVA in String = "+CountWords.count(str,word));
		}
	
	static int count(String str,String word)
	
	{
		String a[]=str.split(" ");
		System.out.println("NO OF WORDS IN STRING "+a.length);
		int count=0;
		for (int i=0;i<a.length;i++)
		{
			if(word.equals(a[i]))
				count++;
		}
		
		return count;
	}
}

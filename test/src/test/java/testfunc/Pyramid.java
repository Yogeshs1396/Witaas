package testfunc;

public class Pyramid {

	public static void main(String args[])

	{
		int n = 5;
		int i, j, no;
		for (i = 0; i < n; i++) {
			no = 1;
			for (j = 0; j <= i; j++) {
				System.out.print(no + " ");
				no++;
			}
			System.out.println();
		}

	}

}

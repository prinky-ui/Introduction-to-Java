package introduction;

public class Count {

	public static void main(String[] args) {

		int num = 58795123;
		int count = 0;
		while (num>0)
		{
			num=num/10;
			count++;
			
		}
		System.out.println("Number of digit:" +count);

	}

}


public class Problem001 {

	public static void main(String[] args){

		int n = 1000;
		long total = 0L;
		int i = 1;

		for(i = 0; i < n; i++)
		{
			if(i % (3 * 5) == 0) total += i;
			else if(i % 5 == 0) total += i;
			else if(i % 3 == 0) total += i;
		}


        System.out.println("Answer:" + total);
    }

}


public class Problem021 {

	public static void main(String[] args){

		int n = 0;
		int total = 0;

		for(n = 1; n < 10000; n++)
		{
			if((n == d(d(n))) && (n != d(n)))//���S���i6, 28, 496, 8128�j�͏��O����
			{
				total += n;
			}
		}

		System.out.println("Answer:" + total);
    }

	public static int d(int n)
	{
		int total = 0;
		int i = 0;

		for(i = 1; i < n; i++)
		{
			if(n % i == 0)
			{
				total += i;
			}
		}

		return total;

	}
}
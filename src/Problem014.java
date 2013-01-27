
public class Problem014 {

	public static void main(String[] args){

		long n = 1000000L;
		long count = 0;
		long maxCount[] = {0, 0};//���������J�E���g���A���������Ή����������l
		long i = 0;
		long tmp = 0;

		for(i = 1; i < n; i++)
	    {
			tmp = i;
			count = 0;
			while(tmp > 1)
			{
				tmp = seq(tmp);
				count ++;
			}
			if(count > maxCount[0])
			{
				maxCount[0] = count;
				maxCount[1] = i;
			}

	    }
		System.out.println("Answer:" + maxCount[1]);
    }

	public static long seq(long n)
	{
		if(n % 2 ==0) n /= 2;
		else n= (3 * n) + 1;

		return n;
	}

}

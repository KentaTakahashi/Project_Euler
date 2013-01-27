import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Problem034 {

	public static void main(String[] args){

		long total = 0;

		for(long i = 3; i <= 1000000; i++)
		{
			long tmp1 = i;
			long tmp2 = 0;

			while(1 <= tmp1)
			{
				tmp2 += calcFactorial(tmp1 % 10);
				tmp1 /= 10;
			}
			if(i == tmp2)
			{
				System.out.println(i);
				total += i;
			}
		}
		System.out.println("Answer:" + total);
	}

	private static long calcFactorial(long n)
	{
		if(n <= 1)
		{
			return 1;
		}else{
			return (n * calcFactorial(n-1));
		}
	}
}

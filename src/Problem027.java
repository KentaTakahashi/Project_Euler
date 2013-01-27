import java.math.BigInteger;


public class Problem027 {

	public static void main(String[] args){

		int maxCount = 0;
		int maxA = 0;
		int maxB = 0;

		for(int a = -1000; a <= 1000; a++)
		{
			for(int b = -1000; b <= 1000; b++)
			{
				int thisCount = contiPrimeNum(a, b);
				if(maxCount < thisCount)
					{
						maxCount = thisCount;
						maxA = a;
						maxB = b;
					}
			}
		}
		System.out.println("Answer:" + (maxA * maxB));
	}

	public static int contiPrimeNum(int a, int b)
	{
		int num = 0;
		BigInteger A = new BigInteger(Integer.toString(a));
		BigInteger B = new BigInteger(Integer.toString(b));
		while(true)
		{
			BigInteger NUM = new BigInteger(Integer.toString(num));
			BigInteger TOTAL = NUM.multiply(NUM);
			TOTAL = TOTAL.add(NUM.multiply(A));
			TOTAL = TOTAL.add(B);

			if(!TOTAL.isProbablePrime(10))
			{
				//System.out.println(TOTAL.toString());
				break;
			}
			num++;
		}
		return num;
	}
}

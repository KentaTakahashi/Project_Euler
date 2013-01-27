import java.math.BigInteger;


public class Problem028 {

	public static void main(String[] args){

		BigInteger TOTAL = new BigInteger("1");
		int skipNum = 2;
		long i = 1;

		while(i < (1001 * 1001))
		{
			for(int j = 1; j <= 4; j++)
			{
				i += skipNum;
				BigInteger I = new BigInteger(Long.toString(i));
				TOTAL = TOTAL.add(I);
			}
			skipNum += 2;
		}
		System.out.println("Answer:" + TOTAL.toString());
	}
}

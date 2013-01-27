import java.math.BigInteger;


public class Problem020 {

	public static void main(String[] args){

		BigInteger count = new BigInteger("1");
		BigInteger zero = new BigInteger("0");
		BigInteger one = new BigInteger("1");
		BigInteger ten = new BigInteger("10");
		BigInteger total = new BigInteger("1");
		BigInteger ans = new BigInteger("0");
		int i = 1;

		while(i <= 100)
		{
			total = total.multiply(count);
			count = count.add(one);

			i++;
		}
		while(true)
		{
			ans = ans.add(total.remainder(ten));
			total = total.divide(ten);
			if (total.compareTo(zero) == 0)break;
		}

		System.out.println("Answer:" + ans);
    }
}

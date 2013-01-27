import java.math.BigInteger;


public class Problem016 {

	public static void main(String[] args){

		BigInteger biginteger = new BigInteger("2");
		BigInteger total = new BigInteger("0");
		BigInteger ten = new BigInteger("10");
		BigInteger zero = new BigInteger("0");
		biginteger = biginteger.pow(1000);


		while(true)
		{
			total = total.add(biginteger.remainder(ten));
			biginteger = biginteger.divide(ten);
			if (biginteger.compareTo(zero) == 0)break;
		}

		System.out.println("Answer:" + total);
    }

}

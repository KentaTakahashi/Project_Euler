import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Problem033 {

	public static void main(String[] args){

		int mult_a = 1;
		int mult_b = 1;

		for(int delKey = 1; delKey <= 9; delKey++)
		{
			for(int a = 1; a <= 9; a++)
			{
				if(a == delKey)continue;

				//約分後にa/bなる形を考える、このときbはaより大きくないと命題を満たさない
				for(int b = a + 1; b <= 9; b++)
				{
					if(b == delKey)continue;

					//(10 * delKey + a) / (10 * b + delKey)の形を考える
					if((10 * delKey + a) * b == a * (10 * b + delKey))
					{
						mult_a *= a;
						mult_b *= b;
						System.out.println((10 * delKey + a) + "/" + (10 * b + delKey));
					}

					//(10 * a + delKey) / (10 * delKey + b)の形を考える
					if(((10 * a + delKey) * b) == (a * (10 * delKey + b)))
					{
						mult_a *= a;
						mult_b *= b;
						System.out.println((10 * a + delKey) + "/" + (10 * delKey + b));
					}
				}
			}
		}
		BigInteger MULT_A = new BigInteger(Long.toString(mult_a));
        BigInteger MULT_B = new BigInteger(Long.toString(mult_b));
        BigInteger GCD = MULT_A.gcd(MULT_B);
        BigInteger ANS = MULT_B.divide(GCD);

		System.out.println("Answer:" + ANS.toString());
	}
}

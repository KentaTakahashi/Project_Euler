import java.math.BigDecimal;
import java.math.RoundingMode;


public class Problem026 {

	public static void main(String[] args){

		int max_d = 2;
		long max = 1;

		for(int d = 2; d < 20; d++)
		{
			//d ‚ª2‚Æ5‚Ì‚Ý‚Ì‘fˆö”‚©‚ç‚È‚éê‡AzŠÂß‚Í‚È‚¢‚Ì‚Åcontinue‚·‚é
			long tmp = d;
			while(true)
			{
				if(tmp % 2 == 0) tmp /= 2;
				else break;
			}
			while(true)
			{
				if(tmp % 5 == 0) tmp /= 5;
				else break;
			}
			if(tmp == 1)continue;

			float tmp2 = d;

			while(( 1.0 / tmp2) < 0.1)
			{
				tmp2 /= 10.0;//¬”‘æˆêˆÊ‚É0ˆÈŠO‚ª‚­‚é‚Ü‚Å10”{‚µ‘±‚¯‚é
				System.out.println("tmp2:" + tmp2);
			}

			BigDecimal big_d = new BigDecimal(tmp2);

			int e = 1;
			while(e < 20)
			{
				System.out.println("d:" + d + " e:" + e);

				//double pow = (Math.pow(10, e) - 1);

				BigDecimal big_pow = BigDecimal.TEN;

				BigDecimal big_float = new BigDecimal(0);
				BigDecimal big_int = new BigDecimal(0);
				BigDecimal big_abs = new BigDecimal(0);

				big_pow = big_pow.pow(e);
				big_pow = big_pow.subtract(BigDecimal.ONE);
				big_pow = big_pow.multiply(BigDecimal.TEN);
				big_float = big_pow.divide(big_d, 1000, RoundingMode.HALF_UP);
				big_int   = big_pow.divideToIntegralValue(big_d);
				big_abs = big_float.subtract(big_int);

				float tmp_pow = big_pow.floatValue();
				float tmp_float = big_float.floatValue();
				float tmp_int = big_int.floatValue();
				float abs = big_abs.floatValue();
				System.out.println("tmp_pow:" + tmp_pow + " tmp_float:" + tmp_float + " tmp_int:" + tmp_int + " abs:" + abs);

				if((abs >=  -0.0001) && (abs <= 0.0001) )break;

				e++;
			}

			if(e >= max)
			{
				max = e;
				max_d = d;
			}

		}

		System.out.println("Answer:" + max_d);
	}

}

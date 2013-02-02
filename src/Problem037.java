import java.math.BigInteger;



public class Problem037 {

	public static void main(String[] args){

		long total = 0;
		long num = 10;
		int truncatable_count = 0;

		while(truncatable_count < 11){

			num++;

			String num_str = Long.toString(num);
			BigInteger NUM_STR = new BigInteger(num_str);
			if(!NUM_STR.isProbablePrime(10)) continue;//素数でなかったらcontinue

			int length = num_str.length();
			boolean isTruncatable = true;

			for(int i = 1; i < length; i++){
				String num_str_left		= num_str.substring(0, i);
				String num_str_right 	= num_str.substring(i, length);

				BigInteger NUM_STR_LEFT 	= new BigInteger(num_str_left);
				BigInteger NUM_STR_RIGHT 	= new BigInteger(num_str_right);
				if((!NUM_STR_LEFT.isProbablePrime(10)) || (!NUM_STR_RIGHT.isProbablePrime(10))) {
					isTruncatable = false;//素数でなかったらフラグを折ってcontinue
					continue;
				}
			}

			if(isTruncatable){
				//対象数とそのバイナリーが回文数ならtotalに加える
				total += num;
				System.out.println("ProbablePrime:" + num);
				truncatable_count++;
			}

		}

		System.out.println("Answer:" + total);
	}
}

import java.math.BigInteger;


public class Problem035 {

	public static void main(String[] args){

		long total = 0;

		for(long num = 1; num < 1000000; num++){
			boolean isPrime =true;
			String num_str = Long.toString(num);

			for(int i = 0; i < num_str.length(); i++){
				String cyc_num = num_str.substring(i, num_str.length());//i文字目から最後まで
				cyc_num = cyc_num.concat(num_str.substring(0, i));				//最初からi-1文字目までを末尾に連結

				BigInteger CYC_NUM = new BigInteger(cyc_num);
				if(!CYC_NUM.isProbablePrime(10))isPrime = false;//素数でなかったらフラグを折る
			}
			if(isPrime){
				total++;
				System.out.println("circular prime:" + num);
			}
		}

		System.out.println("Answer:" + total);
	}
}

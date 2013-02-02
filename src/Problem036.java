

public class Problem036 {

	public static void main(String[] args){

		long total = 0;

		for(long num = 1; num < 1000000; num++){
			String num_str = Long.toString(num);
			String binary_str = Long.toBinaryString(num);

			if(isPalindromicNumber(num_str) && isPalindromicNumber(binary_str)){
				//対象数とそのバイナリーが回文数ならtotalに加える
				total += num;
				System.out.println("PalindromicNumber:" + num_str + "(binary:" + binary_str + ")");
			}
		}

		System.out.println("Answer:" + total);
	}

	private static boolean isPalindromicNumber(String str_num){

		int length = str_num.length();
		char char_num[] = str_num.toCharArray();

		for(int i = 0; i < (length / 2); i++){
			if(char_num[i] != char_num[length -1 - i])return false;
		}

		return true;
	}
}

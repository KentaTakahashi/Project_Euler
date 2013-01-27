
public class Problem017 {

	public static void main(String[] args){

		/*
		 * 01 one		3 * 190 + 1 (for thousand)
		 * 02 two		3 * 190
		 * 03 three		5 * 190
		 * 04 four		4 * 190
		 * 05 five		4 * 190
		 * 06 six		3 * 190
		 * 07 seven		5 * 190
		 * 08 eight		5 * 190
		 * 09 nine		4 * 190
		 *
		 * 10 ten		3 * 10
		 * 11 eleven	6 * 10
		 * 12 twelve	6 * 10
		 * 13 thirteen	8 * 10
		 * 14 fourteen	8 * 10
		 * 15 fifteen	7 * 10
		 * 16 sixteen	7 * 10
		 * 17 seventeen 9 * 10
		 * 18 eighteen	8 * 10
		 * 19 nineteen	8 * 10
		 *
		 * 20 twenty	6 * 100
		 * 30 thirty	6 * 100
		 * 40 forty		5 * 100
		 * 50 fifty		5 * 100
		 * 60 sixty		5 * 100
		 * 70 seventy	7 * 100
		 * 80 eighty	6 * 100
		 * 90 ninety	6 * 100
		 *
		 * 100 hundred	7 * 900
		 *
		 * 1000 thousand 8 * 1
		 *
		 *  and 		3 * 99 * 9
		 */

		int total = 3
				+ (3 + 3 + 5 + 4 + 4 + 3 + 5 + 5 + 4) * 190
				+ (3 + 6 + 6 + 8 + 8 + 7 + 7 + 9 + 8 + 8) * 10
				+ (6 + 6 + 5 + 5 + 5 + 7 + 6 + 6) * 100
				+ 7 * 900
				+ 8 * 1
				+ 3 * 99 * 9;

		System.out.println("Answer:" + total);
    }



}

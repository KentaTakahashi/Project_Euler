

public class Problem040 {

	public static void main(String[] args){

		long n = 1;
		String int_seq = "";

		while(true){
			int_seq = int_seq.concat(Long.toString(n));
			if(1000000 < int_seq.length())break;
			n++;
			//System.out.println(int_seq);
		}

		int d_1 		= Integer.parseInt(int_seq.substring(0, 1));
		int d_10 		= Integer.parseInt(int_seq.substring(9, 10));
		int d_100 		= Integer.parseInt(int_seq.substring(99, 100));
		int d_1000 		= Integer.parseInt(int_seq.substring(999, 1000));
		int d_10000 	= Integer.parseInt(int_seq.substring(9999, 10000));
		int d_100000 	= Integer.parseInt(int_seq.substring(99999, 100000));
		int d_1000000 	= Integer.parseInt(int_seq.substring(999999, 1000000));

		System.out.println("Answer:" + d_1 + " * " + d_10 + " * " + d_100 +" * " + d_1000 + " * " + d_10000 + " * " + d_100000 + " * " + d_1000000
				+ " = " + (d_1 * d_10 * d_100 * d_1000 * d_10000 * d_100000 * d_1000000));
	}
}


public class Problem002 {

	public static void main(String[] args){

		long n = 4000000;
		long fib = 2;
		long pre_fib = 1;
		long total = 0;
		long tmp = 0;

		while(fib <= n)
		{
			//偶数なら合計値に加える
			if(fib % 2 == 0) total += fib;

			//フィボナッチ数列更新
			tmp = fib;
			fib += pre_fib;
			pre_fib = tmp;
		}

        System.out.println("Answer:" + total);
    }

}

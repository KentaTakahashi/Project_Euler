
public class Problem005 {

	public static void main(String[] args){

		long n = 20;
	    long j = 1;
	    long k = 1;
	    long l = 1;

	    for(j = 1; j <= n; j++)
	    {
	        l = gcd(k, j);
	        k = k * j / l;
	    }
        System.out.println("Answer:" + k);
    }
	//*********************************************************
	// 最大公約数（Greatest Common Divisor）を返す。
	// 引数に0がある場合は0を返す。
	//*********************************************************
	public static long gcd(long m, long n )
	{
		// 引数に0がある場合は0を返す
		if ( ( 0 == m ) || ( 0 == n ) )
			return 0;

		// ユークリッドの方法
		while( m != n )
		{
			if ( m > n ) m = m - n;
			else         n = n - m;
		}
		return m;
	}//gcd

}

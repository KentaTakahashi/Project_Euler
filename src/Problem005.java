
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
	// �ő���񐔁iGreatest Common Divisor�j��Ԃ��B
	// ������0������ꍇ��0��Ԃ��B
	//*********************************************************
	public static long gcd(long m, long n )
	{
		// ������0������ꍇ��0��Ԃ�
		if ( ( 0 == m ) || ( 0 == n ) )
			return 0;

		// ���[�N���b�h�̕��@
		while( m != n )
		{
			if ( m > n ) m = m - n;
			else         n = n - m;
		}
		return m;
	}//gcd

}

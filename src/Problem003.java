
public class Problem003 {

	public static void main(String[] args){

		long n = 600851475143L;
		long dev = 1;

		while(n > 1)
		{
			dev++;

			while(true)
			{
				if(n % dev == 0)
				{
					n /= dev;
				}else{
					break;
				}
			}
		}

        System.out.println("Answer:" + dev);
    }

}

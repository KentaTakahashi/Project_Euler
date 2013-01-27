import java.math.BigInteger;
import java.util.ArrayList;


public class Problem029 {

	public static void main(String[] args){

		ArrayList<Object> list = new ArrayList<Object>();

		for(int a = 2; a <= 100; a++)
		{
			for(int b = 2; b <= 100; b++)
			{
				BigInteger A = new BigInteger(Long.toString(a));
				BigInteger TMP = A.pow(b);

				if(!list.contains(TMP))list.add(TMP);
			}
		}
		System.out.println("Answer:" + list.size());
	}
}

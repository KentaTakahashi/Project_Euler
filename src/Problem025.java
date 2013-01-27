import java.math.BigInteger;


public class Problem025 {

	public static void main(String[] args){

		BigInteger feb = new BigInteger("1");
		BigInteger pre_feb = new BigInteger("1");
		BigInteger tmp = new BigInteger("0");

		BigInteger target = new BigInteger("10");
		target = target.pow(1000 -1);//2桁になるのは10の1乗、3桁になるのは10の2乗・・・・1000桁になるのは10の（1000-1）乗
		long count = 2;//配列は2番目からスタート

		while(true)
		{
			//フィボナッチ数列更新
			tmp = feb;
			feb = feb.add(pre_feb);
			pre_feb = tmp;
			count++;

			//ターゲットとの差をとり、負の値になったらbreak
			tmp = target.subtract(feb);
			if(tmp.signum() <= 0) break;
		}

		System.out.println("Answer:" + count);
	}
}

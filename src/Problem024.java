import java.util.ArrayList;


public class Problem024 {

	public static void main(String[] args){

		//答えはあっているが、かなり微妙なコード、要リファクタリング

		long[] rank = new long[10];
		long[] ans = new long[10];
		long ans_total = 0;
		long num = 1000000 - 1;
		ArrayList<Integer> listtNums = new ArrayList<Integer>();
		listtNums.add(0);
		listtNums.add(1);
		listtNums.add(2);
		listtNums.add(3);
		listtNums.add(4);
		listtNums.add(5);
		listtNums.add(6);
		listtNums.add(7);
		listtNums.add(8);
		listtNums.add(9);

		for(int n = 0; n < 10; n++)
		{
			rank[n] = 1;
			for(int m = 0; m <= n; m++)
			{
				rank[n] *= (m + 1);
			}
		}
		//stem.out.println("Answer:" + rank[9]);

		int i = 9;
		while(i > 0)
		{
			long dev = num / rank[i -1];
			num -= (rank[i -1] * dev);
			int dev_int =(int) dev;
			System.out.println("Answer:" + i + dev + dev_int + num);
			ans[i] = listtNums.get(dev_int);
			listtNums.remove(dev_int);

			i--;
		}
		ans[0] = listtNums.get(0);

		for(int j = 0; j < 10; j++)
		{
			ans_total += (ans[j] * (Math.pow(10, j)));
		}
		System.out.println("Answer:" + ans_total);

    }

}


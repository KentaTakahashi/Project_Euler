import java.util.ArrayList;


public class Problem023 {

	public static void main(String[] args){

		ArrayList<Integer> abundantNums = new ArrayList<Integer>();
		long total = 0;
		boolean isAdd= false;

		for(int n = 1; n <= 28123; n++)
		{
			if(n < Problem021.d(n))//過剰数ならリストに追加する
			{
				abundantNums.add(n);
			}
		}
		System.out.println("abundantNums.size():" + abundantNums.size());

		for(int m = 1; m < 28123; m ++)
		{
			isAdd= true;

			for(int i = 0; i < abundantNums.size(); i++)
			{
				for(int j = 0; j < abundantNums.size(); j++)
				{
					int tmp = abundantNums.get(i) + abundantNums.get(j);
					if(tmp == m) isAdd = false;     //過剰数の和でmをあらわせたなら、for文をフラグ書き換え
					if(tmp >= m) break;         //過剰数の和がm以上ならfor文をbreak
				}
			}
			System.out.println("m:" + m);
			if(isAdd) total += m;
		}

		//Answer:4179871　20分くらいかかった。アルゴリズム改良の余地あり
		System.out.println("Answer:" + total);
    }

}

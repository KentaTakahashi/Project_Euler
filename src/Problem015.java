
public class Problem015 {

	public static void main(String[] args){


		int wideth = 20;
		int hight = 20;
		long root[][] = new long[wideth + hight + 1][wideth + hight + 1];
		int i, j;

		for(i = 1; i <= wideth + hight; i++)
		{
			for(j = 0; j <= i; j++)
			{
				if ((i - j < 0)||(i - j > wideth + 1)){}//do nothing
				else if((j == 0)||( (i - j) == 0)) root[j][i - j] = 1;
				else root[j][i - j] = root[j - 1][i - j] + root[j][i - j - 1];
			}
		}

		//System.out.println("Answer:" + seq(20, 20));//本当はこれだけで再帰処理を走らせられるが、スタックが深すぎるため？処理が戻ってこなかった。。。
		System.out.println("Answer:" + root[wideth][hight]);
    }

	public static long seq(long wideth, long hight)
	{
		if(wideth == 0) return 1;
		else if (hight == 0) return 1;
		else return (seq(wideth, hight - 1) + seq(wideth - 1, hight));
	}
}

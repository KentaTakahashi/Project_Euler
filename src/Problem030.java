
public class Problem030 {

	public static void main(String[] args){

		long total = 0;

		//�����܂��ܐ����A999999���傫���l�ŏ����𖞂����������������Ƃ͏ؖ����ĂȂ�

		for(long i = 2; i <= 9999999; i++)
		{
			double tmp = Math.pow((i % 10), 5) + Math.pow(((i / 10) % 10), 5) + Math.pow(((i / 100) % 10), 5)
					+ Math.pow(((i / 1000) % 10), 5) + Math.pow(((i / 10000) % 10), 5) + Math.pow(((i / 100000) % 10), 5) ;
			//System.out.println(tmp);
			if(tmp == i)total += tmp;
		}
		System.out.println("Answer:" + total);
	}
}

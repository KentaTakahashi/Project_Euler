import java.util.ArrayList;


public class Problem023 {

	public static void main(String[] args){

		ArrayList<Integer> abundantNums = new ArrayList<Integer>();
		long total = 0;
		boolean isAdd= false;

		for(int n = 1; n <= 28123; n++)
		{
			if(n < Problem021.d(n))//�ߏ萔�Ȃ烊�X�g�ɒǉ�����
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
					if(tmp == m) isAdd = false;     //�ߏ萔�̘a��m������킹���Ȃ�Afor�����t���O��������
					if(tmp >= m) break;         //�ߏ萔�̘a��m�ȏ�Ȃ�for����break
				}
			}
			System.out.println("m:" + m);
			if(isAdd) total += m;
		}

		//Answer:4179871�@20�����炢���������B�A���S���Y�����ǂ̗]�n����
		System.out.println("Answer:" + total);
    }

}

import java.math.BigInteger;


public class Problem025 {

	public static void main(String[] args){

		BigInteger feb = new BigInteger("1");
		BigInteger pre_feb = new BigInteger("1");
		BigInteger tmp = new BigInteger("0");

		BigInteger target = new BigInteger("10");
		target = target.pow(1000 -1);//2���ɂȂ�̂�10��1��A3���ɂȂ�̂�10��2��E�E�E�E1000���ɂȂ�̂�10�́i1000-1�j��
		long count = 2;//�z���2�Ԗڂ���X�^�[�g

		while(true)
		{
			//�t�B�{�i�b�`����X�V
			tmp = feb;
			feb = feb.add(pre_feb);
			pre_feb = tmp;
			count++;

			//�^�[�Q�b�g�Ƃ̍����Ƃ�A���̒l�ɂȂ�����break
			tmp = target.subtract(feb);
			if(tmp.signum() <= 0) break;
		}

		System.out.println("Answer:" + count);
	}
}


public class Problem002 {

	public static void main(String[] args){

		long n = 4000000;
		long fib = 2;
		long pre_fib = 1;
		long total = 0;
		long tmp = 0;

		while(fib <= n)
		{
			//�����Ȃ獇�v�l�ɉ�����
			if(fib % 2 == 0) total += fib;

			//�t�B�{�i�b�`����X�V
			tmp = fib;
			fib += pre_fib;
			pre_fib = tmp;
		}

        System.out.println("Answer:" + total);
    }

}

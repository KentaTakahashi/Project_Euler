
public class Problem019 {

	public static void main(String[] args){

		int year = 1900;
		int month = 1;
		int day = 1;//���j��1�A���j��0�Ƃ���
		int count = 0;

		while(year <= 2000)
		{
			for(month = 1; month <= 12; month++)
			{
				switch(month)
				{
				case 1:
					day += 31;
					break;
				case 2:
					day += FebruaryDays(year);//���邤�N���肵�ē�����Ԃ�
					break;
				case 3:
					day += 31;
					break;
				case 4:
					day += 30;
					break;
				case 5:
					day += 31;
					break;
				case 6:
					day += 30;
					break;
				case 7:
					day += 31;
					break;
				case 8:
					day += 31;
					break;
				case 9:
					day += 30;
					break;
				case 10:
					day += 31;
					break;
				case 11:
					day += 30;
					break;
				case 12:
					day += 31;
					break;
				default:
					System.out.println("No month:" + month);
				}

				day %= 7;//�T�Ŋ���Aint�Ŏ��܂点�邽��

				if(year == 1900)continue; //1900�N��19���I�Ȃ̂őΏۊO�A�d�l�͂悭�ǂ����B�B�B

				if(day == 0)//���j�Ȃ�J�E���g�A�b�v
				{
					count++;
				}
			}
			year++;
		}

		System.out.println("Answer:" + count);
    }

	public static int FebruaryDays(int year)
	{
		int day;

		if((year % 4 == 0) && (year != 1900))
		{
			day = 29;
		}else{
			day = 28;
		}

		return day;
	}

}

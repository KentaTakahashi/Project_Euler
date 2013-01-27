
public class Problem019 {

	public static void main(String[] args){

		int year = 1900;
		int month = 1;
		int day = 1;//月曜を1、日曜を0とする
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
					day += FebruaryDays(year);//うるう年判定して日数を返す
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

				day %= 7;//週で割る、intで収まらせるため

				if(year == 1900)continue; //1900年は19世紀なので対象外、仕様はよく読もう。。。

				if(day == 0)//日曜ならカウントアップ
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

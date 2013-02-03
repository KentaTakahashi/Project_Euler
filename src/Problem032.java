import java.util.ArrayList;


public class Problem032 {

	public static ArrayList<Integer> pandCheackList = new ArrayList<Integer>();

	public static void main(String[] args){

		int total = 0;

		ArrayList<Integer> pandigitalList = new ArrayList<Integer>();

		//a:1桁、b:4桁、a*b:4桁の組み合わせ
		for(int a = 1; a <= 9; a++)
		{
			for(int b = 1234; b <= 9876; b++)
			{
				pandCheackList.clear();
				addPandCheackList(a);
				addPandCheackList(b);
				addPandCheackList(a * b);
				if(isPandigital(pandCheackList))
				{
					//Pandigitalでかつ、listになければリストに追加
					if(!pandigitalList.contains(a * b)) pandigitalList.add(a * b);
					System.out.println("a = " + a + " b = " + b + " a * b = " + a * b);
				}
			}
		}

		//a:2桁、b:3桁、a*b:4桁の組み合わせ
		for(int a = 12; a <= 98; a++)
		{
			for(int b = 123; b <= 987; b++)
			{
				pandCheackList.clear();
				addPandCheackList(a);
				addPandCheackList(b);
				addPandCheackList(a * b);

				if(isPandigital(pandCheackList))
				{
					//Pandigitalでかつ、listになければリストに追加
					if(!pandigitalList.contains(a * b)) pandigitalList.add(a * b);
					System.out.println("a = " + a + " b = " + b + " a * b = " + a * b);
				}
			}
		}

		for(int i = 0; i < pandigitalList.size(); i++)
		{
			//System.out.println(pandigitalList.get(i));
			total += pandigitalList.get(i);
		}

		System.out.println("Answer:" + total);
	}

	public static boolean  isPandigital(ArrayList<Integer> pandCheackList)
	{
		if(pandCheackList.contains(0)) return false;//要素に0が含まれるならPandigitalでない
		if(pandCheackList.size() != 9) return false;//要素数が9以外ならPandigitalでない

		for(int i = 1; i <= 9; i++)
		{
			if(!pandCheackList.contains(i)) return false;////要素にiが含まれないならPandigitalでない
		}

		return true;
	}

	public static void  addPandCheackList(int n)
	{
		int digit = String.valueOf(n).length();
		for(int i = digit; i >= 1; i--){
			pandCheackList.add((n / (int)Math.pow(10, i - 1)) % 10);
		}
		return;
	}
}

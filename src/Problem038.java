

public class Problem038 {

	public static void main(String[] args){

		long total = 0;

		Problem032 p32 = new Problem032();

		for(int n = 2; n <= 9; n++){
			int i = 1;
			while(true){

				p32.pandCheackList.clear();

				for(int m = 1; m <= n; m++){
					p32.addPandCheackList(i * m);
				}

				if(p32.isPandigital(p32.pandCheackList)){
					System.out.println("Pandigital:" + p32.pandCheackList);
				}

				if(p32.pandCheackList.size() > 9) break;

				i++;
			}

		}

		//System.out.println("Answer:" + total);
	}
}


public class Problem031 {

	public static void main(String[] args){

		int count = 0;

		for(int p200 = 0; p200 <= 1; p200++)
		{
			for(int p100 = 0; p100 <= 2; p100++)
			{
				for(int p50 = 0; p50 <= 4; p50++)
				{
					for(int p20 = 0; p20 <= 10; p20++)
					{
						for(int p10 = 0; p10 <= 20; p10++)
						{
							for(int p5 = 0; p5 <= 40; p5++)
							{
								for(int p2 = 0;p2 <= 100; p2++)
								{
									if(200 >= p200 * 200 + p100 * 100 + p50 * 50 + p20 * 20 + p10 * 10 + p5 * 5 + p2 * 2) count++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println("Answer:" + count);
	}
}

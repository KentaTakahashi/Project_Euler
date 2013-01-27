
public class Problem004 {

	public static void main(String[] args){

		int i = 999;
		int j = 999;
		int kaibun;

		for(i = 999; i > 0; i--)
	    {
			kaibun = (1000 * i) +(100 * (i % 10)) + (10 * ((i / 10) % 10)) + (1 * ((i / 100) % 10));

	        for(j = 999; j > 0; j--)
	        {
	            if((kaibun % j == 0) && (kaibun / j) < 1000)
	            {
	            	System.out.println("Answer:" + kaibun);
	                return;
	            }
	        }
	    }
    }

}



public class Problem039 {

	public static void main(String[] args){

		long max_p = 0;
		long max_triangle = 0;

		for(int p = 12; p <= 1000; p++){
			int triangle_count = 0;
			for(int c = (3 / p); c <= p; c++){
				for(int a = 3; a <= (p - c) / 2; a++){
					int b = p - c - a;
					if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
						System.out.println("a = " + a + ", b = " + b + ", c = " + c);
						triangle_count++;
					}
				}
			}
			if(max_triangle < triangle_count){
				max_triangle = triangle_count;
				max_p = p;
			}
		}


		System.out.println("Answer:" + max_p);
	}
}

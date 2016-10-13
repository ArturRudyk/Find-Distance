package distance;

public class FindDistance {
	public static void main (String args[]){
		
		int mas[]= {23, 45, 34, 12, 45, 4, 38, 56, 2, 49, 100};
		int buf;
		int position=0;
		int position2=0;
		
		for (int i = 1; i<mas.length; i++){			
			if (mas[position2]>mas[i]){
				position2=i;
				if(mas[position]>mas[position2]){
					buf=position;
					position=position2;
					position2=buf;
				}
			}
						
		}
		
		System.out.println(Math.abs(position2-position));
		
		
	}
}

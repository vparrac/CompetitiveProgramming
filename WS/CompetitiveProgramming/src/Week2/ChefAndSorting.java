package Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ChefAndSorting {

	public static void main(String[] args) throws IOException {
		StringBuilder rta= new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int number=	Integer.parseInt(in.readLine().trim());

		for (int i = 0; i < number; i++) {
			in.readLine();
			String[] line1 = in.readLine().split(" ");
			ArrayList<Integer> array = new ArrayList<>();
			for (int j = 0; j < line1.length; j++) {
				array.add(Integer.parseInt(line1[j]));
			} 
			int movements=-1;
			int number2=0;

			while(!(number2==(array.size()-movements))) {
				int max=array.get(0);
				movements++;
				int index=0;
				number2=0;
				for (int j = 0; j < array.size()-movements; j++) {				
					if(array.get(j)>=max) {						
						max=array.get(j);
						index=j;
						number2++;

					}										
				}
				if(!(number2==(array.size()-2))) {
					int maxN= array.get(index);
					array.remove(index);
					array.add(array.size()-movements, maxN);
				}
			}
			
			String fin=(i==number-1)?movements+"":movements+"\n";
			rta.append(fin);			
		}
		System.out.println(rta);
	}


}

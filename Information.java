
public class Emloyeeproject {
	public static void main(String[]args) {
		
		String[][]Info =
		{{"Robert","1994","64c-WallsStreet"},
			{"Sam","200","68D-WallsStreet"},
				{"John","1999","26B-WallsStreet"}};
				
		System.out.println("Name "+" Year of Joining "+" Address ");
		for(int i=0; i<Info.length ;  i++) {
			System.out.println();
			for (int j=0; j<Info[i].length; j++) {
				System.out.print(Info[i][j]+" \t");
			}
			
		}
		
	}

}

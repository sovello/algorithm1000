package space.fugit;

public class Stars {

	public static void main(String[] args) {
		triangle(3);
		triangle(5);
		triangleRight(8);
		tree(5);
		tree(8);
	}
	
	private static void triangle(int levels) {
		int spaces = levels-1;
		StringBuilder stars = new StringBuilder();
		for(int i = 0; i < levels; i++) {
			stars.append('*');
			if( spaces != 0) {
				System.out.format("%"+spaces+"s", "");
			}
			System.out.println(String.format("%s", stars.toString()));
			
			spaces -= 1;
		}
	}
	private static void triangleRight(int levels) {
		StringBuilder stars = new StringBuilder();
		for(int i = 0; i < levels; i++) {
			stars.append('*');
			System.out.println(String.format("%s", stars.toString()));
		}
	}
	
	public static void tree(int levels) {
		int spaces = levels-1;
		StringBuilder stars = new StringBuilder();
		StringBuilder left = new StringBuilder();
		for(int i = 0; i < levels; i++) {
			stars.append('*');
			if( spaces > 0) {
				System.out.format("%"+spaces+"s", "");
			}
			System.out.print(String.format("%s", stars.toString()));
			if( i > 0) {
				left.append("*");
				System.out.print(String.format("%s", left.toString()));
			}
			System.out.println();
			spaces -= 1;
		}
		
		//Stalk
		for(int i = 0; i <= levels; i++) {
			int space = levels-1;
			System.out.format("%"+space+"s", "");
			System.out.println("*");
		}
	}
}

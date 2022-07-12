
public class Feladat01 {
	
	public static int feladat01(String[] szinek) {
		int hossz = szinek.length;
		int sum = 0;
		for (int i = 2; i <= hossz; i++) {
			if (i == 2)
				sum += (hossz * (hossz-1)) / i;
			else {
				int szaml = hossz;
				int nev = i;
				for (int j = hossz-1; j > hossz - i + 1; j--) {
					szaml *= i;
				}
				for (int j = i - 1; j > 1; j--) {
					nev *= j;
				}
				sum += (szaml / nev);
			}
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		String[] szinek = {"kek", "piros", "sarga"};
		System.out.println(feladat01(szinek));
	}

}

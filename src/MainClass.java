import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("di che marca è il tuo telefono?");
		String marca=scan.nextLine();
		System.out.println("che modello è?");
		String modello=scan.nextLine();
		System.out.println("qual'è stato il prezzo di lancio?");
		int pz=scan.nextInt();
		System.out.println("quanti pollici misura lo schermo?");
		double pollici=scan.nextDouble();
		System.out.println("quanta ram ha?");
		int ram=scan.nextInt();
		fascistaprezzo(pz);
		grandezzaschermo(pollici);
	}
	public static void fascistaprezzo(int pz) {
		if(pz>500) {
			System.out.println("il tuo telefono fa parte della fascia alta di prezzo");
		}
		if(pz<500 && pz>200) {
			System.out.println("il tuo telefono fa parte della fascia media di prezzo");
		}
		if(pz<200) {
			System.out.println("il tuo telefono fa parte della fascia bassa di prezzo");
		}
	}
	public static void grandezzaschermo(int pollici) {
		if(pollici<5) {
			System.out.println("il tuo telefono è mini");
		}
		if(pollici>5 && pollici <7) {
			System.out.println("il tuo telefono è di media grandezza");
		}
		if(pollici>7) {
			System.out.println("il tuoe telefono è grande");
	}
	}
	
}


import java.util.Scanner;

public class Konverter {

	public static double kilogramUFunte(double a) {
		return a * 2.2046;
	}

	public static double funteUKilograme(double a) {
		return a / 2.2046;
	}

	public static double cmUInce(double a) {
		return a / 2.54;
	}

	public static double inceUCm(double a) {
		return a * 2.55;
	}

	public static double celzijusiUFarenhajte(double a) {
		return a * 1.8 + 32;
	}

	public static double farnehajtiUCelzijuse(double a) {
		return (a - 32) * 5 / 9;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Izaberite opciju: ");
		System.out.println("1. Kilogrami u funte");
		System.out.println("2. Funte u kilograme");
		System.out.println("3. Centimetri u ince");
		System.out.println("4. Ince u centimetre");
		System.out.println("5. Celzijusi u farenhajte");
		System.out.println("6. Farenhajti u celzijuse");

		int izbor = input.nextInt();

		double vrijednost = 0;

		if (izbor > 0 && izbor < 7) {
			System.out.println("Unesite vrijednost: ");
			vrijednost = input.nextDouble();
		}
		
		input.close();

		switch (izbor) {
		default:
			System.out.println("Pogresan unos.");
			break;
		case 1:
			System.out.println(vrijednost + " kilograma je " + kilogramUFunte(vrijednost) + " funti.");
			break;
		case 2:
			System.out.println(vrijednost + " funti je " + funteUKilograme(vrijednost) + " kilograma.");
			break;
		case 3:
			System.out.println(vrijednost + " centimetara je " + cmUInce(vrijednost) + " inca.");
			break;
		case 4:
			System.out.println(vrijednost + " inci je " + inceUCm(vrijednost) + " centimetara.");
			break;
		case 5:
			System.out.println(vrijednost + " celzijusa je " + celzijusiUFarenhajte(vrijednost) + " farenhajti.");
			break;
		case 6:
			System.out.println(vrijednost + " farenhajti je " + farnehajtiUCelzijuse(vrijednost) + " celzijusa.");
			break;	
		}
	}
}

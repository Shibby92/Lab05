public class Dice {

	public static void main(String[] args) {

		double broj1 = (int) (Math.random() * 6) + 1;

		double broj2 = (int) (Math.random() * 6) + 1;

		double suma = broj1 + broj2;

		System.out.println("Prvi broj je: " + broj1);

		System.out.println("Drugi broj je: " + broj2);

		System.out.println("Suma ta dva broja je: " + suma);

	}

}
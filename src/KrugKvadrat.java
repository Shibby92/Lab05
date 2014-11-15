public class KrugKvadrat {

	public static void main(String[] args) {

		int broj = 7;

		double omjer = (broj * broj * Math.PI) / (broj * broj);

		double random = (0.5 + (Math.random() * 37.2));

		System.out.println(broj * broj);

		System.out.println(4 * broj);

		System.out.println(broj * broj * Math.PI);

		System.out.println(2 * broj * Math.PI);

		System.out.println((int) (omjer));

		System.out.println(random);

		System.out.println(broj * broj * Math.PI * random);

	}

}
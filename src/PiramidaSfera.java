public class PiramidaSfera {
	public static void main(String[] args) {
		double nasumican = 2;
		double cetiriTrecine = 1.333333333;
		int visina = 8;
		System.out.println(nasumican);
		System.out.println("Vp= " + nasumican * nasumican * visina / 3);
		System.out.println("Pp= "
				+ (nasumican * nasumican + 2
						* nasumican
						* Math.sqrt(((nasumican / 2) * (nasumican / 2) + visina
								* visina))));
		System.out.println("Vs= " + Math.PI * nasumican * nasumican * nasumican
				* cetiriTrecine);
		System.out.println("Ps= " + 4 * Math.PI * nasumican * nasumican);
	}
}
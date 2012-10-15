
public class calculo {

	
	public static void main(String[] args) {
		
		circulo pelota = new circulo(2, 2, "rojo", 3);
		System.out.println("Area:      "+pelota.area());
		System.out.println("Perimetre: "+pelota.perimetre());
		System.out.println(pelota.toString());
		
		cuadrado dado = new cuadrado(2, 2, "rojo", 5);
		System.out.println("Area:      "+dado.area());
		System.out.println("Perimetre: "+dado.perimetre());
		System.out.println(dado.toString());
	}

}

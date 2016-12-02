public class TestRectangulo {
	public static void main(String[] args){
		// creamos objetos de tipo rectangulo
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		/*System.out.println(r1.lado1);
		System.out.println(r2.lado2);*/ //no tienen accesibilidad porque lado 1 y lado 2 son atributos privados
		
		r2.setLado1(100); //actualizar los valores del atributo lado 1
		r2.setLado2(1000); //actualizar los valores del atributo lado 2
		
		System.out.printf("Atributos del rectángulo 1, lado1: %d, lado2: %d%n", r1.getLado1(), r1.getLado2());
		System.out.printf("Atributos del rectángulo 2, lado1: %d, lado2: %d%n", r2.getLado1(), r2.getLado2());
	}
}

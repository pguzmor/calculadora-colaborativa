public class Calculadora {

    // === ZONA USUARIO A ===
    public double sumar(double a, double b) {
    return a + b;
    }

    // === ZONA USUARIO B ===
    public double restar(double a, double b) {
        return a - b;
    }

    // === ZONA USUARIO C ===
	public double multiplicar(double a, double b) {
    		return a * b;
	}


    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
	System.out.println("Bienvenido a la Aplicación Calculadora Java");
	
    }
}

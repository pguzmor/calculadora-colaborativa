public class Calculadora {

    // === ZONA USUARIO A ===
    public double sumar(double a, double b) {
    return a + b;
    }
    public double dividir(double a, double b) {
    return a / b;
    }


    // === ZONA USUARIO B ===
    public double restar(double a, double b) {
        return a - b;
    }
    
    private String ultimaOperacion = "Ninguna";

    public String getUltimaOperacion() {
    	return ultimaOperacion;
    }


    // === ZONA USUARIO C ===
	public double multiplicar(double a, double b) {
    		return a * b;
	}


    public static void main(String[] args) {
	Calculadora calc = new Calculadora();
	
	System.out.println("==============================");
        System.out.println("     CALCULADORA JAVA");
        System.out.println("==============================");

	System.out.println("Calculadora Colaborativa v1.0");
	System.out.println("Suma 10 + 5 = " + calc.sumar(10, 5));
	System.out.println("Resta 10 - 5 = " + calc.restar(10, 5));
	System.out.println("Multiplicacion 10 * 5 = " + calc.multiplicar(10, 5));

    }
}

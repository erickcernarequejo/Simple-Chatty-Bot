import java.time.LocalDate;
import java.util.Scanner;

public class App {
    
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        System.out.println("Hola, qué nombre deseas colocarme ?");
        String name = scanner.nextLine();
        saludar(name, LocalDate.now().getYear());
        recordarNombre();
        adivinarEdad();
        contar();
        prueba();
        finalizar();
    }

    static void saludar(String assistantName, int birthYear) {
        System.out.println("\nHola! Mi nombre es " + assistantName + ".");
        System.out.println("Fui creado en el año " + birthYear + ".");
        System.out.println("Por favor, dime, cómo te llamas ?");
    }

    static void recordarNombre() {
        String name = scanner.nextLine();
        System.out.println("\nQue gran nombre tienes, " + name + "!");
    }

    static void adivinarEdad() {
        System.out.println("Déjame adivinar tu edad");
        System.out.println("Cuál es el resto de dividir tu edad entre 3");
        int rem3 = scanner.nextInt();
        System.out.println("Cuál es el resto de dividir tu edad entre 5");
        int rem5 = scanner.nextInt();
        System.out.println("Cuál es el resto de dividir tu edad entre 7");
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Tu edad es " + age + "; es un buen momento para empezar a programar!");
    }

    static void contar() {
        System.out.println("\nAhora te demostraré que puedo contar hasta el número que desees.");
        System.out.println("Hasta qué número deseas que lo haga ?");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void prueba() {

        System.out.println("\nAhora realizaré un pregunta");
        System.out.println("Por qué usamos métodos?");

        int opcion;
        do {

            System.out.println("\n1. Para repetir una declaración varias veces."
                    + "\n2. Para descomponer un programa en varias subrutinas pequeñas."
                    + "\n3. Para determinar el tiempo de ejecución de un programa."
                    + "\n4. Para interrumpir la ejecución de un programa.");

            System.out.println("Ingresa la opción correcta");
            opcion = scanner.nextInt();

        } while (!verificarRespuesta(opcion));

    }

    static boolean verificarRespuesta(int opcion) {
        if (opcion == 2) {
            return true;
        }
        System.out.println("Por favor, intenta nuevamente");
        return false;
    }

    static void finalizar() {
        System.out.println("Felicidades, ten un excelente día!"); 
    }

}

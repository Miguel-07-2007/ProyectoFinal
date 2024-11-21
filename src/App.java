import java.util.Scanner;

public class App {
// Asignación de variables estáticas
    static Scanner scanner = new Scanner(System.in);
    static String[] planetas = {"Marte", "Jupiter", "Saturno"};
    static double[] distancias= {78.0, 628.0, 1256.0};
    static String[] naves = {"De reconocimiento", "Tripulada lenta", "Tripulada veloz"};
    static double[] velocidades = {15_000.0, 10_000.0, 20_000.0};

    public static void main(String[] args) throws Exception {
    
       getOpcion();

    }

    private static void getOpcion() {
        int opcion;
           mostrarMenu();
        
           
            do{
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        seleccionarPlaneta();
                        break;
                    case 2:
                       calcularDistanciaYTiempo();
                        break;
                    case 3:
                        seleccionarNave();
                        break;
                    case 4:
                        consultarRecursos();
                        break;
                    case 5:
                        iniciarSimulación();
                        break;
                    case 6:
                        
                        break;
                    default: System.err.println("Opción no válida");
                        break;





                }



            }while(opcion != 4);
    }

    public static void mostrarMenu(){
        System.out.println("\n---Menú Principal---");
        System.out.println("1. Seleccionar un planeta de destino");
        System.out.println("2. Calcular distancia y tiempo");
        System.out.println("3. Seleccionar una nave espacial");
        System.out.println("4. Consultar recursos");
        System.out.println("5. Iniciar la simulación del vuelo");
        System.out.println("6. Salir");
        System.out.println("Por favor, elige una opción: ");
     
    }

    public static void seleccionarPlaneta(){

        System.out.println("A continuación se encuentran los posibles destinos: ");
        System.out.println("1. Saturno");
        System.out.println("2. venus");
        System.out.println("3. marte");

   
        System.out.println("A continuación seleccione su planeta de destino: ");
        int option = scanner.nextInt();

       switch (option) {
            case 1:
                System.out.printf("Planeta seleccionado: " + planetas[2] + "ditancia hasta su planeta es de " + distancias[2]);
                break;
            case 2:
                System.out.printf("Planeta seleccionado: " + planetas[1] + "ditancia hasta su planeta es de " + distancias[1]);
                break;
            case 3:
                System.out.printf("Planeta seleccionado: " + planetas[0] + "ditancia hasta su planeta es de " + distancias[0]);
                break;

            default : System.err.println("Opción no válida");
                break;
            }

    }

    public static void calcularDistanciaYTiempo() {
        
    }

    public static void seleccionarNave () {
        
    }

    public static void consultarRecursos() {

    }

    public static void iniciarSimulación() {
        
    }
    
//Métodos auxiliares.
public static void imprimirPlanetas(){}

public static void lanzarEvento(){}





}
import java.util.Scanner;

public class App {
// Asignación de variables estáticas
    static Scanner scanner = new Scanner(System.in);
    static String[] planetas = {"Marte", "Jupiter", "Saturno"};
    static double[] distancias= {78.0, 628.0, 1256.0};
    static String[] naves = {"De reconocimiento", "Tripulada lenta", "Tripulada veloz"};
    static double[] velocidades = {15_000.0, 10_000.0, 20_000.0};
    static int   [] capacidad = {1, 4, 2};

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
                        seleccionarNave();
                        break;
                    case 3:
                        iniciarSimulacion();
                        break;
                 
                    default: System.err.println("Opción no válida");
                        break;





                }



            }while(opcion != 5);
    }

    public static void mostrarMenu(){
        System.out.println("\n1====================================");
        System.out.println("--------- Menú Principal ---------");
        System.out.println("1. Seleccionar un planeta de destino");
        System.out.println("2. Seleccionar una nave espacial");
        System.out.println("3. Iniciar la simulación del vuelo");
        System.out.println("4. Salir");
        System.out.println("Por favor, elige una opción: ");
        System.out.println("====================================");
     
    }

    public static void seleccionarPlaneta(){

        System.out.println("A continuación se encuentran los posibles destinos: ");
        System.out.println("1. Saturno");
        System.out.println("2. venus");
        System.out.println("3. marte");
         System.out.println("4. salir");
   
        System.out.println("A continuación seleccione su planeta de destino: ");
        int option = scanner.nextInt();
        //Consumir el <ENTER>
        scanner.nextLine();
       switch (option) {
            case 1:
                System.out.printf("Planeta seleccionado: " + planetas[2] + " y la ditancia hasta su planeta es de " + distancias[2]);
               getOpcion();
                break;
            case 2:
                System.out.printf("Planeta seleccionado: " + planetas[1] + "y la ditancia hasta su planeta es de " + distancias[1]);
                getOpcion();
                break;
            case 3:
                System.out.printf("Planeta seleccionado: " + planetas[0] + "y la ditancia hasta su planeta es de " + distancias[0]);
                getOpcion();
                break;
            case 4:
                getOpcion();

            default : System.err.println("Opción no válida");
                break;
            }

    }

    public static void calcularTiempo() {
        
    }

    public static void seleccionarNave () {
        System.out.println("A continuación se encuentran las posibles naves: ");
        System.out.println("1. nave " + naves[0]);
        System.out.println("2. nave " + naves[1]);
        System.out.println("3. nave " + naves[2]);

   
        System.out.println("A continuación seleccione su planeta de destino: ");
        int option = scanner.nextInt();

       switch (option) {
            case 1:
                System.out.printf("Nave seleccionada: " + naves[0] + ", la velocidad de su nave es de: " + velocidades[0] + " Y la capacidad de su nave es de: " + capacidad[0] + " personas");
                break;
            case 2:
            System.out.printf("Nave seleccionada: " + naves[1] + ", la velocidad de su nave es de: " + velocidades[1] + " Y la capacidad de su nave es de: " + capacidad[1] + " personas");
                break;
            case 3:
            System.out.printf("Nave seleccionada: " + naves[2] + ", la velocidad de su nave es de: " + velocidades[2] + " Y la capacidad de su nave es de: " + capacidad[2] + " personas");
                break;

            default : System.err.println("Opción no válida");
                break;
       }
    }


    public static void iniciarSimulacion() {
        
    }
    
    public static void validarPasajeros() {
        
    }
//Métodos auxiliares.
public static void imprimirPlanetas(){}

public static void lanzarEvento(){}

public static void consultarRecursos(){
    
}



}
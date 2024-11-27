import java.util.Scanner;

public class App {
    // Asignación de variables estáticas
    static Scanner scanner = new Scanner(System.in);
    static String[] planetas = { "Marte", "Jupiter", "Saturno" };
    static double[] distancias = { 78.0, 628.0, 1256.0 }; // Distancia en millones de km
    static String[] naves = { "De reconocimiento", "Tripulada lenta", "Tripulada veloz" };
    static double[] velocidades = { 15_000.0, 10_000.0, 20_000.0 }; // Velocidades en mill de km p hora
    static int naveSeleccionada = 0;
    static int nuemeroPasajeros = 0;
    static int planetaSeleccionado = 0;
    public static void main(String[] args) throws Exception {
        getOpcion();
        System.out.println("HASTA LA VISTA BABY");
    }

    private static void getOpcion() {
        int opcion;
        mostrarMenu();

        do {
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int planeta =  seleccionarPlaneta();
                    break;
                case 2:
                    int nave = seleccionarNave();
                    int pasajeros =  cantidadPasajeros();
                    double duracion = calcularDuración(planetaSeleccionado, naveSeleccionada);
                    break;
                case 3:
                    iniciarSimulacion();
                    break;
                case 4:
                    System.out.println("Saliendo el Juego 'INTERESPACIAL'");
                    break;
                default:
                    System.err.println("Opción no válida");
                    break;
            }

        } while (opcion != 4);
    }

    public static void mostrarMenu() {
        System.out.println("\n====================================");
        System.out.println("--------- Menú Principal ---------");
        System.out.println("1. Seleccionar un planeta de destino");
        System.out.println("2. Seleccionar una nave espacial");
        System.out.println("3. Iniciar la simulación del vuelo");
        System.out.println("4. Salir");
        System.out.println("Por favor, elige una opción: ");
        System.out.println("====================================");

    }

    public static int seleccionarPlaneta() {
        int option = -1;
        while (true) {
            System.out.println("A continuación se encuentran los posibles destinos: ");
            System.out.println("1. Marte");
            System.out.println("2. Jupiter");
            System.out.println("3. Saturno");
            System.out.println("4. Salir");

            System.out.println("A continuación seleccione su planeta de destino: ");
            option = scanner.nextInt();
            // Consumir el <ENTER>
            scanner.nextLine();

            if (option >= 1 && option <= planetas.length) {
                System.out.println("Su planeta de destino es " + planetas[option - 1]);
                System.out.println(
                        "Su distancia con el planeta elegido es de " + distancias[option - 1] + " millones de km.");

                System.out.println("¿Desea confirmar su destino? (S/N)");
                String confirmacion = scanner.nextLine().toUpperCase();// toUpperCase pasa el valor a mayúscula para
                                                                       // evitar errores

                if (confirmacion.equals("S")) {
                    System.out.println(
                            "Destino confirmado: " + planetas[option - 1] + " ...Regresando al menú principal...");
                    getOpcion();
                    break; // Termina el bucle si el usuario confirma
                } else if (confirmacion.equals("N")) {
                    System.out.println("Puede seleccionar otro destino.");
                } else {
                    System.out.println("Respuesta no válida, por favor ingrese 'S' para confirmar o 'N' para cambiar.");
                }
            } else if (option == 4) {
                System.out.println("Saliendo del sistema de selección de destinos.");
                getOpcion();
                break; // Vuelve al menú principal
            } else {
                System.err.println("Opción no válida, por favor coloque un valor válido.");
            }
        }

        return option; // Devuelve el planeta seleccionado
    }

    public static void calcularTiempo() {

    }

    public static int seleccionarNave() {

        int option = -1;
        while (true) {
            System.out.println("A continuación se encuentran las posibles naves: ");
            System.out.println("1. nave " + naves[0]);
            System.out.println("2. nave " + naves[1]);
            System.out.println("3. nave " + naves[2]);
            System.out.println("4. Salir");

            System.out.println("A continuación seleccione su nave para el viaje: ");
            option = scanner.nextInt();
            // Consumir el <ENTER>
            scanner.nextLine();

            if (option >= 1 && option <= naves.length) {
                System.out.println("Su nave seleccionada es " + naves[option - 1]);
                System.out.println("La velocidad de su nave elegida es de " + velocidades[option - 1]
                        + " millones de km por hora.");

                System.out.println("¿Desea confirmar su nave? (S/N)");
                String confirmacion = scanner.nextLine().toUpperCase();// toUpperCase pasa el valor a mayúscula para
                                                                       // evitar errores

                if (confirmacion.equals("S")) {
                    System.out.println("Nave confirmada: " + naves[option - 1]);
                    break; // Termina el bucle si el usuario confirma
                } else if (confirmacion.equals("N")) {
                    System.out.println("Puede seleccionar otra nave.");
                } else {
                    System.out.println("Respuesta no válida, por favor ingrese 'S' para confirmar o 'N' para cambiar.");
                }
            } else if (option == 4) {
                System.out.println("Saliendo del sistema de selección de naves.");
                getOpcion();
                break; // Vuelve al menú principal
            } else {
                System.err.println("Opción no válida, por favor coloque un valor válido.");
            }
        }

        return option; // Devuelve la nave seleccionada
    }

    public static void iniciarSimulacion() {

    }

    public static void validarPasajeros() {

    }

    // Métodos auxiliares.
    public static void imprimirPlanetas() {
    }

    public static void lanzarEvento() {
    }

    public static void consultarRecursos() {

    }

    public static int cantidadPasajeros() {
        System.out.println("Ingrese la cantidad de pasajeros que van a viajar");
        int pasajeros = scanner.nextInt();
        if (pasajeros > 0) {
            System.out.println("Número de pasajeros ingresado = " + pasajeros);

        } else {
            System.out.println("Número no válido, ingrese otro valor");
            cantidadPasajeros();
        }
        System.out.println("Regresando al menú principal...");
        getOpcion();
        return pasajeros;
    }

    public static double calcularDuración(int planetaSeleccionado, int naveSeleccionada) {
        System.out.println("la duración de su viaje será de aproximadamente: ");
        double duracion = (distancias[planetaSeleccionado] / velocidades[naveSeleccionada]) / 24;
        System.out.println(duracion + "dias");
        return duracion;
    }
}
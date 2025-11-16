import java.util.Scanner;
import java.time.LocalDate; // Para manejar fechas
import java.time.format.DateTimeFormatter; // Para formatear fechas
import java.time.temporal.ChronoUnit; // Para calcular días entre fechas

public class Practica_ObligatoriaT2 {

    public static void main(String[] args) {

        // --- 1. Variables y Estado del Hotel ---
        // Se declaran FUERA del bucle do-while para que sus valores persistan.
        // Si se declaran dentro, se reinician en cada iteración del menú.

        // Variables para el tipo de habitación y tarifa
        String habitacion1 = "Doble"; double tarifa1 = 60.0;
        String habitacion2 = "Doble"; double tarifa2 = 60.0;
        String habitacion3 = "Doble"; double tarifa3 = 60.0;
        String habitacion4 = "Doble"; double tarifa4 = 60.0;
        String habitacion5 = "Doble"; double tarifa5 = 60.0;
        String habitacion6 = "Doble"; double tarifa6 = 60.0;
        String habitacion7 = "Doble"; double tarifa7 = 60.0;
        String habitacion8 = "Doble"; double tarifa8 = 60.0;
        String habitacion9 = "Individual"; double tarifa9 = 45.0;
        String habitacion10 = "Individual"; double tarifa10 = 45.0;

        // Variables para saber si está ocupada o libre
        boolean ocupada1 = false;
        boolean ocupada2 = false;
        boolean ocupada3 = false;
        boolean ocupada4 = false;
        boolean ocupada5 = false;
        boolean ocupada6 = false;
        boolean ocupada7 = false;
        boolean ocupada8 = false;
        boolean ocupada9 = false;
        boolean ocupada10 = false;

        // Nombres de los huéspedes
        String huesped1 = "";
        String huesped2 = "";
        String huesped3 = "";
        String huesped4 = "";
        String huesped5 = "";
        String huesped6 = "";
        String huesped7 = "";
        String huesped8 = "";
        String huesped9 = "";
        String huesped10 = "";

        // Fechas de entrada (del tipo LocalDate)
        LocalDate fechaEntrada1 = null; // Usamos null como valor por defecto para un objeto
        LocalDate fechaEntrada2 = null;
        LocalDate fechaEntrada3 = null;
        LocalDate fechaEntrada4 = null;
        LocalDate fechaEntrada5 = null;
        LocalDate fechaEntrada6 = null;
        LocalDate fechaEntrada7 = null;
        LocalDate fechaEntrada8 = null;
        LocalDate fechaEntrada9 = null;
        LocalDate fechaEntrada10 = null;


        // --- 2. Variables de Administración ---
        double ingresosTotales = 0.0;
        int reservasFinalizadas = 0;
        // Constantes para el login de admin
        final String ADMIN_USER = "admin";
        final String ADMIN_PASS = "1234";

        Scanner scanner = new Scanner(System.in);
        boolean running = true; // Controla el bucle principal

        // --- 3. Menú Principal (Bucle do-while) ---
        // Este bucle repite el menú hasta que 'running' sea false
        do {
            System.out.println("\n==============================");
            System.out.println("=== HOTEL CIUDAD DE MARTOS ===");
            System.out.println("==============================");
            System.out.println("Elige una opción:");
            System.out.println("a. Ver estado de las habitaciones");
            System.out.println("b. Reservar una habitación");
            System.out.println("c. Realizar checkout");
            System.out.println("d. Menú de Administrador");
            System.out.print("Opción: ");
            String opcion = scanner.nextLine();

            // Estructura 'switch' para manejar la opción del menú
            switch (opcion.toLowerCase()) {

                // --- a. Ver estado de las habitaciones ---
                case "a":
                    System.out.println("\n--- ESTADO DE HABITACIONES ---");
                    // Mostramos el estado de cada habitación una por una
                    System.out.println("Habitación 1 (" + habitacion1 + "): " + (ocupada1 ? "Ocupada por " + huesped1 + " (Entrada: " + fechaEntrada1 + ")" : "Libre"));
                    System.out.println("Habitación 2 (" + habitacion2 + "): " + (ocupada2 ? "Ocupada por " + huesped2 + " (Entrada: " + fechaEntrada2 + ")" : "Libre"));
                    System.out.println("Habitación 3 (" + habitacion3 + "): " + (ocupada3 ? "Ocupada por " + huesped3 + " (Entrada: " + fechaEntrada3 + ")" : "Libre"));
                    System.out.println("Habitación 4 (" + habitacion4 + "): " + (ocupada4 ? "Ocupada por " + huesped4 + " (Entrada: " + fechaEntrada4 + ")" : "Libre"));
                    System.out.println("Habitación 5 (" + habitacion5 + "): " + (ocupada5 ? "Ocupada por " + huesped5 + " (Entrada: " + fechaEntrada5 + ")" : "Libre"));
                    System.out.println("Habitación 6 (" + habitacion6 + "): " + (ocupada6 ? "Ocupada por " + huesped6 + " (Entrada: " + fechaEntrada6 + ")" : "Libre"));
                    System.out.println("Habitación 7 (" + habitacion7 + "): " + (ocupada7 ? "Ocupada por " + huesped7 + " (Entrada: " + fechaEntrada7 + ")" : "Libre"));
                    System.out.println("Habitación 8 (" + habitacion8 + "): " + (ocupada8 ? "Ocupada por " + huesped8 + " (Entrada: " + fechaEntrada8 + ")" : "Libre"));
                    System.out.println("Habitación 9 (" + habitacion9 + "): " + (ocupada9 ? "Ocupada por " + huesped9 + " (Entrada: " + fechaEntrada9 + ")" : "Libre"));
                    System.out.println("Habitación 10 (" + habitacion10 + "): " + (ocupada10 ? "Ocupada por " + huesped10 + " (Entrada: " + fechaEntrada10 + ")" : "Libre"));
                    break;

                // --- b. Reservar una habitación ---
                case "b":
                    System.out.println("\n--- RESERVAR HABITACIÓN ---");
                    System.out.print("Introduce el nombre del huésped: ");
                    String nombre = scanner.nextLine();

                    // Buscamos la primera habitación libre usando 'if-else if'
                    if (!ocupada1) {
                        huesped1 = nombre;
                        ocupada1 = true;
                        fechaEntrada1 = LocalDate.now();
                        System.out.println("Habitación 1 ("+ habitacion1 +") reservada para " + nombre);
                    } else if (!ocupada2) {
                        huesped2 = nombre;
                        ocupada2 = true;
                        fechaEntrada2 = LocalDate.now();
                        System.out.println("Habitación 2 ("+ habitacion2 +") reservada para " + nombre);
                    } else if (!ocupada3) {
                        huesped3 = nombre;
                        ocupada3 = true;
                        fechaEntrada3 = LocalDate.now();
                        System.out.println("Habitación 3 ("+ habitacion3 +") reservada para " + nombre);
                    } else if (!ocupada4) {
                        huesped4 = nombre;
                        ocupada4 = true;
                        fechaEntrada4 = LocalDate.now();
                        System.out.println("Habitación 4 ("+ habitacion4 +") reservada para " + nombre);
                    } else if (!ocupada5) {
                        huesped5 = nombre;
                        ocupada5 = true;
                        fechaEntrada5 = LocalDate.now();
                        System.out.println("Habitación 5 ("+ habitacion5 +") reservada para " + nombre);
                    } else if (!ocupada6) {
                        huesped6 = nombre;
                        ocupada6 = true;
                        fechaEntrada6 = LocalDate.now();
                        System.out.println("Habitación 6 ("+ habitacion6 +") reservada para " + nombre);
                    } else if (!ocupada7) {
                        huesped7 = nombre;
                        ocupada7 = true;
                        fechaEntrada7 = LocalDate.now();
                        System.out.println("Habitación 7 ("+ habitacion7 +") reservada para " + nombre);
                    } else if (!ocupada8) {
                        huesped8 = nombre;
                        ocupada8 = true;
                        fechaEntrada8 = LocalDate.now();
                        System.out.println("Habitación 8 ("+ habitacion8 +") reservada para " + nombre);
                    } else if (!ocupada9) {
                        huesped9 = nombre;
                        ocupada9 = true;
                        fechaEntrada9 = LocalDate.now();
                        System.out.println("Habitación 9 ("+ habitacion9 +") reservada para " + nombre);
                    } else if (!ocupada10) {
                        huesped10 = nombre;
                        ocupada10 = true;
                        fechaEntrada10 = LocalDate.now();
                        System.out.println("Habitación 10 ("+ habitacion10 +") reservada para " + nombre);
                    } else {
                        System.out.println("Lo sentimos, no hay habitaciones libres.");
                    }
                    break;

                // --- c. Realizar checkout ---
                case "c":
                    System.out.println("\n--- REALIZAR CHECKOUT ---");
                    System.out.print("Introduce el número de habitación (1-10) para checkout: ");
                    // Leemos el número y lo convertimos a entero
                    int numHabitacionCheckout = Integer.parseInt(scanner.nextLine());

                    // Variables locales para guardar los datos de la habitación seleccionada
                    String nombreHuesped = "";
                    LocalDate fechaEntrada = null;
                    String tipoHab = "";
                    double tarifaNoche = 0.0;
                    boolean habitacionEstaOcupada = false;

                    // Usamos un 'switch' para cargar los datos de la habitación correcta
                    switch (numHabitacionCheckout) {
                        case 1:
                            nombreHuesped = huesped1; fechaEntrada = fechaEntrada1; tipoHab = habitacion1; tarifaNoche = tarifa1; habitacionEstaOcupada = ocupada1;
                            break;
                        case 2:
                            nombreHuesped = huesped2; fechaEntrada = fechaEntrada2; tipoHab = habitacion2; tarifaNoche = tarifa2; habitacionEstaOcupada = ocupada2;
                            break;
                        case 3:
                            nombreHuesped = huesped3; fechaEntrada = fechaEntrada3; tipoHab = habitacion3; tarifaNoche = tarifa3; habitacionEstaOcupada = ocupada3;
                            break;
                        case 4:
                            nombreHuesped = huesped4; fechaEntrada = fechaEntrada4; tipoHab = habitacion4; tarifaNoche = tarifa4; habitacionEstaOcupada = ocupada4;
                            break;
                        case 5:
                            nombreHuesped = huesped5; fechaEntrada = fechaEntrada5; tipoHab = habitacion5; tarifaNoche = tarifa5; habitacionEstaOcupada = ocupada5;
                            break;
                        case 6:
                            nombreHuesped = huesped6; fechaEntrada = fechaEntrada6; tipoHab = habitacion6; tarifaNoche = tarifa6; habitacionEstaOcupada = ocupada6;
                            break;
                        case 7:
                            nombreHuesped = huesped7; fechaEntrada = fechaEntrada7; tipoHab = habitacion7; tarifaNoche = tarifa7; habitacionEstaOcupada = ocupada7;
                            break;
                        case 8:
                            nombreHuesped = huesped8; fechaEntrada = fechaEntrada8; tipoHab = habitacion8; tarifaNoche = tarifa8; habitacionEstaOcupada = ocupada8;
                            break;
                        case 9:
                            nombreHuesped = huesped9; fechaEntrada = fechaEntrada9; tipoHab = habitacion9; tarifaNoche = tarifa9; habitacionEstaOcupada = ocupada9;
                            break;
                        case 10:
                            nombreHuesped = huesped10; fechaEntrada = fechaEntrada10; tipoHab = habitacion10; tarifaNoche = tarifa10; habitacionEstaOcupada = ocupada10;
                            break;
                        default:
                            System.out.println("Error: Número de habitación inválido (debe ser 1-10).");
                            break;
                    }

                    // --- Validación y Proceso de Checkout ---
                    // Primero comprobamos que la habitación sea válida y esté ocupada
                    if (numHabitacionCheckout < 1 || numHabitacionCheckout > 10) {
                        // El mensaje de error ya se mostró en el 'default' del switch
                    } else if (!habitacionEstaOcupada) {
                        System.out.println("Error: La habitación " + numHabitacionCheckout + " ya está libre.");
                    } else {
                        // Si está ocupada, procedemos
                        System.out.println("Realizando checkout para " + nombreHuesped + " (Habitación " + numHabitacionCheckout + ")");
                        System.out.println("Fecha de entrada: " + fechaEntrada);

                        // 1. Pedir fecha de salida (simulación)
                        System.out.print("Introduce la fecha de salida (formato YYYY-MM-DD): ");
                        // Usamos LocalDate.parse() para convertir texto a fecha
                        LocalDate fechaSalida = LocalDate.parse(scanner.nextLine());

                        // 2. Validar fechas
                        // Comprobamos si la fecha de salida es POSTERIOR a la de entrada
                        if (fechaSalida.isBefore(fechaEntrada) || fechaSalida.isEqual(fechaEntrada)) {
                            System.out.println("Error: La fecha de salida debe ser posterior a la fecha de entrada (" + fechaEntrada + ")");
                        } else {
                            // 3. Calcular noches
                            // Usamos ChronoUnit.DAYS.between()
                            long noches = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);

                            // 4. Calcular totales
                            double subtotal = noches * tarifaNoche;
                            double iva = subtotal * 0.21;
                            double totalAPagar = subtotal + iva;

                            // 5. Mostrar Factura (Requisito 5)
                            // Creamos un formateador para mostrar la fecha como dd/MM/yyyy
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                            System.out.println("\n========= FACTURA HOTEL CIUDAD DE MARTOS =========");
                            System.out.println("Cliente: " + nombreHuesped);
                            System.out.println("Habitación: " + numHabitacionCheckout + " (" + tipoHab + ")");
                            System.out.println("Entrada: " + fechaEntrada.format(formatter));
                            System.out.println("Salida: " + fechaSalida.format(formatter));
                            System.out.println("-------------------------------------------------");
                            System.out.println("Noches: " + noches);
                            // Usamos printf para formatear los decimales
                            System.out.printf("Tarifa por noche: %.2f€\n", tarifaNoche);
                            System.out.printf("Subtotal: %.2f€\n", subtotal);
                            System.out.printf("IVA (21%%): %.2f€\n", iva);
                            System.out.println("-------------------------------------------------");
                            System.out.printf("TOTAL A PAGAR: %.2f€\n", totalAPagar);
                            System.out.println("=================================================");

                            // 6. Procesar Pago (Requisito 6)
                            System.out.print("\nIntroduce el importe en efectivo pagado por el cliente: ");
                            double importePagado = Double.parseDouble(scanner.nextLine());

                            if (importePagado < totalAPagar) {
                                System.out.println("Error: El importe pagado es insuficiente. Checkout cancelado.");
                            } else {
                                // 7. Calcular y mostrar cambio (Requisito 6a) [cite: 229]
                                double cambio = importePagado - totalAPagar;
                                System.out.printf("Pago recibido. Cambio a devolver: %.2f€\n", cambio);

                                // Cálculo de cambio en céntimos (para evitar errores con decimales)
                                // Se usan operadores aritméticos básicos / y % (módulo) [cite: 511]
                                int cambioEnCentimos = (int) Math.round(cambio * 100);
                                System.out.println("Desglose del cambio:");

                                // Lógica para calcular el menor número de billetes/monedas
                                int cant;
                                cant = cambioEnCentimos / 50000; if (cant > 0) System.out.println("- " + cant + " x 500.00€");
                                cambioEnCentimos = cambioEnCentimos % 50000;
                                cant = cambioEnCentimos / 20000; if (cant > 0) System.out.println("- " + cant + " x 200.00€");
                                cambioEnCentimos = cambioEnCentimos % 20000;
                                cant = cambioEnCentimos / 10000; if (cant > 0) System.out.println("- " + cant + " x 100.00€");
                                cambioEnCentimos = cambioEnCentimos % 10000;
                                cant = cambioEnCentimos / 5000;  if (cant > 0) System.out.println("- " + cant + " x 50.00€");
                                cambioEnCentimos = cambioEnCentimos % 5000;
                                cant = cambioEnCentimos / 2000;  if (cant > 0) System.out.println("- " + cant + " x 20.00€");
                                cambioEnCentimos = cambioEnCentimos % 2000;
                                cant = cambioEnCentimos / 1000;  if (cant > 0) System.out.println("- " + cant + " x 10.00€");
                                cambioEnCentimos = cambioEnCentimos % 1000;
                                cant = cambioEnCentimos / 500;   if (cant > 0) System.out.println("- " + cant + " x 5.00€");
                                cambioEnCentimos = cambioEnCentimos % 500;
                                cant = cambioEnCentimos / 200;   if (cant > 0) System.out.println("- " + cant + " x 2.00€");
                                cambioEnCentimos = cambioEnCentimos % 200;
                                cant = cambioEnCentimos / 100;   if (cant > 0) System.out.println("- " + cant + " x 1.00€");
                                cambioEnCentimos = cambioEnCentimos % 100;
                                // Podríamos seguir con 50, 20, 10, 5, 2, 1 céntimos si quisiéramos

                                // 8. Liberar habitación y actualizar contadores (Requisito 6b)
                                // Usamos otro 'switch' para PONER A CERO la habitación correcta
                                switch (numHabitacionCheckout) {
                                    case 1: ocupada1 = false; huesped1 = ""; fechaEntrada1 = null; break;
                                    case 2: ocupada2 = false; huesped2 = ""; fechaEntrada2 = null; break;
                                    case 3: ocupada3 = false; huesped3 = ""; fechaEntrada3 = null; break;
                                    case 4: ocupada4 = false; huesped4 = ""; fechaEntrada4 = null; break;
                                    case 5: ocupada5 = false; huesped5 = ""; fechaEntrada5 = null; break;
                                    case 6: ocupada6 = false; huesped6 = ""; fechaEntrada6 = null; break;
                                    case 7: ocupada7 = false; huesped7 = ""; fechaEntrada7 = null; break;
                                    case 8: ocupada8 = false; huesped8 = ""; fechaEntrada8 = null; break;
                                    case 9: ocupada9 = false; huesped9 = ""; fechaEntrada9 = null; break;
                                    case 10: ocupada10 = false; huesped10 = ""; fechaEntrada10 = null; break;
                                }

                                // Actualizamos estadísticas del admin
                                ingresosTotales += totalAPagar;
                                reservasFinalizadas++;

                                System.out.println("\nCheckout finalizado. Habitación " + numHabitacionCheckout + " marcada como libre.");
                            }
                        }
                    }
                    break;

                // --- d. Menú de Administrador ---
                case "d":
                    System.out.println("\n--- MENÚ DE ADMINISTRADOR ---");
                    // Pedimos credenciales
                    System.out.print("Usuario: ");
                    String user = scanner.nextLine();
                    System.out.print("Contraseña: ");
                    String pass = scanner.nextLine();

                    // Comparamos credenciales con operadores lógicos y .equals()
                    if (user.equals(ADMIN_USER) && pass.equals(ADMIN_PASS)) {
                        System.out.println("Acceso concedido.");

                        boolean adminRunning = true;
                        // Bucle do-while para el submenú de admin
                        do {
                            System.out.println("\n--- Panel de Administración ---");
                            System.out.println("i. Consultar ingresos totales y reservas finalizadas");
                            System.out.println("ii. Consultar monedas/billetes para cambio");
                            System.out.println("iii. Apagar el software");
                            System.out.println(" (Cualquier otra tecla para volver al menú principal)");
                            System.out.print("Opción admin: ");
                            String adminOpcion = scanner.nextLine();

                            switch (adminOpcion.toLowerCase()) {
                                case "i":
                                    System.out.printf("Ingresos Totales: %.2f€\n", ingresosTotales);
                                    System.out.println("Reservas Finalizadas: " + reservasFinalizadas);
                                    break;
                                case "ii":
                                    System.out.println("El sistema está configurado para dar cambio con:");
                                    System.out.println("Billetes: 500, 200, 100, 50, 20, 10, 5");
                                    System.out.println("Monedas: 2, 1");
                                    break;
                                case "iii":
                                    System.out.println("Apagando el software...");
                                    adminRunning = false; // Salir del bucle admin
                                    running = false; // Salir del bucle principal
                                    break; //
                                default:
                                    System.out.println("Volviendo al menú principal...");
                                    adminRunning = false; // Salir solo del bucle admin
                                    break;
                            }
                        } while (adminRunning);

                    } else {
                        System.out.println("Acceso denegado. Usuario o contraseña incorrectos.");
                    }
                    break;

                // --- Opción por defecto ---
                default:
                    System.out.println("Error: Opción no válida. Inténtalo de nuevo.");
                    break;
            }

        } while (running); // El bucle principal se repite mientras 'running' sea true

        System.out.println("Gracias por usar el software del Hotel Ciudad de Martos.");

    }
}
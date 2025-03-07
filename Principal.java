import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonaCRUD personaCRUD = new PersonaCRUD();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- CRUD de Personas ---");
            System.out.println("1. Crear Persona");
            System.out.println("2. Leer Personas");
            System.out.println("3. Actualizar Persona");
            System.out.println("4. Eliminar Persona");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    personaCRUD.crearPersona(nombre, edad);
                    break;
                case 2:
                    personaCRUD.leerPersonas();
                    break;
                case 3:
                    System.out.print("Ingresa el índice de la persona a actualizar: ");
                    int indexActualizar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Nueva edad: ");
                    int nuevaEdad = scanner.nextInt();
                    personaCRUD.actualizarPersona(indexActualizar, nuevoNombre, nuevaEdad);
                    break;
                case 4:
                    System.out.print("Ingresa el índice de la persona a eliminar: ");
                    int indexEliminar = scanner.nextInt();
                    personaCRUD.eliminarPersona(indexEliminar);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}

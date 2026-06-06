public class Main {
    public static void main(String[] args) {

    }

    public static void mostrarMenu() {
        System.out.println("\n=========================");
        System.out.println("  REGISTRO DE USUARIOS");
        System.out.println("=========================");
        System.out.println("\n1. Registrar usuario");
        System.out.println("2. Salir");
    }

    public static void validarUsuario(String nombre, int edad, String correo, double salario) throws Exception {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("\nEl nombre no puede estar vacío");
        }
        else if (nombre.trim().length() < 3) {
            System.out.println("\nEl nombre debe tener al menos 3 caracteres");
        }

        if (edad < 18) {
            System.out.println("\nLa edad debe ser mayor o igual a 18 años");
        }
        else if (edad > 100) {
            System.out.println("\nLa edad debe ser menor o igual a 100 años");
        }

        if (!correo.contains("@") || !correo.contains(".")) {
            System.out.println("\nEl correo debe contener '@' y '.'");
        }

        if (salario <= 0) {
            System.out.println("\nEl salario debe ser mayor que 0");
        }
    }
}
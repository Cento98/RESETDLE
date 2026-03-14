public class ConsoleColor {
    public static final String BLANCO = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";

    public static String aplicarColor(String texto, String color) {
        return color + texto + BLANCO;
    }
}

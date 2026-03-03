import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static GeneracionJugador generador;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        generador = new GeneracionJugador();
        Jugador jugadorDelDia = generador.getJugador();

        bienvenida();

        String nombre = "";
        System.out.println("Escribe un nombre para empezar:");
        boolean firstTime = true;
        int contador = 0;
        boolean comprobacionFinal = true;
        do{
            do{
                if(!firstTime){
                    System.out.println("Escribe un nombre:");
                }
                nombre = scan.nextLine();
                firstTime = false;
            }while(comprobarNombre(nombre));

            limpiar();

            contador++;
            compararJugadores(nombre, jugadorDelDia);

            if(nombre.equalsIgnoreCase(jugadorDelDia.getNombre())){
                System.out.println("Enhorabuena, has adivinado el miembro al "+contador+" intento");
                comprobacionFinal = false;
            }
        }while(comprobacionFinal);
    }

    private static void compararJugadores(String nombre, Jugador jugadorDelDia){
        Jugador jugadorElegido = recuperarJugador(nombre);
        List<String> colores = new ArrayList<>();

        //Nombre
        if(jugadorDelDia.getNombre().equals(jugadorElegido.getNombre())){
            colores.add("Verde");
        }else{
            colores.add("Rojo");
        }

        //Faccion
        if(jugadorDelDia.getFaccion().equals(jugadorElegido.getFaccion())){
            colores.add("Verde");
        }else{
            colores.add("Rojo");
        }

        //Main
        colores.add(compararPosibilidades(jugadorDelDia.getMain(), jugadorElegido.getMain()));

        //Alter
        colores.add(compararPosibilidades(jugadorDelDia.getAlter(), jugadorElegido.getAlter()));

        //Calvo
        if(jugadorDelDia.getCalvo().equals(jugadorElegido.getCalvo())){
            colores.add("Verde");
        }else{
            colores.add("Rojo");
        }

        //Rol
        colores.add(compararPosibilidades(jugadorDelDia.getRol(), jugadorElegido.getRol()));

        //Ano
        if(jugadorDelDia.getAno().equals(jugadorElegido.getAno())){
            colores.add("Verde");
        }else{
            colores.add("Rojo");
        }

        mostrarJugador(jugadorElegido, colores);
    }

    private static String obtenerColorAnsi(String color) {
        String colorFormat ="";
        switch (color.toLowerCase()) {
            case "rojo":  
                colorFormat = ConsoleColor.ROJO;
            break;
            case "verde": 
                colorFormat = ConsoleColor.VERDE;
            break;
            case "amarillo": 
                colorFormat = ConsoleColor.AMARILLO;
            break;
            default: 
                 colorFormat = ConsoleColor.RESET;
            break;
        }

        return colorFormat;
    }

    public static void mostrarJugador(Jugador jugador, List<String> colores) {

        List<String> nombresCampos = List.of(
                "Nombre",
                "Faccion",
                "Main",
                "Alter",
                "Calvo",
                "Rol",
                "Ano"
        );

        List<String> valores = List.of(
                jugador.getNombre(),
                jugador.getFaccion(),
                String.join(", ", jugador.getMain()),
                String.join(", ", jugador.getAlter()),
                jugador.getCalvo(),
                String.join(", ", jugador.getRol()),
                jugador.getAno()
        );

        System.out.println("========================================================");

        for (int i = 0; i < nombresCampos.size() && i < colores.size(); i++) {

            String colorAnsi = obtenerColorAnsi(colores.get(i));
            String valorColoreado = ConsoleColor.aplicarColor(valores.get(i), colorAnsi);

            System.out.printf("%-15s : %s%n",
                    nombresCampos.get(i),
                    valorColoreado);
        }

        System.out.println("========================================================");
    }

    private static String compararPosibilidades(String[] dia,  String[] ele){

        int target = 0;
        if(dia.length>=ele.length){
            target = dia.length;
        }else{
            target = ele.length;
        }
        int conseguido = 0;
        String aux = "";
        if(dia.length>=ele.length){
            for(int i=0;i<dia.length;i++){
                aux=dia[i];
                for(int j=0;j<ele.length;j++){
                    if(aux.equals(ele[j])){
                        conseguido++;
                    }
                }
            }   
        }else{
            for(int i=0;i<ele.length;i++){
                aux=ele[i];
                for(int j=0;j<dia.length;j++){
                    if(aux.equals(dia[j])){
                        conseguido++;
                    }
                }
            }  
        }

        String color = "";
        if(conseguido == target){
            color = "Verde";
        }else if(conseguido == 0){
            color = "Rojo";
        } else{
            color = "Amarillo";
        }

        return color;
    }

    private static Jugador recuperarJugador(String nombre){
        Jugador jugadorRecuperado = null;
        List<Jugador> jugadores = generador.getJugadores();
        for(Jugador item: jugadores){
            if(item.getNombre().equalsIgnoreCase(nombre)){
                jugadorRecuperado = item;
            }
        }
        return jugadorRecuperado;
    }

    private static boolean comprobarNombre(String nombre){
        boolean compro = true;
        List<Jugador> jugadores = generador.getJugadores();
        for(Jugador item: jugadores){
            if(item.getNombre().equalsIgnoreCase(nombre)){
                compro = false;
            }
        }
        if(compro){
            System.out.println("Eres bobo o que?");
        }
        return compro;
    }

    private static void bienvenida(){
        System.out.println("***********************************");
        System.out.println("*                                 *");
        System.out.println("*      BIENVENIDO A RESEDLE       *");
        System.out.println("*                                 *");
        System.out.println("***********************************");
        System.out.println();
        
    }

    private static void limpiar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GeneracionJugador {
    private Jugador jugador;
    private List<Jugador> jugadores;
    private HashMap<String, String> nombresConfaccion;

    public GeneracionJugador() {
		this.jugador = generarJugador();
	}
	
	private Jugador generarJugador() {
        this.jugadores = new ArrayList<>();
		this.jugadores.add(new Jugador("Bors","Horda",new String[]{"DH","Guerrero"},new String[]{"Chaman"},"Si",new String[]{"Tank","Dps"},"1998"));
		this.jugadores.add(new Jugador("Snyk","Horda",new String[]{"Hunter"},new String[]{"Druida","Brujo"},"No",new String[]{"Dps"},"1994"));
		this.jugadores.add(new Jugador("Kamichi","Alianza",new String[]{"Evoker","Sacerdote"},new String[]{"Druida","Paladin"},"No",new String[]{"Tank","Dps","Heal"},"1998"));
		this.jugadores.add(new Jugador("Compy","Alianza",new String[]{"Guerrero","Druida"},new String[]{"Mago","Monje"},"No",new String[]{"Tank","Dps"},"1990"));
		this.jugadores.add(new Jugador("Shabranz","Horda",new String[]{"DH"},new String[]{"Evoker"},"Si",new String[]{"Dps"},"1980"));
        this.jugadores.add(new Jugador("Gorim","Alianza",new String[]{"DK", "Paladin"},new String[]{"Guerrero","DH"},"No",new String[]{"Dps"},"1999"));
        this.jugadores.add(new Jugador("Squall","Horda",new String[]{"DH","Mago"},new String[]{"Hunter"},"Si",new String[]{"Dps"},"1995"));
        this.jugadores.add(new Jugador("Xeraxy","Alianza",new String[]{"Sacerdote",},new String[]{"Druida"},"Si",new String[]{"Heal","Dps"},"2000"));
        this.jugadores.add(new Jugador("Choq","Horda",new String[]{"Chaman",},new String[]{"Monje"},"Si",new String[]{"Heal","Dps"},"1996"));
        this.jugadores.add(new Jugador("Orocha","Horda",new String[]{"DK",},new String[]{"Brujo"},"Si",new String[]{"Dps"},"1987"));
        this.jugadores.add(new Jugador("Barrinas","Horda",new String[]{"Guerrero",},new String[]{"Paladin"},"Si",new String[]{"Dps"},"1996"));
        this.jugadores.add(new Jugador("Xque","Alianza",new String[]{"Sacerdote",},new String[]{"Druida"},"No",new String[]{"Heal","Dps"},"1998"));
        this.jugadores.add(new Jugador("Mitsune","Horda",new String[]{"DH",},new String[]{"Monje"},"Si",new String[]{"Tank","Dps"},"2007"));
        this.jugadores.add(new Jugador("Penta","Alianza",new String[]{"Chaman, Hunter",},new String[]{"Sacerdote"},"No",new String[]{"Dps"},"2000"));
        this.jugadores.add(new Jugador("Xhordante","Horda",new String[]{"Paladin"},new String[]{"Evoker"},"Si",new String[]{"Heal"},"1992"));
        this.jugadores.add(new Jugador("Trendelacaca","Horda",new String[]{"Druida",},new String[]{"Chaman"},"Si",new String[]{"Heal, Dps"},"2001"));
        this.jugadores.add(new Jugador("Ocelotte","Alianza",new String[]{"Rogue"},new String[]{"Ninguno"},"Es posible",new String[]{"Dps"},"1989"));
        this.jugadores.add(new Jugador("Jude","Alianza",new String[]{"Monje"},new String[]{"Paladin"},"No",new String[]{"Tank, Dps"},"1999"));
        this.jugadores.add(new Jugador("Lovalgo","Horda",new String[]{"Paladin"},new String[]{"Hunter"},"Si",new String[]{"Dps"},"2002"));
        this.jugadores.add(new Jugador("Thidrel","Horda",new String[]{"Druida"},new String[]{"Ninguno"},"No",new String[]{"Dps"},"1997"));
        this.jugadores.add(new Jugador("Shunzo","Alianza",new String[]{"Chaman"},new String[]{"DH"},"No",new String[]{"Heal, Dps"},"1996"));
        this.jugadores.add(new Jugador("Aloreth","Horda",new String[]{"DH"},new String[]{"Ninguno"},"No",new String[]{"Dps"},"1998"));
        this.jugadores.add(new Jugador("Xoplete","Horda",new String[]{"Evoker"},new String[]{"Druida"},"Si",new String[]{"Heal, Dps"},"1992"));
        this.jugadores.add(new Jugador("Discotheque","Horda",new String[]{"Sacerdote"},new String[]{"Evoker"},"Si",new String[]{"Heal"},"2005"));
        this.jugadores.add(new Jugador("Akaeba","Horda",new String[]{"Druida"},new String[]{"Evoker"},"No",new String[]{"Heal"},"1991"));
        this.jugadores.add(new Jugador("Gato","Horda",new String[]{"Mago"},new String[]{"DK"},"No",new String[]{"Dps"},"1998"));
        this.jugadores.add(new Jugador("Khazerg","Alianza",new String[]{"DK"},new String[]{"Ninguno"},"Si",new String[]{"Dps"},"1997"));
		
		int randomIndex = ThreadLocalRandom.current().nextInt(jugadores.size());

        this.nombresConfaccion = new HashMap<>();
        for(Jugador item: this.jugadores){
            nombresConfaccion.put(item.getNombre(), item.getFaccion());
        }
		
		return jugadores.get(randomIndex);
	}

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public HashMap<String, String> getNombresConfaccion() {
        return nombresConfaccion;
    }

    public void setNombresConfaccion(HashMap<String, String> nombresConfaccion) {
        this.nombresConfaccion = nombresConfaccion;
    }

}

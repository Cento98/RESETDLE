import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GeneracionJugador {
    private Jugador jugador;
    private List<Jugador> jugadores;

    public GeneracionJugador() {
		this.jugador = generarJugador();
	}
	
	private Jugador generarJugador() {
        this.jugadores = new ArrayList<>();
		this.jugadores.add(new Jugador("Bors","Horda",new String[]{"DH","Guerrero"},new String[]{"Chaman"},"Si",new String[]{"Tank","Dps"},"1998"));
		this.jugadores.add(new Jugador("Snyk","Horda",new String[]{"Hunter"},new String[]{"Druida","Brujo"},"No",new String[]{"Dps"},"1994"));
		this.jugadores.add(new Jugador("Kamichi","Alianza",new String[]{"Evoker","Sacerdote"},new String[]{"Druida","Paladin"},"No",new String[]{"Tank","Dps","Heal"},"1998"));
		this.jugadores.add(new Jugador("Compy","Alianza",new String[]{"Guerrero","Druida"},new String[]{"Mago","Monje"},"No",new String[]{"Tank","Dps"},"1990"));
		this.jugadores.add(new Jugador("Shabranz","Horda",new String[]{"DH"},new String[]{"DH"},"Si",new String[]{"Dps"},"1980"));
		
		int randomIndex = ThreadLocalRandom.current().nextInt(jugadores.size());
		
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
}

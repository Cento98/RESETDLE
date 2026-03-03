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
        this.jugadores.add(new Jugador("Gorim","Alianza",new String[]{"DK", "Paladin"},new String[]{"Guerrero","DH"},"No",new String[]{"Dps"},"1999"));
        this.jugadores.add(new Jugador("Squall","Horda",new String[]{"DH","Mago"},new String[]{"Hunter"},"Si",new String[]{"Dps"},"1995"));
        this.jugadores.add(new Jugador("Xeraxy","Alianza",new String[]{"Sacerdote",},new String[]{"Druida"},"Si",new String[]{"Heal","Dps"},"2000"));
        this.jugadores.add(new Jugador("Choq","Choq",new String[]{"Chaman",},new String[]{"Monje"},"Si",new String[]{"Heal","Dps"},"1996"));
        this.jugadores.add(new Jugador("Orocha","Horda",new String[]{"DK",},new String[]{"Brujo"},"Si",new String[]{"Dps"},"1987"));
        this.jugadores.add(new Jugador("Barrinas","Horda",new String[]{"Guerrero",},new String[]{"Paladin"},"Si",new String[]{"Dps"},"1996"));
        this.jugadores.add(new Jugador("Xque","Alianza",new String[]{"Sacerdote",},new String[]{"Druida"},"No",new String[]{"Heal","Dps"},"1998"));
        this.jugadores.add(new Jugador("Mitsune","Horda",new String[]{"DH",},new String[]{"Monje"},"Si",new String[]{"Tank","Dps"},"1996"));
        this.jugadores.add(new Jugador("Penta","Alianza",new String[]{"Chaman, Hunter",},new String[]{"Sacerdote"},"No",new String[]{"Dps"},"2000"));
		
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

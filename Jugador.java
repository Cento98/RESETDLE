public class Jugador {
    
    private String nombre;
	private String faccion;
	private String[] main;
	private String[] alter;
	private String calvo;
	private String[] rol;
	private String ano;
	
	public Jugador(String nombre, String faccion, String main[], String alter[], String calvo, String rol[], String ano) {
		this.nombre = nombre;
		this.faccion = faccion;
		this.main = main;
		this.alter = alter;
		this.calvo = calvo;
		this.rol = rol;
		this.ano = ano;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFaccion() {
		return faccion;
	}
	public void setFaccion(String faccion) {
		this.faccion = faccion;
	}
	public String[] getMain() {
		return main;
	}
	public void setMain(String[] main) {
		this.main = main;
	}
	public String[] getAlter() {
		return alter;
	}
	public void setAlter(String[] alter) {
		this.alter = alter;
	}
	public String getCalvo() {
		return calvo;
	}
	public void setCalvo(String calvo) {
		this.calvo = calvo;
	}
	public String[] getRol() {
		return rol;
	}
	public void setRol(String[] rol) {
		this.rol = rol;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}

	public void imprimirJugador(){
		System.out.println("*******************************************************************************************");
		System.out.println("*  "+this.nombre+"  *"+"*  "+this.faccion+"  *"+"*  "+concatenar(this.main)+"  *"+"*  "+concatenar(this.alter)+"  *"+"*  "+this.calvo+"  *"+"*  "+concatenar(this.rol)+"  *"+"*  "+this.ano+"  *");
		System.out.println("*******************************************************************************************");
	}

	private String concatenar(String[] aux){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<aux.length;i++){
			if(i==aux.length-1){
				sb.append(aux[i]);
			}else{
				sb.append(aux[i]);
				sb.append(", ");
			}
			
		}
		return sb.toString();
	}
}

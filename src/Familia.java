
public abstract class Familia {
	//Attributes
	protected String numeroDeLibroDeFamilia;
	protected String direccion;
	protected String poblacion;
	protected String provincia;
	
	//Builders
	public Familia() {
		this.numeroDeLibroDeFamilia = "";
		this.direccion = "";
		this.poblacion = "";
		this.provincia = "";
	}
	public Familia(String lF, String adress, String vll, String state) {
		this.numeroDeLibroDeFamilia = lF;
		this.direccion = adress;
		this.poblacion = vll;
		this.provincia = state;
		
	}
	
	//Getters & Setters------------------------
	public String getNumeroDeLibroDeFamilia() {
		return numeroDeLibroDeFamilia;
	}
	public void setNumeroDeLibroDeFamilia(String numeroDeLibroDeFamilia) {
		this.numeroDeLibroDeFamilia = numeroDeLibroDeFamilia;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}//-------------------------------------------------------------------
	
	
	public abstract void imc();
	
}


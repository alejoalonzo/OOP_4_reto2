
public class Persona extends Familia {
	
	//Attributes
		protected String nombre;
		protected int edad;
		protected String dni;
		protected String sexo;
		protected float peso;
		protected float altura;
		
		//Builders
		public Persona() {
			this.nombre = "";
			this.edad = 0;
			this.dni = "";
			this.sexo = "";
			this.peso = 0.0f;
			this.altura = 0.0f;
		}
		//Builder overload
		public Persona(String name, int age, String id, String sx, float wh, float he) {
			this.nombre = name;
			this.edad = age;
			this.dni = id;
			this.sexo = sx;
			this.peso = wh;
			this.altura = he;
		}	
		
		//Getters & Setters----------------------------------------
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public float getPeso() {
			return peso;
		}
		public void setPeso(float peso) {
			this.peso = peso;
		}
		public float getAltura() {
			return altura;
		}
		public void setAltura(float altura) {
			this.altura = altura;
		}
		//-------------------------------------------------------------
		
		public void print() {
			System.out.println("Datos de la persona: " +this.nombre+" - "+this.edad+" - "+this.dni+" - "+this.sexo+" - "+this.peso+" - "+this.altura);
		}
		
		@Override
		public void imc() {
			// TODO Auto-generated method stub
			float p, a, resultado;
			p = this.peso;
			a = this.altura;
			
			resultado = p/a*a;
			
			System.out.println("Su peso ideal es: " + resultado);
			
		}
	
}

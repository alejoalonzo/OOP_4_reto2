

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
	
		p1.setNombre("Alejandro");
		p1.setEdad(32);
		p1.setDni("88855522Y");
		p1.setSexo("Masculino");
		p1.setPeso(78.45f);
		p1.setAltura(75.56f);
		p1.print();
		p1.imc();


		p2.setNombre("Stefania");
		p2.setEdad(28);
		p2.setDni("00045454Y");
		p2.setSexo("Femenino");
		p2.setPeso(50.23f);
		p2.setAltura(150.2f);
		p2.print();
		p2.imc();
	}

}


public class Calculadora {
	private int numero1,numero2;
	private String color;
	
	public Calculadora(int numero1, int numero2, String color)
	{
		this.numero1=numero1;
		this.numero2=numero2;
		this.color=color;
	}
	
	//-----------------------------------------------
	
	//Getters y Setters 
	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//------------------------------------------------
	
	//metodo Sumar; Devuelve el resultado de la suma de los números
	public int sumar()
	{
		int resultado=numero1+numero2;
		return resultado;
	}
	
	//------------------------------------------------
	
	//metodo restar; Devuelve el resultado de la resta de los números
	public int restar()
	{
		int resultado=numero1-numero2;
		return resultado;
	}
	
	//------------------------------------------------

	//Devuelve el resultado de la división de los números
	public int dividir()
	{
		int resultado=numero1/numero2;
		return resultado;
	}
	
	//-------------------------------------------------
	
	//Devuelve el resultado de la multiplicación de los números
	public int multiplicar()
	{
		int resultado=numero1*numero2;
		return resultado;
	}
	
	public int factorial(int numero)
	{
	      if(numero==0) return 1;   //AXIOMA
	      else return numero*factorial(numero);  //FORMULA RECURSIVA
	} 
	
}

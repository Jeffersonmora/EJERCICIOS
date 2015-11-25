package DEBERES;

public class Circulo {

	/*crear una clase circulo con el atributo radio, y el metodo getArea(). crear dos
	 * constructores, el primero sin argumentos, el segundo con el parametro de entrada*/
	 
	private double radio;
	public Circulo(){
	}
	public void setRadio(double radioParam){
		this.radio=radioParam;
	}
	public double getRadio1(){
		return this.radio;
	}
	public Circulo (double radioParam){
		this.radio=radioParam;
	}
	public double getArea(){
		return Math.PI*radio*radio;
	}

}

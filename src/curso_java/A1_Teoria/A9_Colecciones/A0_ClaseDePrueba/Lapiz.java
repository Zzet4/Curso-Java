package curso_java.A1_Teoria.A9_Colecciones.A0_ClaseDePrueba;

public class Lapiz {
	public String color;
	public int punta;
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the punta
	 */
	public int getPunta() {
		return punta;
	}
	/**
	 * @param punta the punta to set
	 */
	public void setPunta(int punta) {
		this.punta = punta;
	}
	/**
	 * @param color
	 * @param punta
	 */
	public Lapiz(String color, int punta) {
		super();
		this.color = color;
		this.punta = punta;
	}
	
	
	public void sacarPunta() {
		this.punta += 1;
	}

}



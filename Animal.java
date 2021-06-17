package Aula10_MetodosModificadoresAcessores;

public class Animal {
	private double peso;
	private String grupo;
	
	

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @return the grupo
	 */
	public String getGrupo() {
		return grupo;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	public static void main(String[] args) {
		Animal leao = new Animal();
		leao.setPeso(30.0);
		leao.setGrupo("Carnivoro");
		
	}

}

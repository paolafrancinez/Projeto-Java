
public class Aluno extends Pessoa {

	
	private Curso curso;
	
	//construtor pai		
	public Aluno(String nome, String cpf, int idade, Curso curso) {
		super(nome, cpf, idade);
		this.curso = curso;
	}

	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return super.toString()  
				+ "\n" + "Curso: " 
				+ getCurso().getNome();

}

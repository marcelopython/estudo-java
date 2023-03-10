package BytBankHerdado; 

public class FuncionarioTeste {

	private String nome;
	
	private String cpf;
	
	private double salario;
	
	private int tipo = 0; //0 - Funcionanrio comun, 1 - Gerente, 2 - Diretor
	
	
	public double getBonificacao() {
		
		if(this.tipo == 0) {
			return (this.salario * 0.1) + this.salario;	
			
		}else if(this.tipo == 1) {
			return this.salario;
			
		}else {
			return this.salario + 1000.0;
		}
				
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	
}

package dominio;

import java.io.Serializable;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //identifica que apenas UMA tabela será criada no banco de dados.
@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING)
//public class Pessoa implements Serializable {
public class Pessoa{

	//private static final long serialVersionUID = 1L; //Id padrão do Serializable
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPessoa;
	private String nome;
	private String cpf;
		
	public Pessoa() {
		this("", "");
	}

	public Pessoa(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
	}

	public long getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(long idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + ", CPF=" + cpf + "]";
	}
}

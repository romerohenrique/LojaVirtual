package beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name= "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "cli_id")
	private int cli_id;
	
	@Column (name= "cli_nome", length = 60, nullable = true)
	private String cli_nome;
	
	@Column (name= "cli_cpf", length = 14, nullable = true)
	private String cli_cpf;
	
	@Column (name= "cli_rg", length = 20, nullable = true)
	private String cli_rg;
	
	@Column (name= "cli_data_nasc", nullable = true)
	private Date cli_data_nasc = new Date();
	
	@Column (name= "cli_rua", length = 60, nullable = true)
	private String cli_rua;
	
	@Column (name= "cli_bairro", length = 30, nullable = true)
	private String cli_bairro;
	
	@Column (name= "cli_cidade", length = 30, nullable = true)
	private String cli_cidade;
	
	@Column (name= "cli_uf", length = 2, nullable = true)
	private String cli_uf;
	
	@Column (name= "cli_cep", length = 9, nullable = true)
	private int cli_cep;
	
	@Column (name= "cli_email", length = 40, nullable = true)
	private String cli_email;
	
	@Column (name= "cli_senha", length = 32, nullable = true)
	private String cli_senha;
	
	
	public int getCli_id() {
		return cli_id;
	}
	public void setCli_id(int cli_id) {
		this.cli_id = cli_id;
	}
	public String getCli_nome() {
		return cli_nome;
	}
	public void setCli_nome(String cli_nome) {
		this.cli_nome = cli_nome;
	}
	public String getCli_cpf() {
		return cli_cpf;
	}
	public void setCli_cpf(String cli_cpf) {
		this.cli_cpf = cli_cpf;
	}
	public String getCli_rg() {
		return cli_rg;
	}
	public void setCli_rg(String cli_rg) {
		this.cli_rg = cli_rg;
	}
	public Date getCli_data_nasc() {
		return cli_data_nasc;
	}
	public void setCli_data_nasc(Date cli_data_nasc) {
		this.cli_data_nasc = cli_data_nasc;
	}
	public String getCli_rua() {
		return cli_rua;
	}
	public void setCli_rua(String cli_rua) {
		this.cli_rua = cli_rua;
	}
	public String getCli_bairro() {
		return cli_bairro;
	}
	public void setCli_bairro(String cli_bairro) {
		this.cli_bairro = cli_bairro;
	}
	public String getCli_cidade() {
		return cli_cidade;
	}
	public void setCli_cidade(String cli_cidade) {
		this.cli_cidade = cli_cidade;
	}
	public String getCli_uf() {
		return cli_uf;
	}
	public void setCli_uf(String cli_uf) {
		this.cli_uf = cli_uf;
	}
	public int getCli_cep() {
		return cli_cep;
	}
	public void setCli_cep(int cli_cep) {
		this.cli_cep = cli_cep;
	}
	public String getCli_email() {
		return cli_email;
	}
	public void setCli_email(String cli_email) {
		this.cli_email = cli_email;
	}
	public String getCli_senha() {
		return cli_senha;
	}
	public void setCli_senha(String cli_senha) {
		this.cli_senha = cli_senha;
	}
	
	// Relacionando de 1 para vários
		@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
		private List<Fone> fones = new ArrayList<Fone>();

		public List<Fone> getFones() {
			return fones;
		}

		public void setFones(List<Fone> fones) {
			this.fones = fones;
		}
	
}

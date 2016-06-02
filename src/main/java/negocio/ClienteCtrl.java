package negocio;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import persistência.ClienteDao;
import beans.Cliente;
import beans.Fone;

@ManagedBean
@SessionScoped
public class ClienteCtrl implements Serializable {

	private static final long serialVersionUID = 1L;

	private Cliente cliente = new Cliente();
	private Fone fone;

	public Fone getFone() {
		return fone;
	}

	public void setFone(Fone fone) {
		this.fone = fone;
	}

	public Cliente getCliente() {
		if (cliente == null) {
			cliente = new Cliente();
		}
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getListagem() {
		return ClienteDao.listagem();

	}

	public String actionGravar() {

		if (cliente.getCli_id() == 0) {
			ClienteDao.inserir(cliente);
			return actionInserir();
		} else {
			ClienteDao.alterar(cliente);
			return null;
		}

	}

	public String actionInserir() {
		this.cliente = new Cliente();
		return "form_cliente";
	}

	public String actionExcluir(Cliente c) {
		ClienteDao.excluir(c);
		return "lista_cliente";
	}

	public String actionAlterar(Cliente c) {
		cliente = c;
		return "form_cliente";
	}

	public String actionInserirFone() {
		Fone fone = new Fone();
		fone.setCliente(cliente);
		cliente.getFones().add(fone);
		return "form_cliente";
	}

	public String actionExcluirFone() {
		//

		return "form_cliente";
	}

}

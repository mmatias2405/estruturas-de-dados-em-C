import java.util.ArrayList;
import java.util.List;

public class Cadastro {
	
	private List<Imovel> imoveis;
	private List<Cliente> clientes;
	
	public Cadastro() {
		imoveis = new ArrayList<Imovel>();
		clientes = new ArrayList<Cliente>();	
	}
	
	public void cadastrarCliente(Cliente c) {
		if(clientes.isEmpty())
			c.setId((int) (Math.random()*1000));
		else
			c.setId(clientes.get(clientes.size()-1).getId()+1);
		
		clientes.add(c);
	}
	
	public void cadastrarImovel(Imovel i) {
		if(imoveis.isEmpty())
			i.setMatricula((int) (Math.random()*1000));
		else
			i.setMatricula(imoveis.get(imoveis.size()-1).getMatricula()+1);
		
		imoveis.add(i);
	}
	
	public List<Imovel>getImoveis(){
		return imoveis;
	}
	
	public List<Cliente>getClientes(){
		return clientes;
	}
	
	public String buscarCliente(String nome) {
		String ret = "";
		for(Cliente c : clientes) {
			if(c.getNome().contains(nome)) 
				ret += c+"\n";
		}
		return ret;
	}
	
	public String buscarImoveis(String endereco) {
		String ret = "";
		for(Imovel i: imoveis) {
			if(i.getEndereco().contains(endereco))
				ret += i+"\n";
		}
		return ret;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientes == null) ? 0 : clientes.hashCode());
		result = prime * result + ((imoveis == null) ? 0 : imoveis.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro other = (Cadastro) obj;
		if (clientes == null) {
			if (other.clientes != null)
				return false;
		} else if (!clientes.equals(other.clientes))
			return false;
		if (imoveis == null) {
			if (other.imoveis != null)
				return false;
		} else if (!imoveis.equals(other.imoveis))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String ret="Imoveis:\n";
		for(int i = 0;i < imoveis.size();i++)
				ret+=imoveis.get(i)+"\n";
		
		ret+="Clientes:\n";
		for(int i = 0;i < clientes.size();i++)
				ret+=clientes.get(i)+"\n";
		
		return ret;
	}
	

}

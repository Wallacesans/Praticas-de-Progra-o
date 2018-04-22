package controller;


import controller.PaisDAO;
import controller.Pais;


public class PaisService {
	static PaisDAO dao = new PaisDAO();
	
	public static int criar(Pais pais) throws Exception  {
		return dao.criar(pais);
	}
	
	public void atualizar(Pais pais){
		dao.atualizar(pais);
	}
	
	public void excluir(int id){
		dao.excluir(id);
	}
	
	public static Pais carregar(int id) throws Exception {
		return dao.carregar(id);
	}

}

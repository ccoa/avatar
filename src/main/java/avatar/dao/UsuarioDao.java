package avatar.dao;

import avatar.model.Usuario;

public interface UsuarioDao {
	
	Usuario obtenerPorLogin(String login);
	
}

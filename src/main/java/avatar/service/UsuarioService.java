package avatar.service;

import avatar.model.Usuario;

public interface UsuarioService {

	Usuario obtenerPorLogin(String login);
	
}

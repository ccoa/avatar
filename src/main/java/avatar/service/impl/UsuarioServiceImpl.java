package avatar.service.impl;

import java.util.ArrayList;
import java.util.List;

//import avatar.dao.UsuarioDao;
import avatar.model.Usuario;
import avatar.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {
	
	//private UsuarioDao usuarioDao;

	public Usuario obtenerPorLogin(String login) {
		
		List<Usuario> usuarios = new ArrayList<>();
		
		Usuario usuarioEncontrado = null;
		
		Usuario usuarioDefault = new Usuario();
		
		usuarioDefault.setLogin("occoa");
		usuarioDefault.setClave("123");
		usuarioDefault.setNombre("Omar Ccoa");
		
		usuarios.add(usuarioDefault);
		
		try {
			// usuarios = usuarioDao.listarPorLogin(login);
			
			for (Usuario usuario : usuarios) {
				if (usuario.getLogin().equals(login)) {
					usuarioEncontrado = usuario;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return usuarioEncontrado;
	}

}

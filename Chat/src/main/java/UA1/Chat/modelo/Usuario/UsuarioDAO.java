package UA1.Chat.modelo.Usuario;

public class UsuarioDAO extends Usuario{

	public UsuarioDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioDAO(String nickname) {
		super(nickname);
		// TODO Auto-generated constructor stub
	}
	public UsuarioDAO(Usuario u) {
		this.nickname=u.getNickname();
	}
}

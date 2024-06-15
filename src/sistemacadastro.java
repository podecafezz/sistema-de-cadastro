package cadastro;

import java.util.ArrayList;
import java.util.List;

public class SistemaCadastro {
    private List<Usuario> usuarios;

    public SistemaCadastro() {
        usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso: " + usuario);
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("Usuários cadastrados:");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }
}

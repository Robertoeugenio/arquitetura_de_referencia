package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import model.Usuario;

public class UsuarioDAO implements DAO {

	public Usuario busca(String nomeUsuario, String senha) {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		Usuario usuario = null;
		try {
			stmt = con.createStatement();
			String sql = "SELECT nome FROM usuarios where usuario='" + nomeUsuario + "' and senha='" + senha + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				nomeUsuario = rs.getString("nome");
				usuario = new Usuario(nomeUsuario);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException se2) {
				se2.printStackTrace();
			}
		}
		return usuario;
	}

	@Override
	public Object recuperarPorId(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void salvar(Object entidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}

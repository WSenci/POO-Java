package semana07;

import java.sql.SQLException;

public class ProdutoDAO {

	private BD bd;

	public ProdutoDAO() {
		bd = new BD();
	}

	/**
	 * apresenta em tela a relação de produtos cujo preço seja maior que o fornecido
	 */
	public void listar() {
		if (bd.getConnection()) {
			String sql = "select * from produtos";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				while (bd.rs.next()) {
					Produto p = new Produto();
					p.setCodigo(bd.rs.getInt("codigo"));
					p.setDesccricao(bd.rs.getString("descricao"));
					p.setPreco(bd.rs.getDouble("preco"));
					System.out.println(p);
					
					
					Produto p2 = new Produto(
							bd.rs.getInt("codigo"),
							bd.rs.getString("descricao"),
							bd.rs.getDouble("preco"));
					System.out.println(p2);
					
					
					System.out.println(bd.rs.getInt("codigo"));
					System.out.println(bd.rs.getString("descricao"));
					System.out.println(bd.rs.getDouble("preco"));
				}
			} catch (SQLException e) {
				System.out.println(e);
			} finally {
				bd.close();
			}
		} else {
			System.out.println("Falha na conexão!");
		}
	
	}
}

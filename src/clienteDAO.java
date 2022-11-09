import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class clienteDAO {
    
    projeto pj = new projeto();

    cliente cliente = new cliente();

    public void exibir(){

        String sql = "Select * from Cliente";
    
        ResultSet rs = pj.executaBusca(sql);
    
        try {
            while(rs.next()){
                String nome = rs.getString("Nome");
                String conta = rs.getString("Conta");
                String email = rs.getString("Email");
                String agencia = rs.getString("Agencia");
                float saldo = rs.getFloat("Saldo");
                System.out.println(nome + " - " +  email + " - " + conta + " - " + agencia + " - " + saldo );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*public void inserir(){

        String sql = "insert into Cliente (nome, email, agencia, conta, saldo) values (?, ?, ?, ?, ?)";

        try (Connection conn = con.executaSQL()){
            PreparedStatement stmt = con.PreparedStatement(sql);
	            stmt.setString(1, cliente.getNome());
	            stmt.setString(2, cliente.getEmail());
	            stmt.setString(3, cliente.getConta());
                stmt.setString(4, cliente.getAgencia());
                stmt.setFloat(5, cliente.getSaldo());

                int rowsAffected = stmt.executeUpdate();

                System.out.println("Inserção BEM SUCEDIDA!. Foi adicionada " + rowsAffected + " linha");
            }
        catch (Exception e) {
             e.printStackTrace();
        }
    }*/

}

    


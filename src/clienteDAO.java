import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class clienteDAO {
    
    projeto con = new projeto();

    cliente cliente = new cliente();

    public void exibir(){

        String sql = "Select * from Cliente";
    
        ResultSet rs = con.executaBusca(sql);
    
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

    public void inserir(){

        String sql = "insert into Cliente (nome, email, agencia, conta, saldo) values (?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = con.(sql);
	            stmt.setString(1 , aluno.getNome());
	            stmt.setInt(2, aluno.getIdade());
	            stmt.setString(3 , aluno.getEstado());
            }
        catch (Exception e) {
             e.printStackTrace();
        }
    }

}

    


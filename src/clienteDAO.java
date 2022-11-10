import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class clienteDAO {
    
    projeto projeto = new projeto();

    public void exibir(){

        String sql = "Select * from cadastro";
    
        ResultSet rs = projeto.executaBusca(sql);
    
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

}

    


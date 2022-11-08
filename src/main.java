import java.sql.ResultSet;

public class main {
    
public static void main(String[] args) {
    
    projeto con = new projeto();
    String sql = "Select * from Cadastro";
    
    ResultSet rs = con.executaBusca(sql);

    try {
        while(rs.next()){
            String nome = rs.getString("Nome");
            String conta = rs.getString("Conta");
            String agencia = rs.getString("Agencia");
            float saldo = rs.getFloat("Saldo");
            System.out.println(nome + " - " + conta + " - " + agencia + " - " + saldo );
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    

}


}

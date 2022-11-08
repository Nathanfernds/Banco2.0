import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Projeto{
    
    private String url;
    private String usuario;
    private String senha;
    private Connection con;

    Teste(){

        url = "jdbc:postgresql://localhost:5432/ProjetoBanco";
        usuario = "postgres";
        senha = "123";

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexao realizada com sucesso!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int executaSQL(String sql){
        try {
            Statement stm = con.createStatement();
            int res = stm.executeUpdate(sql);
            con.close();
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public ResultSet executaBusca(String sql){

        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            con.close();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

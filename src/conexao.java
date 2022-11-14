import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conexao {
    
    private static final String DRIVE = "org.postgresql.Driver";
    private static final String url = "jdbc:postgresql://localhost:5432/FuntecBanco";
    private static final String usuario = "postgres";
    private static final String senha = "123";

    public static Connection getConnection(){
        try {
            Class.forName(DRIVE);
            return DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException | SQLException ErroSQL) {
            throw new RuntimeException("Erro! Não foi possivel conectar." + ErroSQL);
        }


    }

    public static void closeConnection(Connection con){
  
        try {
            if(con != null);
            con.close();
        } catch (SQLException ErroSQL) {
           throw new RuntimeException("Erro! Não foi possivel fechar a conexão." + ErroSQL);
        }

    }

    public static void closeConnection(Connection con, PreparedStatement pstm){
        
        closeConnection(con);
        try {
            if(pstm != null);
            pstm.close();
        } catch (SQLException ErroSQL) {
           throw new RuntimeException("Erro! Não foi possivel fechar o PreparedStatment." + ErroSQL);
        }

    }

    public static void closeConnection(Connection con, PreparedStatement pstm, ResultSet rs){
        
        closeConnection(con, pstm);
        try {
            if(rs!= null);
            rs.close();
        } catch (SQLException ErroSQL) {
           throw new RuntimeException("Erro! Não foi possivel fechar o ResultSet." + ErroSQL);
        }

    }
    
}

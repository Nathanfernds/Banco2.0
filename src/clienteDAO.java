import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class clienteDAO {

    cliente Usuario = new cliente();
    Scanner scanner = new Scanner(System.in);

    public void adicionar() {
        
        Connection con = conexao.getConnection();
        PreparedStatement pstm = null;
    
        try {
            
            pstm = con.prepareStatement("insert into Cadastro (nome, email, agencia, conta, saldo) values (?, ?, ?, ?, ?);");
            
            System.out.println("---- Cadastro ----");
            System.out.println("\nDigite seu nome:");
            String nome = scanner.next();
            Usuario.setNome(nome);
            System.out.println("\nDigite seu email:");
            String email = scanner.next();
            Usuario.setEmail(email);
            System.out.println("\nDigite sua agencia:"); 
            String agencia = scanner.next();
            Usuario.setAgencia(agencia);
            System.out.println("\nDigite o tipo da conta:");
            String conta = scanner.next();
            Usuario.setConta(conta);
            System.out.println("\nDigite seu saldo atual:");
            float saldo = scanner.nextFloat();
            Usuario.setSaldo(saldo);
               
            pstm.setString(1, Usuario.getNome());
            pstm.setString(2, Usuario.getEmail());
            pstm.setString(3, Usuario.getAgencia());
            pstm.setString(4,Usuario.getConta());
            pstm.setFloat(5, Usuario.getSaldo()); 

                pstm.execute();

                JOptionPane.showMessageDialog(null, "Adicionado com sucesso","Sucesso", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            conexao.closeConnection(con);
        }
    }

    public void remover() {
        
        Connection con = conexao.getConnection();
        PreparedStatement pstm = null;

        try {
            pstm = con.prepareStatement("delete from Cadastro where email = ?;");
            
            pstm.setString(1, "nathanchite@mail.com");

            pstm.executeUpdate();

           JOptionPane.showMessageDialog(null, "Removido com sucesso","Sucesso", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            conexao.closeConnection(con);
        }
    }

    public List<cliente> Listar(){

        List<cliente> Usuario = new ArrayList<>();
        
        Connection con = conexao.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            pstm = con.prepareStatement("select * from Cadastro;");
            rs = pstm.executeQuery();

            while(rs.next()){

                cliente cliente = new cliente();

            cliente.setNome(rs.getString(1));
            cliente.setEmail(rs.getString(2));
            cliente.setAgencia(rs.getString(3));
            cliente.setConta(rs.getString(4));
            cliente.setSaldo(rs.getInt(5));            

            Usuario.add(cliente);
            
        }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
           conexao.closeConnection(con, pstm, rs);
        }

        return Usuario;
    }
    
}



    


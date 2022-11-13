import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            
            System.out.println("nome:");
            String nome = scanner.next();
            Usuario.setNome(nome);
            System.out.println("email:");
            String email = scanner.next();
            Usuario.setEmail(email);
            System.out.println("agencia:");
            String agencia = scanner.next();
            Usuario.setAgencia(agencia);
            System.out.println("conta:");
            String conta = scanner.next();
            Usuario.setConta(conta);
            System.out.println("saldo:");
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
    }
}


    


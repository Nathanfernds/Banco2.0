import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class BancoConta2 extends ContaBanco {

	public static void main(String[] args) {
		
		ContaBanco contaBanco = new ContaBanco();
        clienteDAO cld = new clienteDAO();
		
		Scanner scanner = new Scanner(System.in);
		
		cld.adicionar();
        contaBanco.informacoes();
        contaBanco.opcoes();
        
        
    }
	
}

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class BancoConta2 extends ContaBanco {

	public static void main(String[] args) {
		
		ContaBanco contaBanco = new ContaBanco();
        clienteDAO cld = new clienteDAO();
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Bem vindo ao Banco!");
        System.out.println("Digite 1 para Cadastrar");
        System.out.println("Digite 2 para Listar");
        int numero = scanner.nextInt();
    
    if (numero == 1) {
        cld.adicionar();
        contaBanco.Login();
        contaBanco.informacoes();
        contaBanco.opcoes();
    } else {
        cld.listar();
    }
    
}
        
}
	

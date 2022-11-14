import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class BancoConta2 extends ContaBanco {

	public static void main(String[] args) {
		
		ContaBanco contaBanco = new ContaBanco();
        clienteDAO cld = new clienteDAO();
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("\n---Bem vindo ao Banco!---");
        System.out.println("\nDigite 1 para Cadastrar");
        System.out.println("\nDigite 2 para Listar\n");
        int numero = scanner.nextInt();
    
    if (numero == 1) {
        cld.adicionar();
    } else {
        cld.listar();
    }
    
    System.out.println("\n-----------------------------");
    System.out.println("\nDeseja Fazer Login?");
    System.out.println("\nDigite 1 para Fazer o Login");
    System.out.println("\nDigite 2 para Finalizar");
    int numero2 = scanner.nextInt();
    
    switch (numero2) {
        case 1:
        contaBanco.Login();
        contaBanco.informacoes();
        contaBanco.opcoes();
            break;
        default:
        System.out.println("\nVolte Sempre!");
            break;
    }
        
}
        
}
	

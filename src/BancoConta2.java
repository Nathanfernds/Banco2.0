import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class BancoConta2 extends ContaBanco {

	public static void main(String[] args) {
		
		ContaBanco contaBanco = new ContaBanco();
        clienteDAO cld = new clienteDAO();
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("\n---Bem vindo ao Banco!---");
        System.out.println("\nDigite 1 para Cadastrar");
        System.out.println("\nDigite 2 para Fazer Login");
        System.out.println("\nDigite 3 para Listar\n");
        int numero = scanner.nextInt();
        System.out.println("\n-----------------------------");
    
    switch (numero) {
        case 1:
        cld.adicionar();
            break;
        case 2:
        contaBanco.Login();
        contaBanco.informacoes();
        contaBanco.opcoes();
            break;
        case 3:
        cld.listar();
            break;
        default:
        System.out.println("\nVolte Sempre!");
            break;
        
}
        
}

}
	

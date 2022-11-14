import java.sql.ResultSet;
import java.util.Scanner;

public class main {

   public static void main(String[] args) {
    
    clienteDAO cld = new clienteDAO();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite 1 para adicionar");
    System.out.println("Digite 2 para remover");
    
    int numero = scanner.nextInt();
    
    switch (numero) {
		case 1:
        cld.adicionar();
			break;
        case 2: 
       cld.remover();
            break;
		default:
			break;
    
}

}

}

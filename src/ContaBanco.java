import java.lang.invoke.SwitchPoint;
import java.security.PublicKey;
import java.util.Scanner;

public class ContaBanco{
	
	Scanner scanner = new Scanner(System.in);
	clienteDAO clt = new clienteDAO();

	public double saldo;
	protected double saque;
	protected double deposito;
			
	protected int resposta;
	protected int resposta2;
	
    protected String email;
	protected String conta;
	protected String nome;
	protected String agencia;	
	
	//*3
	public void sacar() {
		
	    System.out.println("\nSaldo atual: " + saldo);
		System.out.println("\nQuantia a ser sacada:");
		double saque = scanner.nextDouble();
	
		  if(saque <= saldo)
		  {
			  System.out.println("\nSaldo final: \n" + (saldo - saque));
			  System.out.println("\n---------------------");
			  saldo = saldo - saque;
		  }
		  else
		  {
			  System.out.println("\n---------------------");
			  System.out.println("|Saldo insulficiente|");
			  System.out.println("---------------------");
			  System.out.println("\n---------------------");
		  }
		  
		  System.out.println("\nDeseja continuar?");
		  System.out.println("\n(1)sim");
		  System.out.println("\n(2)não");
		  resposta2 = scanner.nextInt();
		  System.out.println("\n---------------------");
		  
		  
		  
		  switch (resposta2) {
		case 1:
			informacoes();
			opcoes();
			break;
		default:
			System.out.println("\nVolte sempre!");
			break;
		}
			
	}
		
	//*3
	public void depositar() {
		
		System.out.println("\nSaldo atual: " + saldo);
		System.out.println("\nQuantia a ser depositada: ");
		double deposito = scanner.nextDouble();
		
		System.out.println("\nSaldo final: \n" + (deposito + saldo));
		System.out.println("\n---------------------");
		
		saldo = deposito + saldo;
		
		System.out.println("\nDeseja continuar?");
		  System.out.println("\n(1)sim");
		  System.out.println("\n(2)não");
		  resposta2 = scanner.nextInt();
		  System.out.println("\n---------------------");
		  
		  switch (resposta2) {
		case 1:
			informacoes();
			opcoes();
			break;
		default:
			System.out.println("\nVolte sempre!");
			break;
		}
				
	}
	
	//1
	public void Login() {
		
        System.out.println("---- Login ----");
		
		System.out.println("\nDigite seu nome:");
        nome = scanner.next();
        
        System.out.println("\nDigite seu email:");
        email = scanner.next();
        
        System.out.println("\nDigite sua agencia:"); 
        agencia = scanner.next();
        
        System.out.println("\nDigite o tipo da conta:");
        conta = scanner.next();

	}
	
	//2
	public void informacoes() {
		
		System.out.println("\n---- Informaçôes ----");
		   
        System.out.println("\nNome do titular:\n" + nome);
        
        System.out.println("\nAgencia:\n" + agencia);
        
        System.out.println("\nConta " + conta);

        System.out.println("\nSaldo atual:\n" + saldo);  
        
        System.out.println("\n---------------------");
	}
	
	//3
	public void opcoes() {
		
		 System.out.println("\nDigite (1) para sacar");
	        System.out.println("\nDigite (2) para depositar");
	        System.out.println("\nDigite (3) para finalizar");
	        int resposta = scanner.nextInt();
	        
	        switch (resposta) {
	        case 1:
				System.out.println("\n--------SACAR--------");
				sacar();
			    break;
	        case 2:
				System.out.println("\n------Depositar------");
				depositar();
				break;
	        default:
				System.out.println("\n---------------------");
				System.out.println("\nVolte sempre!");
				break;
				}   
	        
		  }
	      
	}

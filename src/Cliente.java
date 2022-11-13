public class cliente {
    
    private String nome;
    private String conta;
    private String agencia;
    private String email;
    private float saldo;

    public cliente(String nome, String email, String agencia, String conta, float saldo) {
        this.nome = nome;
        this.email = email;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public cliente() { }

    public String getNome() {
        return nome;
    }

    public void setNome(String meuNome) {
       nome = meuNome;
    }
    
    public String getConta() {
        return conta;
    }

    public void setConta(String minhaConta) {
       conta = minhaConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String minhaAgencia) {
        agencia = minhaAgencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String meuEmail) {
        email = meuEmail;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float meuSaldo) {
        saldo = meuSaldo;
    }

}
    

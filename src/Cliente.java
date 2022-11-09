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

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("cliente{");
        sb.append("nome=").append(nome);
        sb.append(", email='").append(email).append('\'');
        sb.append(", agencia=").append(agencia);
        sb.append(", conta='").append(conta).append('\'');
        sb.append(", saldo='").append(saldo).append('\'');
        sb.append('}');
        
        return sb.toString();
    }
    
    
}

import java.util.Objects;

public class Conta {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private float saldo;

    public Conta(){

    }
    public Conta(String nomeCliente, int numero, String agencia, float saldo){
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return numero == conta.numero && Objects.equals(agencia, conta.agencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, agencia);
    }


    @Override
    public String toString() {
        return "----Conta----" + "\n" +
                "Numero: " + numero + "\n" +
                "Agencia: '" + agencia + '\'' + "\n" +
                "Nome do Cliente: '" + nomeCliente + '\'' + "\n" +
                "Saldo: " + saldo;
    }
}

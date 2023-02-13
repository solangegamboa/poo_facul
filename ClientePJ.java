public class ClientePJ extends Cliente
{
    public String nome;
    public String cnpj;
    private double saldo;

    public void efetuarEmprestimoPJ(double valor)
    {
        super.saldoContaCorrente += valor;
    }

    @Override
    public double obterSaldo() {
        return this.saldo;
    }
}
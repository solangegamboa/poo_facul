public class ClientePJ extends Cliente
{
    public String nome;
    public String cnpj;

    public void efetuarEmprestimoPJ(double valor)
    {
        super.saldoContaCorrente += valor;
    }
}
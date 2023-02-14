public class ClientePF extends Cliente
{
    public String nome;
    public String cpf;
    private double saldo;

    public static void main(String[] args) {
        ClientePF objClientePF = new ClientePF();
        objClientePF.saldoContaCorrente = 100.00;
        objClientePF.efetuarSaque(20.00);
        objClientePF.efetuarEmprestimoPF(200.00);
        System.out.println(objClientePF.saldoContaCorrente);
    }
    

    public void efetuarEmprestimoPF(double valor) 
    {
        super.saldoContaCorrente += valor;
    }

    @Override
    public double obterSaldo() {
        return this.saldo;
    }
}
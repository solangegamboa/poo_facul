public abstract class Cliente 
{
    public String contaCorrente;
    public int numeroAgencia;
    public int numeroBanco;
    public double saldoContaCorrente;

    public void efetuarSaque(double valor) 
    {
        this.saldoContaCorrente -= valor;
    }

    public abstract double obterSaldo();
 }
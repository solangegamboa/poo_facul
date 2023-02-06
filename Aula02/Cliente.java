// nome da classe em singular que faça sentido
public class Cliente 
{
  // atributos declarado tipo de dado + nome do atributo
  int agencia;
  String contaCorrente;
  String cpf;
  double saldoCC;

  //método/açã0
  //sempre um verbo
  //void é quando o método não retorna nenhum tipo de dado
  public void sacarContaCorrente(double valor) 
  {
    if(this.saldoCC > valor)
    {
      this.saldoCC -= valor;
    }
  }

  public int informarAgencia() 
  {
    return this.agencia;
  }

}
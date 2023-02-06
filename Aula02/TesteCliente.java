public class TesteCliente
  {
    public static void main(String[] args) {
      //instanciando a classe
      //Nome da classe + nome da variavel = instancia nova objeto
      Cliente cliente = new Cliente();
      //objeto em memória aguardando os valores dos atributos
      //atribuir valores
      cliente.agencia = 1234;
      cliente.contaCorrente = "1231231-8";
      cliente.cpf = "303.030.222-34";
      cliente.saldoCC = 500.00;
      //estrutura de objeto agora com valores - state - fotografia do objeto em memória

      cliente.sacarContaCorrente(20.00);
      int agenciaDoCliente = cliente.informarAgencia();
      System.out.println(agenciaDoCliente);
    }
  }
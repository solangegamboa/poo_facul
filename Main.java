class Main {
    // método publico pode ser chamado de fora da classe main
    public static void main(String[] args) {
      Ponto pontoA = new Ponto(7,3);
      Ponto pontoB = new Ponto(4,1);

      if(pontoA.verificarIgual(pontoB)) {
        System.out.println("Pontos iguais");
      } else {
        System.out.println("Pontos diferentes");
      }

      System.out.println(pontoA.verificarDistancia(pontoB));
    }
  }
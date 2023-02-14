public class Ponto {
    private int x;
    private int y;

    /**
     * Construtor ponto para ponto vazio
     */
    public Ponto() {
        this.x = 0;
        this.x = 0;
    }

    /**
     * Constructor para receber valores
     * @param x
     * @param y
     */
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Função para verificar se os pontos são iguais
     * @param ponto
     * @return true or false
     */
    public boolean verificarIgual(Ponto ponto) {
        return (this.x == ponto.x && this.y == ponto.y);
    }

    /**
     * Função que verifica distância entre 2 pontos
     * @param ponto
     * @return
     */
    public double verificarDistancia(Ponto ponto) {
        return Math.sqrt(Math.pow(ponto.x - this.x, 2) +
                Math.pow(ponto.y - this.y, 2) * 1.0);
    }
}

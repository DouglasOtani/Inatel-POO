public class Cliente {
    public String nome;
    public long cpf;
    public Computador[] carrinho = new Computador[5];
    public float total;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra() {
        for(int i = 0; i < this.carrinho.length; ++i) {
            if (this.carrinho[i] != null) {
                this.total += this.carrinho[i].preco;
            }
        }

        return this.total;
    }
}
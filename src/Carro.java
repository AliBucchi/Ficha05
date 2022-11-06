public class Carro {

    public String matricula;
    public int velocidadeAtual;
    public final int velocidadeMaxima = 200;
    public Condutor condutor;
    public boolean ligado;

    public void buzinar() {
        System.out.println("Buzina do carro");
    }

    public int getVelocidadeAtual(){
        return this.velocidadeAtual;
    }
    public int getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
    public Condutor getCondutor(){
        return this.condutor;
    }
    public void acelerar() {
        if (this.ligado) {
            this.velocidadeAtual += 10 + this.condutor.getDestreza()*0.1;
            if (this.velocidadeAtual > this.velocidadeMaxima)
                this.velocidadeAtual = this.velocidadeMaxima;
        } else
            System.out.println("O Carro não pode acelerar pois está desligado!");
    }
    public void travar (int intensidadeTravagem) {
        if (this.ligado) {
            if (intensidadeTravagem == this.velocidadeMaxima)
                intensidadeTravagem = this.velocidadeMaxima;
            else if (intensidadeTravagem < 0)
                intensidadeTravagem = 0;
            this.velocidadeAtual -= intensidadeTravagem;
            if (this.velocidadeAtual > this.velocidadeMaxima)
                this.velocidadeAtual = this.velocidadeMaxima;
            else if (this.velocidadeAtual < 0)
                this.velocidadeAtual = 0;
        } else
            System.out.println("O Carro não pode travar pois está desligado!");
    }

}


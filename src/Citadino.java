public class Citadino extends Carro {

    public Citadino(){

    }
    public void ligarACManual(){
        System.out.println("AC ligado!");
    }

    public void buzinar() {
        super.buzinar();
        System.out.println("Buzina do Citadino");
    }

    public String toString() {
        return "Este objeto é tipo Citadino";
    }
}


public class Familiar extends Carro {

    public Familiar() {

    }
    public void desligarAirbagPassageiro(){
        System.out.println("Airbag desligado!");
    }
    public void buzinar() {
        super.buzinar();
        System.out.println("Buzina do Familiar");
    }

    public String toString() {
        return "Este objeto é tipo Familiar";
    }
}

public class Jipe extends Carro {

    public Jipe() {

    }
    public void ligarTracao4x4(){
        System.out.println("Tração ligada!");
    }

    public void buzinar() {
        super.buzinar();
        System.out.println("Buzina do Jipe");
    }

    public String toString() {
        return "Este objeto é tipo Jipe";
    }
}

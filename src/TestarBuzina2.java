import java.util.Scanner;
import javax.swing.JOptionPane;


public class TestarBuzina2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String tipoCarro = JOptionPane.showInputDialog("Insira o tipo de carro que deseja buzinar: Citadino, Familiar ou Jipe");


        new Carro();
        Carro carro = switch (tipoCarro) {
            case "Citadino" -> new Citadino();
            case "Familiar" -> new Familiar();
            case "Jipe" -> new Jipe();
            default -> new Carro();
        };

        carro.buzinar();

        if (carro instanceof Citadino) {
            ((Citadino)carro).ligarACManual();
        }
        else if (carro instanceof Familiar) {
            ((Familiar)carro).desligarAirbagPassageiro();
        }
        else if (carro instanceof Jipe) {
            ((Jipe)carro).ligarTracao4x4();
        }
    }
}

public class TestarBuzina1 {

    public static void main(String[] args) {
        Citadino citadino = new Citadino();
        Familiar familiar = new Familiar();
        Jipe jipe = new Jipe();

        System.out.println(citadino);
        citadino.buzinar();

        System.out.println(familiar);
        familiar.buzinar();

        System.out.println(jipe);
        jipe.buzinar();
    }
}

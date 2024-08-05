package method_chaining_technique;

public class TeaMaster {
    public static void main(String[] args) {
        TeaMaker teaMaker = new TeaMaker();


        teaMaker.setCup()
                .addMilk()
                .addSugar()
                .addDecoction()
                .makeStir()
                .setServe();

    }
}

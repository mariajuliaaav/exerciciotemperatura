public class ConversãoDeTemperatura {
    public static void main(String[] args) {

        metodoConverteK conversaoK = new metodoConverteK();
        metodoConverteF conversaoF = new metodoConverteF();
        double temperatura = 10.0;
        double convK = conversaoK.celsius(temperatura);
        double convF = conversaoF.celsius(temperatura);

        System.out.println("A conversão de " + temperatura + "°C resulta em " + convK + "°K.");
        System.out.println("A conversão de " + temperatura + "°C resulta em " + convF + "°F.");

    }
}
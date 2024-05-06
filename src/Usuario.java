public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("canal atual? " + smartTv.canal);
        smartTv.mudarCanal(15);
        System.out.println("canal atual? " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("volume atual? " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("volume atual? " + smartTv.volume);

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("canal atual? " + smartTv.canal);
        System.out.println("volume atual? " + smartTv.volume);

        smartTv.ligar();
    }
}

public class Main {
    static Contador contador = new Contador();
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Triangulo triangulo = new Triangulo((Math.round((Math.random() + 1 )* 10)), (Math.round((Math.random()+1)*10)));
            lanzarHilo(triangulo, "Hilo " + i);
        }
    }

    public static void lanzarHilo(Triangulo triangulo, String nombreHilo){
        Thread thread = new Thread(triangulo);
        thread.setName(nombreHilo);
        thread.start();
    }
}

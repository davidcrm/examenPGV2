public class Triangulo implements Runnable{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {return base;}


    public void setBase(double base) {this.base = base;}


    public double getAltura() {return altura;}


    public void setAltura(double altura) {this.altura = altura;}


    public synchronized double calcularArea(){
        return base * altura / 2;
    }


    @Override
    public void run() {

        System.out.println( "El " + Thread.currentThread().getName() + " Ha finalizado." +
                "\nBase del triangulo: " + this.getBase() + "\nAltura del triángulo: " + this.getAltura()
                + "\n" + "Area del triángulo: " + calcularArea() + " um² \n"
                + "----------------------------------------------\n"
                + "Contador: " + Main.contador.aumentarCuenta() + "\n"
                + "----------------------------------------------");
    }
}

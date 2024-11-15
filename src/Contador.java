public class Contador {
    private int cuenta;

    public Contador(){
        this.cuenta = 1;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public  synchronized int aumentarCuenta(){
         return cuenta ++;
    }
}

package semaforo;

public class Boletin04 {

    public static void main(String[] args) {
        Semaforo sema1=new Semaforo();
        String valor=sema1.damecor();
        System.out.println("cor antes de darlle valor "+valor);
        sema1.poncor("verde");
        valor=sema1.damecor();
        System.out.println("cor: "+valor);
        //outro xeito
        System.out.println("cor: "+ sema1.damecor());
    }
}

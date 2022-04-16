package Test;
public class Test{

    public static void main (String [] args){
        Complejo z, w;
        z = new Complejo(-1.5, 3.0);
        w = new Complejo(-1.2, 2.4);
        z.suma(w);
        System.out.println("Complejo:" + z.toString());
   }
}
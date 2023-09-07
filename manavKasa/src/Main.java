import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
         */

                int armut,elma,domates,muz,patlican;
                double arm =2.14, elm =3.67, dom = 1.11, mz = 0.95, pat = 5.0, total;

                Scanner input = new Scanner(System.in);

                System.out.print("Armut ne kadar(kg)?");
                armut = input.nextInt();

                System.out.print("Elma ne kadar(kg)? ");
                elma = input.nextInt();

                System.out.print("Domates ne kadar(kg)? ");
                domates = input.nextInt();

                System.out.print("Muz ne kadar(kg)? ");
                muz = input.nextInt();

                System.out.print("Patlıcan ne kadar(kg)? ");
                patlican = input.nextInt();

                total = ((arm * armut) + (elm * elma) + (dom * domates) + (mz * muz) + (pat * patlican));
                System.out.println("Ödenecek Toplam Tutar: " + total + "TL");

    }
}
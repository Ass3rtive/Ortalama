import java.util.Scanner;
public class Ortalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fizik, turkce, kimya, muzik;

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = input.nextByte();
        System.out.print("Müzik Notunuz: ");
        muzik = input.nextByte();

        double toplam = (mat + fizik + turkce + kimya + muzik)/5;

        if (toplam >= 55){
            System.out.println("Sınıfı Geçtiniz");

            System.out.println("Ortalamanız: "  + toplam);
        }
        else{
            System.out.println("Sınıfta Kaldınız");
            System.out.println("Ortalamanız: "  + toplam);
        }
        /**
         * @author Erdem AYDEMİR.
          */    



    }
}

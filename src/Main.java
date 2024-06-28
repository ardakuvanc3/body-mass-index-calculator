import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);;
        double kilo, boy,sonuc;

        System.out.println("Boyunuz:(metre) ");
        boy = scan.nextDouble();

        System.out.println("Kilonuz: ");
        kilo = scan.nextDouble();

        sonuc = kilo/(boy*boy);

        if (sonuc < 18.5){
            System.out.println("Zayıfsınız");
            System.out.println(sonuc);
        }
        else if (sonuc < 25){
            System.out.println("İdeal");
            System.out.println(sonuc);
        }
        else if (sonuc < 30){
            System.out.println("Şişman");
            System.out.println(sonuc);
        }
        else if (sonuc < 35){
            System.out.println("Obez");
            System.out.println(sonuc);
        }
        else if (sonuc > 35){
            System.out.println("Aşırı obez");
            System.out.println(sonuc);
        }
        else {
            System.out.println("Hatalı bir işlem yaptınız!");
        }

    }
}
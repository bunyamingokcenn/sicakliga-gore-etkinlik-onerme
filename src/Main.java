import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;
        Scanner input = new Scanner(System.in);

        System.out.println("Etkinlik Programına Hoşgeldiniz\n-------------------------------");
        System.out.print("Lütfen hava sıcaklığını giriniz: ");
        heat = input.nextInt();
        System.out.println("Hava sıcaklığı: " + heat + " derece");

        if(heat < 5){
            System.out.println("Kayak yapabilirsiniz");
        }else if (heat <=25){
            if(heat<=15){
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if (heat>=15){
                System.out.println("Pikniğe gidebilirsiniz");
            }

        }else {
            System.out.println("Yüzmeye gidebilirsiniz");

        }
    }
}
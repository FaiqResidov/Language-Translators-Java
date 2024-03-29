import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*  Kicik bir proqram yazin, istifadeciden adini ve aldigi bali alsin, ve aldigi bala gore ona hansi qiymeti aldigini cap etsin.
        100-91 bal arasi - A qiymeti
        90-81 bal arasi - B qiymeti
        80-71 bal arasi - C qiymeti
        70-61 bal arasi - D qiymeti
        60-51 bal arasi - E qiymeti
        50-0 bal arasi - F qiymeti
        Numune: Ad: Nurlan, Bal 92 -> "Hormetli Nurlan, sizin qiymetiniz: A"
        */

         Scanner sc=new Scanner(System.in);
        System.out.println("Adinizi daxil edin:");
        String name=sc.nextLine();
        System.out.println("Balinizi daxil edin:");
         int point =sc.nextInt();
          if(point>100 || point<0){
            System.out.println("Hormetli "+name +","+" Bele bir qiymet gostericisi yoxdur");
        }
        else if(point>=91 && point<=100){
            System.out.println("Hormetli "+name +","+" sizin qiymetiniz:A");
        }
        else if(point>=81 && point<=90){
            System.out.println("Hormetli "+name +","+" sizin qiymetiniz:B");
        }
          else if(point>=71 && point<=80){
            System.out.println("Hormetli "+name +","+" sizin qiymetiniz:C");
        }
          else if(point>=61 && point<=70){
            System.out.println("Hormetli "+name +","+" sizin qiymetiniz:D");
        }
          else if(point>=51 && point<=60){
            System.out.println("Hormetli "+name +","+" sizin qiymetiniz:E");
        }

        else{
            System.out.println("Hormetli "+name +","+" sizin qiymetiniz:F");
        }

        }
    }

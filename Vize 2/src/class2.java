import java.util.Scanner;

public class class2 {
    public void bla(){

        Scanner secenek2= new Scanner(System.in);
        int secim2=secenek2.nextInt();
        //girdi sonucuna göre maindeki switch casein case 3 üne bağlanan yapı
        switch(secim2){
            case 1: System.out.println("Elit üyeler için mail bilgisi giriniz\n\n");
                break;
            case 2: System.out.println(" Üyeler için mail bilgisi giriniz\n\n");
                break;
            case 3: System.out.println("Tüm üyeler için mail bilgisi giriniz\n\n");
                break;
        }

    }}

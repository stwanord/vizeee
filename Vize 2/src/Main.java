import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //for döngüsü sonsuza kadar sürsün diye iyi azalan ve şartını 10dan büyük yaptım.
        for(int i=0;i<10;i--) {
            System.out.println("Yapmak istediğiniz işlemi seçiniz.\n1-)Elit üye kaydetme\n2-)Üye kaydetme\n3-)Mail gönderme\n\n\n");

            //class1 için senek kısmını yazdım ve çağırdım.
            class1 nesne = new class1();
            int secenek;
            secenek = nesne.secim;

            class2 nesne2 = new class2();

            switch (secenek) {
                case 1:
                    System.out.println("Önce elit kullanıcı isim Soyismi, sonra e-mail adressini giriniz.\n\n\n");
                    Scanner case1= new Scanner(System.in);
                    String Elitisim=case1.next();
                    Scanner case11= new Scanner(System.in);
                    String Elitmail=case11.next();
                    try {
                        File file = new File("viz.txt");
                        FileWriter writer = new FileWriter(file);
                        writer.write(Elitisim);
                        writer.close();
                        System.out.println("String dosyaya yazıldı.");
                    } catch (IOException e) {
                        System.err.println("Dosya yazma hatası: " + e.getMessage());
                    }

                    // Dosya okuma işlemi
                    try {
                        File file = new File("viz.txt");
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        String line;
                        System.out.println("Dosya içeriği:");
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                        reader.close();
                    } catch (IOException e) {
                        System.err.println("Dosya okuma hatası: " + e.getMessage());
                    }

                    try {
                        File file = new File("vizz.txt");
                        FileWriter writer = new FileWriter(file);
                        writer.write(Elitmail);
                        writer.close();
                        System.out.println("String dosyaya yazıldı.");
                    } catch (IOException e) {
                        System.err.println("Dosya yazma hatası: " + e.getMessage());
                    }


                    try {
                        File file = new File("vizz.txt");
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        String line;
                        System.out.println("Dosya içeriği:");
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                        reader.close();
                    } catch (IOException e) {
                        System.err.println("Dosya okuma hatası: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Önce kullanıcı isim Soyismi, sonra e-mail adressini giriniz.\n\n\n");
                    Scanner case2= new Scanner(System.in);
                    String isim=case2.next();
                    Scanner case22= new Scanner(System.in);
                    String mail=case22.next();
                    try {
                        File file = new File("viz2.txt");
                        FileWriter writer = new FileWriter(file);
                        writer.write(isim);
                        writer.close();
                        System.out.println("String dosyaya yazıldı.");
                    } catch (IOException e) {
                        System.err.println("Dosya yazma hatası: " + e.getMessage());
                    }

                    // dosya okuma işlemi
                    try {
                        File file = new File("viz2.txt");
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        String line;
                        System.out.println("Dosya içeriği:");
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                        reader.close();
                    } catch (IOException e) {
                        System.err.println("Dosya okuma hatası: " + e.getMessage());
                    }

                    try {
                        File file = new File("viz22.txt");
                        FileWriter writer = new FileWriter(file);
                        writer.write(mail);
                        writer.close();
                        System.out.println("String dosyaya yazıldı.");
                    } catch (IOException e) {
                        System.err.println("Dosya yazma hatası: " + e.getMessage());
                    }

                    // Dosya okuma işlemi
                    try {
                        File file = new File("viz22.txt");
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        String line;
                        System.out.println("Dosya içeriği:");
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                        reader.close();
                    } catch (IOException e) {
                        System.err.println("Dosya okuma hatası: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Mail göndeeceğiniz grubu  seçiniz.\n1-)Elit üyeler için mail\n2-)Üyeler için mail\n3-)tüm üyeler için mail\n\n\n");
                    //2. aşama için class2 yi kurdum ve switch case ve fonksiyon ayarladım. Fonksiyonu Case3e çağırdım.
                    class2 nesne3 = new class2();
                    nesne3.bla();

                    break;
            }


        }}}
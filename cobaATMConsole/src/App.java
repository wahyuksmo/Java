import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner terminalInput = new Scanner(System.in);
        int menu, saldo, simpan, ambil, pin;
        saldo =0;
        String pilihan;
    
        pin = 241003;
        System.out.print("Masukan Pin ATM Anda : ");
        pin = terminalInput.nextInt();

        if(pin == 241003) {

            do {

                System.out.println("1. Informasi Saldo");
                System.out.println("2. Nabung Uang ");
                System.out.println("3. Ambil Uang");
                System.out.println("4. Keluar");
                System.out.print("Pilih yang anda inginkan 1-4 : ");
                menu = terminalInput.nextInt();

                if(menu == 1 ) {
                    System.out.println("Saldo anda sekarang = Rp. " + saldo);
                }else if (menu == 2 ) {
                    System.out.print("Masukan Jumlah Uang = " );
                    simpan = terminalInput.nextInt();
                    saldo = saldo + simpan;
                    System.out.println("Saldo anda berhasil ditabung, Saldo Anda = Rp. " + saldo);
                }else if(menu == 3) {
                    System.out.print("Masukan Jumlah Uang Yang Ingin Diambil = " );
                    ambil = terminalInput.nextInt();
                    saldo = saldo - ambil;
                    System.out.println("Saldo anda berhasil diambil, Saldo Anda = Rp. " + saldo);
                }else if (menu == 4) {
                    System.out.println("Terima kasih sudah memakai layanan kami");
                } else {
                    System.out.println("Input menu tidak ada");
                }

                
           System.out.print("Anda ingin lanjut tranksaksi ? (y/n)");
           pilihan = terminalInput.next();

            }while(pilihan.equals("y"));



        }else {
            System.out.println("PIN yang anda masukan Salah");
        }


    }


}
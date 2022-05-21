import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     


        String validate;
        int saldo,menuKat,motor,mobil;

        motor = 2000;
        mobil = 5000;


        Scanner inputTerminal = new Scanner(System.in);



        do {


            System.out.println("========Kategori Kendaraan========");
            System.out.println("1. Motor");
            System.out.println("2. Mobil");
            System.out.print("Silahkan pilih kategori kendaraan anda : ");
            menuKat = inputTerminal.nextInt();

            if(menuKat == 1) {

                System.out.println("Tagihan untuk parkir motor adalah :  " + motor);
                System.out.print("Silahkan masukan uang anda : ");
                saldo = inputTerminal.nextInt();
                
                if(saldo < motor) {
                    System.out.println("Uang anda tidak cukup");
                }else {
                    System.out.println("Silahkan masuk, Karcis jangan sampai hilang");
                }   

                menuKat = 0;
            }

            if(menuKat == 2) {

                System.out.println("Tagihan untuk parkir mobil adalah :  " + mobil);
                System.out.print("Silahkan masukan uang anda : ");
                saldo = inputTerminal.nextInt();
                
                if(saldo < motor) {
                    System.out.println("Uang anda tidak cukup");
                }else {
                    System.out.println("Silahkan masuk, Karcis jangan sampai hilang");
                 
                }  
                
                menuKat =0;
            }


        }while(menuKat!=0);










    }
}

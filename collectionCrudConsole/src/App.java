import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Siswa {

    private int id;
    private String nama;
    private int nilai;


    Siswa(int id, String nama, int nilai) {
        this.id = id;
        this.nama = nama;
        this.nilai = nilai;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }

    public String toString() {
        return id+" "+nama+" "+nilai;
    }

}



class crudDemo {



    public static void main(String[] args) {
        
        List<Siswa> siswa = new ArrayList<Siswa>();
        Scanner forInt  = new Scanner(System.in);
        Scanner forString = new Scanner(System.in);
        int pilUser;

        do {
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Update");
            System.out.print("Masukan Pilihan mu : ");
            pilUser = forInt.nextInt();


            if(pilUser == 1 ) {
                System.out.print("Masukan ID : ");
                int id = forInt.nextInt();
                System.out.print("Masukan Nama : ");
                String nama = forString.nextLine();
                System.out.print("Masukan Nilai : ");
                    int nilai = forInt.nextInt();

                siswa.add(new Siswa(id, nama, nilai));

            } else if(pilUser == 2) {
                
                System.out.println("================");
    
                Iterator<Siswa> sis = siswa.iterator();
                while(sis.hasNext()) {
                    Siswa e = sis.next();
                    System.out.println(e);
                }
                System.out.println("================");



            } else if(pilUser == 3) {

                boolean nemu = false;

                System.out.print("Cari siswa berdasarkan ID : ");
                int id = forInt.nextInt();

                System.out.println("================");
    
                Iterator<Siswa> sis = siswa.iterator();
                while(sis.hasNext()) {
                    Siswa e = sis.next();
                    if(e.getId() == id) {
                        System.out.println(e);
                        nemu = true;
                    }
                
                }

                if(!nemu) {
                    System.out.println("Pencarian tidak ditemukan");
                }
                System.out.println("================");





            }else if(pilUser == 4) {
                boolean nemu = false;

                System.out.print("Hapus siswa berdasarkan ID : ");
                int id = forInt.nextInt();

                System.out.println("================");
    
                Iterator<Siswa> sis = siswa.iterator();
                while(sis.hasNext()) {
                    Siswa e = sis.next();
                    if(e.getId() == id) {
                        sis.remove();
                        nemu = true;
                    }
                
                }

                if(!nemu) {
                    System.out.println("Pencarian tidak ditemukan");
                }else {
                    System.out.println("Data berhasil dihapus");
                }
                System.out.println("================");


            } else  if(pilUser == 5) {
                boolean nemu = false;

                System.out.print("Ubah data siswa berdasarkan ID : ");
                int id = forInt.nextInt();

                System.out.println("================");
    
                ListIterator<Siswa> sis = siswa.listIterator();
                while(sis.hasNext()) {
                    Siswa e = sis.next();
                    if(e.getId() == id) {
                        System.out.print("Masukan nama baru : ");
                        String nama = forString.nextLine();
                        System.out.println("Masukan nilai baru : ");
                        int nilai = forInt.nextInt();

                        sis.set(new Siswa(id, nama, nilai));
                        nemu = true;
                    }
                
                }

                if(!nemu) {
                    System.out.println("Pencarian tidak ditemukan");
                }else {
                    System.out.println("Data berhasil diubah");
                }
                System.out.println("================");




            }




        }while(pilUser!=0);








        

    }



}








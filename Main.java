import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;


public class Main {
    

public static void main(String[] args) {
    mainMenu();
}

public static void mainMenu() {
}

/**
 * @param args
 */
public static void mainMenu(String[] args) {

    String namaMenu = "";
    Scanner input = new Scanner(System.in);

    int ent, harga = 0;
    int qty;
    System.out.println("=======================");
    System.out.println("Selamat Datang Di BinarFud");
    System.out.println("=======================");
    System.out.println("Silahkan pilih makanan  : ");
    System.out.println("1. Nasi Goreng | Rp. 15.000");
    System.out.println("2. Mie Goreng  | Rp. 13.000");
    System.out.println("3. Nasi + Ayam  | Rp. 18.000");
    System.out.println("4. Es teh manis  | Rp. 3.000");
    System.out.println("5. Es jeruk | Rp. 5.000");
    System.out.println("99. Pesan dan Bayar");
    System.out.println("0. Keluar aplikasi");
    System.out.println("=> ");
    ent = input.nextInt();
    if (ent >=1 && ent <= 5) {
    switch (ent) {
        case 1:
            System.out.println("=======================");
            System.out.println("Berapa pesanan Anda");
            System.out.println("=======================");
            System.out.println("1. Nasi Goreng  | Rp. 15.000");
            System.out.println("input 0 untuk kembali");
            System.out.println("qty=> ");
            qty = input.nextInt();
            namaMenu = "Nasi Goreng";
            harga = 15000;
            break;
        case 2:
            System.out.println("=======================");
            System.out.println("Berapa pesanan Anda");
            System.out.println("=======================");
            System.out.println("2. Mie Goreng  | Rp. 13.000");
            System.out.println("input 0 untuk kembali");
            System.out.println("qty=> ");
            qty = input.nextInt();
            namaMenu = "Mie Goreng";
            harga = 13000;
            break;
        case 3:
            System.out.println("=======================");
            System.out.println("Berapa pesanan Anda");
            System.out.println("=======================");
            System.out.println("3. Nasi + Ayam | Rp. 18.000");
            System.out.println("input 0 untuk kembali");
            System.out.println("qty=> ");
            qty = input.nextInt();
            namaMenu = "Nasi + Ayam";
            harga = 18000;
            break;
        case 4:
            System.out.println("=======================");
            System.out.println("Berapa pesanan Anda");
            System.out.println("=======================");
            System.out.println("4. Es teh manis  | Rp. 3.000");
            System.out.println("input 0 untuk kembali");
            System.out.print("qty=> ");
            qty = input.nextInt();
            namaMenu = "Es Teh Manis";
            harga = 3000;
            break;
        case 5:
            System.out.println("=======================");
            System.out.println("Berapa pesanan Anda");
            System.out.println("=======================");
            System.out.println("5. Es jeruk | Rp. 5.000");
            System.out.println("input 0 untuk kembali");
            String s;
            System.out.print("qty=> ");
            qty = input.nextInt();
            namaMenu = "Es jeruk";
            harga = 5000;
            break;
        default:
            System.out.println("Pilihan Salah");
            break;
        qty = input.nextInt();
        if (qty > 0) {
           
            if (menu.contains(namaMenu)) {
                int indexMenu = extracted(namaMenu);
                qty.set(indexMenu, (qty.get(indexMenu) + qty));
    
            } else {
                menu.add(namaMenu);
                hargamenu.add(harga);
                qty.add(qty);

            }
        } else if (ent == 99) {
            showStruk();
        }
    }while (ent !=0);
}

private static int extracted(String namaMenu) {
    return namaMenu.indexOf(namaMenu);
}

public static void showStruk() {
    int total = 0;
    int subTotal = 0;
    StringBuilder nota = new StringBuilder();
    for (int i=0; i < namaMenu.size(); i++) {
        subTotal = hargaMenu.get(i) * qty.get(i);
        total += subTotal;
        nota.append(namaMenu.get(i)).append(str:" qty : ").append(qty.get(i)).append(str:" total : ").append(subTotal).append(str:"\n");
        
    }
    nota.append(str:"Total :").append(total);
    cetaknota(nota.toString());
}

public static void cetaknota(string nota){
    String PATH = "/Users/nurmarhl/Documents/Synrgy7/synrgy7/notaa.txt";
    File file = new File(PATH);
    try {
        if (file.createnewFile()) {
            System.out.println("File Created");
            FileWriter filewriter = new FileWriter(PATH);
            fileWriter.write(nota);
            fileWriter.close();
            System.out.println("Berhasil dicetak");
        }else{
            System.out.println("Sudah Dicetak");   
        }
    } catch (IOException e) {
        System.out.println("Terjadi Error");
        throw new RuntimeException(e);
    }
        }
    }
}  

        
    }
    }

}
}

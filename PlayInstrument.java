package penilaian;

import java.util.Scanner;

//Buat Objek Class dari Driver Class berikut
public class PlayInstrument {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Instrumentnya a = new Instrumentnya();
        Instrumentnya b = new Instrumentnya("Piano", 200.0);
        Instrumentnya c = new Instrumentnya("Violin", 150.9);

        a.setType("Gitar");
        a.setPrice(101.5);
        a.print();
        b.print();
        c.print();

        if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("Instrument termahal adalah " + a.getType());
        } else if (b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()) {
            System.out.println("Instrument termahal adalah " + b.getType());
        } else if (c.getPrice() > a.getPrice() && c.getPrice() > b.getPrice()) {
            System.out.println("Instrument termahal adalah " + c.getType());

        }
        if (a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("Instrument termurah adalah " + a.getType());
        } else if (b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()) {
            System.out.println("Instrument termurah adalah " + b.getType());
        } else if (c.getPrice() < a.getPrice() && c.getPrice() < b.getPrice()) {
            System.out.println("Instrument termurah adalah " + c.getType());
        }

        input.close();

    }
}

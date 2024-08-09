public class BukuTester {
    public static void main(String[] args) {
        //object dgn constructor paramenter
        Buku Yola = new Buku(123,2024,"bumi","tereliye");
        System.out.println("Data Yola meminjam buku");
        System.out.println("id = "+Yola.id);
        System.out.println("tahunTerbit = "+Yola.tahunTerbit);
        System.out.println("judul = "+Yola.judul);
        System.out.println("pengarang = "+Yola.pengarang);

        Buku ina = new Buku(234,2023,"rembulan","sigma");
        System.out.println("Data ina meminjam buku");
        System.out.println("id = "+ina.id);
        System.out.println("tahunTerbit = "+ina.tahunTerbit);
        System.out.println("judul = "+ina.judul);
        System.out.println("pengarang = "+ina.pengarang);

        Buku bibi = new Buku(567,2020,"komet","karya saya");
        System.out.println("Data bibi meminjam buku");
        System.out.println("id = "+bibi.id);
        System.out.println("tahunTerbit = "+bibi.tahunTerbit);
        System.out.println("judul = "+bibi.judul);
        System.out.println("pengarang = "+bibi.pengarang);

        Buku ceroz = new Buku(8910,2090,"cincin","hindia");
        System.out.println("Data ceroz meminjam buku");
        System.out.println("id = "+ceroz.id);
        System.out.println("tahunTerbit = "+ceroz.tahunTerbit);
        System.out.println("judul = "+ceroz.judul);
        System.out.println("pengarang = "+ceroz.pengarang);

        Buku Mrbeast = new Buku(1990,2001,"skibidi","diamon");
        System.out.println("Data Mrbeast meminjam buku");
        System.out.println("id = "+Mrbeast.id);
        System.out.println("tahunTerbit = "+Mrbeast.tahunTerbit);
        System.out.println("judul = "+Mrbeast.judul);
        System.out.println("pengarang = "+Mrbeast.pengarang);

    }
    
}

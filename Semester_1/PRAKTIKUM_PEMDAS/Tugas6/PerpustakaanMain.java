package Semester_1.Basic_Programming.Semester_1.PRAKTIKUM_PEMDAS.Tugas6;

public class PerpustakaanMain {
    public static void main (String[] args) {
        Buku[] teknologi = new Buku[5];
        Buku[] filsafat = new Buku[5];
        Buku[] sejarah = new Buku[5];
        Buku[] agama = new Buku[5];
        Buku[] psikologi = new Buku[5];
        Buku[] politik = new Buku[5];
        Buku[] fiksi = new Buku[5];

        // ====================================================
        // 1. INSTANSIASI OBJEK (Pembuatan Buku)
        // ====================================================

        teknologi[0] = new Buku("Teknologi", "The Shallows", 2010, 288, 1);
        teknologi[1] = new Buku("Teknologi", "AI Superpowers", 2018, 272, 1);
        teknologi[2] = new Buku("Teknologi", "21 Lessons", 2018, 384, 1);
        teknologi[3] = new Buku("Teknologi", "Zero to One", 2014, 224, 2);
        teknologi[4] = new Buku("Teknologi", "The Code Book", 1999, 416, 1);

        filsafat[0] = new Buku("Filsafat", "Republic", -375, 416, 1);
        filsafat[1] = new Buku("Filsafat", "Sophie's World", 1991, 544, 1);
        filsafat[2] = new Buku("Filsafat", "Meditations", 180, 256, 1);
        filsafat[3] = new Buku("Filsafat", "Beyond Good and Evil", 1886, 240, 1);
        filsafat[4] = new Buku("Filsafat", "Critique of Pure Reason", 1781, 856, 1);

        sejarah[0] = new Buku("Sejarah", "Sapiens", 2011, 443, 1);
        sejarah[1] = new Buku("Sejarah", "Guns, Germs, and Steel", 1997, 480, 1);
        sejarah[2] = new Buku("Sejarah", "The Silk Roads", 2015, 672, 1);
        sejarah[3] = new Buku("Sejarah", "Sejarah Dunia yg Disembunyikan", 2007, 640, 1);
        sejarah[4] = new Buku("Sejarah", "1491", 2005, 560, 1);

        agama[0] = new Buku("Agama", "Mere Christianity", 1952, 227, 1);
        agama[1] = new Buku("Agama", "The Case for Christ", 1998, 366, 1);
        agama[2] = new Buku("Agama", "A History of God", 1993, 460, 1);
        agama[3] = new Buku("Agama", "No God but God", 2005, 336, 1);
        agama[4] = new Buku("Agama", "The Purpose Driven Life", 2002, 368, 1);

        psikologi[0] = new Buku("Psikologi", "Thinking, Fast and Slow", 2011, 499, 1);
        psikologi[1] = new Buku("Psikologi", "Atomic Habits", 2018, 320, 1);
        psikologi[2] = new Buku("Psikologi", "The Psychology of Money", 2020, 252, 1);
        psikologi[3] = new Buku("Psikologi", "Influence", 1984, 336, 1);
        psikologi[4] = new Buku("Psikologi", "Quiet", 2012, 368, 1);

        politik[0] = new Buku("Politik", "The Prince", 1532, 140, 1);
        politik[1] = new Buku("Politik", "Leviathan", 1651, 720, 1);
        politik[2] = new Buku("Politik", "World Order", 2014, 432, 1);
        politik[3] = new Buku("Politik", "The Communist Manifesto", 1848, 60, 2);
        politik[4] = new Buku("Politik", "Das Kapital", 1867, 1152, 1);

        fiksi[0] = new Buku("Fiksi", "Harry Potter", 1997, 223, 1);
        fiksi[1] = new Buku("Fiksi", "The Lord of the Rings", 1954, 1178, 1);
        fiksi[2] = new Buku("Fiksi", "1984", 1949, 328, 1);
        fiksi[3] = new Buku("Fiksi", "To Kill a Mockingbird", 1960, 281, 1);
        fiksi[4] = new Buku("Fiksi", "Good Omens", 1990, 432, 2);

        // ====================================================
        // 2. PENGISIAN NAMA PENULIS
        // ====================================================

        teknologi[0].tambahPenulis("Nicholas Carr");
        teknologi[1].tambahPenulis("Kai-Fu Lee");
        teknologi[2].tambahPenulis("Yuval Noah Harari");
        teknologi[3].tambahPenulis("Peter Thiel");
        teknologi[3].tambahPenulis("Blake Masters");
        teknologi[4].tambahPenulis("Simon Singh");

        filsafat[0].tambahPenulis("Plato");
        filsafat[1].tambahPenulis("Jostein Gaarder");
        filsafat[2].tambahPenulis("Marcus Aurelius");
        filsafat[3].tambahPenulis("Friedrich Nietzsche");
        filsafat[4].tambahPenulis("Immanuel Kant");

        sejarah[0].tambahPenulis("Yuval Noah Harari");
        sejarah[1].tambahPenulis("Jared Diamond");
        sejarah[2].tambahPenulis("Peter Frankopan");
        sejarah[3].tambahPenulis("Jonathan Black");
        sejarah[4].tambahPenulis("Charles C. Mann");

        agama[0].tambahPenulis("C.S. Lewis");
        agama[1].tambahPenulis("Lee Strobel");
        agama[2].tambahPenulis("Karen Armstrong");
        agama[3].tambahPenulis("Reza Aslan");
        agama[4].tambahPenulis("Rick Warren");

        psikologi[0].tambahPenulis("Daniel Kahneman");
        psikologi[1].tambahPenulis("James Clear");
        psikologi[2].tambahPenulis("Morgan Housel");
        psikologi[3].tambahPenulis("Robert B. Cialdini");
        psikologi[4].tambahPenulis("Susan Cain");

        politik[0].tambahPenulis("Niccolo Machiavelli");
        politik[1].tambahPenulis("Thomas Hobbes");
        politik[2].tambahPenulis("Henry Kissinger");
        politik[3].tambahPenulis("Karl Marx");
        politik[3].tambahPenulis("Friedrich Engels");
        politik[4].tambahPenulis("Karl Marx");

        fiksi[0].tambahPenulis("J.K. Rowling");
        fiksi[1].tambahPenulis("J.R.R. Tolkien");
        fiksi[2].tambahPenulis("George Orwell");
        fiksi[3].tambahPenulis("Harper Lee");
        fiksi[4].tambahPenulis("Neil Gaiman");
        fiksi[4].tambahPenulis("Terry Pratchett");

        // ====================================================
        // 3. TAMPILKAN INFO BUKU
        // ====================================================

        System.out.println("\n===== LIST BUKU TEKNOLOGI =====");
        for (Buku buku : teknologi) {
            buku.infoBuku();
            System.out.println();
        }

        System.out.println("\n=====  LIST BUKU FILSAFAT  =====");
        for (Buku buku : filsafat) {
            buku.infoBuku();
            System.out.println();
        }

        System.out.println("\n=====  LIST BUKU SEJARAH  =====");
        for (Buku buku : sejarah) {
            buku.infoBuku();
            System.out.println();
        }

        System.out.println("\n=====  LIST BUKU AGAMA  =====");
        for (Buku buku : agama) {
            buku.infoBuku();
            System.out.println();
        }

        System.out.println("\n=====  LIST BUKU PSIKOLOGI  =====");
        for (Buku buku : psikologi) { 
            buku.infoBuku();
            System.out.println();
        }

        System.out.println("\n=====  LIST BUKU POLITIK  =====");
        for (Buku buku : politik) {
            buku.infoBuku();
            System.out.println();
        }

        System.out.println("\n=====  LIST BUKU FIKSI  =====");
        for (Buku buku : fiksi) {
            buku.infoBuku();
            System.out.println();
        }
    }
}

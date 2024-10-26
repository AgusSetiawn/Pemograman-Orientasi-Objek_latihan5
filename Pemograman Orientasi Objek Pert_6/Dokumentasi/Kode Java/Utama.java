public class Utama {
    public static void main(String[] args) {

        Lingkaran lingkaran = new Lingkaran(5);
        Segitiga segitiga = new Segitiga(4, 3);
        Persegi persegi = new Persegi(6);


        System.out.println("Lingkaran:");
        System.out.println("Luas: " + lingkaran.luas());
        System.out.println("Keliling: " + lingkaran.keliling());

        System.out.println("\nSegitiga:");
        System.out.println("Luas: " + segitiga.luas());
        System.out.println("Keliling: " + segitiga.keliling());

        System.out.println("\nPersegi:");
        System.out.println("Luas: " + persegi.luas());
        System.out.println("Keliling: " + persegi.keliling());
    }
}

class BangunDatar {
    public float luas() {
        return 0;
    }

    public float keliling() {
        return 0;
    }
}

class Lingkaran extends BangunDatar {
    private int r;

    public Lingkaran(int r) {
        this.r = r;
    }

    public float luas() {
        return (float) (Math.PI * r * r);
    }

    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}

class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas() {
        return (float) (0.5 * alas * tinggi);
    }

    public float keliling() {
        float sisiMiring = (float) Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}

class Persegi extends BangunDatar {
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }


    public float luas() {
        return sisi * sisi;
    }


    public float keliling() {
        return 4 * sisi;
    }
}



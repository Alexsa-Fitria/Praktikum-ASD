public class fungsi {
    private static final int[][] stokBunga = {
        {10, 5, 15, 7},  
        {6, 11, 9, 12},  
        {2, 10, 10, 5},  
        {5, 7, 12, 9}   
    };

    public static void hitungPendapatanCabang() {
        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar = 10000;
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = stokBunga[i][0] * hargaAglonema + stokBunga[i][1] * hargaKeladi + stokBunga[i][2] * hargaAlocasia + stokBunga[i][3] * hargaMawar;
            System.out.println("Pendapatan Cabang " + (i + 1) + ": Rp" + pendapatan);
        }
    }

    public static void kurangiStokMatiCabang4() {
        int[] penguranganStok = {-1, -2, 0, -5}; 
        int cabang = 3; 
        for (int i = 0; i < stokBunga[cabang].length; i++) {
            stokBunga[cabang][i] += penguranganStok[i];
        }
    }

    public static void stokBungaCabang4() {
        int cabang = 3; 
        System.out.println("Stok Cabang 4: Aglonema " + stokBunga[cabang][0] + ", Keladi " + stokBunga[cabang][1] + ", Alocasia " + stokBunga[cabang][2] + ", Mawar " + stokBunga[cabang][3]);
    }

    public static void main(String[] args) {
        hitungPendapatanCabang();
        kurangiStokMatiCabang4();
        stokBungaCabang4();
    }
}


package sesi4;


public class penjumlahan {
    public int jumlahan(int x, int y) {
        return x + y;
    }

    public float jumlahan(float x, float y){
        return x + y;
    }

    public double jumlahan(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        penjumlahan per = new penjumlahan();

        System.out.println(per.jumlahan(8, 5));
        System.out.println(per.jumlahan(8.5, 7.525));
        System.out.println(per.jumlahan(6.234567543, 2.456789786));
    }
}

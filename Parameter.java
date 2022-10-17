paket PBO;


kelas ParameterNomor {
    tampilan void statis pribadi(int a){
        System.out.println("Argumen: " + a);
    }

    tampilan void statis pribadi (int a, int b){
        System.out.println("Argumen: " + a + " dan " + b);
    }

    public static void main(String[] args) {
        tampilan(1);
        tampilan(1, 4);
    }
}

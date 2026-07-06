public class ThrowExample {
    static void demo() {
        NullPointerException t = new NullPointerException("Coba Throw");
        throw t; 
        // System.out.println("Ini tidak lagi dicetak"); // Dihapus karena pasti Unreachable Error
    }

    public static void main(String[] args) {
        try {
            demo();
        } catch (NullPointerException e) {
            System.out.println("Ada pesan error: " + e);
        }
        System.out.println("Selesai");
    }
}
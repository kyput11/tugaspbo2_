package matematika;

public class MatematikaBeraksi {
    
    public void pertambahan(int a, int b) {
        System.out.println("Hasil Pertambahan: " + (a + b));
    }

    public void pengurangan(int a, int b) {
        System.out.println("Hasil Pengurangan: " + (a - b));
    }

    public void perkalian(int a, int b) {
        System.out.println("Hasil Perkalian: " + (a * b));
    }

    public void pembagian(int a, int b) {
        if (b != 0) {
            System.out.println("Hasil Pembagian: " + (a / b));
        } else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan.");
        }
    }
}

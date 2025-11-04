import java.util.Scanner;

public class Soal_Latihan_UKL4 {
    public static double volumeTabung(double jariJari, double tinggi) {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari (cm): ");
        double r = input.nextDouble();
        System.out.print("Masukkan tinggi (cm): ");
        double t = input.nextDouble();

        if (r <= 0 || t <= 0) {
            System.out.println("Jari-jari dan tinggi harus > 0.");
            input.close();
            return;
        }

        double volume = volumeTabung(r, t);
        System.out.printf("Volume tabung " + volume);
        input.close();
    }
}

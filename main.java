import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
            
         double angka1, angka2, hasil;
          char operator;

           System.out.println("=== KALKULATOR SEDERHANA ===");

           System.out.print("Masukkan angka pertama: ");
             angka1 = input.nextDouble();

           System.out.print("Masukkan operator (+, -, *, /): ");
             operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;

            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;

            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;

            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Tidak bisa membagi dengan nol!");
                }
                break;

            default:
                System.out.println("Operator tidak valid!");
        }

        input.close();
    }
    
}
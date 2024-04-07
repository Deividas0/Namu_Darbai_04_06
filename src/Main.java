import java.util.*;

public class Main {
    public static <Int> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Parašykite programą, kuri prašo vartotojo įvesti savo vardą ir tada pasveikina juos pagal įvestą vardą.
        // Ši programa turėtų būti sukūrusi void tipo funkciją,
        // kuri priima vartotojo įvestį kaip argumentą ir išveda pasveikinimą į konsolę.

        /* System.out.print("Įveskite savo vardą: ");
        String textas = scanner.nextLine();
        System.out.println("Sveikas sugryžes "+ textas + ".");
        */ ////////////////////////////////////


        // 2. Parašykite programą, kuri priima du skaičius iš vartotojo ir tada atspausdina jų sumą ir skirtumą.
        // Naudojant void tipo funkciją, kuri priima du parametrus - skaičius, ir išveda jų sumą ir skirtumą.

        /* System.out.print("Įveskite pirmaji skaičių: ");
        Integer skaicius1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Iveskite antrajį skaičių: ");
        Integer skaicius2= Integer.valueOf(scanner.nextLine());
        int suma = skaicius1 + skaicius2;
        int skirtumas = skaicius1 - skaicius2;
        System.out.println("Duotų skaičių suma yra: " + suma);
        System.out.println("Ir jų skirtumas yra : " + skirtumas);
        */

        // 3. (BONUS) Parašykite programą, kuri prašo vartotojo įvesti tekstą ir tada atspausdina
        // įvestą tekstą atvirkštine tvarka. Ši programa turėtų turėti void tipo funkciją,
        // kuri priima įvestį kaip argumentą ir atspausdina tekstą atvirkštine tvarka.

        /* System.out.print("Įveskite tekstą: ");
        String textas = scanner.nextLine();
        String backwards = "";

        for (int i = textas.length() - 1; i >= 0; i--)
            backwards += textas.charAt(i);

        System.out.println(backwards);
        */
    }
}
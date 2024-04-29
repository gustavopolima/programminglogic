import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do herói: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade de XP do herói: ");
        int xp = scanner.nextInt();

        String nivel;
        if (xp < 1000) {
            nivel = "Ferro";
        } else if (xp >= 1001 && xp <= 2000) {
            nivel = "Bronze";
        } else if (xp >= 2001 && xp <= 5000) {
            nivel = "Prata";
        } else if (xp >= 5001 && xp <= 7000) {
            nivel = "Ouro";
        } else if (xp >= 7001 && xp <= 8000) {
            nivel = "Platina";
        } else if (xp >= 8001 && xp <= 9000) {
            nivel = "Ascendente";
        } else if (xp >= 9001 && xp <= 10000) {
            nivel = "Imortal";
        } else {
            nivel = "Radiante";
        }

        System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);

        scanner.close();
    }
}

import java.util.Scanner;

public class CalculadoraRankeada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantidade de vitórias: ");
        int vitorias = in.nextInt();
        System.out.println("Digite a quantidade de derrotas: ");
        int derrotas = in.nextInt();
        ResultadoRankeada resultado = calcularRankeada(vitorias, derrotas);
        System.out.println("O Herói tem saldo de " + resultado.getSaldoVitorias() + " está no nível de " + resultado.getNivel());
    }

    public static ResultadoRankeada calcularRankeada(int vitorias, int derrotas) {
        int saldoVitorias = vitorias - derrotas;
        String nivel;

        if (vitorias < 10) {
            nivel = "Ferro";
        } else if (vitorias >= 10 && vitorias <= 20) {
            nivel = "Bronze";
        } else if (vitorias >= 21 && vitorias <= 50) {
            nivel = "Prata";
        } else if (vitorias >= 51 && vitorias <= 80) {
            nivel = "Ouro";
        } else if (vitorias >= 81 && vitorias <= 90) {
            nivel = "Diamante";
        } else if (vitorias >= 91 && vitorias <= 100) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }

        return new ResultadoRankeada(saldoVitorias, nivel);
    }
}

class ResultadoRankeada {
    private int saldoVitorias;
    private String nivel;

    public ResultadoRankeada(int saldoVitorias, String nivel) {
        this.saldoVitorias = saldoVitorias;
        this.nivel = nivel;
    }

    public int getSaldoVitorias() {
        return saldoVitorias;
    }

    public String getNivel() {
        return nivel;
    }
}

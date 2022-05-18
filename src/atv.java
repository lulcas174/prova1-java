import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class atv {
    static DecimalFormat formatador = new DecimalFormat("0.00");

    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int  tamanho_array = 2;
        int i;
        String[] pilotos = new String[tamanho_array];
        //int[] provas = IntStream.generate(() -> new Random().nextInt(60)).limit(60).toArray();
        ArrayList<Float> provas = new ArrayList<>();
        for (int x = 0; x < 60; x++) {
            provas.add(rand.nextFloat());
        }
        for(i=0; i<tamanho_array; i++){
            System.out.println("Informe o nome do piloto: ");
            pilotos[i] = input.next();
            System.out.println("O tempo de prova do piloto " + pilotos[i] + " é de : " + formatador.format(provas.get(i)) + " minutos." );
        }

        System.out.println("Calculando vencedor..");
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        vencedorCorrida(pilotos, provas);

        System.out.println("Calculando perdedor...");
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        perdedorCorrida(pilotos, provas);

        System.out.println("Calculando o tempo médio das provas...");
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        tempoMedio(pilotos,provas);
    }

    public static void vencedorCorrida(String[] pilotos, ArrayList<Float> tempoProva) {
        Random random = new Random();
        int indiceAleatorioVencedor = random.nextInt(pilotos.length);
        System.out.println("O piloto : " + pilotos[indiceAleatorioVencedor] + " é o vencedor da prova em : " + formatador.format(tempoProva.get(indiceAleatorioVencedor)) + " minutos");
    }

    public static void perdedorCorrida(String[] pilotos, ArrayList<Float> tempoProva) {
        Random random = new Random();
        int indiceAleatorioPerdedor = random.nextInt(pilotos.length);
        System.out.println("O piloto : " + pilotos[indiceAleatorioPerdedor] + " é o perdedor da prova em : " + formatador.format(tempoProva.get(indiceAleatorioPerdedor)) + " minutos");
    }

    public static void tempoMedio (String[] pilotos, ArrayList<Float>tempoProva) {
        float media = 0;
        for (int x = 0; x < tempoProva.size(); x++) {
            media += tempoProva.get(x);
        }
        float total = media/pilotos.length;
        System.out.println("O tempo médio é: " +  formatador.format(total) + " minutos");
    }
}

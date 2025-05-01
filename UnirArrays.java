import java.util.Arrays;

public class UnirArrays {

    // Função união: junta os dois arrays
    public static int[] uniao(int[] v1, int[] v2) {
        int[] resultado = new int[v1.length + v2.length];
        int i = 0;

        // Copia elementos de v1
        for (int num : v1) {
            resultado[i++] = num;
        }

        // Copia elementos de v2
        for (int num : v2) {
            resultado[i++] = num;
        }

        return resultado;
    }

    // Função principal
    public static void main(String[] args) {
        // Arrays definidos estaticamente (pode adaptar para entrada do usuário)
        int[] v1 = { 11, 13, 45, 7 };
        int[] v2 = { 24, 4, 16, 81, 10, 12 };

        // Chama a função uniao
        int[] v3 = uniao(v1, v2);

        // Exibe o array resultante
        System.out.println("Array resultante da união:");
        System.out.println(Arrays.toString(v3));
    }
}

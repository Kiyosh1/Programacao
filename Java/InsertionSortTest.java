import java.util.Random;

public class InsertionSortTest {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static int[] generateRandomArray(int size, int range) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(range);
        }
        return arr;
    }

    public static int[] generateSortedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;  // ou outra sequência crescente
        }
        return arr;
    }

    public static long measureInsertionSortTime(int[] arr) {
        long start = System.nanoTime();
        insertionSort(arr);
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {
        // Tamanhos solicitados
        int[] sizes = {10, 100, 500, 1000, 2000, 5000};

        System.out.printf("%-10s %-20s %-20s\n", "N", "Ordenado(ns)", "Desordenado(ns)");
        for (int n : sizes) {
            // Gera array ordenado
            int[] sortedArray = generateSortedArray(n);
            // Gera array aleatório (desordenado)
            int[] randomArray = generateRandomArray(n, 100000);

            // Mede tempo para o array ordenado
            long timeSorted = measureInsertionSortTime(sortedArray);

            // Mede tempo para o array aleatório
            long timeRandom = measureInsertionSortTime(randomArray);

            System.out.printf("%-10d %-20d %-20d\n", n, timeSorted, timeRandom);
        }
    }
}


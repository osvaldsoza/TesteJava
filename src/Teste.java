import java.util.Comparator;
import java.util.stream.IntStream;

public class Teste {

    public static void main(String[] args) {

        int[] numbers = new int[]{2, 8, 4, -3, 7};
        int sizeNumbers = numbers.length - 1;

        int minSum = minSumOrderAsc(numbers, sizeNumbers);
        int maxSum = maxSumOrderDesc(numbers, sizeNumbers);

        System.out.println(minSum);
        System.out.println(maxSum);
    }

    private static int minSumOrderAsc(int[] numbers, int sizeNumbers) {
        int[] numbersOrderAsc = getNumbersOrder(numbers, Comparator.naturalOrder());
        int sumAsc = 0;
        return sumNumbersOrder(numbersOrderAsc, sumAsc, sizeNumbers);
    }

    private static int maxSumOrderDesc(int[] numbers, int sizeNumbers) {
        int[] numbersOrderDesc = getNumbersOrder(numbers, Comparator.reverseOrder());
        int sumDesc = 0;
        return sumNumbersOrder(numbersOrderDesc, sumDesc, sizeNumbers);
    }

    private static int sumNumbersOrder(int[] numbersOrderAsc, int sum, int i2) {
        for (int i = 0; i < i2; i++) {
            sum += numbersOrderAsc[i];
        }
        return sum;
    }

    private static int[] getNumbersOrder(int[] numbers, Comparator<Integer> comparator) {
        return IntStream.of(numbers).boxed()
                .sorted(comparator)
                .mapToInt(i -> i)
                .toArray();
    }
}

public class Teste {

    public static void main(String[] args) {

        int[] numbers = new int[]{2, 8, 4, -3, 7};
        int aux = 0;

        orderAsc(numbers);
        orderDesc(numbers);
    }

    private static void orderAsc(int[] numbers) {
        int aux;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] > numbers[j]) {
                    aux = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = aux;
                }
            }
        }
        int sumAsc = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            sumAsc += numbers[i];
        }
        System.out.println(sumAsc);
    }

    private static void orderDesc(int[] numbers) {
        int aux;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] < numbers[j]) {
                    aux = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = aux;
                }
            }
        }
        int sumDesc = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            sumDesc += numbers[i];
        }
        System.out.println(sumDesc);
    }
}

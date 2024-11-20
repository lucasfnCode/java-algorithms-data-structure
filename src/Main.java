public class Main {

    public static void main(String[] args) {

//        perfectNumbers();

        cousinNumbers();

    }


    static void cousinNumbers() {

        int limit = 100;

        while (limit > 0) {

            boolean count = getCousinNumber(limit);
            int invertCousinNumber = invertCousinNumbers(limit);

            if (count) {
                System.out.println(limit + " é um número primo!");

                if (getCousinNumber(invertCousinNumber)) {
                    System.out.println("Invertendo o número " + limit + " também obteremos um número primo "
                            + invertCousinNumber + "\n");
                }
            }

            limit--;
        }

    }

    private static boolean getCousinNumber(int limit) {
        int count = 0;


        for (int i = 2; i <= limit; i++) {

            boolean isDivider = limit % i == 0;

            if (isDivider) {
                count++;
            }

        }
        return count == 1;
    }

    static int invertCousinNumbers(int cousinNumber) {

        if (cousinNumber > 10) {
            int dezena = cousinNumber / 10;

            int unidade = cousinNumber % 10;


            return Integer.parseInt(unidade+""+dezena);
        }

        return 1;
    }

    static void perfectNumbers() {

        int limit = 100000;

        while (limit > 0) {

            int soma = 0;

            for (int i = 1; i <=limit ; i++) {

                if (limit % i == 0 && i != limit) {

                    soma += i;

                    /*if (i != limit) {
                        soma += i;
                    }*/

                }

            }

            if (soma == limit) {

                System.out.println("Número perfeito achado: " + limit);

            }


            limit--;
        }

    }
}

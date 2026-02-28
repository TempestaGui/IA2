import atividade1.NewPopMethod;

public class Application {

    public static void main(String[] args) {
        NewPopMethod npm = new NewPopMethod();

        int[][] limit = {
                {1, 10},
                {5, 15}
        };

        int[][] pop =  npm.newPop(5, limit);

        int contador = 1;

        for (int[] ints : pop) {
            System.out.print("ind: " + contador + " | ");
            contador++;
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

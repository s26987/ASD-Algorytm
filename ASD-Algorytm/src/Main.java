import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] algorytm = {1,1,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,1,0,1,0,1};
        Arrays.sort(algorytm);

        for(int i = algorytm.length - 1; i >= 0; i--) {
            System.out.print(algorytm[i] + " ");
        }

    }
}
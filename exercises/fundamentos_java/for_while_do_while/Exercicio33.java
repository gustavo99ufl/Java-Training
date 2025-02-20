package exercises.fundamentos_java.for_while_do_while;
import java.util.ArrayList;
public class Exercicio33 {
    public static void main(String[] args) {
        int[] list = new int[6];
        list[0] = 10;
        list[1] = 20;
        list[2] = 30;
        list[3] = 40;
        list[4] = 50;
        list[5] = 60;
        int i = 0;
        int max =  list[0];
        while (i < list.length) {
            if(list[i] > max) {
                max = list[i];
            }
            i++;
        }
        System.out.println("O número máximo é " + max);
    }
}

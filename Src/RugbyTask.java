import java.util.Random;

public class RugbyTask {
    public static void main (String [] args){
        Random random = new Random();
         int [] team1 = new int [25];
         int [] team2 = new int[25];
        for (int i = 0; i < 25; i++) {
            team1 [i] = random.nextInt(23) + 18;
            team2 [i] = random.nextInt(23) + 18;}
            System.out.println ("Вік гравців першої команди :");
            for(int age : team1){
                System.out.print(age + " ");
            } System.out.println();
            System.out.println ("Вік гравців другої команди :");
            for (int age : team2){
                System.out.print(age + " ");
            }
            System.out.println();
             int sum1 = 0;
             int sum2 = 0;
             for(int age :team1){
                 sum1 += age;
             }
             for(int age : team2){
                 sum2 += age;
             }double average1 =(double) sum1/ team1.length;
             double average2 = (double) sum2/ team2.length;
             System.out.println("Середній вік команди 1 =" + average1);
             System.out.println("Середній вік команди 2 =" + average2);

    }
}

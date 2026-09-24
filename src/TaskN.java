import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int totalMinutes=540+n*45+(n/2)*5+((n-1)/2)*15;
        int hours = totalMinutes/60;
        int minutes = totalMinutes%60;
        System.out.println(hours+" "+ minutes);

    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int hours = (n/3600)%60;
        int minutes = (n/60)%60;
        int seconds = n%60;
        System.out.println(hours + ":"+ minutes+":"+seconds);
    }
}
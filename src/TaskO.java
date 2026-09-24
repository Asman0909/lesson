import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int total = (a*100+b)*c;
        System.out.println(total/100+" "+total%100);


    }
}
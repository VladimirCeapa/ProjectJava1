import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minutes = scanner.nextInt();
        int second = scanner.nextInt();
        int hour1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int second1 = scanner.nextInt();
        int result=((hour1-hour)*60)*60+((minutes1-minutes)*60)+(second1-second);
        System.out.println(result);
    }
}
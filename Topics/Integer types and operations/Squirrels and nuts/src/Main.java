import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sc=scanner.nextInt();
        int nats=scanner.nextInt();
        while (nats>0&&nats>=sc){
            nats-=sc;
        }
        System.out.println(nats);
    }
}
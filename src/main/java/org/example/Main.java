import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println(" == 게시판 앱 == ");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("명령) " );
            String commnad = scanner.nextLine();

            if (commnad.equals("종료")){
                break;
            }
        }
    }
}

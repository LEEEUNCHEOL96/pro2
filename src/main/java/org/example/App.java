package org.example;

import java.util.Scanner;

public class App {
    private Scanner scanner;

    public App(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        System.out.println(" == 게시판 앱 ==");
        while (true){
            System.out.print("명령) ");
            String command = scanner.nextLine().trim();

            if (command.equals("종료")){
                break;
            }
            else if (command.equals("등록")){
                System.out.print("제목: ");
                command = scanner.nextLine();
                System.out.print("내용: ");
                command = scanner.nextLine();
                System.out.print("1번 게시글이 등록되었습니다.");
                break;
            }
        }
    }
}

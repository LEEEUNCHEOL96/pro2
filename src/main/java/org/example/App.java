package org.example;

import java.util.Scanner;

public class App {
    Scanner sc;

    public App(Scanner scanner) {
        this.sc = scanner;
    }

    public void run() {
        int lastid = 1;
        System.out.println(" == 게시판 앱 ==");
        while (true){
            System.out.print("명령) ");
            String command = sc.nextLine().trim();

            if (command.equals("종료")){
                break;
            }
            else if (command.equals("등록")){
                System.out.print("제목: ");
                command = sc.nextLine();
                System.out.print("내용: ");
                command = sc.nextLine();
                System.out.printf("%d 번 게시글이 등록되었습니다.\n",lastid);
                lastid++;

            }

        }
    }
}

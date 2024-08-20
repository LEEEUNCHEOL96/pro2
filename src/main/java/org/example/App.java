package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner sc;

    App (Scanner sc) {
        this.sc = sc;
    }

    void run () {
        int lastId = 1;

        List<Article> articleList = new ArrayList<>();
        // 여라가지 내용을 저장 하기위한 ArrayList

        System.out.println("== 게시판 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim(); //공백제거

            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                System.out.print("제목 : ");
                String subject = sc.nextLine().trim(); //공백제거
                System.out.print("내용 : ");
                String content = sc.nextLine().trim(); //공백제거


                Article article = new Article(lastId, subject, content);
                // 생성자함수를 받아오는 객채생성
                articleList.add(article);
                // 받아온 필드를 ArrayList에 담는다.

                System.out.printf("%d번 게시물이 등록되었습니다.\n", lastId);
                lastId++;// 증감 처리

            } else if (command.equals("목록")) {   // 조건문2 만약"목록"이 입력되면
                System.out.println("번호 / 제목 / 내용");
                System.out.println("----------------------");

                for (int i = articleList.size() -1 ; i >-1 ; i--) {  // 역으로 출력하기 위한 범위 변경
                    //ArrayList에 저장된 내용을 출력하기위해 for문 사용

                    Article article = articleList.get(i);
                    System.out.printf("%d, %s, %s\n", article.getId(), article.getSubject(), article.getContent());
                    // setter 사용
                    // %d = article의id , %s = article의 subject, %n = articel 의 content 를 get해서 받아온다
                }
            }
        }
    }
}
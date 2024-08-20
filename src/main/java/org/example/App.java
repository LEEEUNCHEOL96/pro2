package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner sc;

    App(Scanner sc) {
        this.sc = sc;
    }

    void run() {
        int lastId = 1;

        List<Article> articleList = new ArrayList<>();


        System.out.println("== 게시판 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                System.out.print("제목 : ");
                String subject = sc.nextLine().trim();
                System.out.print("내용 : ");
                String content = sc.nextLine().trim();


                Article article = new Article(lastId, subject, content);

                articleList.add(article);


                System.out.printf("%d번 게시물이 등록되었습니다.\n", lastId);
                lastId++;

            } else if (command.equals("목록")) {
                System.out.println("번호 / 제목 / 내용");
                System.out.println("----------------------");

                for (int i = articleList.size() - 1; i > -1; i--) {


                    Article article = articleList.get(i);
                    System.out.printf("%d, %s, %s\n", article.getId(), article.getSubject(), article.getContent());

                }
            } else if (command.startsWith("삭제")){

                String [] commandList = command.split("\\?",2); //정규표현식으로 \\를 사용해야한다

                String actionCode = commandList[0]; // {"삭제", "=1"} 으로 나뉜것을 actionCode 첫번째에 저장한다.

                String [] paramsStr = commandList[1].split("=",2); // {"id" , "1"} 으로 나뉨

                String key = paramsStr[0];
                // 배열의 첫 번째 요소를 key에 저장합니다.
                // 이 경우 "id"입니다. 이 변수는 파라미터의 키입니다.

                String value = paramsStr[1];
                // 배열의 두 번째 요소를 value에 저장합니다.
                // 이 경우 "1"입니다. 이 변수는 파라미터의 값입니다.

                int idx = Integer.parseInt(value);
                // value 문자열을 정수로 변환하여 idx에 저장합니다.


                Article article = null;

                for(int i=0; i < articleList.size(); i++){  // 배열순회
                    if (articleList.get(i).getId()== idx){  // 현재 인덱스 i의 게시글 ID가 idx와 일치하는 경우
                        article =articleList.get(i);  // 게시글을 리스트에서 제거합니다.
                    }
                }
                if (article==null){  // 예외처리
                    System.out.printf("%d번 게시물은 존재하지 않습니다.\n",idx);
                }else {
                    articleList.remove(article);
                    System.out.printf("%d번 게시물이 삭제되었습니다.\n",idx);
                }

                System.out.printf("%d번 게시물이 삭제되었습니다.\n",idx);

            }
        }
    }
}

package org.example;

import java.util.Scanner;

public class App {
    Scanner sc;
    App(Scanner sc){
        this.sc = sc;
    }
    void run (){
        System.out.println(" == 게시판 앱 == ");

        while (true){
            System.out.print("명령) " );
            String commnad = sc.nextLine();

            if (commnad.equals("종료")){
                break;
            }
        }
    }


}

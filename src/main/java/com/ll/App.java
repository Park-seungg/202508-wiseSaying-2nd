package com.ll;

import java.util.Scanner;

public class App {
    private final Scanner scanner;

    public App(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run () {
        System.out.println("== 명언 앱 ==");
        int lastId = 0;

        while (true) {
            System.out.printf("명령) ");
            String cmd = scanner.nextLine();

            switch (cmd) {
                case "등록" -> {
                    System.out.printf("명언 : ");
                    String content = scanner.nextLine();
                    System.out.printf("작가 : ");
                    String author = scanner.nextLine();
                    System.out.println("1번 명언이 등록되었습니다.");
                    int id = ++lastId;
                    System.out.println("%d번 명언이 등록되었습니다.".formatted(id));
                }
                case "종료" -> {
                    System.out.println("앱을 종료합니다.");
                    return;
                }
            }
        }
    }
}
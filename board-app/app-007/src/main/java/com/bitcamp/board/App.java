/*
 * 게시판 관리 애플리케이션
 * 비트캠프-20220704
 */
package com.bitcamp.board;

public class App {

  public static void main(String[] args) {
    welcome();
    loop: while (true) {
      displayMenu();
      int menuNo = promptMenu("메뉴를 선택하세요[1..3](0: 종료) ");
      displayLine();

      switch (menuNo) {
        case 0: break loop;
        case 1: BoardHandler.processList(); break;
        case 2: BoardHandler.processDetail(); break;
        case 3: BoardHandler.processInput(); break;
        default: System.out.println("메뉴 번호가 옳지 않습니다!");
      }

      displayBlankLine();
    } // while

    System.out.println("안녕히 가세요!");
    keyboardInput.close();
  } // main

  static void welcome() {
    System.out.println("[게시판 애플리케이션]");
    System.out.println();
    System.out.println("환영합니다!");
    System.out.println();
  }


    System.out.print("제목? ");
    title[boardCount] = keyboardInput.nextLine();

    System.out.print("내용? ");
    content[boardCount] = keyboardInput.nextLine();

    System.out.print("작성자? "); 
    writer[boardCount] = keyboardInput.nextLine();

    System.out.print("암호? ");
    password[boardCount] = keyboardInput.nextLine();

    /*
    if (boardCount == 0) {
      no[boardCount] = 1;
    } else {
      no[boardCount] = no[boardCount - 1] + 1;
    }
    */
    no[boardCount] = boardCount == 0 ? 1 : no[boardCount - 1] + 1;

    viewCount[boardCount] = 0;
    createdDate[boardCount] = System.currentTimeMillis();
    
    boardCount++;
  }

  static void displayMenu() {
    System.out.println("메뉴:");
    System.out.println("  1: 게시글 목록");
    System.out.println("  2: 게시글 상세보기");
    System.out.println("  3: 게시글 등록");
    System.out.println();
    
  }

  static void displayLine() {
    System.out.println("=========================================");
  }


  static void displayBlankLine() {
    System.out.println(); // 메뉴를 처리한 후 빈 줄 출력
  }


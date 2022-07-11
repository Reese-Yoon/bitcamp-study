
package com.bitcamp.board;

public class App {

  public static void main(String[] args) {

    java.util.Scanner keyboardInput = new java.util.Scanner(System.in);

      System.out.println("[ 게시판 어플리케이션 ]");
      System.out.println();
      System.out.println("환영합니다. ");
      System.out.println();

      while(true){

        System.out.println("메뉴 : ");
        System.out.println("1 : 게시글 목록");
        System.out.println("2 : 게시글 상세보기");
        System.out.println();
        java.lang.System.out.print("메뉴를 선택하세요.[1..2](0:exit)");

        int menuNo = keyboardInput.nextInt();
        keyboardInput.nextLine(); //입력한 숫자 중 

        //System.out.println("==>"+ menuNo);

        if(menuNo==0){
          System.out.println("안녕히 가세요");
          break; //반복문 탈출
        } else if(menuNo==1){
          System.out.println("[ 게시글 목록 ]");
          System.out.println("번호 제목 조회수 작성자 등록일");
          
          System.out.print(1);
          System.out.print("\t");
          System.out.print("제목입니다.");
          System.out.print('\t');
          System.out.print(20 +"\t"); 
          System.out.print("홍길동\t");
          System.out.print("2022-07-08 \n");
  
          
          System.out.print(2 + "\t" + "제목입니다.2" + '\t'+11 
            +"\t"+"홍길동\t"+"2022-07-08 \n");
          
          System.out.println(3 + "\t제목입니다.3" + '\t'+31 
          +"\t"+"임꺽정\t"+"2022-07-08");
  
          System.out.printf("%d\t%s\t%d\t%s\t%s\n",
            4,"제목입니다4",45,"유관순","2022-07-08");
          System.out.println();
        } else if(menuNo==2){
          System.out.println(" 게시글 상세보기 ");
          System.out.println("[ 보드 게시판 상세보기 ]");

          System.out.printf("번호 : %d \n",1);
          System.out.printf("제목 : %s \n","제목입니다.");
          //String an = scan.nextLine();
          System.out.printf("내용 : %s \n","내용입니다." );
          System.out.printf("조회수 : %d \n",100);
          System.out.printf("작성자 : %s \n","홍길동");
          System.out.printf("등록일 : %s \n", "2022-07-08");
          System.out.println();

        }else {
          System.out.println("메뉴 번호가 옳지 않습니다!");
          System.out.println();
        }
      } //while 반복문
  } //main()
}
 //keyboardInput.close();
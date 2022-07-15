/*
 * 강사님 수업한 내용을 바탕으로 
 * 게시판프로그램을 나름 나의방식으로 새로 만들어봄.
 * 수업내용 : if else
 * 복습 : switch구문 이용
 * 
 * 숙제 : class로 나눠서 해보기
 */
package com.bitcamp.board;

public class App {

  public static void main(String[] args) {

    java.util.Scanner Input = new java.util.Scanner(System.in);

    final int SIZE = 4; //게시글의 갯수
    int index =0; //스택 화살표? 개발자가 봤을때 배열인덱스번호
    int cho; //메뉴선택지
    int no; //게시판 이용자가 봤을때 게시판번호(배열인덱스번호 +1 차이가 남.)

    String[] title = new String[SIZE];      //게시글 제목
    String[] content = new String[SIZE];    //게시글 내용
    String[] password = new String[SIZE];   //게시글 비밀번호
    long[] createdDate = new long[SIZE];//게시글 작성날짜
    String[] writer = new String[SIZE];     //게시글 작성자
    int[] viewCount = new int[SIZE];        //게시글 조회수


    System.out.println("[ 게시판 게시물 ]");
    System.out.println("환영합니다.^^");

    while (true){ //무한 반복
      System.out.println("-----------------------------");
      System.out.println("메뉴 : ");
      System.out.println("  1. 게시물 목록");
      System.out.println("  2. 게시글 상세보기");
      System.out.println("  3. 게시글 등록");
      System.out.print("메뉴를 선택하세요.[1..3] (0:종료)");
      cho = Input.nextInt();
      System.out.println();
      System.out.println("-----------------------------");

      if(cho == 0){
        System.out.println("~~~~~~~~END~~~~~~~~~~~");
        System.out.println("안녕히 가세요~:-)");
        break;
      } //0을 입력받았을때 종료함.


      switch (cho){
        case 1: 
          //게시글등록하면서 기록해놓은 등록일(long)을 formatter클래스를 이용해 
          //배열안에 등록일을 형식에 맞춰 dateStr(String)에 넣어둠.
          java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm");

          System.out.println("[ 1. 게시글 목록 ]");
          System.out.println("번호\t제목\t조회수\t작성자\t등록일\t");
          for(int i=0; i<SIZE; i++){
            String dateStr=formatter.format(createdDate[index]);

            System.out.printf("%d\t%s\t%d\t%s\t%s \n", 
                i+1, title[i], viewCount[i],writer[i],dateStr);
          }
          break;

        case 2:
          if(index==0){ //게시판 전체가 empty 일때
            System.out.println("게시판이 비어져있습니다. 등록을 먼저 해주세요.");
            break;
          }

          System.out.println("[ 2. 게시글 상세보기 ]");
          System.out.print("조회할 게시글 번호를 입력해주세요. :");
          no = Input.nextInt();
          no -= 1; //배열번호와 게시글번호의 갭 해결 index = no

          if(title[no]==null){ //자세히 보고 싶은 게시글이 비어져 있을때
            System.out.printf("%d번째 게시글은 비어져 있습니다. \n",no);
            break;
          }

          System.out.println("-------------------------------------");
          System.out.printf("게시글 번호 : %d \n", no+1);
          System.out.printf("제목 : %s \n",title[no]);
          System.out.printf("내용 : %s \n",content[no]);
          System.out.printf("조회수 : %d \n", viewCount[no]); //수정필요
          System.out.printf("작성자 : %s \n",writer[no]);
          break;

        case 3:
          System.out.println("[ 1. 게시글 등록 ]");
          System.out.println("제목 : ");
          title[index]=Input.next();
          System.out.println("내용 : ");
          content[index]=Input.next();
          System.out.println("작성자 : ");
          writer[index] = Input.next();
          System.out.println("암호 : ");
          password[index] = Input.next();

          createdDate[index] = System.currentTimeMillis(); //게시글 등록과 동시에 현재시간을 받음.(자료형 : long)
          java.util.Date date = new java.util.Date(createdDate[index]); //long형태의 자료형을 date형식으로 만듬
          System.out.printf("등록일: %tY-%1$tm-%1$td %1$tH:%1$tM\n", date); //printf로 해서 출력

          System.out.printf(" \"num[%d] - %d번째 게시글이 저장되었습니다.\" \n", index+1, index+1);
          System.out.println();

          System.out.println("-----개발자 메모--------------------");
          System.out.printf("Current Array index : %d \n", index);

        if(index == SIZE){
          System.out.println("게시판이 꽉찼습니다. 게시글을 등록할 수 없습니다.");
          break; //게시판 Full
          } else { index ++; } //새로운 게시글 준비

          break;

        default :
          System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
          break;

      } //switch 반복문
    } //while 무한 반복

  }
} 

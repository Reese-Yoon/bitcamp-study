package com.bitcamp.board;

public class BoardListApp {
   

    public static void main(String[] args) {


        System.out.println("번호 제목 조회수 작성자 등록일");
        //처음에 출력했을때 위에 App.java가 실행됨. BoardListApp.java를 실행하기위해 Build.gradle가서 
        /*
            * application {
            mainClass = 'com.bitcamp.board.BoardListApp' } 수정을 해줌.
            */
        System.out.print(1);
        System.out.print("\t");
        System.out.print("제목입니다.");
        System.out.print('\t');
        System.out.print(20 +"\t"); //20이 문자열로 바뀜. +
        System.out.print("홍길동\t");
        System.out.print("2022-07-08 \n");

        
        System.out.print(2 + "\t" + "제목입니다.2" + '\t'+11 
            +"\t"+"홍길동\t"+"2022-07-08 \n");
        //숫자에 무엇을 합치면 무조건 문자열로 바뀜
        
        System.out.println(3 + "\t제목입니다.3" + '\t'+31 
        +"\t"+"임꺽정\t"+"2022-07-08");

        System.out.printf("%d\t%s\t%d\t%s\t%s\n",
            4,"제목입니다4",45,"유관순","2022-07-08");
            //자세한 내용은 eomcs-java-lang/app/src/main/java/com/eomcs/lang/ex99

        /*
         * print
         * println : 마지막에 줄바꿈 코드 \n 이 추가됨
         * printf : 줄바꿈 코드 대신에 form을 만들어줌
         */

        System.out.printf("%d %1 $x %1$c\n", 65);

    }
}

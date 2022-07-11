/* ex04의 과제1
 * 사용자로부터 5명의 성적 데이터를 (이름, 국어, 영어, 수학) 입력 받고 합계와 평균을 출력하라. 
## 실행 결과
```
> java -classpath bin step02.assignment.Test02
입력? 홍길동 100 90 80
입력? 임꺽정 100 100 100
입력? 유관순 90 90 90
입력? 안중근 80 80 80
입력? 윤봉길 70 70 70
-----------
홍길동 100 90 80 270 90.0 
임꺽정 100 100 100 300 100.0 
유관순 90 90 90 270 90.0 
안중근 80 80 80 240 80.0 
윤봉길 70 70 70 210 70.0 
>
``` 
"다섯명의 변수를 만들기 귀찮-> 배열 선언"
 */

package com.study.alg;

public class Ass01 {
  public static void main(String[] args) {

    java.util.Scanner KeyboardInput = new java.util.Scanner(System.in);

    int avg=0;
    int sum=0;
    int[][] student = new int[6][6];
  
     for(int i=0; i<5;i++){
      System.out.print("입력? ");
      for(int ii=1; ii<4; ii++){
        student[i][ii]=KeyboardInput.nextInt(); 
      }
     } //이중배열에 수를 입력받음. 이중배열,이중반복문

     System.out.println("_________________________________________________");

     for(int a=0; a<5; a++){
      for(int b=1; b<4; b++){
        sum += student[a][b]; //한 학생의 모든과목점수를 합함.
       // System.out.printf("sum(%d) += student[%d][%d] \n",sum,a,b);
        if(b==3) {
          avg = sum/3;
          student[a][b+1]=sum; //3과목[0,1]~[0,3] 모두 더했으면 [0,4]에 대입하고 초기화 
          student[a][b+2]=avg;
         // System.out.printf("합계student[%d][%d]=%d 평균 : %d / 3 = %d \n",a,b+1,sum,sum,avg);
          sum = 0; //다음 학생의 평균과 합계를 구하기 위해 초기화
          avg = 0; //다음 학생의 평균과 합계를 구하기 위해 초기화
        }
      }
    }

     System.out.println("_________________________________________________");

     for(int x=0; x<5; x++){
        System.out.printf("학생번호 : %d // ", student[x][0]);
        System.out.printf("국어,영어,수학점수 : ");

        for(int y=1; y<4; y++){
          System.out.printf("%d ",student[x][y]);
          if(y==3) {
            System.out.printf("합계 : %d 평균 : %d", student[x][4], student[x][5]);
            System.out.println();
        }
     }
     



  }
}
}

/*
 * step1) 학생 1명의 과목별 점수를 입력 받고 보여주는 코드 작성
 * step2) 여러 학생의 여러 점수를 입력받기 위해서 이중 배열을 변수선언
 * step3) 연속으로 입력받기위해 반복문을 이용해 학생 1명씩 과목별 점수를 입력받음.
 * step4) ?? 배열은 0부터 시작하는데 그럼 student[4][3]이니깐 반복문도 i=0;i<4;i++아닌가?
 * step5) 중간점검으로 잘 입력이 되었는지 반복문 입력받고 바로 보여줌. 중간확인
 * step6) 입력받은 모든 배열 내용을 반복문으로 한번에 정리
 * step7) 이중 반복문으로 정리함. (나중에 입력받을게 더 많아 질 수 있으니 간결하게)
 * step7) 합계와 평균 변수를 만들어서 
 */ 
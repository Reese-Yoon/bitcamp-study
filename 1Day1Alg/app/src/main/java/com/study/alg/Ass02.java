// 과제 1 : 계산기 애플리케이션을 작성하라.
// - 실행
// 값1? 10
// 값2? 20
// 연산자(+,-,*,/)? +
// => 10 + 20 = 30 
//

package com.study.alg;

public class Ass02 {
  public static void main(String[] args) {

    java.util.Scanner KeyboardInput = new java.util.Scanner(System.in);
    int num1,num2, result;
    String cal;

    System.out.print("값1? :");
    num1=KeyboardInput.nextInt();

    System.out.print("값2? : ");
    num2=KeyboardInput.nextInt();

    System.out.print("연산자(+,-,x,/)? ");
    cal=KeyboardInput.next();

    switch(cal) {
      case "+": 
        result = num1 + num2;
        System.out.printf("%d + %d = %d",num1,num2,result);
        break;
      case "-" :
        result = num1 - num2;
        System.out.printf("%d - %d = %d", num1,num2,result);
        break;
      case "*" :
        result = num1 * num2;
        System.out.printf("%d * %d = %d", num1,num2,result);
        break;
      case "/" :
        result = num1 / num2;
        System.out.printf("%d / %d = %d", num1,num2,result);
        break;
      default :
        System.out.println("잘못입력하셨습니다 부호를 다시 입력해주세요.");
    }


  }
}
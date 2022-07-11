/*
 * 1일1알 - 0708
 * 문제) 세 개의 자연수 A,B,C를 입력받아 AxBxc 연산 결과중에서 각 숫자가
 * 몇개씩 반복되었는지 구하는 프로그램
 * EX) 2,8,3 -> 18 -> 1이 1개 8이 1개 
 * tip) 고등수학연산(log10)에 맞춰 숫자의 길이 구하는 함수 (int)(Math.log10(대상)+1)
 */
package com.study.alg;

public class Day2 {
  public static void main(String[] args) {

    int num1, num2, num3, result, length, value;
    
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    System.out.print("첫번째 자연수(A)를 입력해주세요 : ");
    num1=scanner.nextInt();
    System.out.print("두번째 자연수(B)를 입력해주세요 : ");
    num2=scanner.nextInt();
    System.out.print("세번째 자연수(C)를 입력해주세요 : ");
    num3=scanner.nextInt();

    System.out.println("-------------------------------------------");

    result=num1*num2*num3;
    System.out.printf("%d X %d X %d = %d \n", num1, num2, num3, result);

    System.out.println("-------------------------------------------");

    length=(int)(Math.log10(result)+1);
    System.out.printf("숫자의 길이 : %d",length);


    for(int i=length; i<0; i--){
      System.out.printf("arr[%d] : %d \n",i,arr[i]);
      arr[i]=result/10^result;
      System.out.printf("arr[%d] : %d \n",i,arr[i]);

    }

    






  }
}
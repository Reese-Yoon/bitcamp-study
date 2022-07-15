/*
 * 1일1알 - 0708 wjwkddustmq
 * 문제) 입력 받은 수 만큼의 배열을 선언하고 그 안에 랜덤으로 수를 받아 최댓값과 최솟값을 구하시오.
 * 
 * tip)
 */

package com.bitcamp.board;
import java.util.Random;

public class Pratice {

  public static void main(String[] args) {

    java.util.Scanner scanner = new java.util.Scanner(System.in);
    Random random = new Random();
    int max=0;
    int min=0;

    System.out.print("몇개 배열을 만드실껀가요? :");
    int num = scanner.nextInt();
    int arr[] = new int[num];

    for(int i=0; i<num; i++){
      arr[i]=random.nextInt(99)+1;
      System.out.printf("%d ", arr[i]);

      if(max < arr[i]) {
        max=arr[i];
      }
      if(max > arr[i]){
        min=arr[i];
      }
    }

    System.out.println();
    System.out.printf("배열 중에서 최댓값은 : %d \n", max);
    System.out.printf("배열 중에서 최솟값은 : %d \n", min);

  }
}
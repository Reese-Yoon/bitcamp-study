/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.study.pra;

public class App {

    public static void main(String[] args) {

      Car mycar = new Car(); //Car 클래스의 인스턴스를 생성, 객체 생성
      // Car mycar1;
      // Car mycar2;  //Car 객체 생성

      // 객체 생성 후 인스턴스화 필수! (아래과정)
      //mycar1 = new Car();  //mycar1은 car클래스의 '인스턴스'(객체를 메모리에 할당)
      //mycar2 = new Car();  //mycar2은 car클래스의 '인스턴스'(객체를 메모리에 할당)
       

      // 객체 생성은 단순히 클래스 틀에서 찍어낸 객체를 만들어 냈고
      // 인스턴스는 그 객체를 컴퓨터에 저장할때 메모리까지 할당한 경우를 인스턴스라고함.
      // Car mycar = new Car();는 객체생성과 메모리 할당까지 동시에 진행

      mycar.company="현대자동차";
      mycar.model="신형 그랜저";
      mycar.color="검은색";
      mycar.maxSpeed=230;
      //인스턴스 변수 선언

      System.out.println("자동차의 회사 : "+mycar.company);
      System.out.println("자동차 종류 : " +mycar.model);
      System.out.println("자동차 색상 : "+mycar.color);
      System.out.println("자동차 최고 속도 : "+mycar.maxSpeed);


    }
}

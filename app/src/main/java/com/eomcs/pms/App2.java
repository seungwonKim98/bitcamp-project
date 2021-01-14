
package com.eomcs.pms;

import java.sql.Date; 

public class App2 {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);



    System.out.println("[프로젝트]");

    System.out.print("번호? ");
    int num = keyboard.nextInt();

    keyboard.nextLine();

    System.out.print("프로젝트명? ");
    String project = keyboard.nextLine();

    System.out.print("내용? ");
    String contents = keyboard.nextLine();

    System.out.print("시작일? ");
    //String start = keyboard.nextLine();

    Date startDate = Date.valueOf(keyboard.nextLine());

    System.out.print("종료일? "); 
    //String end = keyboard.nextLine();
    Date endDate = Date.valueOf(keyboard.nextLine());

    System.out.print("만든이? "); 
    String made = keyboard.nextLine();

    System.out.print("팀원? "); 
    String members = keyboard.nextLine();


    keyboard.close();

    System.out.println("--------------------------------");

    System.out.printf("번호 : %d\n",num);
    System.out.printf("프로젝트명 : %s\n", project);
    System.out.printf("내용 : %s\n", contents);
    //    System.out.printf("시작일 : %s\n", start);
    //    System.out.printf("종료일 : %s\n", end);
    System.out.printf("시작일 : %s\n", startDate);
    System.out.printf("종료일 : %s\n", endDate);

    System.out.printf("만든이 : %s\n", made);
    System.out.printf("팀원 : %s\n", members);



  }
}


/*

[프로젝트]
번호? 1201
프로젝트명? 미니 프로젝트 관리 시스템 개발
내용? 소규모 팀을 위한 프로젝트 관리 시스템을 개발한다.
시작일? 2020-1-1
종료일? 2020-12-31
만든이? 임꺽정
팀원? 홍길동,김구,유관순,안중근,윤봉길
--------------------------------
번호: 1201
프로젝트명: 미니 프로젝트 관리 시스템 개발
내용: 소규모 팀을 위한 프로젝트 관리 시스템을 개발한다.
시작일: 2020-01-01
종료일: 2020-12-31
만든이: 임꺽정
팀원: 홍길동,김구,유관순,안중근,윤봉길

 */

package com.eomcs.pms;

public class App3 {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in); 

    System.out.println("[작업]");

    System.out.print("프로젝트? ");
    String project = keyboard.nextLine();

    System.out.print("번호? ");
    int num = keyboard.nextInt();

    keyboard.nextLine();

    System.out.print("내용? ");
    String contents = keyboard.nextLine();

    System.out.print("완료일? ");
    String enddate = keyboard.nextLine();

    System.out.print("상태? ");
    System.out.println("0 : 신규 "); 
    System.out.println("1 : 진행중"); 
    System.out.println("2 : 완료"); 
    System.out.print("> ");
    int state = keyboard.nextInt();

    keyboard.nextLine();

    System.out.print("담당자? "); 
    String manager = keyboard.nextLine();


    System.out.println("--------------------------------");

    System.out.printf("프로젝트명 : %s\n", project);
    System.out.printf("번호 : %d\n",num);
    System.out.printf("내용 : %s\n", contents);
    System.out.printf("완료일 : %s\n", enddate);


    if(state == 0) {
      System.out.println("상태 : 신규");
    }else if(state == 1) {
      System.out.println("상태 : 진행중");
    }else if(state == 2) {
      System.out.println("상태 : 완료");
    }else {
      System.out.println("상태 입력오류");
    }


    System.out.printf("담당자 : %s\n", manager);


  }
}

/*

[작업]
프로젝트? 미니 프로젝트 관리 시스템 개발
번호? 1
내용? 요구사항 수집
완료일? 2020-1-20
상태?
0: 신규
1: 진행중
2: 완료
> 1
담당자? 홍길동
--------------------------------
프로젝트: 미니 프로젝트 관리 시스템 개발
번호: 1
내용: 요구사항 수집
완료일: 2020-01-20
상태: 진행중
담당자: 홍길동

 */
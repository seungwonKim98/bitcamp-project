package com.eomcs.pms;

public class App {
  public static void main(String[] args) {
    java.util.Scanner keyScan = new java.util.Scanner(System.in);
    java.util.Date today = new java.util.Date();


    System.out.println("[회원]");

    System.out.print("번호? ");
    String num = keyScan.nextLine();

    keyScan.nextLine();

    System.out.print("이름? ");
    String name = keyScan.nextLine();

    System.out.print("이메일? ");
    String add = keyScan.nextLine();

    System.out.print("암호? ");
    String pw = keyScan.nextLine();

    keyScan.nextLine();

    System.out.print("사진? "); 
    String photo = keyScan.nextLine();

    System.out.print("전화? "); 
    String sp = keyScan.nextLine();


    keyScan.close();

    System.out.println("--------------------------------");
    System.out.printf("번호 : %s\n", num);
    System.out.printf("이름 : %s\n", name);
    System.out.printf("이메일 : %s\n", add);
    System.out.printf("암호 : %s\n", pw);
    System.out.printf("사진 : %s\n", photo);
    System.out.printf("전화 : %s\n", sp);
    System.out.printf("가입일 : %1$tY-%1$tm-%1$te\n",today);





  }
}

/*
[회원]
번호? 101
이름? 홍길동
이메일? hong@test.com
암호? 1111
사진? hong.png
전화? 010-1111-2222
--------------------------------
 */
package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;


public class App {

  static Scanner keyboardScan = new Scanner(System.in);


  //회원 데이터
  static final int LENGTH = 100;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tel = new String[LENGTH];
  static Date[] registeredDate = new Date[LENGTH];
  static int size = 0;


  //프로젝트 데이터
  static final int PROJECT_LENGTH = 100;
  static int[] pno = new int[PROJECT_LENGTH];
  static String[] ptitle = new String[PROJECT_LENGTH];
  static String[] pcontent = new String[PROJECT_LENGTH];
  static Date[] pstartDate = new Date[PROJECT_LENGTH];
  static Date[] pendDate = new Date[PROJECT_LENGTH];
  static String[] powner = new String[PROJECT_LENGTH];
  static String[] pmembers = new String[PROJECT_LENGTH];
  static int psize = 0;


  //작업 데이터
  static final int TASK_LENGTH = 100;
  static int[] tno = new int[TASK_LENGTH];
  static String[] tcontent = new String[TASK_LENGTH];
  static Date[] tdeadline = new Date[TASK_LENGTH];
  static String[] towner = new String[TASK_LENGTH];
  static int[] tstatus = new int[TASK_LENGTH];    
  static int tsize = 0;

  // 문자형 스캐너 메소드
  static String promptString(String title) {
    System.out.print(title);
    return keyboardScan.nextLine();
  }

  // 인트형 스캐너 메소드
  static int promptInt(String title) {
    String str = promptString(title);
    return Integer.valueOf(str);
  }

  // 데이트 스캐너 메소드
  static Date promptDate(String title) {
    String today = promptString(title);
    return Date.valueOf(today);
  }


  static void addMember() {
    System.out.println("[회원 등록]");

    no[size] = promptInt("번호? ");
    name[size] = promptString("이름? ");
    email[size] = promptString("이메일? ");
    password[size] = promptString("암호? ");
    photo[size] = promptString("사진? ");
    tel[size] = promptString("전화? ");

    registeredDate[size] = new java.sql.Date(System.currentTimeMillis());

    size++;
  }


  static void listMember() {
    System.out.println("[회원 목록]");

    for (int i = 0; i < size; i++) {
      // 번호, 이름, 이메일, 전화, 가입일
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          no[i], name[i], email[i], tel[i], registeredDate[i]);
    }
  }

  static void addProject() {
    System.out.println("[프로젝트 등록]");

    pno[psize] = promptInt("번호? ");
    ptitle[psize] = promptString("프로젝트명? ");
    pcontent[psize] = promptString("내용? ");
    pstartDate[psize] = promptDate("시작일? ");
    pendDate[psize] = promptDate("종료일? ");
    powner[psize] = promptString("만든이? ");
    pmembers[psize] = promptString("팀원? ");

    psize++;
  }

  static void listProject() {
    System.out.println("[프로젝트 목록]");

    for (int i = 0; i < psize; i++) {
      // 번호, 프로젝트명, 시작일, 종료일, 만든이
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          pno[i], ptitle[i], pstartDate[i], pendDate[i], powner[i]);
    }
  }

  static void addTask() {
    System.out.println("[작업 등록]");

    tno[tsize] = promptInt("번호? ");
    tcontent[tsize] = promptString("내용? ");
    tdeadline[tsize] = promptDate("마감일? ");
    tstatus[tsize] = promptInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");
    towner[tsize] = promptString("담당자? ");

    tsize++;
  }

  static void listTask() {
    System.out.println("[작업 목록]");


    for (int i = 0; i < tsize; i++) {
      String stateLabel = null;
      switch (tstatus[i]) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          tno[i], tcontent[i], tdeadline[i], stateLabel, towner[i]);
    }
  }

  public static void main(String[] args) {

    while(true){
      String command = promptString("명령> ");

      if(command.equalsIgnoreCase("quit") || command.equalsIgnoreCase("exit")) {
        System.out.println("사용해주셔서 감사합니다.");
        break;

      }else if(command.equalsIgnoreCase("/member/add")) {
        addMember();
      }else if(command.equalsIgnoreCase("/member/list")) {
        listMember();
      }else if(command.equalsIgnoreCase("/project/add")){
        addProject();
      }else if(command.equalsIgnoreCase("/project/list")) {
        listProject();
      }else if(command.equalsIgnoreCase("/task/add")) {
        addTask();
      }else if(command.equalsIgnoreCase("/task/list")) {
        listTask();
      }else {
        System.out.println("실행할 수 없는 명령입니다.");
      }
      System.out.println();
    }
  }
}



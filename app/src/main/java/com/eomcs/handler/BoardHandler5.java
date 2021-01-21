package com.eomcs.handler;

import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler5 {

  static final int LENGTH = 100;
  static Board[] board = new Board[LENGTH];
  static int size = 0;

  public static void add(){
    System.out.println("[게시글 작성]");

    Board b = new Board();

    b.no = Prompt.inputInt("번호? ");
    b.title = Prompt.inputString("제목? ");
    b.content = Prompt.inputString("내용? ");
    b.writer = Prompt.inputString("작성자? ");
    b.registeredDate = new java.sql.Date(System.currentTimeMillis());
    b.viewCount = 0;

    //b.viewCount = Prompt.inputInt("조회수? ");

    board[size++] = b;

    System.out.println("게시글을 등록하였습니다.");
  }

  public static void list() {
    System.out.println("[게시글 목록]");


    for(int i = 0; i < size; i++) {
      Board b = board[i];
      System.out.printf("%d, %s, %s, %s, %s, %d, %d\n", 
          b.no, b.title, b.content, b.writer, b.registeredDate, b.viewCount, b.like);
    }
  }

}

/*
명령> /board/add
[새 게시글]
번호? 1 no
제목? 제목입니다. title
내용? 내용입니다. content
작성자? 홍길동 name
게시글을 등록하였습니다.
 */

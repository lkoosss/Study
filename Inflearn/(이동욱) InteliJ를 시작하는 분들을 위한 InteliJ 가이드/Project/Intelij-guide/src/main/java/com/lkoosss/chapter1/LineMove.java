package com.lkoosss.chapter1;

public class LineMove {

    // 라인옮기기 ctrl + shift + 방향키 (블록으로 여러라인 이동가능)
    // 라인옮기기2 alft + shift + 방향키 (블록으로 여러라인 이동가능) (구문 내에서만 이동가능)

    public void moveLineAndStatement() {
        System.out.println("라인 혹은 구문 단위로 이동 시킵니다.");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

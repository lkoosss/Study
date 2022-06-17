package com.lkoosss.chapter4;

import java.lang.reflect.Member;
import java.time.LocalDate;
import java.util.Optional;

public class FocusHierarchy {

    public void increateFocus() {
        // 블록선택하기 ctrl + w
        // 블록선택해제 ctrl + shift + w
        // 전,후 포커스 ctrl + alt + 좌우 방향키
        System.out.println(Optional.of(new Member().getCourse()));
        System.out.println(LocalDate.of(2018,5,14));

        // 멀티 포커스 Alt + 마우스, ctrl + ctrl + 방향키
        member.add(new Member().getName());
        member.add(new Member().getName());
        member.add(new Member().getName());
        member.add(new Member().getName());
        member.add(new Member().getName());

        // 에러가 난 곳으로 포커스 이동 F2
    }
}

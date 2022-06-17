package com.lkoosss.chapter2;

public class ViewDefinition {

    public void viewDefinition() {
        EmailSender emailSender = new EmailSender(1L, "lkoosss", "lkoosss@gmail.com");

        // send, emailSender의 구현코드보기 ctrl + shift + i
        emailSender.send("test@gmail.com");
    }
}

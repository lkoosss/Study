package com.lkoosss.chapter2;

public class ViewArguments {

    public void viewArguments() {
        EmailSender emailSender = new EmailSender(3L,"e","4");
        emailSender.send("test@gmail.com");

    }
}

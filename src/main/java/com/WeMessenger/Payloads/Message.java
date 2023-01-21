package com.WeMessenger.Payloads;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private String messageContent;
    private String message;
    private String to;
}

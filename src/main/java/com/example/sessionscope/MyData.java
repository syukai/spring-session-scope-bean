package com.example.sessionscope;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
@SessionScope()
public class MyData {
    String data1 = "aaa";
    String data2 = "bbb";

    public int val = 0;

    void data1Add() {
        this.data1 += "a";
    }

    void valAdd() {
        this.val +=1;
    }

    String write() {
        return String.format("data1=%s, data2=%s, int=%s", data1, data2, val);
    }
}

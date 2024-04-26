package com.example.sessionscope;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class MyController2 {

    MyData2 myData2;

    MyController2(MyData2 myData2) {
        this.myData2 = myData2;
    }

    @GetMapping("hoge")
    String demo() {

        myData2.data1Add();;
        myData2.valAdd();

        return  myData2.write();
    }
}

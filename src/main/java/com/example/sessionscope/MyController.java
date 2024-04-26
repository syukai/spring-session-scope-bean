package com.example.sessionscope;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class MyController {

    MyData myData;
    MyData2 myData2;

    MyController(MyData myData,MyData2 myData2) {
        this.myData = myData;
        this.myData2 = myData2;
    }

    @GetMapping()
    String demo() {

        myData.data1Add();;
        myData.valAdd();
        myData2.data1Add();;
        myData2.valAdd();

        return myData.write() + "/" + myData2.write();
    }
}

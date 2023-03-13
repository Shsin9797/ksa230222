package com.example.ksa230222;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @Autowired
    TestService ts;

    @RequestMapping(value ="/test",method= RequestMethod.GET) // 위치 여기임.. 메소드 바로위에 ..
    public String test(@RequestParam(value="value") String name){

        return ts.test(name);
    }

    //쌤
    @RequestMapping("/save")
    public String save(@RequestParam("value")String val){
        //localhost:8080/save?value=____ -> 이값이 페이지에 뿌려지는지 확인해봐야함

        //return val ; 이거로 화면에 한번 뿌려지는지 확인해보기
        return ts.save(val);

    }

    // 퀘스트2
    @RequestMapping("/search")
    public String search(@RequestParam("id") Long lid){


        return ts.search(lid);
    }


}




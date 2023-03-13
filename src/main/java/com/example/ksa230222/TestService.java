package com.example.ksa230222;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestRepository tr;

    public String test(String name){
        return tr.test(name);
    }

    public String save(String val) {
        return tr.save(val);
    }

    public String search(Long lid) {
        return tr.search(lid);
    }
}

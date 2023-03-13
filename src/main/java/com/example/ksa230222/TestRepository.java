package com.example.ksa230222;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TestRepository {

    /**
     * test() 메소드가 불리면
     * db에서 test 글자를 찾아서 반환해주세요


     db에는 test 글자 어케넣을까 ?


     */

   /* public Map<Long,String> save(long key,String value) {

        Map<Long, String> map0 = new Map<Long, String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public String get(Object key) {
                return null;
            }

            @Override
            public String put(Long key, String value) {
                return null;
            }

            @Override
            public String remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends Long, ? extends String> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<Long> keySet() {
                return null;
            }

            @Override
            public Collection<String> values() {
                return null;
            }

            @Override
            public Set<Entry<Long, String>> entrySet() {
                return null;
            }



        }

        map0.put(key,value);
        return map0;
    }


    public String test(long key,Map<Long,String> map1){

        String value = map1.get(key);

        return value;

    }


    Map<Long,String>  map2 = save(1,"test");

    String a = test(1,map2); */

    /////////선생님

    Map<Long,String> db =new HashMap<Long,String>();
   /* public void save(){
        db.put(1L,"test");
    } */
    Long id =1L;


    public String save(String val){
        //db.put(1L ,val); 숫자를 대놓고 적어놓는걸 하드코딩이라고함
        db.put(id++,val); // 1로 처음엔 저장하고. .다음엔 2,3,4,5,... 이렇게 ..저장하는거. ..
        return val;
    }

    public String get() {
        return db.get(1L);
    }

    public String test(String name){
        save(name);
        return get();
    }


    public String search(Long lid) {

        return db.get(lid);
    }
}

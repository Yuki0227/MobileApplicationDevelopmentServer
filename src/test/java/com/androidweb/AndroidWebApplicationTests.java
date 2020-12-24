package com.androidweb;

import com.androidweb.entity.User;
import com.androidweb.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AndroidWebApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void save(){
        User user = new User();
        user.setId(11);
        user.setName("admdmmd");
        user.setPassword("123123");
        user.setContent("任务:测试save请求接口");
        User user1 = userRepository.save(user);
        System.out.println(user1);
    }

    @Test
    void update(){
        User user = new User();
        user.setId(5);
        user.setName("abc");
        user.setPassword("123123");
        //user.setContent(null);
        User user1 = userRepository.save(user);
        System.out.println(user1);
    }

//    @Test
//    void delete(){
//        userRepository.deleteById(15);
//    }

}

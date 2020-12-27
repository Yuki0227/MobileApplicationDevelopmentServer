package com.androidweb;

import com.androidweb.entity.User;
import com.androidweb.repository.ChoiceQuestionRepository;
import com.androidweb.repository.TaskAssignRepository;
import com.androidweb.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AndroidWebApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ChoiceQuestionRepository choiceQuestionRepository;

    @Autowired
    private TaskAssignRepository taskAssignRepository;


    @Test
    void findAll(){ System.out.println(choiceQuestionRepository.findAll());
    }

    @Test
    void findById(){
        System.out.println(choiceQuestionRepository.findById(1));
    }

    @Test
    void contextLoads() {
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

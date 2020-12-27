package com.androidweb;

import com.androidweb.entity.User;
import com.androidweb.repository.MultipleChoiceRepository;
import com.androidweb.repository.QuestionRepository;
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
    private MultipleChoiceRepository multipleChoiceRepository;

    @Autowired
    private TaskAssignRepository taskAssignRepository;


    @Test
    void findAll(){ System.out.println(multipleChoiceRepository.findAll());
    }

    @Test
    void findById(){
        System.out.println(multipleChoiceRepository.findById(1));
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

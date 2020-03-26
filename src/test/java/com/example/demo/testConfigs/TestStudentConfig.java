package com.example.demo.testConfigs;

import com.example.demo.models.Students;
import com.example.demo.configs.StudentConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = StudentConfig.class)
@RunWith(SpringRunner.class)
public class TestStudentConfig {

    @Autowired
    @Qualifier("students")
    Students students;
    @Test
    public void testStudentsCurrent(){
        String expected = "id: 1\nname: Leslie";
        String actual = students.toString();
        Assert.assertEquals(expected,actual);
    }

    @Autowired
    Students previousStudents;
    @Test
    public void testStudentsPrevious(){
        String expected = "id: 2\nname: Ron";
        String actual = previousStudents.toString();
        Assert.assertEquals(expected,actual);
    }


}

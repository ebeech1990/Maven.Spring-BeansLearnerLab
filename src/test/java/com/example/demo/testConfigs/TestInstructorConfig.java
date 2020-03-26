package com.example.demo.testConfigs;

import com.example.demo.models.Instructors;
import com.example.demo.configs.InstructorsConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = InstructorsConfig.class)
@RunWith(SpringRunner.class)
public class TestInstructorConfig {

    @Autowired
    @Qualifier("tcUsaInstructors")
    Instructors usa;
    @Test
    public void testInstructorsUsa(){
        String expected = "id: 1\nname: April";
        String actual = usa.toString();
        Assert.assertEquals(expected,actual);
    }

    @Autowired
    @Qualifier("tcUkInstructors")
    Instructors uk;
    @Test
    public void testInstructorsUk(){
        String expected = "id: 2\nname: Tom";
        String actual = uk.toString();
        Assert.assertEquals(expected,actual);
    }

    @Autowired
    @Qualifier("instructors")
    Instructors zc;
    @Test
    public void testInstructorsZc(){
        String expected = "id: 3\nname: GaryJerry";
        String actual = zc.toString();
        Assert.assertEquals(expected,actual);
    }

}

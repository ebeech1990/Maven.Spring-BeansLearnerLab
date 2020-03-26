package com.example.demo.testConfigs;

import com.example.demo.Classroom;
import com.example.demo.configs.InstructorsConfig;
import com.example.demo.configs.StudentConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestClassroomConfig {

    @Autowired
    Classroom currentCohort;

//    @Test
//    public void testClassroomCurrent(){
//        Assert.assertNotNull(currentCohort);
//    }
//
//    @Autowired
//    Classroom previousCohort;
//
//    @Test
//    public void testClassroomPrev(){
//        Assert.assertNotNull(previousCohort);
//    }
}

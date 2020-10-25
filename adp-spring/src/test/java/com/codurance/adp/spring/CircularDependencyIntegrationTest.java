package com.codurance.adp.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
public class CircularDependencyIntegrationTest {

    @Test
    public void givenCircularDependency_whenSetterInjection_thenItWorks() {
    }
}

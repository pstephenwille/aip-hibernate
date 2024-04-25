package com.practice.ts.PracticeTwo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.orm.hibernate5.HibernateTemplate;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

@SpringBootTest
public class HibernateTest {
/* guide; https://dev.to/jeetprakash/no-xml-spring-and-hibernate-integration-2fn */
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Test
    public void hibernateIsInstalled() {
        assertThat(hibernateTemplate).isNotEmpty();
    }
}

/*
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.brightd;

import com.brightd.cashflow.Person;
import com.brightd.cashflow.SampleBean;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.KieBase;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/beans-internal2.xml" })
public class KieSpringAnnotationBasics2Test {


    @Resource(name="sampleBean")
    private SampleBean sampleBean;

    @BeforeClass
    public static void setup() { }

    @Test
    public void testContext() throws Exception {
        assertNotNull(sampleBean);
    }

    @Test
    public void testKSessionExecution() throws Exception {
        StatelessKieSession ksession = (StatelessKieSession)sampleBean.getKieSession();
        assertNotNull(ksession);
        Person person = new Person("HAL", 44);
        person.setHappy(false);
        ksession.execute(person);
        System.out.println(person.isHappy());
        //assertTrue(person.isHappy());
    }

    @AfterClass
    public static void tearDown() {

    }

}

package com.brightd.service.impl.hello;

import com.brightd.service.hello.IDroolsHelloService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertNotNull;

/** 
* HelloServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>Feb 28, 2017</pre> 
* @version 1.0 
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring/spring-service.xml" })
public class DroolsHelloServiceImplTest {

@Resource(name="droolshelloService")
private IDroolsHelloService helloService;

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sayHello(String message) 
* 
*/ 
@Test
public void testSayHello() throws Exception {
    assertNotNull(helloService);
    helloService.sayHello("===");
} 

} 

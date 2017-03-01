package com.brightd.service.impl.hello;

import com.brightd.cashflow.Person;
import com.brightd.cashflow.SampleBean;
import com.brightd.service.hello.HelloService;
import org.kie.api.runtime.StatelessKieSession;

import javax.annotation.Resource;

/**
 * Created by pengyong on 17/2/28.
 */
public class HelloServiceImpl implements HelloService {

    @Resource(name="sampleBean")
    private SampleBean sampleBean;

    @Override
    public String sayHello(String message) {

        StatelessKieSession ksession = (StatelessKieSession)sampleBean.getKieSession();
        Person person = new Person("HAL", 44);
        person.setHappy(false);
        ksession.execute(person);
        System.out.println(person.isHappy());

        return null;
    }
}

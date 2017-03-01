package com.brightd.service.impl.hello;

import com.brightd.cashflow.Person;
import com.brightd.cashflow.SampleBean;
import com.brightd.service.hello.IDroolsHelloService;
import org.kie.api.runtime.StatelessKieSession;

import javax.annotation.Resource;

/**
 * Created by pengyong on 17/2/28.
 */
public class DroolsHelloServiceImpl implements IDroolsHelloService {

    private SampleBean sampleBean;

    @Override
    public String sayHello(String message) {

        StatelessKieSession ksession = (StatelessKieSession)sampleBean.getKieSession();
        Person person = new Person("HAL", 44);
        person.setHappy(false);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        ksession.execute(person);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(person.isHappy());

        return "hello+++++";
    }


    public SampleBean getSampleBean() {
        return sampleBean;
    }

    public void setSampleBean(SampleBean sampleBean) {
        this.sampleBean = sampleBean;
    }
}

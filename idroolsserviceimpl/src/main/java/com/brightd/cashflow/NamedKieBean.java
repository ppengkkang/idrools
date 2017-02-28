/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.brightd.cashflow;

import org.kie.api.KieBase;
import org.kie.api.cdi.KBase;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;

public class NamedKieBean {

    @KSession("ksession1")
    StatelessKieSession ksession1;

    @KSession("statefulSession")
    KieSession statefulSession;

    @KBase("cashflow")
    KieBase kieBase;

    public KieBase getKieBase() {
        return kieBase;
    }

    public void setKieBase(KieBase kieBase) {
        this.kieBase = kieBase;
    }

    public KieSession getStatefulSession() {
        return statefulSession;
    }

    public void setStatefulSession(KieSession statefulSession) {
        this.statefulSession = statefulSession;
    }

    public StatelessKieSession getKieSession() {
        return ksession1;
    }

    public void setKieSession(StatelessKieSession kieSession) {
        this.ksession1 = kieSession;
    }
}

package com.gaw.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class FetchEmailDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        System.out.println("Calling from FetchEMail Delegate");
        System.out.println(
                "userIdInput in FetchEMail Delegate :: "
                        + delegateExecution.getVariable("userIdInput"));
        delegateExecution.setVariable("userEmailIdFromDelegate", "www.galih@gmail.com");
    }
}

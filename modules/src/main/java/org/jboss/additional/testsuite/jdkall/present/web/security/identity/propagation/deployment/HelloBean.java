package org.jboss.additional.testsuite.jdkall.present.web.security.identity.propagation.deployment;

import org.jboss.eap.additional.testsuite.annotations.EapAdditionalTestsuite;
import org.jboss.ejb3.annotation.SecurityDomain;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless(name="Hello")
@Remote(Hello.class)
@SecurityDomain("auth-test")
@EapAdditionalTestsuite({"modules/testcases/jdkAll/Eap72x/web/src/main/java#7.2.1", "modules/testcases/jdkAll/Eap72x-Proposed/web/src/main/java#7.2.1"})
public class HelloBean implements Hello {

    @RolesAllowed({ "guest" })
    public void call() {
    }
}

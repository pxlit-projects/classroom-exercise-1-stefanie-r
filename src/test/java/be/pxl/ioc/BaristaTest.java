package be.pxl.ioc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaristaTest {


    @Test
    public void serve_GivenABaristaWithACustomerFriendlyWorkEthic_CustomerIsSatisfied_AndGotProperName() throws Exception {
        String customer = "meliodas";
        Barista vicky = new Barista("vicky");
        vicky.setWorkEthic(new CustomerFriendlyWorkEthic());
        CustomerExperience customerExperience = vicky.serve(customer);

        assertThat(customerExperience.getCustomer()).isEqualTo(customer);
        assertThat(customerExperience.getHappiness()).isEqualTo("satisfied");
        assertThat(customerExperience.gotCorrectNameOnCup()).isTrue();
    }

    @Test
    public void serve_GivenABaristaWithALazyWorkEthic_CustomerIsNotSatisfied_AndDidNotGetProperName() throws Exception {
        String customer = "ban";
        Barista gemma = new Barista("gemma");
        gemma.setWorkEthic(new LazyWorkEthic());
        CustomerExperience customerExperience = gemma.serve(customer);

        assertThat(customerExperience.getCustomer()).isEqualTo(customer);
        assertThat(customerExperience.getHappiness()).isEqualTo("unsatisfied");
        assertThat(customerExperience.gotCorrectNameOnCup()).isFalse();
    }

    @Test
    public void serve_GivenABaristaWithABadHearingWorkEthic_CustomerIsSatisfied_ButDidNotGetProperName() throws Exception {
        String customer = "elizabeth";
        Barista els = new Barista("els");
        els.setWorkEthic(new BadHearingWorkEthic());
        CustomerExperience customerExperience = els.serve(customer);

        assertThat(customerExperience.getCustomer()).isEqualTo(customer);
        assertThat(customerExperience.getHappiness()).isEqualTo("satisfied");
        assertThat(customerExperience.gotCorrectNameOnCup()).isFalse();
    }
}
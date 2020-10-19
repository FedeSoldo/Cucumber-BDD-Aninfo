

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import icecreamshop.IceCreamShop;

import static org.junit.Assert.assertEquals;

public class ice_cream_shop {

    private IceCreamShop ice_cream_shop;

    @Given("^Ice cream shop with an initial amount of (\\d+)$")
    public void kilo_of_ice_cream_with_the_price_of(int initialDayAmount) {
        ice_cream_shop = new IceCreamShop(initialDayAmount);
    }

    @When("^Client buys an ice cream with the price of (\\d+)$")
    public void client_buys_an_ice_cream_with_the_price_of(int clientAmount) {
        ice_cream_shop.buy(clientAmount);
    }

    @When("^Trying to pay a service for (\\d+)$")
    public void trying_to_pay_a_service_for(int payAmount) throws Throwable {
        try {
            ice_cream_shop.pay(payAmount);
        } catch (Exception ia) { }
    }

    @Then("^Ice cream shop final amount is (\\d+)$")
    public void ice_cream_shop_final_amount_is(int balance) {
        assertEquals(ice_cream_shop.getAmount(), balance);
    }

    @And("^Ice cream final debt amount is (\\d+)$")
    public void iceCreamFinalDebtAmountIs(int debt) {
        assertEquals(ice_cream_shop.getDebtAmount(), debt);
    }
}

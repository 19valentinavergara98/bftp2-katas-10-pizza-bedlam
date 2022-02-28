import org.junit.jupiter.api.Test;
import product.Pizza;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PizzaBedlamTest {
    @Test
    void pizzaCostDependsName() {
        assertThat(new Pizza("Margherita").getPrice(), equalTo(9.30));
        assertThat(new Pizza("Prosciutto").getPrice(), equalTo(12.00));
        assertThat(new Pizza("Prosciutto e funghi").getPrice(), equalTo(12.50));
        assertThat(new Pizza("4 Stagioni").getPrice(), equalTo(12.50));
    }

}

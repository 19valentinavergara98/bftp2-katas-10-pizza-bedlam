import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PizzaBedlamTest {
    @Test
    void pizzaCostDependsName() {
        assertThat(new Pizza("MARGHERITA").getPrice(), equalTo(9.30));
        assertThat(new Pizza("PROSCIUTTO ").getPrice(), equalTo(12.00));
        assertThat(new Pizza("PROSCIUTTO E FUNGHI").getPrice(), equalTo(12.50));
        assertThat(new Pizza("4 STAGIONI").getPrice(), equalTo(12.50));
    }

}

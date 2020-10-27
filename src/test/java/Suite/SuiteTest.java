package Suite;

import Tests.AvaliarVestidosTest;
import Tests.CadastroTest;
import Tests.CompraTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CadastroTest.class,
        CompraTest.class,
        AvaliarVestidosTest.class
})
public class SuiteTest {

}

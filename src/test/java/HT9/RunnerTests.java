package HT9;

import HT9.cases.Cases;
import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;

@RunWith(JUnitPlatform.class)
@SelectClasses({Cases.class})

public class RunnerTests {
}

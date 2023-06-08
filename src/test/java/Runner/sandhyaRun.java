package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="D:\\java and automation\\BashaCucumberFramework\\Feature\\sandhyaAkka.feature",
		glue="StepDefenitions",
		monochrome=true,
				plugin= {"pretty","html:Reports//cucumber.html"}
)
public class sandhyaRun extends AbstractTestNGCucumberTests{

}

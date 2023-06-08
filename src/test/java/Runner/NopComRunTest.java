package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="D:\\java and automation\\BashaCucumberFramework\\Feature\\nopcommerce.feature",
        glue="StepDefenitions",
monochrome=true,
plugin= {"pretty","html:Reports//HTML_Reports//cucumber1.html",
		"json:Reports//JSON_Reports//cucumber.json",
	"junit:Reports//JUNiT_Reports//cucumber.xml"
	})
public class NopComRunTest extends AbstractTestNGCucumberTests {

}

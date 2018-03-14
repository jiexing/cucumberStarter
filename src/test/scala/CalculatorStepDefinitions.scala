import cucumber.api.scala.{EN, ScalaDsl}
import org.junit.Assert._

class CalculatorStepDefinitions extends ScalaDsl with EN {

  var result: Double = 0
  When("""^multiply (\d+) and (\d+)$"""){ (arg0:Double, arg1: Double) =>
    result = arg0 * arg1
  }
  Then("""^the result is (\d+)$"""){ (expected: Double) =>
     assertEquals(expected, result, 0.000001)
  }
}

import org.scalatest.{MustMatchers, WordSpec}

class BonusCalculatorSpec extends WordSpec with MustMatchers {

  "BonusCalculator" must {

    "when provided with a salary £100 and bonus of true return £120" in {
      BonusCalculator.calculate(100, Bonus = true) mustEqual "£120"
    }

    "when provided with a salary £100 and a bonus of false return £100" in {
      BonusCalculator.calculate(100, Bonus = false) mustEqual "£100"
    }

    "when provided with a salary of £99 and a bonus of true return £118" in {
      BonusCalculator.calculate(99, Bonus = true) mustEqual "£118"
    }

    "when provided with a salary of £2000 and a bonus of true return £2400" in {
      BonusCalculator.calculate(2000, Bonus = true) mustEqual "£2400"
    }
  }

}

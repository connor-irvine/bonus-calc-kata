object BonusCalculator extends App {

  def calculate (salary: Int, Bonus : Boolean) : String = {

    val salWithBonus = (salary * 0.2) + salary
    val roundDown = Math.floor(salWithBonus).toString.replace(".0", "")

    if (Bonus)
      s"£$roundDown"
    else {
      s"£$salary"
    }
  }
}

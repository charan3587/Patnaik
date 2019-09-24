package chakri.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepdefinition {
	@Given("I enter {int} in the calculator")
	public void I_enter_50_in_the_calculator1(int num)
	{
		System.out.println("I enter "+num+ "in the calculator");
	}
	@And("I press {word}")
	public void I_press_add(String Symbol)
	{
		System.out.println(" I press "+Symbol);
	}
	@And("I enter {int} in calculator")
	public void I_enter_50_in_the_calculator2(int num)
	{
		System.out.println("I enter"+num+" in the calculator");
	}
@And("press equal to button")
public void press_equal_to_button()
{
	System.out.println("press equal to button");
}
@Then("validate the answer")
public void validate_the_answer()
{
	System.out.println("validate the answer");
}
}

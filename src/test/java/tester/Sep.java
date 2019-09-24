package tester;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sep {
	@Given("I am a {word} tester")
	public void I_am_type_tester(String word)
	{
		System.out.println("I am a"+word+"tester ");
	}
	@When("I go to work")
	public void I_go_to_work()
	{
	System.out.println("I go to work");	
	}
	@Then("I {word} it")
	public void I_work_it(String word)
	{
		System.out.println("I"+word+"it");
	}
	@And("My boss {word}me")
	public void My_Boss_Mood(String word)
	{
		System.out.println("My boss"+word+"me");
	}
	@But("the developer {word}me")
	public void the_developer(String word)
	{
		System.out.println("the developer "+word+"me");
		System.out.println("*******************************************************");
		System.out.println("*******************************************************");
	}
	}

package com.example.testEasyRules;

import com.example.testEasyRules.rule.MyRule;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestEasyRulesApplication {


	public static void main(String[] args) {

		Rule rule = new org.jeasy.rules.core.RuleBuilder()
				.name("MyRule")
				.description("Description of My Rule")
				.when(facts -> true) // Condition always evaluates to true for this example
				.then(facts -> System.out.println("Action of My Rule executed!"))
				.build();

		Rules rules = new Rules();
		rules.register(rule);

		Facts facts = new Facts();

		DefaultRulesEngine rulesEngine = new DefaultRulesEngine();
		rulesEngine.fire(rules, facts);

	}

}

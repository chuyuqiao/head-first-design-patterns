package com.design.patterns.strategy;

import org.junit.Test;

public class DuckTest {

	@Test
	public void testFlyWithQuack(){
		Duck mallardDuck=new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}
}

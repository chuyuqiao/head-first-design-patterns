package com.enhance.command;

import org.junit.Test;

public class CommandTest {
	
	@Test
	public void testCommand(){
		Light light=new Light();
		Command command=new LightOnCommand(light);
		SimpleRemoteControl simpleRemoteControl=new SimpleRemoteControl();
		simpleRemoteControl.setCommand(command);
		simpleRemoteControl.buttonWasPressed();
	}

}

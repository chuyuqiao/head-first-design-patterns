package com.design.patterns.command;

/**
 * 命令注入者 Invoker
 * @author chuyuqiao
 *
 */
public class SimpleRemoteControl {

	private Command command;

	public SimpleRemoteControl(){
		
	}
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void buttonWasPressed(){
		command.execute();
	}
	
	
	
	
	
	
}

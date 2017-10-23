package com.design.patterns.command;

/**
 * 命令
 * @author chuyuqiao
 *
 */
public class LightOnCommand implements Command{
	private Light light;
	public LightOnCommand(Light light){
		this.light=light;
	}
	@Override
	public void execute() {
		light.on();
	}

}

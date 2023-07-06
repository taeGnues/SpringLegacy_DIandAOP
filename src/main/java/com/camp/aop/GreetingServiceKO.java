package com.camp.aop;

import org.springframework.stereotype.Component;

@Component("greeting")
public class GreetingServiceKO implements GreetingService {
	
	private OutputService outputter;
	public GreetingServiceKO(OutputService outputter) {
		this.outputter = outputter;
		System.out.println("GreetingServiceKO(OutputService outputter)...");
	}

	public void sayHello(String name) {
		outputter.print("안녕 "+name);
	}

	@Override
	public void sayGoodbye(String name) {
		outputter.print("잘가 "+name);
	}

	@Override
	public void smile() {
		outputter.print("호호호~~");		
	}
}

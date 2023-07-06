package com.camp.aop;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Component;

@Component
public class OutputServiceFile implements OutputService {

	@Override
	public void print(String msg) {
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileWriter("msg.txt", true));
			out.println(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(out != null) out.close();
		}
		
	}

}

package com.enhance.decoratorapi;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void testDecorator() {
		int c;
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(
					new FileInputStream("src/test.txt")));
			while((c=in.read())>=0){
				System.out.println((char)c);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

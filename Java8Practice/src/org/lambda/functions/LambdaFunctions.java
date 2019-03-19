package org.lambda.functions;

import org.lambda.functions.functionalInterface.Test;

public final class LambdaFunctions {

	public static void main(String[] args) {
		
		Test testLambda = str -> str;								
		TestClass testCls = new TestClass();
		testCls.printLambda(testLambda);
		System.out.println(testLambda.testFunction("Oh "));
	}

}

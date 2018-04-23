package com.livrable.impl;

import com.livrable.inter.AutreInterface;
import com.livrable.inter.MyInterface;

public class MyClass implements MyInterface, AutreInterface {

	public int laSomme(int val1, int val2) {
		return val1+val2;
	}

	
	public String presentation() {
	
		return" JE VIENS DE LA CLASSE: MyClass et je m'appelle presentation2";

	}
}

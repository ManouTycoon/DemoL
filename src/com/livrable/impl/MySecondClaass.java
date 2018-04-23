package com.livrable.impl;

import com.livrable.inter.AutreInterface;
import com.livrable.inter.MyInterface;

public class MySecondClaass implements MyInterface, AutreInterface {

	public int laSomme(int val1, int val2) {

		return val1- val2;
	}

	public String presentation() {
		// TODO Auto-generated method stub
		return " Je viens de la classe :MySecondClass";
	}
}

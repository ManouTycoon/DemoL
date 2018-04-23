package com.livrable.ui;

import com.livrable.impl.MyClass;
import com.livrable.impl.MySecondClaass;

public class Lanceur {

	public static void main(String... args) {
		
		MyClass myClass= new MyClass();
		myClass.autreMethode();
		int result1= myClass.laSomme(10, 16);
		
		System.out.println(result1);
		System.out.println(myClass.presentation());
		MySecondClaass mySecondClass= new MySecondClaass();
		mySecondClass.autreMethode();
		int result2 = mySecondClass.laSomme(15, 20);
		
		System.out.println(result2);
		System.out.println(mySecondClass.presentation());
	}

}

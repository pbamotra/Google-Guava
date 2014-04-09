package com.paypal.oap.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ObjectsToStringTestMain {

	public static void main(String[] args) {
		ObjectsToStringTest obj = new ObjectsToStringTest("Pankesh Bamotra", 123);
		System.out.println(obj);
		
		ObjectsToStringTest obj2 = new ObjectsToStringTest("Pankesh Bamotra", 121);
		System.out.println(obj2);
		
		List<ObjectsToStringTest> sample_arr = new ArrayList<ObjectsToStringTest> ();
		for(ObjectsToStringTest o: sample_arr) {
			System.out.println(o);
		}
		sample_arr.add(obj);
		sample_arr.add(obj2);
		Collections.sort(sample_arr);
		for(ObjectsToStringTest o: sample_arr) {
			System.out.println(o);
		}
	}

}

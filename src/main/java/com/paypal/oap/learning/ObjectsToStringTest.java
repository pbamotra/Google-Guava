package com.paypal.oap.learning;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ComparisonChain;

public class ObjectsToStringTest implements Comparable<ObjectsToStringTest>{
	String emp_name;
	Integer emp_id;
	
	private static final String INVALID_ARGS_ERROR = "Invalid arguments passed";
	
	public ObjectsToStringTest() {}
	
	public ObjectsToStringTest(String emp_name, Integer emp_id) {
		this.emp_name = Preconditions.checkNotNull(emp_name, INVALID_ARGS_ERROR);
		this.emp_id	  = Preconditions.checkNotNull(emp_id, INVALID_ARGS_ERROR);
		
		this.emp_name = emp_name;
		this.emp_id = emp_id;
	}
	
	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("Emp Name", this.emp_name).add("Emp Id", this.emp_id).toString();
	}

	@Override
	public int compareTo(ObjectsToStringTest o) {
		// TODO Auto-generated method stub
		return ComparisonChain.start().compare(this.emp_name, o.emp_name).compare(this.emp_id, o.emp_id).result();
	}
}

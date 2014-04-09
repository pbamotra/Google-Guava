package com.paypal.oap.learning;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Objects;


class State {
	String name;
	String code;
	String capital;
	
	public State(String name, String code, String capital) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.code = code;
		this.capital = capital;
	}
	
	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("Name", name).add("Code", code).add("Capital", capital).toString();
	}
}
public class FunctionForMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, State> stateMap = new HashMap<String, State>();
		stateMap.put("NY", new State("New York", "NY", "Albany"));
		
		Function<String, State> lookup = Functions.forMap(stateMap);
		State NewYork = lookup.apply("NY");
		System.out.println(NewYork);
	}

}

package com.paypal.oap.learning;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;

public class MapJoinerAndSplitter {
	public static void main(String[] args) {
		Map<String, Integer> student_attendaceCntMap = new HashMap<String, Integer>();
		student_attendaceCntMap.put("Pankesh Bamotra", 99);
		student_attendaceCntMap.put("Abhishek Bamotra", 100);
		
		System.out.println(Joiner.on("#").withKeyValueSeparator("=").join(student_attendaceCntMap));
		
		String joinedMap = "Pankesh Bamotra=99#Abhishek Bamotra=100";
		for(String str :Splitter.on("#").omitEmptyStrings()
        .trimResults()
        .split(joinedMap.trim())) {
			System.out.println(Strings.nullToEmpty(str));
		}
		
		String sample_string = "  Pankesh   Bamotra";
		System.out.println(CharMatcher.WHITESPACE.trimAndCollapseFrom(sample_string, ' '));
		
		int[] sample_arr = new int[] {1, 2, 3, 4, 5};
		Preconditions.checkElementIndex(-1, 5, "Invalid array index passed");
		Preconditions.checkArgument(-1>5);
	}
}

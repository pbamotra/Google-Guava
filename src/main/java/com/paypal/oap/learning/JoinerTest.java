package com.paypal.oap.learning;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Joiner;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class JoinerTest {

    public static void main(String[] args) {
        
    	List<String> sample_string_array = new ArrayList<String>();
    	sample_string_array.add("Pankesh");
    	sample_string_array.add("Abhishek");
    	sample_string_array.add("Nishant");
    	sample_string_array.add(null);
    	sample_string_array.add("Abhishek");
    	sample_string_array.add("Nishant");
    	sample_string_array.add("");
    	sample_string_array.add("Abhishek");
    	sample_string_array.add("Nishant");
    	String pipe_joined = Joiner.on("|").skipNulls().join(sample_string_array);
    	String pipe_joined_null_default = Joiner.on("|").useForNull("NULL_VALUE").join(sample_string_array);
    	System.out.println(pipe_joined + "\n" + pipe_joined_null_default);
    	
    	assert pipe_joined.isEmpty() : "Is not empty";
    }
}

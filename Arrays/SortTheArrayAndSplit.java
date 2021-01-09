package com.capg.td_demo;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
                    *Program to sort the array and split into the two parts* 
**/

public class SortTheArrayAndSplit {
private  SortTheArrayAndSplit_TestCaseContainer sortSplitTester;


static String input_array_for_odd[]= {"Ram","Sita","Laxman","Hanuman","Shiva"};
static String input_array_for_even[]= {"Ram","Sita","Laxman","Hanuman","Shiva","Vishnu"};
	
@Test
public void test_if_array_is_empty(){
		String input_array[]= {};
		String result=sortSplitTester.sortStrings(input_array);
		assertEquals("0",result);

}
	@Test
public void test_if_array_contains_single_elements(){
		String input_array[]= {"Ram"};
		String test_input=input_array[0].toUpperCase();
		String result=sortSplitTester.sortStrings(input_array);
		assertEquals(test_input,result);

	}
	@Test
public void test_if_array_is_sorted_and_length_is_odd(){
		String test_input="HANUMAN LAXMAN RAM shiva sita";
		String result=sortSplitTester.sortStrings(input_array_for_odd);
		assertEquals(test_input,result);
	}
	@Test
public void test_if_array_is_sorted_and_length_is_even(){
		String test_input="HANUMAN LAXMAN RAM shiva sita vishnu";
		String result=sortSplitTester.sortStrings(input_array_for_even);
		assertEquals(test_input,result);
	}
}

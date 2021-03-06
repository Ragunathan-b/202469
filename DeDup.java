package com.duplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DeDup {
	   
		     public static int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3, 
		                                    20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19, 
		                                    13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};    
		   
		     public static void main(String [] args) { 
		 	 
		    DeDup deDupObject = new DeDup();	 
		 	int[] arryUniqueInt =  deDupObject.removeDuplicate(randomIntegers); 
		 	System.out.println("Approach 1 Duplicate removed Array : " + Arrays.toString(arryUniqueInt)); 
		 	arryUniqueInt =  deDupObject.removeDuplicateApproach2( randomIntegers  ); 
		 	System.out.println("Approach 2 Duplicate removed Array: " + Arrays.toString(arryUniqueInt)); 
		 	arryUniqueInt =  deDupObject.removeDuplicateInsertionOrder( randomIntegers  ); 
		 	System.out.println("Approach 3 Duplicate removed Array with orginal order : " + Arrays.toString(arryUniqueInt)); 
		     } 
		 
		 
		   private int[] toInt(Set<Integer> set) { 
		   int[] a = new int[set.size()]; 
		   int i = 0; 
		   for (Integer val : set) a[i++] = val; 
		   return a; 
		 } 
		 
		 
		    private int[] removeDuplicate( int [] intArg){ 
		 
		 
		 	ArrayList<Integer> intList = new ArrayList<Integer>(intArg.length); 
		 	for (int i : intArg) intList.add(i); 
		 	Set<Integer> s  = new HashSet<Integer>(intList);  
		    return toInt(s); 
		 } 
		
		 
		    private int [] removeDuplicateApproach2(int [] intArg ){ 
		 		 
		 	HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>(intArg.length); 
		 	for (int i : intArg) intMap.put((Integer)i,(Integer)i); 
		 	Set<Integer> s = intMap.keySet(); 
		    return toInt(s);	 
		 } 		 
		 
		private int [] removeDuplicateInsertionOrder(int [] intArg){ 
		 
		 
		ArrayList<Integer> intList = new ArrayList<Integer>(intArg.length); 
		for (int i : intArg) intList.add(i); 
		Set <Integer> s = new LinkedHashSet<Integer>(intList);        return toInt(s); }  
		 
 } // class closing tag 

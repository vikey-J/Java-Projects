//Set :
//	* It is a Interface.
//	* It does not have any spesific value
//	* Not allow duplicate Value
//	* It is vlaue based
//Tyes:	
//	i) HashSet
//   ii) LinkedHashSet
//  iii) TreeSet
//
//i.HashSet :
//	* It print random order
//	* Not allow duplicate value 
//	* It will allow single null value 
//	                     -not a duplicate nul value
//ii.LinkedHashSet:
//	* It prints Insertion order
//	* It will not allow duplicate value
//	* It will allow single null value 
//	                      -not a duplicate null value
//iii.TreeSet :
//	* It prints Ascending order
//	* not allow duplicate value 
//	*It will not allow even single null value 
	

package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class Set_Type3{
	public static void main(String[] args) {
		Set<Object> s=new TreeSet<Object>();
		//i.add
		s.add("VIKNESH");
		s.add("46");
		s.add("s");
		s.add("KUMAR");
		System.out.println("Add Set :");
		System.out.println(s);
		
		//ii.size
		System.out.println("\nsize :");
		int size=s.size();
		System.out.println(size);
		
		//remove
		System.out.println("\nRemove Set :");
		s.remove("s");
		System.out.println(s);
		
		//contains 
		System.out.println("Check the value for Set :");
		boolean contains = s.contains("s");
		System.out.println(contains);
		
		//claer
//		System.out.println("\nClaer Set :");
//		s.clear();
//		System.out.println(s);
		
		//add all
		Set<Object> s1=new TreeSet<Object>();
		s1.add("VIKNESH");
		s1.add("001");
		s1.add("SV");
		s1.add("KUMAR");
		System.out.println("\nAdd all set :");
//		s.addAll(s1);
//		System.out.println(s);
		
		//retain all
		s.retainAll(s1);
		System.out.println(s);
		
		//removeall
		s.removeAll(s1);
		System.out.println(s);
		
	}

}

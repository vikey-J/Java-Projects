//Map :
//	* Its Key and value pair
//	* Key+value=one entry

//key--->
//    * It will not allow dulicate 
//    * It can be override
//    * It will allow Override null[duplicate]

//Value-->
//    * It will allow duplicate
//    * It will allow both  null.
//    

//Map--->(curley bases){}

package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Types 
{
	public static void main(String[] args) 
	{
		Map<Object, Object> m=new HashMap<Object, Object>();
		//i.put  ( Add a map )
		m.put(4, "VIKNESH");
		m.put(7,null);
		m.put(null, "Selneium");
		m.put(null,"JAVA");
		System.out.println("put the map :");
		System.out.println(m);
		
		//ii.size  ( total size of map )
		System.out.println("\nSize of map :");
		int size=m.size();
		System.out.println(size);
		
		//iii.get   (get the value for map like enter Key)
		System.out.println("\nget a map :");
		Object object = m.get(1);
		System.out.println(object);
		
		//iv.keyset  ( Display keys on cosole )
		System.out.println("\nKeyset :");
		Set<Object> keySet = m.keySet();
		System.out.println(keySet);
		
		//v.value   ( Display values on console )
		System.out.println("\nValue :");
		Collection<Object> values = m.values();
		System.out.println(values);
		
		//vi.containsKey  ( to check the key in map )
		System.out.println("\nContainsKey :");
		boolean containsKey = m.containsKey(4);
		System.out.println(containsKey);
		
		//vii.containsvalues (to check the value in map )
		System.out.println("\ncontainsValue :");
		boolean containsValue = m.containsValue("JAVA");
		System.out.println(containsValue);
		
		//viii.EntrySet ( Show the keys and values on console )
		System.out.println("\nEntrySet :");
        Set<Entry<Object,Object>> entrySet = m.entrySet();
        for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry);
		}
	}

}

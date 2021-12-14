package com.xworkz.Collection;
import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List arraylist=new ArrayList();
		System.out.println("Before adding the elements "+arraylist.isEmpty());
		arraylist.add("prathu");
		arraylist.add(20);
		arraylist.add(null);
		arraylist.add(80.05);
		arraylist.add('p');
		arraylist.add(20);
		System.out.println("The elements in Array List are "+arraylist);
		int size = arraylist.size();
		System.out.println("The size of the Array List is "+size);
		boolean contains = arraylist.contains(20);		
		System.out.println("Check's if the object is present in the Array List "+contains);
		int indexOf = arraylist.indexOf(80.05);
		System.out.println("The index of the object is "+indexOf);
		Object object = arraylist.get(4);
		System.out.println("The index of the object using get method is "+object);
		Object remove = arraylist.remove(5);
		System.out.println("object removed from Array List using index "+remove);
		boolean remove2 = arraylist.remove(null);
		System.out.println("object removed from Array List "+remove2);
	}

}

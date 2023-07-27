package com.collection.framework.end;

public class EnumerationVsIterator 
{
	public static void main(String...args)
	{
		/*
		 * ---------Enumeration--------
		 * from 1.0
		 * traverse the collection 
		 * can't do any modification while traversing in it
		 * enumeration is an legacy interface used to traverse the legacy classes
		 * vector hashtable stack concurrentHashmap
		 * method: hasMoreElements,nextElement()
		 * fail-safe in nature
		 * not safe and secure due to fail-safe nature 
		 */
		
		/*
		 * --------------Iterator--------------
		 * 1.2
		 * traverse in collection we can do modification
		 * remove()  hasNext()  next()
		 * fail-fast
		 * safe and secure
		 * all collection except vector hashtable stack concurrentHashMap 
		 * 
		 */
		
		/*
		 * -------------------fail fast iterators -----------
		 * immediately throw concurrentModificationException
		 * fail-fast doesn't tolerate any structural modification to a collection while iterating over it
		 * it won't throw any exception when the collection is modified by own iterators method like remove()
		 * 
		 * WORK:
		 * collection types maintain array of object
		 * internal flag called  modCount
		 * it will check everytime when we call next()
		 * 
		 * if modCount is updated after iteration then it throw
		 * concurrentModificationexception
		 * 
		 */
		
		
		
		/*
		 * -----------------------fail safe-------------
		 * not throw exception if a collection is modified while iterating
		 * operate on clone of the collection not on the actual collection
		 * drawbacks:
		 * 			time memory consume bcoz clone of the collection happened
		 * 			not up to date(modification not reflected in the existing collection) 
		 * 
		 */
	}

}

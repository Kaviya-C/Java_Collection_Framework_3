package com.collection.framework.end;

public class HashMapVSConcurrentHashMap 
{
	public static void main(String...args)
	{
		/*
		 * ---------------------HashMap----------------------
		 * key-value pair
		 * introduced in 1.2
		 * belongs to java.util package
		 * not synchronized
		 * if we make hashmap as synchronized using Collections.synchronizedMap()
		 * read remove add operation slow bcoz we externally make synchronized
		 * fail-fast in nature
		 * single thread application
		 * one null key multiple null values allowed
		 * implementation of map interface
		 * 
		 */
		
	
		/*
		 * ------------------------ConcurrentHashMap----------------
		 * from 1.5 v
		 * part of concurrency package java.util.concurrent
		 * it is alternative for hashTable
		 * internally synchronized ---> add delete internal synchronized 
		 * read not synchronized
		 * no null element are allowed
		 * fail-safe in nature
		 * multi threaded application 
		 */
	}

}

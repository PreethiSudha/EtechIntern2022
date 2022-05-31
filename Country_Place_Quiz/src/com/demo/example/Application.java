package com.demo.example;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static List<Streams> getStreams()
	{
		Streams stream = new Streams("USA", "Kansas City", 501957);
		Streams stream1 = new Streams ("India", "Chennai", 7090000);
		Streams stream2 = new Streams("USA", "Los Angeles", 3970000);
		Streams stream3 = new Streams("Nepal", "Kathmandu", 1000000);
		Streams stream4 = new Streams("India", "Kolkata", 14900000);
		Streams stream5 = new Streams("USA", "Denver", 706000);
	
	List<Streams> list = new ArrayList<>();
	
	list.add(stream);
	list.add(stream1);
	list.add(stream2);
	list.add(stream3);
	list.add(stream4);
	list.add(stream5);
	
	return list;

	}
	
}
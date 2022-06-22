/*
 * Assignment9
 *
 * Student name: Sarah Narayamy Tavares Silva
 * Student number: 2960992
 *
 *
 * Urban Explorers Problem
 * An urban explorer is a person who visits cities and explores them. Each time an explorer
 * visits a city they record its name. An explorer only visits a city once.
 * Two classes called Explorer and City are given. In each case they encapsulate a String that
 * represents the name of an explorer or the name of city.
 * An outline of the class UrbanExplorers is also given.
 * The data structure TreeMap<Explorer,TreeSet<City>> is used to model the relationship between
 * explorers and the cities already visited by them.
 * Your task is to complete the methods listed as part of the interface to this class.
 * In each case the signature and semantics of the method are given.
 * You must also complete a simple test of these methods.
 *
 */

import java.util.*;
public class Assignment9{
	public static void main(String args[]){
		// Sample data set. You should add more data to this list.
		UrbanExplorers exps = new UrbanExplorers();
		Explorer e1 = new Explorer("Nora");
		Explorer e2 = new Explorer("James");
		Explorer e3 = new Explorer("Joe");
		Explorer e4 = new Explorer("Carmel");
		Explorer e5 = new Explorer("Paddy");
		Explorer e6 = new Explorer("Martina");
		Explorer e7 = new Explorer("Sarah");
		Explorer e8 = new Explorer("Paula");
		
		City c1 = new City("Paris");
		City c2 = new City("London");
		City c3 = new City("Rome");
		City c4 = new City("Berlin");
		City c5 = new City("Barcelona");
		City c6 = new City("Madrid");
		City c7 = new City("Lyon");
		City c8 = new City("Amsterdam");
		City c9 = new City("Stockholm");
		City c10 = new City("Brugges");
		City c11 = new City("Malaga");
		City c12 = new City("Warsow");
		City c13 = new City("Edingburg");
		
		
		
		
		exps.add(e1,c1);
		exps.add(e2,c1);
		exps.add(e3,new TreeSet<City>(Arrays.asList(c2,c1,c3,c4)));
		exps.add(e4,new TreeSet<City>(Arrays.asList(c3,c1,c5,c4)));
		exps.add(e5,new TreeSet<City>(Arrays.asList(c2,c1,c6,c7)));
		exps.add(e6,new TreeSet<City>(Arrays.asList(c8,c1,c3,c4)));
		exps.add(e7,new TreeSet<City>(Arrays.asList(c2,c9,c10,c11)));
		exps.add(e8,new TreeSet<City>(Arrays.asList(c8,c1,c12,c13)));
		
		// Testing the list of the explorers
		System.out.println("########### Testing the list of all explorers ###########");
		System.out.println(exps.explorers());
		
		// Testing the list of the explorers
		System.out.println();
		System.out.println("########### Testing the list of all cities visited ###########");
		System.out.println(exps.citiesVisited());
		
		// Testing the list of cities visited by a explorers
		System.out.println();
		System.out.println("########### Testing the list of all cities visited by a explorer ###########");
		System.out.print(e4);
		System.out.print(" " + exps.listCities(e4));
		System.out.println();
		System.out.print(e5);
		System.out.print(" " + exps.listCities(e5));
		System.out.println();
		System.out.print(e7);
		System.out.print(" " + exps.listCities(e7));
		System.out.println();
		System.out.print(e8);
		System.out.print(" " + exps.listCities(e8));
		System.out.println();
		
		
		// Testing the list of explorers that has visited a city
		System.out.println();
		System.out.println("########### Testing the list of all explorers that visited a city ###########");
		System.out.print("Brugges");
		System.out.println(exps.listVisitors("Brugges"));
		System.out.print("London");
		System.out.println(exps.listVisitors("London"));
		System.out.print("Prague");
		System.out.println(exps.listVisitors("Prague"));
		System.out.print("Paris");
		System.out.println(exps.listVisitors("Paris"));
		
		// Testing the frequency of visits per city
		System.out.println();
		System.out.println("########### Testing the frequency of visits per city ###########");
		System.out.print(exps.visitsPerCity());
		
		
		
		
	}
}
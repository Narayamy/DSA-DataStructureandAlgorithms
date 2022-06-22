/*
 * Class Name: UrbanExplorers
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */
import java.util.*;
public class UrbanExplorers{
	private TreeMap<Explorer,TreeSet<City>> data;

	public UrbanExplorers(){
		data = new TreeMap<>();
	}

	//Add new explorer and 1 city
	public void add(Explorer p, City city){
	   if(data.containsKey(p)) {
		   data.get(p).add(city);
	   }
	   else {
		   TreeSet<City> temp = new TreeSet<>();
		   temp.add(city);
		   data.put(p, temp);
	   }
	}

	//Add new explorer together with a list of cities
	public void add(Explorer p, Set<City> cities){
		if(data.containsKey(p)) {
			data.get(p).addAll(cities);
		}
		else {
			data.put(p, new TreeSet<City>(cities));
		}
	
	}

	//list all explorers
	public Set<Explorer> explorers(){
		Set<Explorer> tmp = new TreeSet<>(data.keySet());
		return tmp;
	}

	//List all cities
	public Set<City> citiesVisited(){
		Set<City> tmp = new TreeSet<>();
		for(Explorer e: data.keySet()) {
			tmp.addAll(data.get(e));
		}
		return tmp;
	}

	//List cities visited by an explorer
	public Set<City> listCities(Explorer exp){
		if(data.containsKey(exp)) {
			return new TreeSet<City>(data.get(exp));
		}
		return new TreeSet<City>();
	}

	//List explorers that have visited a city
	public Set<Explorer> listVisitors(String c){
		TreeSet<Explorer> explorers = new TreeSet<>();
		City cc = new City(c);
		for(Explorer e: data.keySet()) {
			if (data.get(e).contains(cc))
				explorers.add(e);
		}
		return explorers;
	}

	//for each city list the frequency of visits 
	//to that city
	public Map<City,Integer> visitsPerCity(){
		List<City> temp = new ArrayList<>();
		for(TreeSet<City> cc: data.values()) {
			temp.addAll(cc);
		}
		Map<City, Integer> cFreq = new TreeMap<City, Integer>();
		for(City c: temp) {
			if(cFreq.containsKey(c)) {
				cFreq.put(c, cFreq.get(c)+1);
			}
			else {
				cFreq.put(c, 1);
			}
		}
		return cFreq;
	}
}
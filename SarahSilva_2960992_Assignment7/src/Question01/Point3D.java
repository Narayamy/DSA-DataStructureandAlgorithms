/*
 * Class Name: Point3D
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */
package Question01;

import java.util.*;
public class Point3D{
	private int x,y,z;

	Point3D(int a, int b, int c){
		x = a; y = b; z = c;
	}

	public int x(){
		return x;
	}

	public int y(){
		return y;
	}

	public int z(){
		return z;
	}

	public String toString(){
		return "("+x+","+y+","+z+")";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		result = prime * result + z;
		return result;
	}

	public boolean equals(Object ob){
		if(!(ob instanceof Point3D)) {
			return false;
		}
		Point3D point = (Point3D)ob;
		if(x() == point.x() && y() == point.y() && z() == point.z() ){
			return true;			
		}
		return false;
	}
}
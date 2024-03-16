package assignment11.prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key,Student> hashMap=new HashMap<>();
		for(Student student:students){
			hashMap.put(new Key(student.getFirstName(),student.getLastName()),student);
		}
		return hashMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
		double totalGpa=0;
		for(Map.Entry<Key,Student> entry:maps.entrySet()){
			totalGpa+=entry.getValue().getGpa();
		}
		return totalGpa/maps.size();
	}
}

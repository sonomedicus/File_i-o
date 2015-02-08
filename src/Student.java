
public class Student implements Comparable<Student>{
	private String name;
	private int score;
	@Override
	public String toString() {
		return  name +  " " + score ;
	}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}

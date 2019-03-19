
public enum calc {
	one,two, three;
	public String getGrade(){
		String grade= new String();
		switch(this){
		case one: grade="one";
		break;
		case two: grade="one";
		break;
		case three: grade="one";
		break;
		}
		return grade;
	}
	public static void main(String[] args) {
		System.out.println(three.getGrade());
	}
}

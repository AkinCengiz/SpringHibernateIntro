package education;

public class Student {
	private String name;
	private String no;
	private int classes;
	private Course[] courses;
	private double average;
	private boolean isPass;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getClasses() {
		return classes;
	}
	public void setClasses(int classes) {
		this.classes = classes;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage() {
		double toplam = 0;
		for(int i = 0; i < this.getCourses().length; i++)
		{
			toplam += this.getCourses()[i].getNote();
		}
		this.average = toplam / this.getCourses().length;
		if(average >= 60)
		{
			this.isPass=true;
		}
		else
		{
			this.isPass = false;
		}
		
	}
	public boolean getIsPass() {
		return isPass;
	}
	
	public Student(String name, String no, int classes, Course[] courses)
	{
		this.name = name;
		this.no = no;
		this.classes = classes;
		this.courses = courses;
//		this.courses[1] = courses[1];
//		this.courses[2] = courses[2];
//		this.average = average;
//		this.isPass = isPass;
	}
	void getStudentInfo()
	{
		String state;
		if(this.isPass)
		{
			state = "Geçti";
		}
		else
		{
			state = "Kaldý";
		}
		System.out.println("\n############################################################################################################\n\nÖðrenci Bilgileri\n************************************************************************************************************");
		System.out.println("Adý              : " + this.getName());
		System.out.println("Numarasý         : " + this.getNo());
		System.out.println("Sýnýfý           : " + this.getClasses());
		System.out.println("Not ortalamasý   : " + this.getAverage());
		System.out.println("Geçme durumu     : " + state);
		System.out.println("************************************************************************************************************");
	}
	
	void getStudentCourse()
	{
		
		for(var course : this.getCourses())
		{
			System.out.print("Öðrenci Ders Bilgileri ======>\t");
			System.out.print("Ders\t: " + course.getName() + "\tDers Kodu\t: " + course.getCode() + "\t\tNotu\t: " + course.getNote() + "\n"+course.getTeacher().teacherInfo());
		}
	}
	
}

package education;

public class EducationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher[] teachers = {
			new Teacher("Metin Sayı","101","Matematik"),
			new Teacher("Filiz Hızlı","102","Fizik"),
			new Teacher("Kiraz Deney","103","Kimya")
		};
		Course[] courses = {
			new Course("Matematik","Mat1","Mat",80,teachers[0]),
			new Course("Fizik","Fzk1","Fzk",35,teachers[1]),
			new Course("Kimya","Kmy1","Kmy",50,teachers[2])
		};
		
		Student student = new Student("Ali Veli","1",1,courses);
		student.setAverage();
		Student student2 = new Student("Ayşe Fatma","2",2, new Course[] {
			new Course("Matematik","Mat2","Mat",70,teachers[0]),
			new Course("Fizik","Fzk2","Fzk",95,teachers[1]),
			new Course("Kimya","Kmy2","Kmy",85,teachers[2])
		});
		student2.setAverage();
		
//		
		student.getStudentInfo();
		student.getStudentCourse();
		student2.getStudentInfo();
		student2.getStudentCourse();
//		
	}

}

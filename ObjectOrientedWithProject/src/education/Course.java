package education;

public class Course {
	private String name;
	private String code;
	private String prefix;
	private int note;
	private Teacher teacher;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Course(String name, String code, String prefix, int note, Teacher teacher)
	{
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = note;
		this.teacher = teacher;
	}

}

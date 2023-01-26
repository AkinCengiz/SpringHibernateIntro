package education;

public class Teacher {
	private String name;
	private String mobilPhone;
	private String branch;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMpNo() {
		return mobilPhone;
	}
	public void setMpNo(String mpNo) {
		this.mobilPhone = mpNo;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public Teacher(String name, String mpNo, String branch)
	{
		this.name = name;
		this.mobilPhone = mpNo;
		this.branch = branch;
	}
	
	public String teacherInfo()
	{
		return "\nDersin Öðretmeni ============>\tAdý\t: " + this.name + "\tTelefon No\t: " + this.mobilPhone + "\tBranþý\t: " + this.branch+"\n************************************************************************************************************\n";
	}
}

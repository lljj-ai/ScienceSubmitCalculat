package nuc.edu.cn.pojo;

import java.util.List;

public class University {
    private int universityId;//学校编号
    private String universityName;//学校名称
    private String universityGrade;//学校等级
    private String universityType;//学校类型
    private List<Department> department;
	public int getUniversityId() {
		return universityId;
	}
	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getUniversityGrade() {
		return universityGrade;
	}
	public void setUniversityGrade(String universityGrade) {
		this.universityGrade = universityGrade;
	}
	public String getUniversityType() {
		return universityType;
	}
	public void setUniversityType(String universityType) {
		this.universityType = universityType;
	}
	public List<Department> getDepartment() {
		return department;
	}
	public void setDepartment(List<Department> department) {
		this.department = department;
	}
	public University() {
		super();
	}
	public University(String universityName, String universityGrade, String universityType) {
		super();
		this.universityName = universityName;
		this.universityGrade = universityGrade;
		this.universityType = universityType;
	}
	public University(Integer universityId, String universityName, String universityGrade, String universityType) {
		super();
		this.universityId = universityId;
		this.universityName = universityName;
		this.universityGrade = universityGrade;
		this.universityType = universityType;
	}
}

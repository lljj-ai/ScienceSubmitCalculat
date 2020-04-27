package nuc.edu.cn.pojo;

import java.util.List;

public class Department {
    private int departmentId;//学院id
    private String departmentName;//学院名称
    private String departmentType;//学院类型
    private int universityId;//学校id
    private String universityName;//学校名字
    private List<Teacher> teacher;
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentType() {
		return departmentType;
	}
	public void setDepartmentType(String departmentType) {
		this.departmentType = departmentType;
	}
	public int getUniversityId() {
		return universityId;
	}
	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}
	public List<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}
	public Department() {
		super();
	}
	public Department(String departmentName, String departmentType, Integer universityId) {
		super();
		this.departmentName = departmentName;
		this.departmentType = departmentType;
		this.universityId = universityId;
	}
	public Department( String departmentName, String departmentType, Integer universityId,Integer departmentId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentType = departmentType;
		this.universityId = universityId;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
}

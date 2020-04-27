package nuc.edu.cn.pojo;

import java.util.List;

public class Teacher {
	private int teacherId;//教师编号
    private String teacherName;//教师姓名
    private int universityId;//学校编号
    private int departmentId;//学院编号
    private String universityName;//学校名称
	private String departmentName;//学院名称
	private String email;//邮箱
    private String phoneNum;//联系方式
	private String teacherGrade;//教师职称
    private String password;//教师密码
    private List<TeacherAndPaper> teacherAndPaper;
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getTeacherGrade() {
		return teacherGrade;
	}
	public void setTeacherGrade(String teacherGrade) {
		this.teacherGrade = teacherGrade;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUniversityId() {
		return universityId;
	}
	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}
	public List<TeacherAndPaper> getTeacherAndPaper() {
		return teacherAndPaper;
	}
	public void setTeacherAndPaper(List<TeacherAndPaper> teacherAndPaper) {
		this.teacherAndPaper = teacherAndPaper;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
    public Teacher() {
		super();
	}
    public Teacher(int teacherId) {
		super();
		this.teacherId = teacherId;
	}
	public Teacher(int teacherId, String password) {
		super();
		this.teacherId = teacherId;
		this.password = password;
	}
	public Teacher(String email, String phoneNum) {
		super();
		this.email = email;
		this.phoneNum = phoneNum;
	}
	public Teacher(int teacherId, String phoneNum, String email) {
		super();
		this.teacherId = teacherId;
		this.email = email;
		this.phoneNum = phoneNum;
	}
	public Teacher(int teacherId,String teacherName,int universityId,int departmentId) {
		super();
		this.teacherId=teacherId;
		this.teacherName=teacherName;
		this.universityId=universityId;
		this.departmentId=departmentId;
	}
	public Teacher(int teacherId, String teacherName, int universityId, int departmentId, String email, String phoneNum,
			String teacherGrade, String password) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.universityId = universityId;
		this.departmentId = departmentId;
		this.email = email;
		this.phoneNum = phoneNum;
		this.teacherGrade = teacherGrade;
		this.password = password;
	}
	public Teacher(String teacherName,String password,int universityId,int departmentId,
    		String email,String phoneNum,String teacherGrade) {
		super();
		this.password=password;
		this.teacherName=teacherName;
		this.universityId=universityId;
		this.departmentId=departmentId;
		this.email=email;
		this.phoneNum=phoneNum;
		this.teacherGrade=teacherGrade;
	}
}

package nuc.edu.cn.pojo;

public class Manager {
    private int managerId;//管理员id
    private String managerName;//管理员姓名
    private String email;//管理员email
    private String phoneNum;//管理员电话
    private String password;//管理员密码
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(int managerId, String password) {
		super();
		this.managerId = managerId;
		this.password = password;
	}
	public Manager(String managerName, String email, String phoneNum, String password) {
		super();
		this.managerName = managerName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.password = password;
	}
	
}

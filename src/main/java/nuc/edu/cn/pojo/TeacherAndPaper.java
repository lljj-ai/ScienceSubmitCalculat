package nuc.edu.cn.pojo;

public class TeacherAndPaper {
	private int id;//记录id
    private int teacherId;//教师id
    private int paperId;//论文id
	private Paper paper;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public int getPaperId() {
		return paperId;
	}
	public void setPaperId(int paperId) {
		this.paperId = paperId;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	public TeacherAndPaper() {
		super();
	}
    public TeacherAndPaper(int teacherId, int paperId) {
		super();
		this.teacherId = teacherId;
		this.paperId = paperId;
	}
}

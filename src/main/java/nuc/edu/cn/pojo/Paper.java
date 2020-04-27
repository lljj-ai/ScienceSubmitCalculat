package nuc.edu.cn.pojo;

public class Paper {
	private int paperId;//论文id
    private String paperName;//论文名称
    private String language;//论文语种
    private int subjectClassId;//学科门类
    private String projectSourceId;//项目来源
	private int projectId;//所属项目
    private String researchType;//研究类别
    private String magazineName;//刊物名称
    private String magazineGrade;//刊物级别
    private String country;//国别
    private int count;//数量
	public int getPaperId() {
		return paperId;
	}
	public void setPaperId(int paperId) {
		this.paperId = paperId;
	}
	public String getPaperName() {
		return paperName;
	}
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getProjectSourceId() {
		return projectSourceId;
	}
	public void setProjectSourceId(String projectSourceId) {
		this.projectSourceId = projectSourceId;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getResearchType() {
		return researchType;
	}
	public void setResearchType(String researchType) {
		this.researchType = researchType;
	}
	public String getMagazineName() {
		return magazineName;
	}
	public void setMagazineName(String magazineName) {
		this.magazineName = magazineName;
	}
	public String getMagazineGrade() {
		return magazineGrade;
	}
	public void setMagazineGrade(String magazineGrade) {
		this.magazineGrade = magazineGrade;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getSubjectClassId() {
		return subjectClassId;
	}
	public void setSubjectClassId(int subjectClassId) {
		this.subjectClassId = subjectClassId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
      public Paper(String paperName) {
		super();
		this.paperName = paperName;
	}
	public Paper() {
  		super();
  	}
    public Paper(int count) {
		super();
		this.count = count;
	}
	public Paper(String paperName, String language, int subjectClassId, String projectSourceId, int projectId,
			String researchType, String magazineName, String magazineGrade, String country) {
		super();
		this.paperName = paperName;
		this.language = language;
		this.subjectClassId = subjectClassId;
		this.projectSourceId = projectSourceId;
		this.projectId = projectId;
		this.researchType = researchType;
		this.magazineName = magazineName;
		this.magazineGrade = magazineGrade;
		this.country = country;
	} 
}

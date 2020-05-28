package ringo.bean;

public class Student {
	private int FlowId;
	private int levelType;
	private String idCard;
	private String examCard;
	private String studentName;
	private String location;
	private int grade;
	
	public Student() {
		super();
	}

	public Student(int flowId, int levelType, String idCard, String examCard, String studentName, String location,
			int grade) {
		super();
		FlowId = flowId;
		this.levelType = levelType;
		this.idCard = idCard;
		this.examCard = examCard;
		this.studentName = studentName;
		this.location = location;
		this.grade = grade;
	}

	public int getFlowId() {
		return FlowId;
	}

	public void setFlowId(int flowId) {
		FlowId = flowId;
	}

	public int getLevelType() {
		return levelType;
	}

	public void setLevelType(int levelType) {
		this.levelType = levelType;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getExamCard() {
		return examCard;
	}

	public void setExamCard(String examCard) {
		this.examCard = examCard;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

//	@Override
//	public String toString() {
//		return "Student [FlowId=" + FlowId + ", levelType=" + levelType + ", idCard=" + idCard + ", examCard="
//				+ examCard + ", studentName=" + studentName + ", location=" + location + ", grade=" + grade + "]";
//	}
	
	@Override
	public String toString() {
		return "========查询结果========\n"  +
				"流水号：" + FlowId +
				"\n四级/六级：" + levelType +
				"\n身份证号：" + idCard +
				"\n准考证号：" + examCard +
				"\n学生姓名：" + studentName +
				"\n区域：" + location +
				"\n成绩：" + grade;
	}
}

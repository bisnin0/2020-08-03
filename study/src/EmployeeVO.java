
public class EmployeeVO {
	private int num;  //사원번호
	private String name; //사원이름
	private String tel; //사원 전화번호
	private String department; //사원 주소
	private String position; //사원 직급
	
	/////////////// 공통모듈이라고 부름
	
	/////////////// getter setter 쉽게 만드려면 마우스 우클릭하고  source에서 제네레이트 게터세터 
	

	
	public EmployeeVO() {
	}
	
	public EmployeeVO(int num, String name, String tel, String department, String position) {  //이 형식대로 입력하면 다 입력된다.
		this.num=num;
		this.name=name;
		this.tel=tel;
		this.department=department;
		this.position=position;
	}
	public void output() { //출력
		System.out.printf("%4d %6s %15s %6s %6s\n", num, name, tel, department, position);
	}
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	
	

}

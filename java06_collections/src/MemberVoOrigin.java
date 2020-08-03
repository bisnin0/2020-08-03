


public class MemberVoOrigin {
	//번호, 이름, 연락처, 이메일
	//보통 Vo는 접근제한자 범위가 제일 작은걸로 만들어준다. 
	//= 외부에서 마음대로 접근 못하게 = 캡슐화, 정보은닉
	private int num;
	private String name;
	private String tel;
	private String email;
	
	public MemberVoOrigin() {
		
	}
	
	public MemberVoOrigin(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public MemberVoOrigin(int num, String name, String tel, String email) {
		//this.num = num;
		//this.name = name+"님"; //필요하면 이렇게 추가할 수 있다.
		//위에 메소드 (int num, Strin name) 을 추가 했기때문에 바로 위랑 겹친다.
		//다른생성자 호출하는 방법
		this(num, name); //첫번째로 생성해줘야함
		this.tel = tel;
		this.email = email;
	} //이걸 하는 이유 = 이렇게 하지 않으면 아래 써논걸 하나하나 모두 호출해야한다.
	
	public void print() {
		System.out.println(num+","+name+","+tel+","+email);
	}

	
	//번호를 외부에서 가져갈 수 있는 메소드
	//getter, setter
	public int getNum() {
		return num;  //이건 같은 클래스라 private를 호출 가능하다.
	} //값을 아웃풋 시키는 메소드 하나
	
	
	public void setNum(int num) { //값을 수정하는거라 반환형없다. 외부에서 데이터를 받아오기때문에 매개변수 입력해야한다.
		this.num = num;  //값을 수정할 수 있는 메소드. 이게 없다면 외부에서 데이터를 변경하지 못한다.
	} //값을 변경시키는 메소드 하다.
	
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
	

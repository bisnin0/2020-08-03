import java.util.HashMap;

public class Login {
	private String userid="admin";   //유저아이디
	private String userpwd="1234";   //유저비밀번호

	public Login() {
		
	}

	public boolean empCheck(String userid, String userpwd) { //아이디와 비밀번호를 매개변수로 받아서 여기서 맞는지 틀렸는지 리턴해주는것
//		if(!this.userid.equals(userid) || !this.userpwd.equals(userpwd)) {  //this 앞에 !부정 확인. '같지 않다'.. 둘중에 하나라도 같지 않으면
																			//그냥 보기 편한걸로 만들면 아래같다.
		if(this.userid.equals(userid) && this.userpwd.equals(userpwd)) {  
			return true; //로그인 성공
		}else {
			return false; // 로그인 실패
		}
	}
	
	/////////////// 입력되어있는 데이터 목록.. HashMap데이터 hm에는 '이름'과 EmployeeVO에 등록되어있는 정보가 입력된다. 이걸 "이름(String)"으로  호출하면 사원 데이터가 출력된다. 
	public static HashMap<String, EmployeeVO> setEmp() {  //static이면 객체 없이 바로 셋팅가능. 데이터를 HashMap에 리턴해준다.
		HashMap<String, EmployeeVO> hm = new HashMap<String, EmployeeVO>();
		hm.put("홍길동", new EmployeeVO(100,"홍길동","010-1111-2222","기획부","과장"));  //사번, 이름, 전번, 부서, 직급
		hm.put("이순신", new EmployeeVO(200,"이순신","010-5555-5555","인사부","사원"));
		hm.put("강감찬", new EmployeeVO(500,"강감찬","010-9999-9999","총무부","부장"));
		hm.put("장영실", new EmployeeVO(300,"장영실","010-7777-7777","영업부","대리"));
		hm.put("유승룡", new EmployeeVO(700,"유승룡","010-8888-8888","총무부","사원"));
		return hm;
		
	}

}

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

//�߰��Ұ�. ȸ�����Խ� ��ȭ��ȣ �̸��� �ߺ�Ȯ��

public class LibraryStart {
	Scanner scan = new Scanner(System.in);
	HashMap<String, BookListVO> list = new HashMap<String, BookListVO>();
	HashMap<String, MemberVO> list2 = new HashMap<String, MemberVO>();
	Login login = new Login();
	int membernum = 6; //��� �ѹ� �Է�
	String userid;
	String userpwd;

	
	public LibraryStart() {
		int loginCnt = 0; //�α��� Ƚ��
		list = BookList.setBook(); //������� Ȯ�� �ʱ�ȭ.. ��ġ�̵�?
		list2 = MemberList.setMemberList();
		a:
		do {//��ȸ�� �ѷ�����
			
			String menu = conInput("1.�������   2.�����˻�   3.�α���   4.ȸ������   5.����");
			if(menu.equals("1")) { //1. ������� ȣ��
				System.out.println("|���� ��ȣ|          ������                  |    ����        |���� �⵵|  �帣    |  ��ġ����    |");
				bookList(); 
			}else if(menu.equals("2")) { //2. �����˻�
				bookListSearch();
			}else if(menu.equals("3")) { //3. �α���
				do {
//					String userid = conInput("���̵� �Է�");
					memberlogin();  //ȸ�� ������ �̿��� �α���
					String userpwd = conInput("�н����� �Է�");
//�α��� ��ü ���� �����غ�					Login login = new Login();
					if(login.memberCheck(userid, userpwd)) {
	//					b:  //�Ϲ�ȸ���α���
						do { //�Ϲ�ȸ��
							String menu2 = conInput("1.�������   2.�����˻�   3.���������û   4.�����ݳ�   5.������Ȳ   6.������������   7.�α׾ƿ�   8.ȸ��Ż��   9.����");
							if(menu2.equals("1")) { //1. ������� ȣ��
								System.out.println("|���� ��ȣ|          ������                  |    ����        |���� �⵵|  �帣    |  ��ġ����    |");
								bookList(); 
							}else if(menu2.equals("2")) { //2. �����˻�
								bookListSearch();
							}else if(menu2.equals("3")) { //3. �����û
								//��� �޾Ƽ� ���������� �ٲٰ�, ������Ȳ�� �߰�.
								bookrent();
								
							}							
							
						}while(true); //�Ϲ�ȸ�� �α��� ��
					}else if(login.adminCheck(userid, userpwd)){//������ �α���
	//					c: //�����ڷα���
							do {   
								String menu3 = conInput("1.�������   2.�����˻�   3.�����߰�   4.������ ������Ȳ   5.ȸ�����   6.ȸ������   7.�α׾ƿ�   8.����");			
							
								
							}while(true);//������ �α��� ��
					}
					loginCnt++;
					System.out.println("���̵� ��й�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
					if(loginCnt>=3) { //���̵� ��й�ȣ 3ȸ �߸� �Է½� ���α׷� ���� 
						System.out.println("���α׷��� �����մϴ�.");
						System.exit(0);
					}
				}while(true);
			}else if(menu.equals("4")) {
				memberInsert(); //ȸ�� ����
			}else if(menu.equals("5")) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			

		}while(true);// ��ȸ�� �ѷ����� ��
	}
	//ȸ�� ������ �̿��� �α���.
	//���̵� �Է¹����� �Է¹��� ���̵� ȸ�������� ������ ���� �ִ��� ã�� ������ ȸ�������� �ִ� ���̵�� �н����带 �α��� Ŭ������ ���
	//������ ���̵� �Է¹����� ������ �α��� â���� �Ѿ.
	public void memberlogin() { 
		String id = conInput("���̵� �Է��ϼ���");
		do {
			if(id.equals("admin")){
				userid = "admin";
				break;
			}
			MemberVO vo = list2.get(id);		
			if(vo!=null) {
				login.setUserid(id);
				String pass = vo.getPass();
				login.setUserpwd(pass);
				userid = id;				
				break;
			} 
		}while(true);
	}

	
	//ȸ�� ����
	public void memberInsert() {
		do {
			int num = membernum;
			//num, id, pass, name, address, tel, email);
			String id = conInput("���̵� �Է�(�ִ� 10�ڸ�)");  //10�ڸ� Ȯ��
			MemberVO vo = list2.get(id);
			if(vo!=null) {
				System.out.println("�̹� ������ ���̵� �ֽ��ϴ�.");
				break;
			}else {
				String pass = conInput("�н����� �Է�(�ִ� 10�ڸ�)");  //10�ڸ� �Ѿ�� ����ǥ��
				String name = conInput("�̸� �Է�");
				String address = conInput("�ּ� �Է�(��������)");
				String tel = conInput("��ȭ��ȣ �Է�"); //�ߺ� Ȯ�� �غ���
				bb();
				String email = conInput("Email �Է�"); //�ߺ� Ȯ�� �غ���
				
				MemberVO vo3 = new MemberVO(num, id, pass, name, address, tel, email);
				list2.put(id, vo3);
				membernum++;
				memberList();
				break;
			}
		}while(true);
	}
	
	
	//���� ���̵�� ��ȭ��ȣ �̸����߿� ������ ������ �̹� ������ �ֽ��ϴ� ����ϰ� �ٽù���Ը����

	
	//���� �����ϱ�
	public void bookrent() {
		do {
			String name = conInput("������ ������");
			BookListVO vo = list.get(name);
			if(vo!=null) {
				String rent = conInput("�����Ͻðڽ��ϱ�?(1:��, 2:�ƴϿ�)");
					if(rent.equals("1")) {
						vo.setRental("�뿩��");
						break;
					}else if(rent.equals("2")) {
						break;
					}
			}
		}while(true);
	}
	
	//�ߺ��˻� //�迭�־ �˻��ϴ¹�������?
	public void bb() {


		
//		do {
//			String name = conInput(msg);
//			BookListVO vo = list.get(name);
//			if(vo!=null) {
//				
				
				
//				String rent = conInput("�����Ͻðڽ��ϱ�?(1:��, 2:�ƴϿ�)");
//					if(rent.equals("1")) {
//						vo.setRental("�뿩��");
//						break;
//					}else if(rent.equals("2")) {
//						break;
//					}

					

//					Iterator<MemberVO> ii = valueList.iterator();
//					while(ii.hasNext()) {
//						if(msg.equals("ii")) {
//							System.out.println("�뿩��");
////							break
//					}
//				}						
//			}
//		}while(true);
	}
	
	

	
	//�ߺ�Ȯ��


	//���� �˻� 
	public void bookListSearch() {
		String book = conInput("�������� �Է��ϼ��� ");
		BookListVO bl = list.get(book);
		bl.print();
	}


	//�Է� ���
	public String conInput(String msg) {
		System.out.print(msg + "=");
		return scan.nextLine();
	}
	
	
	//ȸ�� ��� ȣ��
	public void memberList() {
		Collection<MemberVO> valueList = list2.values();
		Iterator<MemberVO> ii = valueList.iterator();
		while(ii.hasNext()) {
			ii.next().output();
		}
	}	
	
	
	//���� ��� ȣ��
	public void bookList() {
		Collection<BookListVO> valueList = list.values();
		Iterator<BookListVO> ii = valueList.iterator();
		while(ii.hasNext()) {
			ii.next().output();
		}
	}

	public static void main(String[] args) {
		new LibraryStart();

		
	}


}

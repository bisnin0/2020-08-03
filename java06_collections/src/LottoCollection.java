
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class LottoCollection {

	Random ran = new Random();
	Vector<Integer> vector = new Vector<Integer>();
	HashSet<Integer> set1 = new HashSet<Integer>();
	TreeSet<Integer> ts = new TreeSet<Integer>();
	Scanner sc = new Scanner(System.in);
	int choice = 0;
	int num;
	int cnt;
	int q = 1;

	public LottoCollection() {
	}

	public void playLotto() { // 게임 시작 및 종료
		do {
			int num = insertRounds();
			gameRounds(num);
			try {
				if (q == 1) {
					choice = askMore();
				}
			} catch (InputMismatchException ime2) {
				System.out.println("숫자를 입력하여야 합니다...");

			}
			cnt = 0;
		} while (choice == 1);
		if (choice >= 3 || choice == 0) {
			System.out.println("잘못 입력 하셨습니다.");
		}
		System.out.println("게임이 종료 되었습니다.");

	}

	public int insertRounds() { //몇번 할건지 결정
		try {
			System.out.print("몇번 게임을 하시겠습니까? =");
			num = sc.nextInt(); 
		} catch (InputMismatchException ime) {
			System.out.println("숫자를 입력하여야 합니다...");
			q++;
		}
		return num;
	}

	public void gameRounds(int num) { // 게임 수
		for (int i = 0; i < num; i++) {
			cnt++;
			produceNumber();

		}
	}

	public void produceNumber() {
		do { // vector로 값 생성하고 hashset에 대입해서 중복 값 확인. hashset size가 7 이하면 재실행
			vector.clear();
			set1.clear();
			for (int i = 0; i < 7; i++) {
				vector.addElement(ran.nextInt(45) + 1);
			}

			for (int i = 0; i < 7; i++) {
				set1.add(vector.elementAt(i));
			}
		} while (set1.size() < 7);
		arrangeNumber();
	}

	public void arrangeNumber() {
		sortNumber();
		printNumber();
	}

	public void sortNumber() { // treeset에 vector 0~5번까지 입력
		ts.clear();
		for (int i = 0; i < 6; i++) {
			ts.add(vector.elementAt(i));
		}
	}

	public void printNumber() { //treeset으로  오름차순 출력 후 vector 6번 보너스 번호 출력

		Iterator<Integer> result = ts.iterator();
		System.out.print(cnt + "게임 = ");
		while (result.hasNext()) {
			System.out.print(result.next() + " ");
		}

		System.out.print("bonus = " + vector.elementAt(6));
		System.out.println();

	}

	public int askMore() {
		
		System.out.print("계속하시겠습니까?(1:예, 2:아니오)");
		choice = sc.nextInt();
		return choice;

	}
	public static void main(String[] args) {

		LottoCollection lott = new LottoCollection();
		lott.playLotto();
	}

}

//배열사용금지 arraylist
//예외처리
//오름차순정렬 treeset  .. 이중에서 몇번째 자료 하나 뽑아서 보너스로
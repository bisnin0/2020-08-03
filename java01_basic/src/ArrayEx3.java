import java.util.Scanner;
class ArrayEx3
{
	public static void main(String[] args) 
	{


//안풀려서 예제 참고 


		int num[] = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.print("임의의 수 = ");
        int end = sc.nextInt();

        for (int i=1 ; i<=end ; i++)
        {
            num[i%10]++;
            if(i>9)
                num[(i/10)%10]++;
            if(i>99)
                num[(i/100)%10]++;
            if(i>999)
                num[(i/1000)%10]++;
            if(i>9999)
                num[(i/10000)%10]++;
            if(i>99999)
	            num[(i/100000)%10]++;
            if(i>999999)
	            num[(i/1000000)%10]++;
		}

        for(int i=0 ; i<num.length ; i++)
            System.out.println(i + "의 개수 : " + num[i]);




	}
}
/* 100
임의의수 ex)1000을 입력했을때
1~1000까지
1이 몇개인지 구하기
배열




*/

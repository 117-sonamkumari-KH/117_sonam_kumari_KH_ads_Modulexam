//Q3. java program to implement two stack in one array.
	
import java.util.*;
	class TwoStack{
	int size;
	int top1,top2;
	int[] arr = new int[10];
	
	TwoStack(){
	int n =10;
	size = n;
	top1 = -1;
	top2 = size;
	}
	public static void main(String...args);{
		Scanner sc = new Scanner(System.in
		int T = sc.nextInt();
		while(T>0){
			TwoStack ts = new TwoStack();
			int Q = sc.nextInt();
			while(T>0){
				int StackNo = sc.nextInt();
				int QueryT = sc.nextInt();
				Stack g = new Stack();
				if(QueryT == 1){
					int a = sc.nextInt();
					if(StackNo ==1)
						g.push(a,sq);
					else If(StackNo == 2)
						g.push(a,sq);
				}
				else if(QueryT == 2){
					if(StackNo ==1)
						System.out.println(g.pop1(sq)+"");
					else if(StackNo ==2)
					System.out.println(g.pop2(sq)+"");	
				}
				Q--
			}
			System.out.println();
			t--
		}
	}
	
	
	}
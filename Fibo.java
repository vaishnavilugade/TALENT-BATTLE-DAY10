import java.util.*;
class Fibo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,p=0,q=1,r;
		
		System.out.println("Enter the number:");
		n=sc.nextInt();
		if(n>0){
			while(q<n){
				r=p+q;
				p=q;
				q=r;
				if(q<=n){
					System.out.println(q);
				}
			}
		}
	}
}
			

			
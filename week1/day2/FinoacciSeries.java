package week1.day2;

public class FinoacciSeries {
	public void fibonacci(){
		int n1=0, n2=1;
		for(int i=0;i<=10;i++) {
			System.out.println(n1);
				int n3 = n1+n2;
				
				n1=n2;
				n2=n3;
				
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FinoacciSeries fs = new FinoacciSeries();
fs.fibonacci();
}
}

//int i=0;
//int j=1;
//int f=i+j;
//int s=f;
//s+f
import java.util.*;
public class simple_prime{

    public static void main(String[]args){
    	Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();

		for(int i=start;i<=end;i++){
			if(i%2==0 || i%3==0 || i%5==0 && (i!=2 && i!=5 && i!=3)){
				continue;
    		}
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					break;
				}
    		}
			System.out.print(i+", ");	

		}
		sc.close();
		System.out.println("");
	}
}
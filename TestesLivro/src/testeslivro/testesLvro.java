package testeslivro;


/*

public class testesLvro {

	public static void main(String[] args) {
		double gallons, liters;
		int counter;
		counter = 0;

		for (gallons = 1; gallons <= 30; gallons++) {

			liters = gallons * 3.7854;
			System.out.println(gallons + " gallons is " + liters + " liters");

			counter++;
			if (counter == 10) {
				System.out.println();
				counter = 0;
			}

		}

		int x;
		for(x=0; x<5; x++) {
			int y= -1;
			System.out.println("y é: "+ y);
			y= 100;
			System.out.println("y agora é: "+ y);
			
		}
		int n, d, q;
		n=10;
		d=2;
		
		if(d!=0 & (n%d==0))
			System.out.println(d + " is a factor of " +n);
		
		
		
		System.out.println("I'm thinking a letter between a and z");
		System.out.print("Can you guess it:\n");
		Scanner sc = new Scanner(System.in);
		char chr, answer ='k';
		chr = (char) System.in.read();
				
		if(chr == answer) System.out.println("**RIGHT**");
		else{System.out.println("..Sorry You're wrong...");		
		if( chr < answer) System.out.println("too low");
		else System.out.println("too hight");
		}
		
		
		int x;
	
		for(x=0; x<6; x++){
			if(x==1) System.out.println("x is one");
			else if(x==2)System.out.println("x is two");
			else if(x==3)System.out.println("x is three");
			else if(x==4)System.out.println("x is four");
			else if(x==5)System.out.println("x is five");
			else System.out.println("x is not betweem 1 a 5");
									
		}
		
		int i;
		for(i=0; i<6; i++)
			switch(i) {
			case 0:
				System.out.println("i is 0");
				break;
			case 1:
				System.out.println("i is 1");
				break;
			case 2:
				System.out.println("i is 2");
				break;
			case 3:
				System.out.println("i is 3");
				break;
			case 4:
				System.out.println("i is 4");
				break;
				default:
				System.out.println("x is five or more");
			
				
			}
		
		
		double num, sroot, rerr;
		
		for(num = 1.0; num < 100; num++) {
			sroot = Math.sqrt(num);
			System.out.println("Square root of "+ num + " is "+ sroot);
			rerr = num - (sroot*sroot);
			System.out.println("Rounding error is: " + rerr);
			System.out.println();
		
		}
		
		int d;
		for(d=100; d>=-100; d-=5) {
			System.out.println(d);
		}
		
		
		int i, j;
		for(i=0, j=10; i<=j; i++, j--) {
			System.out.println("i and j: "+i+ " "+j);
		}
		
		
		int p;
		System.out.println("Press 's' to stop");
	//	for(p=0; (char)System.in.read() != 's'; p++) {
			System.out.println("Pass # " +p);
		}
			
		
		int s;
		int sum = 0;
		
		for(s = 1; s <=5; sum += s++ )
			System.out.println("Sum is: " +sum);
		
		
		char ch = 'a';
				while(ch <= 'z') {
					System.out.println("Letra: " + ch);
					ch++;
				}
			
		int e, result;
		for(int i = 0; i <=10; i++) {
			result = 1;
			e = i;
			while(e > 0) {
				result *= 2;
				e--;
			}
				System.out.println("2 to the " + i + " power is: " + result);
		
		}
		
						
		int count, res;
		for(int i = 0; i <= 10; i++) {
			res = 1;
			count = 1;
			
			while(count <= i) {
				res *= 2;
				count++;
			}
			
			System.out.println("2 to the " + i + " power is: " + res);
		} 
		int num;
		num = 100;
		for(int i = 0; i <=num; i++) {
			if(i*i > num) break;
			System.out.println(i + " ");
		}
		System.out.println("Loop complete");
		
		int f;
		for(f = 0; f < 100; f++) {
			if((f%2)== 0)
			System.out.println(f);
		}
		
		
		for(int i =2; i <= 10; i++) {
		System.out.print("Factor of: " + i + ";");
		for(int j = 2; j < i; j++)
			if((i%j)==0)
				System.out.print(j + " ");
		System.out.println();		
		}
/*

		char ch = 'a';
		while(ch <= 'z') {
			System.out.println("Letra: " + ch + " Maiúscula: " +(char) (ch-32));
			ch++;
		}
		
		
			
		int nums[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		int sum = 0;
		for(int x : nums) {                            // LACO FOR ESTILO FOR-EACH *********
	
			System.out.println("Value is: " + x);
		sum += x;
		if(x == 6)break;								// Pode ser usado a expressao break para quebar um laco.
	}
		System.out.println("Summation is:" + sum);
	
										// STRINGS*********
		
		String str1 = "When it comes to web programming, java is #1";
		String str2 = new String(str1);
		String str3 = "Java string are powerfull";
	int result, idx;
		char ch;
		System.out.println("Length of str1: "+ str1.length());
		
		for(int i = 0; i < str1.length(); i++)
		System.out.print(str1.charAt(i));
		System.out.println();
		if	(str1.equals(str2))
		System.out.println("str1 equals str2");
		else
		System.out.println("str1 does not equal str2");
		if(str1.equals(str3))
			System.out.println("str1 equals str3");
			else
			System.out.println("str1 does not equal str3");
		result = str1.compareTo(str3);
		if(result == 0)
			System.out.println("str1 end str3 are equals");
		else if( result < 0)
			System.out.println("str1 is less than str3");
		else
			System.out.println("str1 is greater than str3");
		
		str2 = "One two three one";     // Novo valor de str2
	//	idx = str2.indexOf("One");
	//	System.out.println("Index of first occurence of one: " + idx);
	//	idx = str2.lastIndexOf("One");
	//	System.out.println("Index of last occurence of one: " + idx);
		
		str1 = "One";
		str2 = "Two";
		str3 = "Three";
		String str4 = str1 + str2 + str3;
		System.out.println(str4);
		
		String orgstr = "Java makes the web move";
		String substr = orgstr.substring(5, 18);
		System.out.println("Orgstr: " + orgstr);
		System.out.println("Substr: " + substr);
		

}

}

		class Test{
			int a, b;
			Test(int i, int j){
				a = i;
				b = j;
		}
			
			void change(Test ob) {
				ob.a = ob.a + ob.b;
				ob.b = -ob.b;
			}
		
		}
		
		class PassObRef{
			
			 public static void main(String[] args) {		
				Test ob = new Test(15,20);
				System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
				
				ob.change(ob);
				System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
				}
				}


		


class Factorial{
	
	int FactR(int n) {
		int result;
		if(n == 1)return 1;
		result = FactR(n - 1)* n;
		return result;
	}
	int FactI(int n) {
		int t, result;
		result = 1;
		for(t=1; t <= n; t++) ;
			result = t *= t;		
			return result;
			
	}
}
		*/
		
		
		
		
			
			
		


package arrays;

public class Arrays {

	public static void main(String[] args) {
/*
int sample[] = new int[10];
int i;
for(i = 0; i < 10; i++)
	
	sample[i]= i;
for(i = 0; i < 10; i++)
	System.out.println("This is sample ["+i+"] " + (i));
	System.out.println();
		
		int nums[] = new int[10];  // NAO PRECISA OPERADOR NEW *******************************
		int min, max;
		
		nums[0] = -99;
		nums[1] = 10283;
		nums[2] = 63;
		nums[3] = -257;
		nums[4] = 102;      // FORMA INICIAL
		nums[5] = 858;
		nums[6] = 10230;
		nums[7] = 754;
		nums[8] = 912;
		nums[9] = -25;
		
		min = max = nums[0];
		for(int i1 = 1; i1 <10; i1++) {
			if(nums [i1] < min) min = nums[i1];
			if(nums [i1] > max) max = nums[i1];
		}
		
		System.out.println("min and max: " + min + " , "+ max);
		
		
		int nums1[] = { 99,10282,63,-256,102,858,10230,754,912,-25}; // FORMA SIMPLIFICADA PARA MIN/MAX

		min = max = nums1[0];
		for(int i1 = 1; i1 <10; i1++) {
			if(nums1 [i1] < min) min = nums1[i1];
			if(nums1 [i1] > max) max = nums1[i1];
		}
		
	System.out.println("min and max: " + min + " , "+ max);
	
	*/ 	  int atual = 1;
		  int anterior = 0;
           while (atual < 100) {
              System.out.println(atual + "  "+anterior);
              atual = anterior + atual;
              anterior = atual - anterior;
          }
          System.out.println(atual + "  "+anterior);
        	
	
          int result = sum(10);
          System.out.println(result);
        
        public static int sum(int k) {
          if (k > 0) {
            return k + sum(k - 1);
          } else {
            return 0;
          }
          
          
	
	}
	
}
		
		
		
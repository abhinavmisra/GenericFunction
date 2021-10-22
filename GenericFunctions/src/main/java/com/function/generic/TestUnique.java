package com.function.generic;

interface BaseI {
	void method();
}

class BaseC {
	public void method() {
		System.out.println("abc");
	}
}

class TestUnique extends BaseC implements BaseI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new TestUnique()).method();

		/*HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<numbers.length; i++){
			 if (!set.contains(numbers[i])) 
	            { 
	                set.add(numbers[i]); 
	                System.out.print(numbers[i] + " "); 
	            } 
		}*/
		
		
	}

		
		
		
		
		
		/*int result = 0;
        for(int i:numbers){
        	result ^= i;
        }
        System.out.println("Unique numbers are "+result);

		final int[] unique = Arrays.stream(numbers)
		        .distinct()
		        .toArray();
		for(int i : unique) {
			System.out.println("Unique are "+i);
		}
	}
	*/

	}

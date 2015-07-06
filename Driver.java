package array_sorting;

import java.util.Random;

/**
 *  This practice is mock interview question that I made up 
 *  Question : if there is an char array that contain a-z chars in random order, 
 *  our client wants to sort them in alphabetical order.   
 *  'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'  
 * @author Ryu
 *
 */
public class Driver {
	static char[] alphaData = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	static char[] data;
	static int array_size = 250;
	static int table_size = 26;
	public static void main(String[] arg){
		/*************************************
		 *  Create random number for the test 
		 ************************************/
		Random randomGenerator = new Random();
		arraySort as = new arraySort(table_size);
		int randInt = 0;
		int key = 0;		
		int count = 0;
		data = new char[array_size];
		System.out.println("Original Array data[] = {");
	    for (int i = 0; i < array_size; i++){
	      randInt = randomGenerator.nextInt(26);
	      data[i] = alphaData[randInt];	 	    
	      System.out.printf("\'%s\',",data[i]);
	      if(count == 30){
	    	  System.out.println("\'"+data[i]+"\',");
	    	  count = 0;
	      }
	      count++;
	    }
	    System.out.println("}");
	    
	    /*************************************
		 *  insert random chars into hash_table 
		 ************************************/
	    for(int i = 0; i< array_size; i++){
	    	key = as.hash(data[i],table_size);
	    	as.insert(data[i], key);
	    }
	    /*************************************
		 *  print random chars into hash_table 
		 ************************************/
    	as.printAll();
	    
	    
	}
}

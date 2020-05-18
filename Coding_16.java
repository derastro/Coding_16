import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coding_16 {
	
public static void main(String[] args) {
	
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    int value, sum =0 ;
    int count = 0;
    int i = 0, j = 0, k = 0; 
    int arr[] = new int[5];
    int narr[] = new int[6] ;
    double lengthr;
    
    lengthr = Math.pow(2, 6);       		//max. no of subset that can be created 
    int length = (int)lengthr;
    
    int rarr[] = new int[length];
    
    try {
	System.out.println("Please Enter the values for SET : ");
    value = Integer.parseInt(buf.readLine());
    
    System.out.println("Enter the value for an Array : \n");
    for(i=0;i<=4;i++) {
    	arr[i] = Integer.parseInt(buf.readLine());
    }
    
    for(i=0; i<5; i++) {
    	narr[i+1]=arr[i];					//to add 0 to an array in beginning 
    }
   
    for(i=0; i<=4; i++) {
    	for(j=i+1; j<=5; j++) {
    		sum = narr[i]+narr[j];
    		if(value == sum) {
                
    			count+=2;
    			
	           for(k=count-2;k<=count;k+=2) {
    				
    				rarr[k] = narr[i];
    				rarr[k+1] = narr[j];
    			}

    		}
    	}
    }
    
    for(i=0; i<count-2; i+=2) {
    	for(j=i+2; j<count; j+=2) {
    		
    		if((( rarr[i] == rarr[j] ) && ( rarr[i+1] == rarr[j+1] )) ) {
    			rarr[j] = 0;
    			rarr[j+1] = 0;
    		}
    		if((( rarr[i] == rarr[j+1] ) && ( rarr[i+1] == rarr[j] ))) {
    			rarr[j] = 0;
    			rarr[j+1] = 0;
    		}
            
    	}
    }
    
 
    System.out.println("result subsets : ");
    for(k=0; k<count; k++) {
    	if(rarr[k] == 0) {
    		continue;
    	}
    	
    	System.out.println(rarr[k]);
	}
    
    }catch(IOException ex) {
    	ex.printStackTrace();
    }
    catch(ArrayIndexOutOfBoundsException e){
    	e.printStackTrace();
    }
}
}

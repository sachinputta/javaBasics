package Arrays;

public class Array2 {

	public static void main(String[] args) {

        String[] myarr = {"Sachin", "Ravi","Kishore", "Sachin"};  
     
       int  x=myarr.length;
       System.out.println("No of Persons: "+x);
       
       // displays all persons
       for (int i=0; i<x; i++) {
       	System.out.println("Person-"+ (i+1) +": "+myarr[i]);
       }
       
       //duplicate string
       
       for (int i =0; i<x;i++) {
       	
       	for (int j = i+1; j<x; j++) {
       		
       		if(myarr[i].equals(myarr[j])){
       			 System.out.println("Duplicate string: " + myarr[i]);
                    break; 
      	
       		}
       	}
       }
       
       
       System.out.println("===================");

	}

}

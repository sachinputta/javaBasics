package JavaConstructors;

public class BoxDetails {
        
	    String boxName;
	    int length;
	    int width;
	    int height;
	     
	    
	    // Constructor
	    public BoxDetails(String boxName,int length, int width, int height) {
	    	this.boxName= boxName;
	        this.length = length;
	        this.width = width;
	        this.height = height;
	       
	    }
	    
	

	    public void box_3d_Details() {
			
			System.out.println("Box : " + boxName );
			System.out.println("Length: " + length +" cm");
			System.out.println("Width: " + width + " cm" );	
			System.out.println("Height: " + height + " cm" );
			System.out.println("Area : " +(length* width*height) + " cubcms" );
			System.out.println("*****----------*******" );
					
			
		}
	
        public void box_2d_Details() {
		
			System.out.println("Box : " + boxName );
			System.out.println("Length : " + length +" cm");
			System.out.println("width : " + width + " cm" );	
			System.out.println("Area : " +(length* width) + " sqcms" );			
			System.out.println("*****----------*******" );
        	
        	
			
		}
	  
	    public static void main(String[] args) {
	    	
	    	// 3d boxes
	    	BoxDetails n1 = new BoxDetails("Cube",2,5,12 );
	    	BoxDetails n2 = new BoxDetails("Cuboid",4,3,9 );
	    	BoxDetails n3 = new BoxDetails("Cylinder",3,2,4 );
	    	
	    	n1.box_3d_Details();
			n2.box_3d_Details();
			n3.box_3d_Details();
	    	
			//2d boxes
	    	BoxDetails m1 = new BoxDetails("Rectangle",2,5,0);
	    	BoxDetails m2 = new BoxDetails("Sqaure",4,4,0 );
	    	BoxDetails m3 = new BoxDetails("Rhombus",3,3,0 );
			
			m1.box_2d_Details();
			m2.box_2d_Details();
			m3.box_2d_Details();
	      
	    }


}
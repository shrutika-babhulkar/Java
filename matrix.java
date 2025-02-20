import java.util.Scanner;
class matrix {
	public static void main(String args[])
	{
   Scanner sc = new Scanner(System.in);
   
	int choice;
        int[][] matrix1 = new int[2][2];
		int[][] matrix2 = new int[2][2];
        int[][] res = new int[2][2];
                
 	System.out.println("\n Matrix Operations: ");
 	System.out.println("\n 1.Addition ");

 	System.out.println("\n 2.Subtraction ");

 	System.out.println("\n 3.Multiplication" );
	
	
 	System.out.println("\n 4.Transpose" );

    System.out.println("\n Enter your choice  : ");
   
	choice =sc.nextInt();
    
	if(choice==4){
		 System.out.println( "Enter elements of first matrix:" );
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					 matrix1[i][j] = sc.nextInt();
				}
			}
	}
	else{
		
		System.out.println( "Enter elements of first matrix:" );
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				 matrix1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter elements of second matrix:" );
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				 matrix2[i][j] = sc.nextInt();
			}
		}
		
	}
		
	
    switch(choice)
    {
    	case 1: 
    		for (int i = 0; i < 2; i++) {
       		 for (int j = 0; j < 2; j++) {
           	 res[i][j] = matrix1[i][j] + matrix2[i][j];
        	}
  		    }
  		    
		  	System.out.println("Sum of matrices:" );
		    for (int i = 0; i < 2; i++) {
		        for (int j = 0; j < 2; j++) {
		            System.out.print( res[i][j] + " ");
		        }
		        System.out.println( );
		    }
    		break;
    		
    		
    	case 2: 
    		for (int i = 0; i < 2; i++) {
       		    for (int j = 0; j < 2; j++) {
	           	 res[i][j] = matrix1[i][j] - matrix2[i][j];
	        	}
  		    }
  		    
		  	System.out.println( "Sum of matrices:"  );
		    for (int i = 0; i < 2; i++) {
		        for (int j = 0; j < 2; j++) {
		            System.out.print(res[i][j] + " ");
		        }
		        System.out.println( );
		    }
    		break;
    		
    	case 3: 
		    for (int i = 0; i < 2; i++) {
		        for (int j = 0; j < 2; j++) {
		        res[i][j] = 0; 
		            for (int k = 0; k < 2; k++) {
		                res[i][j] += matrix1[i][k] * matrix2[k][j];
		            }
		        }
		    }
		
		    System.out.println( "Multiplication of matrices:" );
		    for (int i = 0; i < 2; i++) {
		        for (int j = 0; j < 2; j++) {
		            System.out.println( res[i][j] + " ");
		        }
		        System.out.println() ;
		    }
		    break;
			
		case 4:
				

				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 2; j++) {
						res[j][i] = matrix1[i][j];
					}
				}

				System.out.println( "Transposed Matrix:\n");
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 2; j++) {
						System.out.print(res[i][j] + " ");
					}
					System.out.println();
				}
				break;

		default:
			System.out.println("Invalid choice..");
			break;
    		
	}
	}
	

}


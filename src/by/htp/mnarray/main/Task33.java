package by.htp.mnarray.main;

//33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов. 

public class Task33 {

	public static void main(String[] args) {
		
			
			int matr [][]=new int[5][5];
	        int min = 10;
	        int max = 99;
	        int b;

	       
	        for (int i=0;i<matr.length;i++){
	            for (int j =0;j<matr[i].length;j++){
	                matr[i][j] = min + (int) (Math.random()*(max-min+1));
	                System.out.print(matr[i][j]+" ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	       
	        
	        System.out.println("Cтолбцы матрицы по возрастанию значений элементов");

	        for (int i=0;i<matr.length;i++) { 
	            for (int j = 0; j < matr[i].length; j++) {
	                for (int k=i+1; k<matr.length; k++){ 
	                    if (matr[i][j]>matr[k][j]){ 
	                        b=matr[i][j];
	                        matr[i][j]=matr[k][j];
	                        matr[k][j]=b;                        
	                    }
	                }
	            }
	        }


	        for (int i=0;i<matr.length;i++){
	            for (int j =0;j<matr.length;j++){
	                System.out.print(matr[i][j]+" ");
	            }
	            System.out.println();
	        }
	      
	        System.out.println();
	        System.out.println("Столбцы матрицы по убыванию значений элементов");
	  
	        for (int i=0;i<matr.length;i++) { 
	            for (int j = 0; j < matr.length; j++) {
	                for (int k=i+1; k<matr.length; k++){  
	                    if (matr[i][j]<matr[k][j]){  
	                        b=matr[i][j];
	                        matr[i][j]=matr[k][j];
	                        matr[k][j]=b;                        
	                    }
	                }
	            }
	        }
	            
	            for (int i=0;i<matr.length;i++){
	                    for (int j =0;j<matr.length;j++){
	                        System.out.print(matr[i][j]+" ");
	                    }
	                    System.out.println();
	                }
	                System.out.println();
	     
		}

		
	}



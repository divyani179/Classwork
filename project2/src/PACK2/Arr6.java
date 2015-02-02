package PACK2;
/*
 * 6.	Use command line to populate a 
 * two dim array which has 2 rows and 2 columns 
 */
public class Arr6 {

	public static void main(String[][] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<args.length;i++){
			for(int j=0;j<args[i].length;j++)
			{
				
				System.out.println(Integer.parseInt(args[i][j])+" ");
			}
		}
	}

}
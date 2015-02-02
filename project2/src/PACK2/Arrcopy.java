package PACK2;

public class Arrcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,7,8};
		int carr[]=new int[10];
		Arrcopy a=new Arrcopy();
	    System.arraycopy(arr, 2, carr, 4, 4);
	    for(int a1:carr){
	    	System.out.println(a1);
	    }

	}

}

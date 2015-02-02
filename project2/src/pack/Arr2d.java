package pack;

import java.util.Scanner;

public class Arr2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[][] marks=new int[3][2];
		Scanner in= new Scanner(System.in);
		System.out.println("enter values");
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<2;j++)
			{
		     marks[i][j]=in.nextInt();
			}
		}
		
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<2;j++)
			{
		     System.out.println(marks[i][j]);
			}
		}
		
*/
		int marks[][]=new int[3][];
		marks[0]=new int[2];
		marks[1]=new int[3];
		marks[2]=new int[2];
		marks[0][1]=2;
		marks[1][0]=10;
        marks[1][1]=11;
        Scanner in = new Scanner(System.in);
       /* for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
		     marks[i][j]=in.nextInt();
			}
		}*/
        for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
		     System.out.println(marks[i][j]);
			}
		}
		
	}

}

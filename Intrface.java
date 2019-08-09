import java.util.*;
interface Practical
{
	public void getPracMarks();
}
interface External extends Practical
{
	public void getExtMarks();
	public void getTW();
}
class SessionalExam
{
	int i,j;
	Scanner s=new Scanner(System.in);
	int sub[][]=new int[5][3];
	int sum[]=new int[5];
	public void getMarks()
	{
		System.out.println("Enter Marks of 5 subjects = ");
		for(i=0;i<5;i++)
		{
			System.out.println("Subject "+(i+1)+" Marks ");
			for(j=0;j<3;j++)
				sub[i][j]=s.nextInt();
		}
	}
	public void getTotal()
	{
		for(i=0;i<5;i++)
		{
			for(j=0;j<3;j++)
				sum[i]=sum[i]+sub[i][j];
			System.out.println("Total of Subject "+(i+1)+"marks = "+sum[i]);
		}
	}
}
class Result extends SessionalExam implements External
{
		int prac[]=new int[5];
		int ex[]=new int[5];
		int tw[]=new int[5];
		int exsum[]=new int[5];
		int psum[]=new int[5];
		int rsum[]=new int[5];
		int twsum[]=new int[5];
		int i;
		public void getTotal()
		{
			super.getTotal();
		}
		public void getExtMarks()
		{
			System.out.print("Enter marks of External Exam = ");
			for(i=0;i<5;i++)
				ex[i]=s.nextInt();
		}
		public void extotal()
		{
			for(i=0;i<5;i++)
			{	exsum[i]=exsum[i]+ex[i];
				System.out.println("Total of external marks of subject "+i+" ="+exsum[i]); }
		}
		public void getTW()
		{
			System.out.print("Enter marks of Termwork = ");
			for(i=0;i<5;i++)
				tw[i]=s.nextInt();
		}
		public void twtotal()
		{
			for(i=0;i<5;i++)
			{	twsum[i]=twsum[i]+tw[i];
				System.out.println("Total of termwork marks of subject "+i+" ="+twsum[i]); }
		}
		public void getPracMarks()
		{
			System.out.print("Enter marks of Practical Exams = ");
			for(i=0;i<5;i++)
				prac[i]=s.nextInt();
		}
		public void prtotal()
		{
			for(i=0;i<5;i++)
			{	psum[i]=psum[i]+prac[i];
				System.out.println("total of practical marks of subject "+i+" ="+psum[i]);}
		}
		public void TotalMarks()
		{
			System.out.print("Total marks = ");
			for(i=0;i<5;i++)
			{	rsum[i]=sum[i]+tw[i]+psum[i]+exsum[i];
				System.out.println("Total marks of subject "+i+" = "+rsum[i]);
			}
		}
}
public class Intrface
{
	public static void main(String args[])
	{
		Result r=new Result();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter NAme = ");
			String nm=s.next();
		System.out.print("Enter NAme = ");
		r.getMarks();
		r.getTW();
		r.getExtMarks();
		r.getPracMarks();
		r.getTotal();
		r.extotal();
		r.twtotal();
		r.prtotal();
		System.out.print("");
		System.out.println("******************************************");
		r.TotalMarks();

	}
}

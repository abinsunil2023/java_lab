 class Student{
 int id;
 float mark1,mark2,mark3,t,avg;
 String name;
   public Student(){
    id=10;
    name="Amal";
    mark1=30;
    mark2=40;
    mark3=36;
	t=mark1+mark2+mark3;
	avg=t/150*100;
   }
   public Student(int i,String n,float a, float b,float c){
	   id=i;
	   name=n;
	   mark1=a;
	   mark2=b;
	   mark3=c;
	   t=mark1+mark2+mark3;
	   avg=t/150*100;
   }
   public Student(float a, float b,float c){
   id=3;
   name="Anu";
   mark1=a;
   mark2=b;
   mark3=c;
   t=mark1+mark2+mark3;
   }
   void display(){
   System.out.println("Student Details:");
   System.out.println("Student id:" + id);
   System.out.println("Student name:" + name);
   System.out.println("mark1:" + mark1);
   System.out.println("mark2:" + mark2);
   System.out.println("mark3:" + mark3);
   System.out.println("total mark:" + t);
   System.out.println("average mark:" + avg);
   }
}
    public class StudentDetails{
    public static void main(String args[]){
   Student obj1= new Student();
   Student obj2= new Student(2,"Athul",30,35,40);
   Student obj3= new Student(30,35,40);
   obj1.display();
     }
	}


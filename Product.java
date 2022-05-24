public class Product{
 String pcode,pname;
 double price;
  public void details(){
	  System.out.println("the product name is:" + pname);
	  	  System.out.println("the product code is:" + pcode);
	  System.out.println("the product price is:" + price);

}
  public static void main(String args[]){
   Product obj1=new Product();
   obj1.pcode="p100";
   obj1.pname="cake";
   obj1.price=45.5;
   obj1.details();
    Product obj2=new Product();
   obj2.pcode="p200";
   obj2.pname="juice";
   obj2.price=40;
   obj2.details();
    Product obj3=new Product();
   obj3.pcode="p300";
   obj3.pname="cola";
   obj3.price=20;
   obj3.details();
   if((obj1.price<obj2.price)&&(obj1.price<obj3.price)){
	   System.out.println("the lowest price product is " + obj1.pname);
   }
   
   else if((obj2.price<obj1.price)&&(obj2.price<obj3.price)){
   	   System.out.println("the lowest price product is " + obj2.pname);
   }
   else{
	   
   	   System.out.println("the lowest price product is " + obj3.pname);

   }
  }
}
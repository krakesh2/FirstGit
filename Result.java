class Area 
 {
 static void circle()
   {
     int r=7;
     double pi=3.142;
     double c=pi*r*r;
     System.out.println(" circle" +c);
   }
}
class Area2
{
 static void triangle()
 {
   int base=8;
   int height=10;
   double c=0.5*base*height;
   System.out.println("triangle" +c);
 }
}
class Area3
{
	static void square()
	{
		int a=10;
		int c=a*a;
		System.out.println("square" +c);
	}
}
class Area4
{
float rectangle(float b,float h)  //non static to static
	 {
		float c=b*h;
		System.out.println("rectangle" +c);
		return c;
		
	}
}
  class Area5
  {
	  double ellipse(int a, int b)
	  {
		double pi=3.142;
		double c=pi*a*b;
		System.out.println("ellipse" +c);
        return c;
	  }
  }
  class Area6
  {
	  double trapenzoid(int a, int b, int h)
	  {
		  double c=0.5*a*b*h;
		  System.out.println("trapenzoid"  +c);
		  return c;
	  }
  }
  class Area7
  {
    static   double sector( int r,int theta)
	  {
		   double c=0.5*r*r*theta;
		   System.out.println("sector"  +c);
		   return c;
	  }
  }
  class Area8
  {
		   static int Parallelogram(int b,int h)
		  {
              int c=b*h;
			  System.out.println("Parallelogram "+c);
			  return c;
		  }
  }
class Result
{
  public static void main(String[] args)
  {
    Area.circle();
    Area2.triangle();
	Area3.square();
	new Area4().rectangle(2,3);
	new Area5().ellipse(2,5);
	new Area6().trapenzoid(4,5,6);
	Area7.sector(5,60);
	int x=Area8.Parallelogram(8,9);
	System.out.println(x);
  }
}
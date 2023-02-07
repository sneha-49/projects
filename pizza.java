public class pizza
{
  public int price;
  public boolean veg;


  public pizza (boolean veg)
  {
    this.veg = veg;
    if (this.veg)
     { this.price = 300;
      System.out.println ("Pizza type veg :" + this.price);
     }
    else
     { this.price = 400;
     System.out.println ("Pizza type non-veg :" + this.price);
     }
     }
   
  

  public void addcheese ()
  {
    System.out.println ("Extra cheese added : 100");
    this.price += 100;
    //System.out.print(this.price);

  }
  public void addtopings ()
  {
    System.out.println ("Extra topping added: 150");
    // System.out.print(this.price);
    this.price += 150;
  }
  public void takeaway ()
  {
    System.out.println ("takeaway option: 20");
    // System.out.print(this.price);
    this.price += 20;
  }

  public void pizzaprice ()
  {

    System.out.print (this.price);

  }


}

public class point
{ 
  // attributes
  double x;
  double y;
  // actions or methods
  public void setX(double x_value){ x=x_value;  }
   public void setY(double y_value){ y=y_value;  }
   public double getX() {return x;}
   public double getY() {return y;}
   public double square_distance_from_origin(){return x*x+y*y;}
}
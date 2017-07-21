// The Rectangle in the graphics package we have been using in  
// this course is limited because it cannot calculate its area.
//
// Create a class UdacityRectagle that extends Rectangle and
// adds an area() method which returns an int
//
// This class will not need to provide any new instance variables,
// but it will need a constructor which takes x, y corordinates and
// width and height. Write this in the space indicated below.
// 
// A RectangleDemo class is included on a different tab. This may give you some hints.

public class UdacityRectangle extends Rectangle
{
   /**
       Constructs an empty rectangle.
    */
    public UdacityRectangle()
    {
        super();
    }       

    /**
       Constructs a rectangle.
       @param x the leftmost x-coordinate
       @param y the topmost y-coordinate
       @param width the width
       @param height the height
    */
    public UdacityRectangle(double x, double y, double width, double height)
    {
        super(x, y, width, height);
    }
    
    /**
     * Compute the area of UdacityRectangle
     * @return the area
     */
    public int area()
    {
        return super.getWidth() * super.getHeight();
    }
}

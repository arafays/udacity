// RectangleList class manages a list of Rectangles
// It has a constructor that takes an array list of Rectangles as a parameter.
// It has a method to return the Rectangle with the smallest area
// (or null if the list is empty)
//
// The class is started for you. You are to complete the class.
//
// This class uses the Rectangle class from the graphics package.
// It has the getWidth() and getHeight() methods
//
// There is a tester included to help you test your code.

import java.util.ArrayList;
//import java.awt.Rectangle;



public class RectangleList
{
    // private instance variables
    ArrayList<Rectangle> list = new ArrayList<Rectangle>();

   /**
    * Constructs a Rectangle list to manage this list of Rectangles
    * @param theList the lest of Rectangles to manage
    */
    public RectangleList(ArrayList<Rectangle> theList)
    {
        list = theList;
    }

   /**
    * Gets the Rectangle with the smallest area
    * @return the rectangle with the smallest area or null if
    * there are no rectangles
    *
    */
    public Rectangle smallestArea()
    {
        if (list.isEmpty())
            return null;

        Rectangle smallest = list.get(0);
        for( Rectangle i : list )
            smallest = i.getWidth() * i.getHeight() < smallest.getWidth() * smallest.getHeight() ? i : smallest;
        return smallest;
    }

}

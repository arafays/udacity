// Here is a class called UnitCircle. Its radius is an int. A couple of methods have been
// provided.

// Add the code so that the UnitCircle class implements the Comparable interface

/**
 * Represents a circle whose radius is multiples of the unit circle - a circle with radius 1
 */
// TODO: add everything necessary for this class to implement Comparable
// HINT: There are two things you need to do
public class UnitCircle implements Comparable<UnitCircle>
{
    private int radius;
    
    /**
     * Constructor sets the raidus 
     * @param radius of the circle
     */
    public UnitCircle(int radius)
    {
        this.radius = radius;
    }

    /**
     * gets the radius of circle
     * @return radius of circle
     */
    public int getRadius()
    {
        return radius;
    }

    /**
     * prints the radius of the UnitCircle
     * @return a string with the radius of the circle
     */
    public String toString()
    {
        return "UnitCircle[r=" + radius + "]";
    }

    /**
     * Compares UnitCircle this, c
     * @param c a UnitCircle to compare agains this UnitCircle
     * @return 0 if this and c are equal, negative integer if this < c, positive integer if this  > c 
     */
    public int compareTo(UnitCircle c)
    {
            return this.radius - c.getRadius();
    }
}
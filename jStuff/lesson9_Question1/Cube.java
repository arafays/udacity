// formulas for surface area and volume
// http://math2.org/math/geometry/areasvols.htm
//
// TODO: complete the code so that Cube implements the GeometricSolid interface
//
public class Cube implements GeometricSolid
{
    private double side;
    
    /**
     * Constructor of the Cube object
     */
    public Cube()
    {
        side = 0;
    }
    
    /**
     * Constructor of the Cube object
     * @param s the side of a cube object
     */
    public Cube(double s)
    {
        side = s;
    }
    
    /**
     * Calculates the volume
     * @return volume of the Cube
     */
    public double getVolume()
    {
        return side * side * side;
    }
    
    /**
     * Calculates the surface area
     * @return surface area of the Cube 
     */
    public double getSurfaceArea()
    {
        return 6 * side * side;
    }

}
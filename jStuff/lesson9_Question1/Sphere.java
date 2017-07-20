// formulas for surface area and volume
// http://math.about.com/od/formulas/ss/surfaceareavol.htm
//
// TODO: complete the code so that Sphere implements the GeometricSolid interface
//
public class Sphere implements GeometricSolid
{
    private double radius;

    /**
     * Constructor for objects of class Sphere
     */
    public Sphere()
    {
        radius = 0;
    }

    /**
     * Constructs a Shpere with the given radius
     * @param r the radius
     */
    public Sphere( double r)
    {
        radius = r;
    }
    /**
     * sets the radius of the Sphere
     */
    public void setRadius(double r)
    {
        radius = r;
    }
    
    /**
     * gets radius
     * @return the radius of the Sphere
     */
    public double getRadius()
    {
        return radius;
    }

    /**
     * calculate the volume of the Sphere
     * @return volume of the Sphere
     */
    public double getVolume()
    {
        return (4 * Math.PI * getRadius() * getRadius() * getRadius() ) / 3;
    }
    
    /**
     * calculate the surface area of the Sphere
     * @return surface area of the sphere
     */
    public double getSurfaceArea()
    {
        return 4 * Math.PI * getRadius() * getRadius(); 
    }
}

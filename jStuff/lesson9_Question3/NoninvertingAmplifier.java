// TODO: supply the implementation of NoninvertingAmplifier as a subclass of Amplifier
// R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
// NoninvertingAmplifier:      g = 1 + (R2 / R1)
// TODO: the getGain method needs to return the correct gain (g)

public class NoninvertingAmplifier extends Amplifier
{
    public NoninvertingAmplifier(int r1, int r2)
    {
       super(r1, r2);
    }
  
    public double getGain()
    {
        return ( 1 + (1.0 * super.getR2()/super.getR1() ) );  
    }
}

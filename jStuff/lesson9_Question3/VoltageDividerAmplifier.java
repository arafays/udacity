// TODO: supply the implementation of VoltageDividerAmplifier as a subclass of Amplifier
// R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
// VoltageDividerAmplifier:    g = R2 / (R1 + R2)
// TODO: the getGain method needs to return the correct gain (g)

public class VoltageDividerAmplifier extends Amplifier
{
    public VoltageDividerAmplifier(int r1, int r2)
    {
        super(r1, r2);
    }
  
    public double getGain()
    {
        return 1.0 * super.getR2() / ( super.getR2() + super.getR1() );  
    }
}
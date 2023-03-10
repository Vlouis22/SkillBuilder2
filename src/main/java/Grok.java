public class Grok
{
    private static final int DEFAULT_POWER_LEVEL=50;

    // instance variables
    private int powerLevel;

    // accessor variables

    /*
     * Initializes a Grok object to the default power level of 50.
     */
    public Grok()
    {
        setPowerLevel(DEFAULT_POWER_LEVEL);
    }

    /*
     * Initializes a Grok object to power powerLevel
     */
    public Grok(int powerLevel)
    {
        setPowerLevel(powerLevel);
        // TODO - add your code here
    }


    /*
     * Returns the power level of this Grok.
     * @return returns the power level of this Grok
     */
    public int getPowerLevel()
    {
        return powerLevel;
        // TODO - add your code here
    }

    // mutator methods

    /*
     * Sets the power level of this Grok.
     * @param powerLevel the power value to set for this Grok.
     */
    public void setPowerLevel(int powerLevel)
    {
        this.powerLevel = powerLevel;
        // TODO - add your code here
    }

    /*
     * Set the power level of this Grok to the power level of
     * the pill.
     * @param pill The PowerPill that the this Grok.  The power
     * of the pill is added to the power level of this Grok.
     */
    public void takePowerPill(PowerPill pill)
    {
        powerLevel += pill.getPower();
        // TODO - add your code here
    }

    /*
     * Invoked when this Grok takes a hit.  The power level of
     * this Grok is reduced by 5.
     */
    public void tookHit()
    {
        powerLevel -= 5;
        // TODO - add your code here
    }
}
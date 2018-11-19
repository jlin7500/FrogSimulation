public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }
    private int hopDistance()
    {
        return (int) (Math.random()*30) - 15;
    }

    public boolean simulate()
    {
        int frogPostion = 0;
        System.out.println(hopDistance());
        while(goalDistance != 0 || goalDistance > 0)
        {
            for(int i = 0; i < maxHops; i++)
            {
                frogPostion += hopDistance();
                if(frogPostion >= goalDistance)
                {
                    return true;
                }
                else if (frogPostion < 0)
                {
                    return false;
                }
            }
        }
        return false;
    }
    public double runSimulations(int num)
    {
        double divisor = 0;
        for(int i  = 0; i <= num; i++)
        {
            if(simulate() == true)
            {
                divisor++;
            }
        }
        return (double)(divisor/num);
    }
}
package iswa.ws.ia.source.code;

/**
 * Created by h nh on 17/03/2017.
 */
public class Mathematiques
{
    int _is_it_any_difficulty = 0;

    private int addition_difficult_priority = 0;
    private int soustraction_difficult_priority = 0;
    private int multiplication_difficult_priority = 0;
    private int division_difficult_priority = 0;


    public int getAddition_difficult_priority()
    {
        return (addition_difficult_priority);
    }

    public void setAddition_difficult_priority(int a1)
    {
        addition_difficult_priority = a1;
    }

    public int getSoustraction_difficult_priority()
    {
        return (soustraction_difficult_priority);
    }

    public int getMultiplication_difficult_priority()
    {
        return (multiplication_difficult_priority);
    }

    public int getDivision_difficult_priority()
    {
        return (division_difficult_priority);
    }


}

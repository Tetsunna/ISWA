package iswa.ws.ia.source.code;

/**
 * Created by h nh on 17/03/2017.
 */
public class Mathematiques
{
    int _is_it_any_difficulty = 0;

    private int addition_difficult_priority = 0;


    void setAdditionDifficultDriority(int moyenne)
    {

        addition_difficult_priority = moyenne;
     /*   if (moyenne <= 33)
            addition_difficult_priority = 1;
        else if (moyenne > 33 && moyenne <= 66)
            addition_difficult_priority = 2;
        else if (moyenne > 66)
            addition_difficult_priority = 3;*/
    }

    int getAdditionDifficultDriority()
    {
        return (addition_difficult_priority);
    }

    class Addition
    {
        int _ddifcult_priority = 0;

    }

    class Soustraction
    {
        int _ddifcult_priority = 0;

    }

    class Multiplication
    {
        int _ddifcult_priority = 0;

    }

    class Division
    {
        int _ddifcult_priority = 0;

    }


}

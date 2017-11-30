package mypackage;

/**
 * Created by qwerty on 16-Nov-17.
 */
public class Tests {

    public double test_official(Perceptron[] perceptrons,Perceptron master)
    {
        Letters letters = new Letters();
        int counter=0;

        int tmp;
        for(int i=0;i<20;i++)
        {
            tmp=Main.guess(perceptrons,letters.getTab()[i],master);
            if(i%2==0 && tmp==0)
            {
                    counter++;
            }
            else if(i%2==1 && tmp==1)
            {
                counter++;
            }
        }

        System.out.println("Dla testu kolejnymi literami gotowymi wynik to : "+counter +"/"+"20");
        return (counter/20);

    }
/*
    public double test_zaburzone(Perceptron[] perceptrons,Perceptron master)    //TODO naprawic
    {
        int[][] letters1 = new int[10][];   //zaburzone 2 pixele
        int[][] letters2 = new int[10][];   //zaburzone 6 pixeli


        //Najpierw zaburzenie dużych liter
        letters1[0]=new int[]{
                0,1,1,1,0,
                1,1,0,0,1,
                1,0,0,0,1,
                1,1,1,1,1,
                1,0,0,0,1,
                1,0,0,1,1,
                1,0,0,0,1};

        letters1[2]=new int[]{
                1,0,1,1,0,
                1,0,0,0,1,
                1,1,0,0,1,
                1,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0
        };

        letters1[4]=new int[]{
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,0,
                1,0,0,0,1,
                1,0,0,0,1,
                0,1,1,1,0
        };

        letters1[6]=new int[]{
                1,1,1,1,0,
                1,0,1,0,1,
                1,0,0,0,1,
                0,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0,
        };

        letters1[8]=new int[]{
                1,1,1,1,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,0,1,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,1,1,1
        };

        //Potem małych

        letters1[1]=new int[]{
                0,0,0,0,0,
                0,0,0,1,0,
                0,0,0,0,0,
                0,0,0,0,0,
                0,1,1,1,0,
                0,1,1,1,0,
                0,1,1,1,1
        };

        letters1[3]=new int[]{
                0,1,0,0,0,
                0,1,0,0,1,
                0,1,0,0,1,
                0,1,1,1,0,
                0,1,0,1,0,
                0,1,0,1,0,
                0,1,1,1,0
        };

        letters1[5]=new int[]{
                0,0,0,0,0,
                0,0,1,0,1,
                0,0,0,0,0,
                0,0,1,1,0,
                0,1,0,0,0,
                0,1,0,0,0,
                0,0,1,1,0
        };

        letters1[7]=new int[]{
                0,0,0,1,0,
                0,1,0,1,0,
                0,0,0,1,0,
                0,0,0,1,0,
                0,1,0,1,0,
                0,1,0,1,0,
                0,1,1,1,0
        };

        letters1[9]=new int[]{
                0,0,1,0,1,
                0,0,0,0,0,
                0,1,1,1,0,
                1,0,0,0,1,
                1,1,1,1,1,
                1,0,0,0,0,
                0,1,1,1,0
        };

        //znowu duze ale dla większego zaburzenia

        letters2[0]=new int[]{
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,1,1,1,
                1,1,1,0,1,
                1,0,0,1,1,
                1,0,0,1,1,
                1,0,0,1,1
        };

        letters2[2]=new int[]{
                1,1,1,1,0,
                1,0,1,0,1,
                1,0,1,1,1,
                1,0,1,0,0,
                1,1,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0
        };

        letters2[4]=new int[]{
                0,1,1,1,0,
                1,0,0,1,1,
                1,0,1,1,1,
                1,0,0,1,1,
                1,0,0,0,0,
                1,0,0,0,1,
                0,1,1,1,0
        };

        letters2[6]=new int[]{
                1,1,1,0,1,
                1,0,0,1,1,
                1,0,0,1,1,
                1,0,1,1,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0,
        };

        letters2[8]=new int[]{
                1,1,1,1,0,
                1,0,1,0,1,
                1,0,1,0,1,
                1,1,1,1,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,1,1,1
        };

        //znowu małe
        letters2[1]=new int[]{
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,1,1,1,
                0,1,1,1,1,
                0,1,0,1,1,
                0,1,1,1,0
        };

        letters2[3]=new int[]{
                0,1,0,0,0,
                0,1,0,0,0,
                0,1,0,1,1,
                0,1,1,1,1,
                0,1,0,1,1,
                0,1,0,1,1,
                0,1,1,1,1
        };

        letters2[5]=new int[]{
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,1,1,1,
                0,0,1,1,1,
                0,1,0,0,1,
                0,1,0,0,1,
                0,0,1,1,0
        };

        letters2[7]=new int[]{
                0,0,0,1,0,
                0,1,1,1,0,
                0,0,0,1,0,
                0,0,0,1,0,
                0,1,1,1,0,
                0,1,0,1,0,
                1,0,0,0,0
        };

        letters2[9]=new int[]{
                0,0,0,1,0,
                0,1,0,1,1,
                0,1,1,0,1,
                1,0,0,0,1,
                1,1,1,1,1,
                1,0,0,0,0,
                0,1,1,1,0
        };

        int counter=0;
        int tmp[];
        for(int i=0;i<10;i++)
        {
            tmp=Main.guess(perceptrons,letters1[i]);
            if(i%2==0)//jesli litera powinna byc duza
            {

            }
            else //jesli litera powinna byc mała
            {

            }
        }

        System.out.println("Dla testu mało zaburzonymi literami wynik to : "+counter +"/"+"10");
        int a=counter;
        counter=0;

        for(int i=0;i<10;i++)
        {
            tmp=Main.guess(perceptrons,letters2[i]);
            if(i%2==0)//jesli litera powinna byc duza
            {

            }
            else //jesli litera powinna byc mała
            {
            }
        }
        System.out.println("Dla testu bardzo zaburzonymi literami wynik to : "+counter +"/"+"10");

        return (a+counter);

    }*/


}

package mypackage;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by qwerty on 30-Nov-17.
 */
public class Adaline extends Perceptron {

    private Double[] weights;
    private Double biasweight;
    private Double lr = 0.5;

    public Double getLr() {
        return lr;
    }

    public void setLr(Double lr) {
        this.lr = lr;
    }

    private int activation(Double sum)
    {
        if(sum<0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
        //return 1/(1+Math.pow(Math.E,-sum));
    }   //zakres 0-1

    Adaline(int size)
    {
        weights = new Double[size];
        for(int i=0;i<weights.length;i++) {
            weights[i] = ThreadLocalRandom.current().nextDouble(-1, 1);
        }
        biasweight=ThreadLocalRandom.current().nextDouble(-1, 1);
    }

    public void show()
    {
        for(int i=0;i<weights.length;i++) {
            System.out.println(weights[i]);
        }
        System.out.println(biasweight);
    }

    public int guess(int[] inputs)
    {
        Double sum= 0.0;
        for(int i=0;i<weights.length;i++)
        {
            sum+=inputs[i]*weights[i];
        }
        sum+=biasweight;
        int out = activation(sum);
        return out;
    }

    public double sum(int[] inputs)
    {
        int sum= 0;
        for(int i=0;i<weights.length;i++)
        {
            sum+=inputs[i]*weights[i];
        }
        sum+=biasweight;
        return sum;
    }


    public void train(int[] input, int target)
    {

        double sum =sum(input);
        double error = target - sum;

        for(int i=0;i<weights.length;i++)
        {
            weights[i]+=error*input[i]*lr;
        }
        biasweight+=error*lr;

    }
}

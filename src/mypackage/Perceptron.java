package mypackage;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by qwerty on 17-Oct-17.
 */
public class Perceptron {
    private Double[] weights;
    private Double biasweight;
    private Double lr = new Double(0.5);

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

    Perceptron()
    {

    }
    Perceptron(int size)
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

    public void train(int[] input, int target)
    {

        double guess =guess(input);
        double error = (double)target - guess;

        for(int i=0;i<weights.length;i++)
        {
            weights[i]+=error*input[i]*lr;
        }
        biasweight+=error*lr;

    }
}

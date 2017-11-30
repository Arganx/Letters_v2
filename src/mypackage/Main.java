package mypackage;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void train(Perceptron[] perceptrons, int[] letter, int[] result, int number_of_trainings,Perceptron master,int final_target) {

        int[] left_top = {letter[0], letter[1], letter[5], letter[6], letter[10], letter[11]};
        int[] right_top = {letter[3], letter[4], letter[8], letter[9], letter[13], letter[14]};
        int[] left_bottom = {letter[20], letter[21], letter[25], letter[26], letter[30], letter[31]};
        int[] right_bottom = {letter[23], letter[24], letter[28], letter[29], letter[33], letter[34]};
        int[] left = {letter[15], letter[16]};
        int[] right = {letter[18], letter[19]};
        int[] top = {letter[2], letter[7], letter[12]};
        int[] bottom = {letter[22], letter[27], letter[32]};
        int[] center = {letter[17]};

        int[][] tables = new int[][]{
                left_top, right_top, left_bottom, right_bottom, left, right, top, bottom, center
        };

        int[] tmp = new int[9];
        for (int j = 0; j < number_of_trainings; j++) {
            for (int i = 0; i < perceptrons.length; i++) {
                perceptrons[i].train(tables[i], result[i]);
                tmp[i]=perceptrons[i].guess(tables[i]);
            }
            master.train(tmp,final_target);
        }
    }

    public static int guess(Perceptron[] perceptrons, int[] letter,Perceptron master) {

        int[] left_top = {letter[0], letter[1], letter[5], letter[6], letter[10], letter[11]};
        int[] right_top = {letter[3], letter[4], letter[8], letter[9], letter[13], letter[14]};
        int[] left_bottom = {letter[20], letter[21], letter[25], letter[26], letter[30], letter[31]};
        int[] right_bottom = {letter[23], letter[24], letter[28], letter[29], letter[33], letter[34]};
        int[] top = {letter[2], letter[7], letter[12]};
        int[] center = {letter[17]};
        int[] bottom = {letter[22], letter[27], letter[32]};
        int[] left = {letter[15], letter[16]};
        int[] right = {letter[18], letter[19]};

        int[][] tables = new int[][]{
                left_top, right_top, left_bottom, right_bottom, left, right, top, bottom, center
        };

        int[] result = new int[perceptrons.length];
        for (int i = 0; i < perceptrons.length; i++) {
            result[i] = perceptrons[i].guess(tables[i]);
        }

        return master.guess(result);
        //return result;

    }

    public static int interpreter(int[] vector, Letters letters) {
        int counter = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < vector.length; j++) {
                if (vector[j] == letters.getTab_result()[i][j]) {
                    counter++;
                }
            }
            if (counter == vector.length && i % 2 == 0)    //mala
            {
                return 0;
            } else if (counter == vector.length && i % 2 == 1) {
                return 1;
            }
            counter = 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        Letters letters = new Letters();
        Adaline[] perceptrons = new Adaline[9];
        for (int i = 0; i < 9; i++) {
            if (i < 4) {
                perceptrons[i] = new Adaline(6);
            } else if (i < 6) {
                perceptrons[i] = new Adaline(2);
            } else if (i < 8) {
                perceptrons[i] = new Adaline(3);
            } else {
                perceptrons[i] = new Adaline(1);
            }
        }
        Adaline master = new Adaline(9);

        Tests testModule = new Tests();
        //traning

        for (int j = 0; j < 1000000; j++) {   //petla treningow

            /*int i;
            i = ThreadLocalRandom.current().nextInt(0, 20);
            if(i%2==0) {
                Main.train(perceptrons, letters.getTab()[i], letters.getTab_result()[i], 1, master, 0);
            }
            else
            {
                Main.train(perceptrons, letters.getTab()[i], letters.getTab_result()[i], 1, master, 1);
            }*/
            for(int i=0;i<20;i++)
            {
                if(i%2==0) {
                    Main.train(perceptrons, letters.getTab()[i], letters.getTab_result()[i], 1, master, 0);
                }
                else
                {
                    Main.train(perceptrons, letters.getTab()[i], letters.getTab_result()[i], 1, master, 1);
                }
            }
        }
        testModule.test_official(perceptrons,master);

        //wyswietlenie wektorow duzych i malych
        System.out.println("Male:");
        for(int i=0;i<20;i=i+2)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(letters.getTab_result()[i][j]+" ");
            }
           System.out.println();
        }

        System.out.println("Duze:");
        for(int i=1;i<20;i=i+2)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(letters.getTab_result()[i][j]+" ");
            }
            System.out.println();
        }

    }
}
package mypackage;

public class Main {

    public static void train(Perceptron[] perceptrons,int[] letter,double result,int number_of_trainings,Perceptron master)
    {

        int[] left_top = {letter[0],letter[1],letter[5],letter[6],letter[10],letter[11]};
        int[] right_top={letter[3],letter[4],letter[8],letter[9],letter[13],letter[14]};
        int[] left_bottom = {letter[20],letter[21],letter[25],letter[26],letter[30],letter[31]};
        int[] right_bottom = {letter[23],letter[24],letter[28],letter[29],letter[33],letter[34]};
        int[] left ={letter[15],letter[16]};
        int[] right={letter[18],letter[19]};
        int[] top = {letter[2],letter[7],letter[12]};
        int[] bottom={letter[22],letter[27],letter[32]};
        int[] center={letter[17]};

        int[][] tables= new int[][]{
                left_top,right_top,left_bottom,right_bottom,left,right,top,bottom,center
        } ;

        double[] tmp = new double[perceptrons.length];

        for(int j=0;j<number_of_trainings;j++) {
            for (int i = 0; i < perceptrons.length; i++) {
                perceptrons[i].train(tables[i], result);
            }
            for (int i = 0; i < perceptrons.length; i++) {
                tmp[i]=perceptrons[i].guess(tables[i]);
            }
            //perceptron koncowy analicujacy
            master.traindouble(tmp,result);
        }
    }

    public static double guess(Perceptron[] perceptrons,int[] letter,Perceptron master)
    {

        int[] left_top = {letter[0],letter[1],letter[5],letter[6],letter[10],letter[11]};
        int[] right_top={letter[3],letter[4],letter[8],letter[9],letter[13],letter[14]};
        int[] left_bottom = {letter[20],letter[21],letter[25],letter[26],letter[30],letter[31]};
        int[] right_bottom = {letter[23],letter[24],letter[28],letter[29],letter[33],letter[34]};
        int[] top = {letter[2],letter[7],letter[12]};
        int[] center={letter[17]};
        int[] bottom={letter[22],letter[27],letter[32]};
        int[] left ={letter[15],letter[16]};
        int[] right={letter[18],letter[19]};

        int[][] tables= new int[][]{
                left_top,right_top,left_bottom,right_bottom,left,right,top,bottom,center
        } ;

        double[] tmp = new double[perceptrons.length];
        for (int i = 0; i < perceptrons.length; i++) {
            tmp[i]=perceptrons[i].guess(tables[i]);
        }

        return master.guessdouble(tmp);

    }

    public static void main(String[] args) {
	Letters letters = new Letters();
	Perceptron[] perceptrons = new Perceptron[9];
	for(int i=0;i<9;i++)
    {
        if(i<4) {
            perceptrons[i] = new Perceptron(6);
        }
        else if(i<6)
        {
            perceptrons[i] = new Perceptron(2);
        }
        else if(i<8)
        {
            perceptrons[i] = new Perceptron(3);
        }
        else
        {
            perceptrons[i] = new Perceptron(1);
        }
    }


    Perceptron master = new Perceptron(9);


	for(int i=0;i<20;i++) {
	    if(i%2==0) {
            Main.train(perceptrons, letters.getTab()[i], 0, 50, master);
        }
        else
        {
            Main.train(perceptrons, letters.getTab()[i], 1, 50, master);
        }
    }


	System.out.println(Main.guess(perceptrons,letters.getAa(),master));
	Tests tests=new Tests();
	tests.test_official(perceptrons,master);
	tests.test_zaburzone(perceptrons,master);

    }
}

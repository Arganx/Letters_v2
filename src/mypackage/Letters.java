package mypackage;

/**
 * Created by qwerty on 11-Nov-17.
 */
public class Letters {
    private int[] a;
    private int[] aa;
    private int[] b;
    private int[] bb;
    private int[] c;
    private int[] cc;
    private int[] d;
    private int[] dd;
    private int[] e;
    private int[] ee;
    private int[] f;
    private int[] ff;
    private int[] g;
    private int[] gg;
    private int[] h;
    private int[] hh;
    private int[] i;
    private int[] ii;
    private int[] j;
    private int[] jj;
    private int[][] tab;

    public int[] getA() {
        return a;
    }

    public int[] getAa() {
        return aa;
    }

    public int[] getB() {
        return b;
    }

    public int[] getBb() {
        return bb;
    }

    public int[] getC() {
        return c;
    }

    public int[] getCc() {
        return cc;
    }

    public int[] getD() {
        return d;
    }

    public int[] getDd() {
        return dd;
    }

    public int[] getE() {
        return e;
    }

    public int[] getEe() {
        return ee;
    }

    public int[] getF() {
        return f;
    }

    public int[] getFf() {
        return ff;
    }

    public int[] getG() {
        return g;
    }

    public int[] getGg() {
        return gg;
    }

    public int[] getH() {
        return h;
    }

    public int[] getHh() {
        return hh;
    }

    public int[] getI() {
        return i;
    }

    public int[] getIi() {
        return ii;
    }

    public int[] getJ() {
        return j;
    }

    public int[] getJj() {
        return jj;
    }

    public int[][] getTab() {
        return tab;
    }

    Letters()
    {
        aa = new int[] {
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1};

        bb = new int[] {
                1,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0};

        cc = new int[] {
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,0,0,0,0,
                1,0,0,0,1,
                0,1,1,1,0
        };

        dd = new int[]{
                1,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0,
        };

        ee = new int[]{
                1,1,1,1,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,1,1,0,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,1,1,1
        };

        ff = new int[]{
                1,1,1,1,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,1,1,0,
                1,0,0,0,0,
                1,0,0,0,0,
                1,0,0,0,0
        };

        gg = new int[]{
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,0,
                1,0,1,1,1,
                1,0,0,0,1,
                1,0,0,0,1,
                0,1,1,1,0
        };

        hh = new int[]{
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1
        };

        ii = new int[]{
                0,1,1,1,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,1,1,1,0
        };

        jj= new int[]{
                1,1,1,1,1,
                0,0,0,0,1,
                0,0,0,0,1,
                0,0,0,0,1,
                0,0,0,0,1,
                1,0,0,0,1,
                0,1,1,1,0
        };

        a = new int[]  {
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,0,0,0,
                0,1,1,1,0,
                0,1,0,1,0,
                0,1,1,1,1
        };

        b= new int[]  {
                0,1,0,0,0,
                0,1,0,0,0,
                0,1,0,0,0,
                0,1,1,1,0,
                0,1,0,1,0,
                0,1,0,1,0,
                0,1,1,1,0
        };

        c= new int[]  {
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,1,1,0,
                0,1,0,0,0,
                0,1,0,0,0,
                0,0,1,1,0
        };


        d = new int[]{
                0,0,0,1,0,
                0,0,0,1,0,
                0,0,0,1,0,
                0,0,0,1,0,
                0,1,1,1,0,
                0,1,0,1,0,
                0,1,1,1,0
        };

        e = new int[]  {
                0,0,0,0,0,
                0,0,0,0,0,
                0,1,1,1,0,
                1,0,0,0,1,
                1,1,1,1,1,
                1,0,0,0,0,
                0,1,1,1,0
        };

        f= new int[]  {
                0,0,1,1,0,
                0,0,1,0,0,
                0,1,1,1,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0
        };

        g= new int[] {
                0,0,0,0,0,
                0,0,1,0,0,
                0,1,1,1,1,
                0,1,0,1,0,
                0,1,1,1,0,
                0,0,0,1,0,
                0,0,1,1,0
        };

        h= new int[] {
                0,1,0,0,0,
                0,1,0,0,0,
                0,1,0,0,0,
                0,1,1,0,0,
                0,1,0,1,0,
                0,1,0,1,0,
                0,1,0,1,0
        };

        i =  new int[]{
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,1,0,0,
                0,0,0,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0
        };

        j= new int[] {
                0,0,0,1,0,
                0,0,0,0,0,
                0,0,0,1,0,
                0,0,0,1,1,
                0,0,1,1,0,
                0,1,0,1,0,
                0,0,1,0,0
        };

        tab=new int[][]{a,aa,b,bb,c,cc,d,dd,e,ee,f,ff,g,gg,h,hh,i,ii,j,jj};
    }

}

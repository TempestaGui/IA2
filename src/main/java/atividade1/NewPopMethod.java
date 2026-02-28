package atividade1;

public class NewPopMethod{


    public int[][] newPop(int nind, int[][] cromlim){
        int ncrom = cromlim.length;

        int inf;
        int sup;
        int[][] newPopVar = new int[nind][ncrom];

        for(int i = 0; i < nind; i++){
            for(int j = 0; j < ncrom; j++){
                inf = cromlim[j][0];
                sup = cromlim[j][1];

                newPopVar[i][j] = (int)(Math.random() * (sup - inf + 1)) + inf;
            }
        }
        return newPopVar;
    }
}
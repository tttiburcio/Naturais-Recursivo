package controller;
public class RecursividadeNaturais {
    public RecursividadeNaturais(){
        super();
    }

    public int natural (int n){
        //Condição de parada
        if (n <= 0){
            return 0;
        }else{
            return n + natural(n- 1 ); // Chamada da função
        }
    }
}
package pergunta1;

public class Pergunta1 {
    public static void main(String[] args) {
        int vetor[] = {3,8,7,9,10,11,80,2,1,50};
        int aux = 0;
        for (int i=0; i < vetor.length; i++){
            int valor = vetor[i];
            int j = i - 1;

            while((j >= 0) && (valor > vetor[j])){
                aux = vetor[j+1];
                vetor[j+1] = vetor[j];
                vetor[j] = aux;
                j = j-1;
                if(j==-1){
                    break;
                }


            }

        }
        for(Integer t:vetor)
            System.out.printf("%d \t",t);


    }

}

public class estruturaderepeticao {
    
    public static void main(String args[]){

    /*Primeiro exercício
    public static void main(String args[]){
        for(int i=150; i<=300;i++){
            System.out.println(i);
        }
    }*/


    /*Segundo exercício
    int soma=0;
        for(int i=1; i<=1000; i++){
            soma=soma+i;  
        }
        System.out.println(soma);
    } */

    /*Terceiro exercício
    for (int i=3; i<100; i+=3){
        System.out.println(i);
    }

    }*/
    
    int fatResult = 0;
    for(int i=0;i>1;i--) {
        if(i ==0){
            fatResult = 1;
            break;
        }else{
            fatResult = i * fatResult;
        }
    }
    System.out.println (fatResult);

}


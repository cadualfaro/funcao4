/*
Atividade 1
Criar 3 funções com o nome media
▪ media(int a, int b, int c) – que calcula a média aritmética entre os valores

▪ media(double a, double b, int c) – que calcula a média arit. entre os dois primeiros valores e soma com o terceiro parâmetro

▪ media(double a, double b, double c) – que calcula a média harmônica entre os 3 valores
 */
package funcao4;

public class Funcao4 {
    static int media(int a, int b, int c){
        int resultado = (a+b+c)/3;
            return resultado;
    }
    static double media(double a, double b, int c){
        double resultado = ((a+b)/2)+c;
            return resultado;
    }
    static double media(double a, double b, double c){
        double resultado = 3/(1.0/a+1.0/b+1.0/c);
            return resultado;
    }
    public static void main(String[] args) {
        int f = 5, s = 6, t = 10;
        double g = f, h = s, i = t;
    
        int media1 = media(f,s,t);
        System.out.println(media1);
        
        double media2 = media(g,h,t);
        System.out.println(media2);
        
        double media3 = media(g,h,i);
        System.out.println(media3);
    }
    
}

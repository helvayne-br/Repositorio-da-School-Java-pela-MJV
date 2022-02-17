public class MinhaClasse {
    public static void main(String [] args) {
        int resultado = MinhaClasse.somar(3,7);
        System.out.println(args[0]);

        if(args.length == 2)
            System.out.println(args[1]);
        
            System.out.println(resultado);    
    } 
        static int somar (int numeroUm, int numeroDois){
            int resultado = numeroDois + numeroUm;
            return resultado;
        }
        
    }


public class MinhaClasse{
    public static void main(String args[]){

        String primeiroNome = "Renan";
        String segundoNome = "Mendes";
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
public class Formatar {

    public String imprimirTexto(String texto){
        return texto;
    }
    public void imprimirTexto(String texto, int a){

        for(int i=0; i<a; i++){
            System.out.print(" " + texto);
        }
        System.out.println("");
    }
    public String imprimirTexto(String texto, boolean caracter){

        if(caracter){
            texto = texto.toUpperCase();
            return texto;
        }else{
            texto = texto.toLowerCase();
            return texto;
        }
    }
}

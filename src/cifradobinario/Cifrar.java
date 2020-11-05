package cifradobinario;

public class Cifrar {
    
    char[] mensaje;
    char[] clave;
    char[] resultado; //resultado cifrado
    String binario;
    String mensajeCifrado = "";
    public Cifrar(String msg)
	{
                this.mensaje = msg.toCharArray();
		cifrar(); //ciframos el texto
	}
    public String cifrar() //Genera cifrado
	{
            char[] cifrado = new char[mensaje.length];
            String abc[] = new String[mensaje.length];//52
	    int i;
	    int j;
	    for(int cont=0;cont<mensaje.length;cont++)
		{
		    j=(int)this.mensaje[cont]; //restamos 97 para pasar de codigo ascii a un numero entero
                    binario = Integer.toBinaryString(j);

                    
                    String ascii = binario + "";
                    mensajeCifrado =  mensajeCifrado + binario;

		}
            
                    System.out.println(mensajeCifrado);

                String string = new String(cifrado); 
                return string; 
	}
}

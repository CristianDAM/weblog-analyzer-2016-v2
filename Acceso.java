public class Acceso
{
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    private String ip;
    private String registro;
    private String pagina;
    private String respuesta;

    public Acceso(String parametrosAPasar)
    {
        String[] cadenaString = parametrosAPasar.split(" ");
          this.ip = cadenaString[0];
       
          
           
        
      
            ano = Integer.parseInt(cadenaString[1].substring(1,5)); 
            mes = Integer.parseInt(cadenaString[2]); 
            dia = Integer.parseInt(cadenaString[3]);
            hora = Integer.parseInt(cadenaString[4]); 
            minutos = Integer.parseInt(cadenaString[5].substring(0,2));  
          
           
            this.pagina = cadenaString[6];
            this.respuesta = cadenaString[7];
               

    }

    public int getAno() 
    {
        return ano;
    }

    public int getMes()
    {
        return mes;
    }

    public int getDia()
    {
        return dia;
    }

    public int getHora()
    {
        return hora;
    }

    public int getMinutos()
    {
        return minutos;
    }
}
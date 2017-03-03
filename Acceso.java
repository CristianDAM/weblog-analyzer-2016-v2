public class Acceso
{
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;

    public Acceso(String parametrosAPasar)
    {
        String[] parametrosConstructor = parametrosAPasar.split(" ");
        ano = Integer.parseInt(parametrosConstructor[0]); 
        mes = Integer.parseInt(parametrosConstructor[1]); 
        dia = Integer.parseInt(parametrosConstructor[2]);
        hora = Integer.parseInt(parametrosConstructor[3]); 
        minutos = Integer.parseInt(parametrosConstructor[4]);               

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
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class AnalizadorAccesosAServidor
{
    private ArrayList<Acceso> accesos;

    public AnalizadorAccesosAServidor() 
    {
        accesos = new ArrayList<>();
    }

    public void analizarArchivoDeLog(String archivo)
    {
        accesos.clear();
        File archivoALeer = new File(archivo);
        try {
            Scanner sc = new Scanner(archivoALeer);
            while (sc.hasNextLine()) {
                String lineaLeida = sc.nextLine();   
                System.out.println(lineaLeida);

                Acceso accesoActual = new Acceso(lineaLeida);               
                accesos.add(accesoActual);
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Ocurrio algun error al leer el archivo.");
        }
    }

    public int obtenerHoraMasAccesos() 
    {
        int valorADevolver = -1;

        if (!accesos.isEmpty()) {
            int[] accesosPorHora = new int[24];

            for (Acceso accesoActual : accesos) {
                int horaAccesoActual = accesoActual.getHora();
                accesosPorHora[horaAccesoActual] = accesosPorHora[horaAccesoActual] + 1;
            }

            int numeroDeAccesosMasAlto = accesosPorHora[0];
            int horaDeAccesosMasAlto = 0;
            for (int i = 0; i < accesosPorHora.length; i++) {
                if (accesosPorHora[i] >= numeroDeAccesosMasAlto) {
                    numeroDeAccesosMasAlto = accesosPorHora[i];
                    horaDeAccesosMasAlto = i;
                }
            }

            valorADevolver = horaDeAccesosMasAlto;                      
        }

        return valorADevolver;
    }

    public String paginaWebMasSolicitada() 
    {
        HashMap<String,Integer> listaRegistros = new HashMap<>();

        String nombrePaginaMasSolicitada = null;
        int contadorNumeroPaginas = 0;
        for(Acceso accesoNuevo : accesos)
        {
            String paginaAcceso = accesoNuevo.getPagina();

            if (listaRegistros.get(paginaAcceso) == null)
            {
                listaRegistros.put(paginaAcceso, 1);
            
            
            }
            else{
                int valorASumar = listaRegistros.get(paginaAcceso) + 1;
                
                
                listaRegistros.put(paginaAcceso, valorASumar);
            
            
            
            }

            
        }

        return nombrePaginaMasSolicitada;
    }

    public String clienteConMasAccesosExitosos()
    {
        return "";
    }

}

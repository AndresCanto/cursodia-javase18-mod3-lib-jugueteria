package jugueteria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

//clase para leer el documento csv, lo cual
//solo es una simulacion de una base de datos

public class JulioCepeda 
{
	public static List<Juguete> listaJuguetes = new ArrayList<Juguete>();
	public static String p = "bd/juguetes.csv";
	public static URL url = JulioCepeda.class.getResource(p);
	
//	abstraccion del unit testing
//	no deberia llevar main
//	intancia de la clase para no depender del main
//	public static void main(String[] args) 
//	{
//		conectar();
//		checkPath();
//	}
	
//	se pone public static, porque es una libreria
//	con static no se necesitara instanciarse un objeto de la clase
	public static void conectar() 
	{
//		simular que se conceta a una bd
		System.out.println("Concetado!");
	}
	
	public static void checkPath() 
	{
		if(url != null)
		{
			System.out.println("ruta correcta");
			leerArchivoCrearLista();
		}
		else 
		{
			System.out.println("Error! el archivo o ruta no existen");
//			crear archivo
		}
	}
	
	public static void leerArchivoCrearLista() 
	{		                                              //Stream = flujo
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
			String linea = null;
			while ((linea = br.readLine())!=null) 
			{
				String[] LActual = linea.split(",");
				int id = Integer.parseInt(LActual[0]);
				String nom = LActual[1];
				float pre = Float.parseFloat(LActual[2]);
				String marc = LActual[3];
				int cat = Integer.parseInt(LActual[4]);
				int stock = Integer.parseInt(LActual[5]);
				listaJuguetes.add(new Juguete(id,nom,pre,marc,cat,stock));
			}
			br.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void leerListaEscribirArchivo()
	{
		try 
		{
			URLConnection urlCon= url.openConnection();
			OutputStream outS = urlCon.getOutputStream();
//			OutputStreamWriter outSwr = new OutputStreamWriter(outS, "utf-8");
//			BufferedWriter buffwr = new BufferedWriter(outSwr);
//			Writer wr = buffwr;
			Writer wt = new BufferedWriter(new OutputStreamWriter(outS, "utf-8"));//url.openConnection().getOutputStream()
			
			for (Juguete j : listaJuguetes) 
			{
				wt.write(j.toString().concat("\n"));
			}
			wt.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
//	READ
	public static Juguete getJuguetes(int index)
	{
		return listaJuguetes.get(index);
	}
	public static int getInventarioSize()
	{
		return listaJuguetes.size();
	}
	public static int getIndexOf(Juguete jug)
	{
		return listaJuguetes.indexOf(jug);
	}

//	CRUD

//	create action directo con JulioCepeda.listaJuguete.add(toy);
	
//	read action directo con JulioCepeda.getJuguetes(int);
	
	public static void read()
	{
		
	}
	
	public static void update()
	{
		
	}
	
	public static void delete()
	{
		listaJuguetes.remove(getIndexOf(null));
	}
}
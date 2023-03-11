package jugueteria;

public class Juguete 
{
	private int id_jug;
	private String nom_jug;
	private float pre_jug;
	private String marc_jug;
	private int cat_jug;
	private int stock_jug;
	public Juguete(int id_jug, String nom_jug, float pre_jug, String marc_jug, int cat_jug, int stock_jug) 
	{
		this.id_jug = id_jug;
		this.nom_jug = nom_jug;
		this.pre_jug = pre_jug;
		this.marc_jug = marc_jug;
		this.cat_jug = cat_jug;
		this.stock_jug = stock_jug;
	}
	public int getId_jug() 
	{
		return id_jug;
	}
	public void setId_jug(int id_jug) 
	{
		this.id_jug = id_jug;
	}
	public String getNom_jug() 
	{
		return nom_jug;
	}
	public void setNom_jug(String nom_jug) 
	{
		this.nom_jug = nom_jug;
	}
	public float getPre_jug() 
	{
		return pre_jug;
	}
	public void setPre_jug(float pre_jug) 
	{
		this.pre_jug = pre_jug;
	}
	public String getMarc_jug() 
	{
		return marc_jug;
	}
	public void setMarc_jug(String marc_jug) 
	{
		this.marc_jug = marc_jug;
	}
	public int getCat_jug() 
	{
		return cat_jug;
	}
	public void setCat_jug(int cat_jug) 
	{
		this.cat_jug = cat_jug;
	}
	
	public int getStock_jug() 
	{
		return stock_jug;
	}
	public void setStock_jug(int stock_jug) 
	{
		this.stock_jug = stock_jug;
	}
	public String toString()
	{
//		esquemas
//		como un json
		return id_jug+","+nom_jug+","+pre_jug+","+marc_jug+","+cat_jug+","+stock_jug;
	}
}

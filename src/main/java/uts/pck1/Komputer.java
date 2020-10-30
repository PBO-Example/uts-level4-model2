//Komputer.java
package uts.pck1;
public abstract class Komputer{
	//atribut
	protected String jenis;
	protected int ukuranLayar;
	
	public abstract void setJenis(String jenis);
	public abstract void setUkuranLayar(int ukuranLayar);
	public abstract String getJenis( );
	public abstract int getUkuranLayar( );
}
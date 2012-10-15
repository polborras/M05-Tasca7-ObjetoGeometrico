class cuadrado extends ObjetoGeometrico 
{

	public double costat;
	
	public cuadrado(float x, float y, String c, double cos){
		super(x,y,c);
		this.costat=cos;
	}
	
	public double area()
	{
		double area = costat * costat;
		return area;
	}
	
	public double perimetre()
	{
		double perimetre = (costat * costat * costat * costat);
		return perimetre;
	}
	
	public String toString()
	{
		String dev = super.toString()+"Costat: "+costat;
		return dev;
	}
}

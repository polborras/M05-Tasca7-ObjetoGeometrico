
class circulo extends ObjetoGeometrico
{

	public double radi;
	
	public circulo(float x, float y, String c, double radi)
	{
		super(x, y, c);
		this.radi=radi;
	}
	
	public double area()
	{
		double area = 3.14*(radi*radi);
		return area;
	}
	public double perimetre()
	{
		double Perimetre = 2*3.14*radi;
		return Perimetre;
	}
	public String toString()
	{
		String dev = super.toString()+ "Radio"+radi;
		return dev;
	}

}


public class ObjetoGeometrico {

	public float coordx;
	public float coordy;
	public String color;
	
	public ObjetoGeometrico(float x, float y, String c) 
	{
		this.coordx = x;
		this.coordy = y;
		this.color = c;	
	}
	
	public String toString()
	{
		String dev = "Cordenada X: "+coordx+" Coordenada Y: "+coordy+" Color: "+color;
		return dev;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

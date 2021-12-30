package Ex2_3;

import junit.framework.TestCase;

public class ImageTest extends TestCase
{
	public void testContructor()
	{
		new Image(2000,2000,"anh","14/3/2003");
	}
	public void testIsportrait()
	{
		Image Image1 = new Image(200,200,"anh","14/3/2003");
		assertEquals(Image1.isportrait(), false);	
	}
	public void testSize()
	{
		Image Image1 = new Image(2000,2000,"anh","14/3/2003");
		assertEquals(Image1.size(),4000000);	
	}
	public void testIslarger()
	{
		Image Image1 = new Image(2000,2000,"anh","14/3/2003");
		Image Image2 = new Image(2000,2000,"anh","14/3/2003");
			
		assertEquals(Image1.islarger(Image2),true);	
	}
	
	public void same()
	{
		Image Image1 = new Image(2000,2000,"anh","14/3/2003");
		Image Image2 = new Image(2000,2000,"anh","14/3/2003");
			
		assertEquals(Image1.same(Image2),"same");	

	}
	public void sizeString()
	{
		Image Image1 = new Image(2000,2000,"anh","14/3/2003");
		Image Image2 = new Image(2000,2000,"anh","14/3/2003");
			
		assertEquals(Image1.sizeString(Image2),"lon");	

	}
}
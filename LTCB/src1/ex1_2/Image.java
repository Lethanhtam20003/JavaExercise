package ex1_2;

public class Image 
{
	/**
	 * height : chiều cao
	 */
	int height;
	/**
	 * width : chiều rộng
	 */
	int width;
	/**
	 * source  : nguồn góc
	 */
	String source;
	/**
	 * quality : chất lượng
	 */
	String quality;
	Image(int height, int width,String source,String quality)
	{
		this.height = height;
		this.quality = quality;
		this.width = width;
		this.source = source;
		
	}
}

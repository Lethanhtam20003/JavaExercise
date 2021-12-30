package Ex2_3;



public class Image {
	int width;
	int height;
	String source;
	String quality;
	/**
	 * @param width
	 * @param height
	 * @param source
	 * @param quality
	 */
	public Image(int width, int height, String source, String quality) 
	{
		this.width = width;
		this.height = height;
		this.source = source;
		this.quality = quality;
	}
	/**
	 *  xác định xem chiều cao của hình ảnh có lớn hơn chiều rộng của hình ảnh hay không;
	 * @return
	 */
	boolean isportrait()
		{
			return this.height > this.width;
		}

/**
 * tính toán số lượng pixel mà hình ảnh chứa
 * @return
 */
	int size()
		{
			return this.height*this.width;
		}
/**
 * xác định xem một hình ảnh có chứa nhiều pixel hơn một số hình ảnh khác hay không
 * @param orther
 * @return
 */
	boolean islarger(Image orther)
		{
			return this.height*this.width == orther.height*orther.width;
		}
/**
 * điều này xác định xem hình ảnh này có giống với hình ảnh đã cho hay không
 */
	String same(Image orther)
	{
				if(this.height*this.width == orther.height*orther.width)
				{
					return "same";
				}
				else
				{
					return "not same";
				}
	}

/**
 * sizeString tạo ra một trong ba chuỗi, tùy thuộc vào số lượng pixel trong hình ảnh:
"nhỏ" đối với hình ảnh có 10.000 pixel trở xuống;
"trung bình" cho hình ảnh có từ 10.001 đến 1.000.000 pixel;
"lớn" cho hình ảnh thậm chí còn lớn hơn tha
 * @param orther
 * @return
 */
	String sizeString(Image orther)
	{
		if(this.height*this.width < 10000 )
		{
			return "nho";
		}
		else if( 10000 < this.height*this.width && this.height*this.width < 1000000)
		{
			return "trung binh";
		}
		else
		{	
			return "lon";	
		}
	
	}
}

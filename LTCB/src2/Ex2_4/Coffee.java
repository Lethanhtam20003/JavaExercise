package Ex2_4;

public class Coffee 
{
	/**
	 * Sửa đổi hạng Cà phê để chi phí có tính đến chiết khấu hàng loạt:
. . . Phát triển một chương trình tính toán chi phí bán cà phê số lượng lớn tại một người bán cà
 phê đặc sản từ biên lai bao gồm loại cà phê, đơn giá và tổng số lượng (trọng lượng) đã bán. 
 Nếu giảm giá dưới 5.000 bảng Anh thì không được giảm giá. Đối với doanh số bán hàng từ 5.000 
 bảng đến 20.000 bảng, người bán sẽ chiết khấu 10%. Đối với doanh thu từ 20.000 bảng Anh trở lên,
  chiết khấu là 25%. . .
	 */
	String coffee;
	double price;
	int weight;
	
	/**
	 * @param coffee
	 * @param price
	 * @param weight
	 */
	public Coffee(String coffee, double price, int weight) {
		this.coffee = coffee;
		this.price = price;
		this.weight = weight;
	}
	double discount()
	{
		if(this.price * this.weight >20000)
		{
			return (this.price * this.weight)- (this.price * this.weight)*(25/100);
		}
		else if(this.price * this.weight < 20000 && this.price * this.weight > 5000)
		{
			return (this.price * this.weight)- (this.price * this.weight)*(10/100);
		}
		else
		{
			return (this.price * this.weight);
		}
		
	}
	
}

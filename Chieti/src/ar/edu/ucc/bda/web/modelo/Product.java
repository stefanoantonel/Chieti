package ar.edu.ucc.bda.web.modelo;


public abstract class Product {

	private int productId;
	private String name;
	private float salePrice;
	private MeasureUnit measureUnit;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}
	public MeasureUnit getMeasureUnit() {
		return measureUnit;
	}
	public void setMeasureUnit(MeasureUnit measureUnit) {
		this.measureUnit = measureUnit;
	}
	
	
	
}

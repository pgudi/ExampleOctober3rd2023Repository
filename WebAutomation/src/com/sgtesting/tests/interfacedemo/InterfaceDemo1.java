package com.sgtesting.tests.interfacedemo;
interface Product
{
	void showProductName(String name);
	static void showProductPrice(double price)
	{
		System.out.println("Price of the Product :"+price);
	}
}

class Lenovo implements Product
{

	@Override
	public void showProductName(String name) {
		System.out.println("Product Name :"+name);	
	}
	
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Lenovo laptop=new Lenovo();
		laptop.showProductName("Lenovo Think Pad");
		Product.showProductPrice(75000.00);
	}

}

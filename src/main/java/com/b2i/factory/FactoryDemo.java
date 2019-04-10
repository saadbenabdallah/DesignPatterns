package com.b2i.factory;

public class FactoryDemo {

	public static void main(String[] args) {

		Website site = WebsiteFactory.getWebSite(WebsiteType.BLOG);
		
		System.out.println(site.getPages());
		
		site = WebsiteFactory.getWebSite(WebsiteType.SHOP);
		
		System.out.println(site.getPages());
	}

}

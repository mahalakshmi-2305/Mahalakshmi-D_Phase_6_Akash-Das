package com.healthcare.app.global;

import java.util.ArrayList;
import java.util.List;

import com.healthcare.app.model.Product;

public class GlobalData {
	public static List<Product> cart;
	static {
		cart= new ArrayList<Product>();
	}

}

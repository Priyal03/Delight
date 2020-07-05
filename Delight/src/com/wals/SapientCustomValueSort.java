package com.wals;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SapientCustomValueSort {

	public static void main(String[] args) {

		Map<String, Product> mp = new HashMap<String, Product>();

		mp.put("U1", new Product("P1", new Double(210.34)));
		mp.put("U2", new Product("P2", new Double(10.34)));
		mp.put("U3", new Product("P3", new Double(310.34)));

		SapientCustomValueSort code = new SapientCustomValueSort();
		String result = code.fetchMeNthCostliestItemKeyorProductName(mp, 3, true);

		System.out.println(result);

	}

	public String fetchMeNthCostliestItemKeyorProductName(Map<String, Product> map, int intValue, boolean booleanVal) {

		String res = "The Product which is " + intValue + "th highest is ";

		if (map.size() < 1) {
			return "Invalid Inputs";
		}

		Set<Entry<String, Product>> entries = map.entrySet();

		List<Entry<String, Product>> list = entries.stream().collect(Collectors.toList());
		
		List<Product> vallist = map.values().stream().collect(Collectors.toList());
		
		Collections.sort(vallist, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
			
		});
		
	//	List<Map.Entry<Integer, Employee>> entryList = new ArrayList<Map.Entry<Integer, Employee>>(map.entrySet());

//        Collections.sort(
//                list, new Comparator<Map.Entry<String, Product>>() {
//            @Override
//            public int compare(Map.Entry<String, Product> integerEmployeeEntry,
//                               Map.Entry<String, Product> integerEmployeeEntry2) {
//                return integerEmployeeEntry.getValue().productPrice
//                        .compareTo(integerEmployeeEntry2.getValue().productPrice);
//            }
//        }
//    );

//		for (Product e : vallist) {
//
//			System.out.println(e.getKey() + " @ " + e.getValue().productPrice);
//		}
// Map.Entry<String,Product> entry=entries.get(entries.size());
//   
//   while(intValue-->0){
//     entry=entries.get(intValue);
//   }
//   
//   if(booleanVal)
//     res=res+entry.getKey());
//   else
//    res=res+entry.getValue().productName;
// 
		return res;
	}

}

class Product implements Comparable<Product> {

	public String productName;
	public double productPrice;

	Product(String name, double price) {

		productName = name;
		productPrice = price;
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return (o.productPrice>this.productPrice?-1:o.productPrice<this.productPrice?1:0);
	}

//	@Override
//	public int compareTo(Product o) {
//		// TODO Auto-generated method stub
//		return (this.productPrice>o.productPrice)?-1:(this.productPrice>o.productPrice)?1:0;
//	}
}
/*
 * <String,Product> param1 {UniqueGlobalId, {ProductName,ProductPrice}}
 * {"U1",{"P1",230.2}} {"U2",{"P2",20.2}} {"U3",{"P3",130.2}}
 * 
 * param2 intValue nth costliest item
 * 
 * 
 * param3 boolean if true return UniqueGlobalId and if false return ProductName
 * String fetchMeNthCostliestItemKeyorProductName(map,intValue,booleanVal)
 * 
 * fetchMeNthCostliestItemKeyorProductName(map,3,true) :- U2
 * 
 * fetchMeNthCostliestItemKeyorProductName(map,3,false) :- P2
 */

//class Shape{
//  int length;
//  int breadth;

//Shape(){
//System.out.println("No arg Cons");
//}

//  Shape(int b, int l){

//    this.length = l;
//    this.breadth=b;
//  }

//  public void display(){
//    System.out.println("In the shape base Class");
//  }

//}

//class Square extends Shape{

//public static void main(String args[]){
//Shape shape = new Shape(5,5);
//Shape poly = new Square();

//// Square(int l){

////   super(l,l);
//// }

//public void display(){

//  super.display();
//  System.out.println("In the Square Inherited Class");
//}

//  poly.display();
//  shape.display();
//}
//}

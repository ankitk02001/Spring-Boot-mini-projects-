package in.ankit.converter;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import in.ankit.binding.Address;
import in.ankit.binding.Order;

public class Converter {
	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Address address = new Address();
		address.setCity("Varanasi");
		address.setState("UttarPardesh");
		address.setCountry("India");

		Order order = new Order();
		order.setOrderId(101);
		order.setOrderBy("Amit");
		order.setOrderStatus("Confirmed");
		order.setBillAmount(556.4);
		order.setAddress(address);

		Gson gson = new Gson();
		String json = gson.toJson(order);
		System.out.println(json);// out put directly appear on console
		// {"orderId":101,"orderBy":"Amit","orderStatus":"Confirmed","billAmount":556.4,"address":{"city":"Varanasi","state":"UttarPardesh","country":"India"}}

		// now converting json to object
		Order parsedOrder = gson.fromJson(new FileReader("Order.json"), Order.class);
		System.out.println(parsedOrder);
	}
}
//output of above program
//{"orderId":101,"orderBy":"Amit","orderStatus":"Confirmed","billAmount":556.4,"address":{"city":"Varanasi","state":"UttarPardesh","country":"India"}}
//Order(orderId=101, orderBy=Amit, orderStatus=Confirmed, billAmount=556.4, address=Address(city=Varanasi, state=Uttar Pradesh, country=India))


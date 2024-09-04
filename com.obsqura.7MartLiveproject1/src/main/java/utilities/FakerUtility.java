package utilities;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
//if we wanted to add any fake text,classname
public class FakerUtility 
{
	public String getFakeFirstName() 
	{

		Faker faker = new Faker();

		Address address = faker.address();

		String text = address.firstName();

		return text;

	}

	public String getFakeLastName() 
	{

		Faker faker = new Faker();

		Address address = faker.address();

		String text = address.lastName();

		return text;

	}
}

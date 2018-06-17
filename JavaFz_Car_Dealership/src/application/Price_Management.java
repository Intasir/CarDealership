package application;

public class Price_Management {
	  String Car[]= {"Hatchback","Sedan","MPV","SUV","Crossover","Coupe"};
	  String Car_type[][]= {{"Maruti Suzuki Alto 800","Renault Kwid","Hyundai Grand i10"},{"Maruti Suzuki Ciaz"," Hyundai Elantra"},{"Maruti Suzuki Omni","Maruti Suzuki Eeco","Datsun GO+"},{"Land Rover Discovery Sport","Mahindra Scorpio","Mahindra Thar"},{"Maruti Suzuki S-Cross","Volvo S60 Cross Country"," Hyundai i20 Active"},{"Mercedes-Benz GLE Coupe","Ford Mustang","Audi R8","Maruti Suzuki S-Cross"}};
	  int Price_array[][]= {{30000,21000,25000},{14000,28000},{10000,11000,15034},{14000,16000,18000},{14000,12000,1000},{14000,34000,12000,11000}};
	public int carManagement(String Value) {
for (int i=0;i<Car.length;i++) {
	if(Value.replaceAll("\\s+","").equalsIgnoreCase(Car[i].replaceAll("\\s+",""))){
		return i;
	}
}
return 0;
	}
	
	public int carType(int i,String value)
	{
		for(int j=0;j<Car_type[i].length;j++)
		{
			if(value.replaceAll("\\s+","").equalsIgnoreCase(Car_type[i][j].replaceAll("\\s+",""))) {
				  return final_Function(i,j);
				}
		}
		return 0;
	}
	private int final_Function(int i, int j) {
		int price = 0;
		price=Price_array[i][j];
		return price;
	}
	 private static String removeSpaces(String input) {
		         return input.replaceAll(" ", "");
		     }

}


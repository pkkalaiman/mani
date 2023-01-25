class ManiHotel{

	   static String ManiHotelNames = "Grand Hotel";
		
	//static String ManiHotel [];
	
	public static void main(String a[])
	{
	//System.out.println("Welcome to" +	ManiHotel");
	
	  String ManiHotel[] ={"Mani non veg", "Mani veg hotel", "Mani biriyani", "Dhum biriyani", "Aaumbur biriyani"};
	
	System.out.println("List of ManiHotel");
	
	System.out.println("ManiHotel[0]"+" "+ 
	                   "ManiHotel[1]"+" "+ 
					   "ManiHotel[2]"+" "+ 
					   "ManiHotel[3]");
	
      for(int v=0; v<ManiHotel.length;v++)
	  {
       System.out.println(ManiHotel[v]+ " ");
	  
}
	}


}
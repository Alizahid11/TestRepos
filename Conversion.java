class Convert{
		public String sick(int n){

	int a;
	String x = " ";

			
			while (n>0){
			a = n % 2;
			
			
					x = a + "" + x;
					n = n/2;
				}
				return x;
	}
		public float hmmm(String x){

	int n; 
	float a;
	n=0;
	a=0;
	

		for (int i =x.length(); i>0; i--,n++){
					a+= Integer.parseInt(x.substring(i-1,i)) * Math.pow(2,n);

				}

					return a;
}
}

class Conversion{
	public static void main(String az[]){

		Convert z = new Convert(); //hi this is a comment
		
		System.out.println("Binary number:" + z.sick(25));
		System.out.println("Decimal number: " + z.hmmm("11001"));

	}
}
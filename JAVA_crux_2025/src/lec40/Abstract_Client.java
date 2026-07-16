package lec40;

public class Abstract_Client {

	Payment_Method ab =new Payment_Method() {
		
		@Override
		public void viewBal() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void pay() {
			// TODO Auto-generated method stub
			
		}
	};
	Upi_Payment upi= new Upi_Payment();
}

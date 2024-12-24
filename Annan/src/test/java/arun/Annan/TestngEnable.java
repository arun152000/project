package arun.Annan;


	import org.testng.annotations.Test;
	@Test(groups="arun")

	public class TestngEnable{

		@Test()
		public void editLead() {
			System.out.println("editLead");

		}
		
		@Test(enabled=false)
		public void deletelead() {
			System.out.println("deletelead");

		}

		@Test(priority=-1,enabled=false)
		public void creatLead() {
			System.out.println("creatLead");
		}
		
		@Test()
		public void duplicateLead() {
			System.out.println("duplicateLead");
		}
	}

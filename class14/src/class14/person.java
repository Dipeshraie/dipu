package class14;

public class person {
	
		private int id;
		private String name;
		private long contact;
		public person(int id, String name, long contact) {
			super();
			this.id=id;
			this.name=name;
			this.contact=contact;
		}
		public person() {
			super();
		}
		public void setID(int id) {
			this.id=id;
		}
		public int getId() {
			return this.id;
		}
		public long getContact() {
			return contact;
		}
		public void setContact(long contact) {
			this.contact = contact;
		}
		
}


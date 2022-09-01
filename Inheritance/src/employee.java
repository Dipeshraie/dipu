
public class employee extends person{
	int empId;
	String position;
	float salary;
	public void display() {
	super.display();
	System.out.println("National Id:"+empId+
			"\t name:"+position+"\t address"+salary);
}
	public void parentsDisplay() {
		super.display();
	}
}
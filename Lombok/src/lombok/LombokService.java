package lombok;

public class LombokService {
	public static void main(String[] args) {
		Lombok obj = new Lombok();
		
		obj.setId(1);
		obj.setName("testing lambok");
		
		System.out.println(obj);
	}
}

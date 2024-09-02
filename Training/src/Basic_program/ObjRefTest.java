package Basic_program;

public class ObjRefTest {
	public static void main(String[] args) {
		ObjRef o1 = ObjRef.createObjRef(6);
		System.out.println(o1.abc);
		
		System.out.println(ObjRef.createObjRef(10).abc);
	}

}

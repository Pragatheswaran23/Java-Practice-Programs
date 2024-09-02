package Basic_program;

public class ObjRef {
	double abc;
	
	ObjRef(double abc){
		this.abc = abc;
	}
	
	public static ObjRef createObjRef(double a) {
		return new ObjRef(a);
	}

}

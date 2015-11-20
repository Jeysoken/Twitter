package twitter;

public enum PhysicalType {

	MOCHE(true), MOYEN(true), BEAU(true), BG(true);
		
	private boolean getPhysicalType;

	public static PhysicalType CurrentPhysicalType;
	
	PhysicalType (boolean getPhysicalType) {
		this.getPhysicalType = getPhysicalType;
	}
	
	public boolean getPhysicalType() {
		return getPhysicalType;
	}
	
	public static void setPhysicalType(PhysicalType type) {
		PhysicalType.CurrentPhysicalType = type;
	}
	
}

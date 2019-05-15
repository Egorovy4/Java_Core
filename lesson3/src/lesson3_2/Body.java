package lesson3_2;

public class Body {
	private String type;
	private String color;

	public Body(String type, String color) {
		super();
		this.type = type;
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Body [type=" + type + ", color=" + color + "]";
	}
	
	public void addNewColorLayer(String newColor) {
		this.color += "/" + newColor;
	}
}

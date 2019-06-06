package lesson15;

public class Animal {
	public String type;
	public String name;
	private int age;

	public Animal(String type, String name, int age) {
		super();
		this.type = type;
		this.name = name;
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + ", age=" + age + "]";
	}

	private void myMethod(String s, int i) {
		for (int temp = 0; temp < i; temp++) {
			System.out.println(s + this.name + " !");
		}
	}

	private void myMethod(String s) {
		System.out.println(s + this.name + " !");
	}
}

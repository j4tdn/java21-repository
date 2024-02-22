package bean;

import java.util.Objects;

import common.Kind;

public class Dish {
	

	private String id;
	private String name;
	private int calories;
	private Kind kind;
	private boolean vegetarian;

	public Dish() {
	}

	public Dish(String id, String name, int calories, Kind kind, boolean vegetarian) {
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.kind = kind;
		this.vegetarian = vegetarian;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Dish)) {
			return false;
		}

		Dish dish = (Dish) o;
		return getId() == dish.getId();
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + calories + ", " + kind + ", " + vegetarian;
	}
	
	public static boolean isMeat(Dish dish) {
		return Kind.MEAT.equals(dish.getKind());
	}
}
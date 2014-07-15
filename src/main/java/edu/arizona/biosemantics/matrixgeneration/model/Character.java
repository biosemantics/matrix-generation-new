package edu.arizona.biosemantics.matrixgeneration.model;

public class Character {

	private String name;
	private String structureName;
	
	public Character(String name, String structureName) {
		this.name = name;
		this.structureName = structureName;
	}

	public String getName() {
		return name;
	}	
	
	public String getStructureName() {
		return structureName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((structureName == null) ? 0 : structureName.hashCode());
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
		Character other = (Character) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (structureName == null) {
			if (other.structureName != null)
				return false;
		} else if (!structureName.equals(other.structureName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name + " of " + structureName;
	}
}

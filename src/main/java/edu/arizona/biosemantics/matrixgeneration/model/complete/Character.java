package edu.arizona.biosemantics.matrixgeneration.model.complete;

import java.io.Serializable;


public class Character implements Comparable<Character>, Serializable {
	
	private String name;
	private String connector;
	private StructureIdentifier structureIdentifier;
	
	public Character(String name, String connector, StructureIdentifier structureIdentifier) {
		this.name = name;
		this.connector = connector;
		this.structureIdentifier = structureIdentifier;
	}

	public String getName() {
		return name;
	}
	
	public String getConnector() {
		return connector;
	}

	public StructureIdentifier getStructureIdentifier() {
		return structureIdentifier;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime
				* result
				+ ((structureIdentifier == null) ? 0 : structureIdentifier
						.hashCode());
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
		if (structureIdentifier == null) {
			if (other.structureIdentifier != null)
				return false;
		} else if (!structureIdentifier.equals(other.structureIdentifier))
			return false;
		return true;
	}

	@Override
	public int compareTo(Character character) {
		if(structureIdentifier.equals(character.getStructureIdentifier()))
			return name.compareTo(character.getName());
		return structureIdentifier.compareTo(character.getStructureIdentifier());
	}
	
	public String getDisplayName() {
		return name + " " + connector + " " + structureIdentifier.getDisplayName();
	}
	
}
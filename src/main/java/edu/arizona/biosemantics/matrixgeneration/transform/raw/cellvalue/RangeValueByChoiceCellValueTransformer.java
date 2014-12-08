package edu.arizona.biosemantics.matrixgeneration.transform.raw.cellvalue;

import java.util.List;

import edu.arizona.biosemantics.matrixgeneration.model.Value;
import edu.arizona.biosemantics.matrixgeneration.model.raw.CellValue;

public class RangeValueByChoiceCellValueTransformer implements ByChoiceCellValueTransformer {

	private List<String> prependModifierPatterns;
	private List<String> appendModifierPatterns;

	public RangeValueByChoiceCellValueTransformer(
			List<String> prependModifierPatterns,
			List<String> appendModifierPatterns) {
		this.prependModifierPatterns = prependModifierPatterns;
		this.appendModifierPatterns = appendModifierPatterns;
	}

	@Override
	public CellValue transform(Value value) {
		String result = "";
		String modifier = value.getModifier();
		if(modifier != null) {
			for(String prependModifierPattern : prependModifierPatterns) {
				if(modifier.matches(prependModifierPattern)) {
					result += modifier + " ";
					break;
				}
			}
		}
		
		String from = value.getFrom() == null ? value.getFromInclusive() : value.getFrom();
		String to = value.getTo() == null ? value.getToInclusive() : value.getTo();
		
		result += from + (value.getFromUnit() == null ? "" : value.getFromUnit()) +
				" - " + to + (value.getToUnit() == null ? "" : value.getToUnit());
		
		if(modifier != null) {
			for(String appendModifierPattern : appendModifierPatterns) {
				if(modifier.matches(appendModifierPattern)) {
					result += " " + modifier;
					break;
				}
			}
		}
		
		return new CellValue(result.trim(), value);
	}

	@Override
	public boolean isTransformable(Value value) {
		return value.getCharType() != null && value.getCharType().equals("range_value");
	}


}
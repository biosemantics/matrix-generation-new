package edu.arizona.biosemantics.matrixgeneration.transform.raw.cellvalue;

import edu.arizona.biosemantics.matrixgeneration.model.Value;
import edu.arizona.biosemantics.matrixgeneration.model.raw.CellValue;

public interface CellValueTransformer {

	public CellValue transform(Value value);

}
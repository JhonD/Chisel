/*
 * generated by Xtext
 */
package de.ubt.ai7.csv_validator.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.ubt.ai7.csv_validator.services.SculptGrammarAccess;

public class SculptParser extends AbstractContentAssistParser {
	
	@Inject
	private SculptGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.ubt.ai7.csv_validator.ui.contentassist.antlr.internal.InternalSculptParser createParser() {
		de.ubt.ai7.csv_validator.ui.contentassist.antlr.internal.InternalSculptParser result = new de.ubt.ai7.csv_validator.ui.contentassist.antlr.internal.InternalSculptParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives_0_4_6_0(), "rule__Type__Alternatives_0_4_6_0");
					put(grammarAccess.getTypeAccess().getAlternatives_0_4_7_0(), "rule__Type__Alternatives_0_4_7_0");
					put(grammarAccess.getTypeAccess().getAlternatives_2_3_0_2_2_2(), "rule__Type__Alternatives_2_3_0_2_2_2");
					put(grammarAccess.getAbstractTokenAccess().getAlternatives(), "rule__AbstractToken__Alternatives");
					put(grammarAccess.getCompoundTypePrimitiveAccess().getAlternatives(), "rule__CompoundTypePrimitive__Alternatives");
					put(grammarAccess.getConstraintAccess().getAlternatives(), "rule__Constraint__Alternatives");
					put(grammarAccess.getNe_NotAccess().getAlternatives(), "rule__Ne_Not__Alternatives");
					put(grammarAccess.getNe_PathAccess().getAlternatives(), "rule__Ne_Path__Alternatives");
					put(grammarAccess.getNe_PrimitiveAccess().getAlternatives(), "rule__Ne_Primitive__Alternatives");
					put(grammarAccess.getNe_AtomicAccess().getAlternatives(), "rule__Ne_Atomic__Alternatives");
					put(grammarAccess.getNe_ComparisonAccess().getAlternatives(), "rule__Ne_Comparison__Alternatives");
					put(grammarAccess.getTypeSpecifierAccess().getAlternatives(), "rule__TypeSpecifier__Alternatives");
					put(grammarAccess.getNe_Atomic_Node_TestAccess().getAlternatives(), "rule__Ne_Atomic_Node_Test__Alternatives");
					put(grammarAccess.getPe_RegexAccess().getAlternatives_1(), "rule__Pe_Regex__Alternatives_1");
					put(grammarAccess.getPe_PrimitiveAccess().getAlternatives(), "rule__Pe_Primitive__Alternatives");
					put(grammarAccess.getPe_AtomicAccess().getAxesAlternatives_1_0(), "rule__Pe_Atomic__AxesAlternatives_1_0");
					put(grammarAccess.getPe_AtomicAccess().getAlternatives_2(), "rule__Pe_Atomic__Alternatives_2");
					put(grammarAccess.getCe_RecursiveAccess().getAlternatives_1(), "rule__Ce_Recursive__Alternatives_1");
					put(grammarAccess.getCe_PrimitiveAccess().getAlternatives(), "rule__Ce_Primitive__Alternatives");
					put(grammarAccess.getCe_AtomicAccess().getAlternatives(), "rule__Ce_Atomic__Alternatives");
					put(grammarAccess.getCe_ComparisonAccess().getAlternatives(), "rule__Ce_Comparison__Alternatives");
					put(grammarAccess.getCe_ComparisonAccess().getAlternatives_2_1(), "rule__Ce_Comparison__Alternatives_2_1");
					put(grammarAccess.getTLOutputPrimitiveAccess().getAlternatives(), "rule__TLOutputPrimitive__Alternatives");
					put(grammarAccess.getTL_Ce_RecursiveAccess().getAlternatives_1(), "rule__TL_Ce_Recursive__Alternatives_1");
					put(grammarAccess.getTL_Ce_AtomicAccess().getAlternatives(), "rule__TL_Ce_Atomic__Alternatives");
					put(grammarAccess.getTLStatementAccess().getAlternatives(), "rule__TLStatement__Alternatives");
					put(grammarAccess.getTLBoolExprAccess().getAlternatives(), "rule__TLBoolExpr__Alternatives");
					put(grammarAccess.getRowColAccess().getAlternatives(), "rule__RowCol__Alternatives");
					put(grammarAccess.getComparatorAccess().getAlternatives(), "rule__Comparator__Alternatives");
					put(grammarAccess.getValidationModeAccess().getAlternatives(), "rule__ValidationMode__Alternatives");
					put(grammarAccess.getTLLoopModeAccess().getAlternatives(), "rule__TLLoopMode__Alternatives");
					put(grammarAccess.getSculptAccess().getGroup(), "rule__Sculpt__Group__0");
					put(grammarAccess.getSculptAccess().getGroup_1(), "rule__Sculpt__Group_1__0");
					put(grammarAccess.getSculptAccess().getGroup_2(), "rule__Sculpt__Group_2__0");
					put(grammarAccess.getSculptAccess().getGroup_3(), "rule__Sculpt__Group_3__0");
					put(grammarAccess.getSculptAccess().getGroup_4(), "rule__Sculpt__Group_4__0");
					put(grammarAccess.getSculptAccess().getGroup_5(), "rule__Sculpt__Group_5__0");
					put(grammarAccess.getSculptAccess().getGroup_6(), "rule__Sculpt__Group_6__0");
					put(grammarAccess.getDelimitersAccess().getGroup_0_0(), "rule__Delimiters__Group_0_0__0");
					put(grammarAccess.getDelimitersAccess().getGroup_0_1(), "rule__Delimiters__Group_0_1__0");
					put(grammarAccess.getDelimitersAccess().getGroup_1(), "rule__Delimiters__Group_1__0");
					put(grammarAccess.getTypeAccess().getGroup_0(), "rule__Type__Group_0__0");
					put(grammarAccess.getTypeAccess().getGroup_0_3(), "rule__Type__Group_0_3__0");
					put(grammarAccess.getTypeAccess().getGroup_0_4_0(), "rule__Type__Group_0_4_0__0");
					put(grammarAccess.getTypeAccess().getGroup_0_4_1(), "rule__Type__Group_0_4_1__0");
					put(grammarAccess.getTypeAccess().getGroup_0_4_2(), "rule__Type__Group_0_4_2__0");
					put(grammarAccess.getTypeAccess().getGroup_0_4_3(), "rule__Type__Group_0_4_3__0");
					put(grammarAccess.getTypeAccess().getGroup_0_4_4(), "rule__Type__Group_0_4_4__0");
					put(grammarAccess.getTypeAccess().getGroup_0_4_5(), "rule__Type__Group_0_4_5__0");
					put(grammarAccess.getTypeAccess().getGroup_0_4_6(), "rule__Type__Group_0_4_6__0");
					put(grammarAccess.getTypeAccess().getGroup_0_4_7(), "rule__Type__Group_0_4_7__0");
					put(grammarAccess.getTypeAccess().getGroup_0_4_8(), "rule__Type__Group_0_4_8__0");
					put(grammarAccess.getTypeAccess().getGroup_0_4_9(), "rule__Type__Group_0_4_9__0");
					put(grammarAccess.getTypeAccess().getGroup_0_4_10(), "rule__Type__Group_0_4_10__0");
					put(grammarAccess.getTypeAccess().getGroup_0_4_11(), "rule__Type__Group_0_4_11__0");
					put(grammarAccess.getTypeAccess().getGroup_1(), "rule__Type__Group_1__0");
					put(grammarAccess.getTypeAccess().getGroup_1_3(), "rule__Type__Group_1_3__0");
					put(grammarAccess.getTypeAccess().getGroup_1_5_0(), "rule__Type__Group_1_5_0__0");
					put(grammarAccess.getTypeAccess().getGroup_1_5_1(), "rule__Type__Group_1_5_1__0");
					put(grammarAccess.getTypeAccess().getGroup_2(), "rule__Type__Group_2__0");
					put(grammarAccess.getTypeAccess().getGroup_2_3_0(), "rule__Type__Group_2_3_0__0");
					put(grammarAccess.getTypeAccess().getGroup_2_3_0_2_0(), "rule__Type__Group_2_3_0_2_0__0");
					put(grammarAccess.getTypeAccess().getGroup_2_3_0_2_1(), "rule__Type__Group_2_3_0_2_1__0");
					put(grammarAccess.getTypeAccess().getGroup_2_3_0_2_2(), "rule__Type__Group_2_3_0_2_2__0");
					put(grammarAccess.getTypeAccess().getGroup_2_3_0_2_3(), "rule__Type__Group_2_3_0_2_3__0");
					put(grammarAccess.getTypeAccess().getGroup_2_3_1(), "rule__Type__Group_2_3_1__0");
					put(grammarAccess.getTypeAccess().getGroup_2_3_2(), "rule__Type__Group_2_3_2__0");
					put(grammarAccess.getAbstractTokenAccess().getGroup_0(), "rule__AbstractToken__Group_0__0");
					put(grammarAccess.getAbstractTokenAccess().getGroup_1(), "rule__AbstractToken__Group_1__0");
					put(grammarAccess.getTokenAccess().getGroup(), "rule__Token__Group__0");
					put(grammarAccess.getCompoundTypePrimitiveAccess().getGroup_0(), "rule__CompoundTypePrimitive__Group_0__0");
					put(grammarAccess.getCompoundTypePrimitiveAccess().getGroup_1(), "rule__CompoundTypePrimitive__Group_1__0");
					put(grammarAccess.getRegionTokenAccess().getGroup(), "rule__RegionToken__Group__0");
					put(grammarAccess.getContentConstraintAccess().getGroup(), "rule__ContentConstraint__Group__0");
					put(grammarAccess.getPrimaryKeyConstraintAccess().getGroup(), "rule__PrimaryKeyConstraint__Group__0");
					put(grammarAccess.getForeignKeyConstraintAccess().getGroup(), "rule__ForeignKeyConstraint__Group__0");
					put(grammarAccess.getTupleSelectorAccess().getGroup(), "rule__TupleSelector__Group__0");
					put(grammarAccess.getTupleSelectorAccess().getGroup_3(), "rule__TupleSelector__Group_3__0");
					put(grammarAccess.getTransformationProgramAccess().getGroup(), "rule__TransformationProgram__Group__0");
					put(grammarAccess.getNe_OrAccess().getGroup(), "rule__Ne_Or__Group__0");
					put(grammarAccess.getNe_OrAccess().getGroup_1(), "rule__Ne_Or__Group_1__0");
					put(grammarAccess.getNe_AndAccess().getGroup(), "rule__Ne_And__Group__0");
					put(grammarAccess.getNe_AndAccess().getGroup_1(), "rule__Ne_And__Group_1__0");
					put(grammarAccess.getNe_NotAccess().getGroup_0(), "rule__Ne_Not__Group_0__0");
					put(grammarAccess.getNe_PathAccess().getGroup_0(), "rule__Ne_Path__Group_0__0");
					put(grammarAccess.getNe_PathAccess().getGroup_0_1(), "rule__Ne_Path__Group_0_1__0");
					put(grammarAccess.getNe_PathAccess().getGroup_0_1_1(), "rule__Ne_Path__Group_0_1_1__0");
					put(grammarAccess.getNe_PathAccess().getGroup_1(), "rule__Ne_Path__Group_1__0");
					put(grammarAccess.getNe_PathAccess().getGroup_2(), "rule__Ne_Path__Group_2__0");
					put(grammarAccess.getNe_PrimitiveAccess().getGroup_0(), "rule__Ne_Primitive__Group_0__0");
					put(grammarAccess.getNe_AtomicAccess().getGroup_1(), "rule__Ne_Atomic__Group_1__0");
					put(grammarAccess.getNe_AtomicAccess().getGroup_2(), "rule__Ne_Atomic__Group_2__0");
					put(grammarAccess.getNe_AtomicAccess().getGroup_3(), "rule__Ne_Atomic__Group_3__0");
					put(grammarAccess.getNe_AtomicAccess().getGroup_4(), "rule__Ne_Atomic__Group_4__0");
					put(grammarAccess.getNe_AtomicAccess().getGroup_5(), "rule__Ne_Atomic__Group_5__0");
					put(grammarAccess.getNe_AtomicAccess().getGroup_6(), "rule__Ne_Atomic__Group_6__0");
					put(grammarAccess.getNe_ComparisonAccess().getGroup_0(), "rule__Ne_Comparison__Group_0__0");
					put(grammarAccess.getNe_ComparisonAccess().getGroup_1(), "rule__Ne_Comparison__Group_1__0");
					put(grammarAccess.getTypeSpecifierAccess().getGroup_0(), "rule__TypeSpecifier__Group_0__0");
					put(grammarAccess.getTypeSpecifierAccess().getGroup_0_3(), "rule__TypeSpecifier__Group_0_3__0");
					put(grammarAccess.getTypeSpecifierAccess().getGroup_1(), "rule__TypeSpecifier__Group_1__0");
					put(grammarAccess.getNe_Atomic_Node_TestAccess().getGroup_0(), "rule__Ne_Atomic_Node_Test__Group_0__0");
					put(grammarAccess.getNe_Atomic_Node_TestAccess().getGroup_1(), "rule__Ne_Atomic_Node_Test__Group_1__0");
					put(grammarAccess.getPath_ExpressionAccess().getGroup(), "rule__Path_Expression__Group__0");
					put(grammarAccess.getPath_ExpressionAccess().getGroup_1(), "rule__Path_Expression__Group_1__0");
					put(grammarAccess.getPath_ExpressionAccess().getGroup_1_1(), "rule__Path_Expression__Group_1_1__0");
					put(grammarAccess.getPe_RegexAccess().getGroup(), "rule__Pe_Regex__Group__0");
					put(grammarAccess.getPe_RegexAccess().getGroup_1_0(), "rule__Pe_Regex__Group_1_0__0");
					put(grammarAccess.getPe_RegexAccess().getGroup_1_1(), "rule__Pe_Regex__Group_1_1__0");
					put(grammarAccess.getPe_RegexAccess().getGroup_1_2(), "rule__Pe_Regex__Group_1_2__0");
					put(grammarAccess.getPe_PrimitiveAccess().getGroup_0(), "rule__Pe_Primitive__Group_0__0");
					put(grammarAccess.getPe_OrAccess().getGroup(), "rule__Pe_Or__Group__0");
					put(grammarAccess.getPe_OrAccess().getGroup_1(), "rule__Pe_Or__Group_1__0");
					put(grammarAccess.getPe_AtomicAccess().getGroup(), "rule__Pe_Atomic__Group__0");
					put(grammarAccess.getPe_AtomicAccess().getGroup_2_0(), "rule__Pe_Atomic__Group_2_0__0");
					put(grammarAccess.getPe_AtomicAccess().getGroup_3(), "rule__Pe_Atomic__Group_3__0");
					put(grammarAccess.getCe_OrAccess().getGroup(), "rule__Ce_Or__Group__0");
					put(grammarAccess.getCe_OrAccess().getGroup_1(), "rule__Ce_Or__Group_1__0");
					put(grammarAccess.getCe_ListAccess().getGroup(), "rule__Ce_List__Group__0");
					put(grammarAccess.getCe_ListAccess().getGroup_1(), "rule__Ce_List__Group_1__0");
					put(grammarAccess.getCe_RecursiveAccess().getGroup(), "rule__Ce_Recursive__Group__0");
					put(grammarAccess.getCe_RecursiveAccess().getGroup_1_0(), "rule__Ce_Recursive__Group_1_0__0");
					put(grammarAccess.getCe_RecursiveAccess().getGroup_1_1(), "rule__Ce_Recursive__Group_1_1__0");
					put(grammarAccess.getCe_RecursiveAccess().getGroup_1_2(), "rule__Ce_Recursive__Group_1_2__0");
					put(grammarAccess.getCe_PrimitiveAccess().getGroup_0(), "rule__Ce_Primitive__Group_0__0");
					put(grammarAccess.getCe_AtomicAccess().getGroup_0(), "rule__Ce_Atomic__Group_0__0");
					put(grammarAccess.getCe_AtomicAccess().getGroup_1(), "rule__Ce_Atomic__Group_1__0");
					put(grammarAccess.getCe_AtomicAccess().getGroup_2(), "rule__Ce_Atomic__Group_2__0");
					put(grammarAccess.getCe_AtomicAccess().getGroup_3(), "rule__Ce_Atomic__Group_3__0");
					put(grammarAccess.getCe_AtomicAccess().getGroup_4(), "rule__Ce_Atomic__Group_4__0");
					put(grammarAccess.getCe_ComparisonAccess().getGroup_0(), "rule__Ce_Comparison__Group_0__0");
					put(grammarAccess.getCe_ComparisonAccess().getGroup_1(), "rule__Ce_Comparison__Group_1__0");
					put(grammarAccess.getCe_ComparisonAccess().getGroup_2(), "rule__Ce_Comparison__Group_2__0");
					put(grammarAccess.getCe_ComparisonAccess().getGroup_2_1_0(), "rule__Ce_Comparison__Group_2_1_0__0");
					put(grammarAccess.getTLOutputPrimitiveAccess().getGroup_0(), "rule__TLOutputPrimitive__Group_0__0");
					put(grammarAccess.getTLOutputPrimitiveAccess().getGroup_1(), "rule__TLOutputPrimitive__Group_1__0");
					put(grammarAccess.getTL_Ce_ListAccess().getGroup(), "rule__TL_Ce_List__Group__0");
					put(grammarAccess.getTL_Ce_ListAccess().getGroup_2(), "rule__TL_Ce_List__Group_2__0");
					put(grammarAccess.getTL_Ce_RecursiveAccess().getGroup(), "rule__TL_Ce_Recursive__Group__0");
					put(grammarAccess.getTL_Ce_RecursiveAccess().getGroup_1_0(), "rule__TL_Ce_Recursive__Group_1_0__0");
					put(grammarAccess.getTL_Ce_RecursiveAccess().getGroup_1_1(), "rule__TL_Ce_Recursive__Group_1_1__0");
					put(grammarAccess.getTL_Ce_RecursiveAccess().getGroup_1_2(), "rule__TL_Ce_Recursive__Group_1_2__0");
					put(grammarAccess.getTL_Ce_AtomicAccess().getGroup_0(), "rule__TL_Ce_Atomic__Group_0__0");
					put(grammarAccess.getTL_Ce_AtomicAccess().getGroup_1(), "rule__TL_Ce_Atomic__Group_1__0");
					put(grammarAccess.getTL_Ce_AtomicAccess().getGroup_2(), "rule__TL_Ce_Atomic__Group_2__0");
					put(grammarAccess.getTL_Ce_AtomicAccess().getGroup_3(), "rule__TL_Ce_Atomic__Group_3__0");
					put(grammarAccess.getTL_Ce_AtomicAccess().getGroup_4(), "rule__TL_Ce_Atomic__Group_4__0");
					put(grammarAccess.getTLOutputAccess().getGroup(), "rule__TLOutput__Group__0");
					put(grammarAccess.getTLOutputAccess().getGroup_2(), "rule__TLOutput__Group_2__0");
					put(grammarAccess.getTLOutputAccess().getGroup_2_1(), "rule__TLOutput__Group_2_1__0");
					put(grammarAccess.getTLLoopAccess().getGroup(), "rule__TLLoop__Group__0");
					put(grammarAccess.getTLLoopAccess().getGroup_4(), "rule__TLLoop__Group_4__0");
					put(grammarAccess.getTLLoopAccess().getGroup_8(), "rule__TLLoop__Group_8__0");
					put(grammarAccess.getTLIfAccess().getGroup(), "rule__TLIf__Group__0");
					put(grammarAccess.getTLIfAccess().getGroup_7(), "rule__TLIf__Group_7__0");
					put(grammarAccess.getTLBoolExprNotAccess().getGroup(), "rule__TLBoolExprNot__Group__0");
					put(grammarAccess.getTLBoolExprEmptyAccess().getGroup(), "rule__TLBoolExprEmpty__Group__0");
					put(grammarAccess.getSculptAccess().getDelimiterAssignment_1_1(), "rule__Sculpt__DelimiterAssignment_1_1");
					put(grammarAccess.getSculptAccess().getTypesAssignment_2_1(), "rule__Sculpt__TypesAssignment_2_1");
					put(grammarAccess.getSculptAccess().getTokensAssignment_3_1(), "rule__Sculpt__TokensAssignment_3_1");
					put(grammarAccess.getSculptAccess().getRegionTokensAssignment_4_1(), "rule__Sculpt__RegionTokensAssignment_4_1");
					put(grammarAccess.getSculptAccess().getConstraintsAssignment_5_1(), "rule__Sculpt__ConstraintsAssignment_5_1");
					put(grammarAccess.getSculptAccess().getTransformationProgramAssignment_6_1(), "rule__Sculpt__TransformationProgramAssignment_6_1");
					put(grammarAccess.getDelimitersAccess().getRowDelimAssignment_0_0_2(), "rule__Delimiters__RowDelimAssignment_0_0_2");
					put(grammarAccess.getDelimitersAccess().getColDelimAssignment_0_1_2(), "rule__Delimiters__ColDelimAssignment_0_1_2");
					put(grammarAccess.getDelimitersAccess().getListDelimAssignment_1_2(), "rule__Delimiters__ListDelimAssignment_1_2");
					put(grammarAccess.getTypeAccess().getNameAssignment_0_1(), "rule__Type__NameAssignment_0_1");
					put(grammarAccess.getTypeAccess().getBaseAssignment_0_3_2(), "rule__Type__BaseAssignment_0_3_2");
					put(grammarAccess.getTypeAccess().getFormatAssignment_0_4_0_2(), "rule__Type__FormatAssignment_0_4_0_2");
					put(grammarAccess.getTypeAccess().getDecimalCharAssignment_0_4_1_2(), "rule__Type__DecimalCharAssignment_0_4_1_2");
					put(grammarAccess.getTypeAccess().getGroupCharAssignment_0_4_2_2(), "rule__Type__GroupCharAssignment_0_4_2_2");
					put(grammarAccess.getTypeAccess().getLengthAssignment_0_4_3_2(), "rule__Type__LengthAssignment_0_4_3_2");
					put(grammarAccess.getTypeAccess().getMinLengthAssignment_0_4_4_2(), "rule__Type__MinLengthAssignment_0_4_4_2");
					put(grammarAccess.getTypeAccess().getMaxLengthAssignment_0_4_5_2(), "rule__Type__MaxLengthAssignment_0_4_5_2");
					put(grammarAccess.getTypeAccess().getMinimumAssignment_0_4_6_2(), "rule__Type__MinimumAssignment_0_4_6_2");
					put(grammarAccess.getTypeAccess().getMaximumAssignment_0_4_7_2(), "rule__Type__MaximumAssignment_0_4_7_2");
					put(grammarAccess.getTypeAccess().getMinExclusiveAssignment_0_4_8_2(), "rule__Type__MinExclusiveAssignment_0_4_8_2");
					put(grammarAccess.getTypeAccess().getMaxExclusiveAssignment_0_4_9_2(), "rule__Type__MaxExclusiveAssignment_0_4_9_2");
					put(grammarAccess.getTypeAccess().getDefaultValueAssignment_0_4_10_2(), "rule__Type__DefaultValueAssignment_0_4_10_2");
					put(grammarAccess.getTypeAccess().getEmptyValueAssignment_0_4_11_2(), "rule__Type__EmptyValueAssignment_0_4_11_2");
					put(grammarAccess.getTypeAccess().getNameAssignment_1_1(), "rule__Type__NameAssignment_1_1");
					put(grammarAccess.getTypeAccess().getPrimitivesAssignment_1_3_0(), "rule__Type__PrimitivesAssignment_1_3_0");
					put(grammarAccess.getTypeAccess().getPrimitivesAssignment_1_4(), "rule__Type__PrimitivesAssignment_1_4");
					put(grammarAccess.getTypeAccess().getDefaultValueAssignment_1_5_0_2(), "rule__Type__DefaultValueAssignment_1_5_0_2");
					put(grammarAccess.getTypeAccess().getEmptyValueAssignment_1_5_1_2(), "rule__Type__EmptyValueAssignment_1_5_1_2");
					put(grammarAccess.getTypeAccess().getNameAssignment_2_1(), "rule__Type__NameAssignment_2_1");
					put(grammarAccess.getTypeAccess().getBaseAssignment_2_3_0_2_0_2(), "rule__Type__BaseAssignment_2_3_0_2_0_2");
					put(grammarAccess.getTypeAccess().getMinElementsAssignment_2_3_0_2_1_2(), "rule__Type__MinElementsAssignment_2_3_0_2_1_2");
					put(grammarAccess.getTypeAccess().getMaxElementsAssignment_2_3_0_2_2_2_0(), "rule__Type__MaxElementsAssignment_2_3_0_2_2_2_0");
					put(grammarAccess.getTypeAccess().getSeparatorAssignment_2_3_0_2_3_2(), "rule__Type__SeparatorAssignment_2_3_0_2_3_2");
					put(grammarAccess.getTypeAccess().getDefaultValueAssignment_2_3_1_2(), "rule__Type__DefaultValueAssignment_2_3_1_2");
					put(grammarAccess.getTypeAccess().getEmptyValueAssignment_2_3_2_2(), "rule__Type__EmptyValueAssignment_2_3_2_2");
					put(grammarAccess.getAbstractTokenAccess().getNameAssignment_0_1(), "rule__AbstractToken__NameAssignment_0_1");
					put(grammarAccess.getAbstractTokenAccess().getTokenRegexAssignment_0_3(), "rule__AbstractToken__TokenRegexAssignment_0_3");
					put(grammarAccess.getAbstractTokenAccess().getNameAssignment_1_1(), "rule__AbstractToken__NameAssignment_1_1");
					put(grammarAccess.getAbstractTokenAccess().getRegionAssignment_1_3(), "rule__AbstractToken__RegionAssignment_1_3");
					put(grammarAccess.getTokenAccess().getNameAssignment_1(), "rule__Token__NameAssignment_1");
					put(grammarAccess.getTokenAccess().getTokenRegexAssignment_3(), "rule__Token__TokenRegexAssignment_3");
					put(grammarAccess.getCompoundTypePrimitiveAccess().getTextAssignment_0_1(), "rule__CompoundTypePrimitive__TextAssignment_0_1");
					put(grammarAccess.getCompoundTypePrimitiveAccess().getTypeAssignment_1_1(), "rule__CompoundTypePrimitive__TypeAssignment_1_1");
					put(grammarAccess.getRegionTokenAccess().getNameAssignment_1(), "rule__RegionToken__NameAssignment_1");
					put(grammarAccess.getRegionTokenAccess().getRegionAssignment_3(), "rule__RegionToken__RegionAssignment_3");
					put(grammarAccess.getContentConstraintAccess().getRegionAssignment_0(), "rule__ContentConstraint__RegionAssignment_0");
					put(grammarAccess.getContentConstraintAccess().getValidationModeAssignment_1(), "rule__ContentConstraint__ValidationModeAssignment_1");
					put(grammarAccess.getContentConstraintAccess().getContentExpressionAssignment_2(), "rule__ContentConstraint__ContentExpressionAssignment_2");
					put(grammarAccess.getPrimaryKeyConstraintAccess().getNameAssignment_2(), "rule__PrimaryKeyConstraint__NameAssignment_2");
					put(grammarAccess.getPrimaryKeyConstraintAccess().getTupleSelectorAssignment_4(), "rule__PrimaryKeyConstraint__TupleSelectorAssignment_4");
					put(grammarAccess.getForeignKeyConstraintAccess().getTupleSelectorAssignment_2(), "rule__ForeignKeyConstraint__TupleSelectorAssignment_2");
					put(grammarAccess.getForeignKeyConstraintAccess().getReferencedRelationAssignment_4(), "rule__ForeignKeyConstraint__ReferencedRelationAssignment_4");
					put(grammarAccess.getTupleSelectorAccess().getRegionAssignment_0(), "rule__TupleSelector__RegionAssignment_0");
					put(grammarAccess.getTupleSelectorAccess().getSelectorsAssignment_2(), "rule__TupleSelector__SelectorsAssignment_2");
					put(grammarAccess.getTupleSelectorAccess().getSelectorsAssignment_3_1(), "rule__TupleSelector__SelectorsAssignment_3_1");
					put(grammarAccess.getTransformationProgramAccess().getDelimiterAssignment_0(), "rule__TransformationProgram__DelimiterAssignment_0");
					put(grammarAccess.getTransformationProgramAccess().getStatementsAssignment_1(), "rule__TransformationProgram__StatementsAssignment_1");
					put(grammarAccess.getNe_OrAccess().getRightAssignment_1_2(), "rule__Ne_Or__RightAssignment_1_2");
					put(grammarAccess.getNe_AndAccess().getRightAssignment_1_2(), "rule__Ne_And__RightAssignment_1_2");
					put(grammarAccess.getNe_NotAccess().getRegionAssignment_0_2(), "rule__Ne_Not__RegionAssignment_0_2");
					put(grammarAccess.getNe_PathAccess().getPathAssignment_0_1_1_1(), "rule__Ne_Path__PathAssignment_0_1_1_1");
					put(grammarAccess.getNe_PathAccess().getPathAssignment_1_2(), "rule__Ne_Path__PathAssignment_1_2");
					put(grammarAccess.getNe_PathAccess().getPathAssignment_2_1(), "rule__Ne_Path__PathAssignment_2_1");
					put(grammarAccess.getNe_AtomicAccess().getModeAssignment_1_1(), "rule__Ne_Atomic__ModeAssignment_1_1");
					put(grammarAccess.getNe_AtomicAccess().getRowAssignment_1_3(), "rule__Ne_Atomic__RowAssignment_1_3");
					put(grammarAccess.getNe_AtomicAccess().getColumnAssignment_1_5(), "rule__Ne_Atomic__ColumnAssignment_1_5");
					put(grammarAccess.getNe_AtomicAccess().getModeAssignment_2_1(), "rule__Ne_Atomic__ModeAssignment_2_1");
					put(grammarAccess.getNe_AtomicAccess().getIndexAssignment_2_3(), "rule__Ne_Atomic__IndexAssignment_2_3");
					put(grammarAccess.getNe_AtomicAccess().getModeAssignment_3_1(), "rule__Ne_Atomic__ModeAssignment_3_1");
					put(grammarAccess.getNe_AtomicAccess().getTokenAssignment_3_3(), "rule__Ne_Atomic__TokenAssignment_3_3");
					put(grammarAccess.getNe_AtomicAccess().getModeAssignment_4_1(), "rule__Ne_Atomic__ModeAssignment_4_1");
					put(grammarAccess.getNe_AtomicAccess().getStringAssignment_4_3(), "rule__Ne_Atomic__StringAssignment_4_3");
					put(grammarAccess.getNe_AtomicAccess().getModeAssignment_5_1(), "rule__Ne_Atomic__ModeAssignment_5_1");
					put(grammarAccess.getNe_ComparisonAccess().getTypeAssignment_0_0(), "rule__Ne_Comparison__TypeAssignment_0_0");
					put(grammarAccess.getNe_ComparisonAccess().getTypeSpecifierAssignment_0_1(), "rule__Ne_Comparison__TypeSpecifierAssignment_0_1");
					put(grammarAccess.getNe_ComparisonAccess().getCompAssignment_0_2(), "rule__Ne_Comparison__CompAssignment_0_2");
					put(grammarAccess.getNe_ComparisonAccess().getValueAssignment_0_3(), "rule__Ne_Comparison__ValueAssignment_0_3");
					put(grammarAccess.getNe_ComparisonAccess().getValueAssignment_1_1(), "rule__Ne_Comparison__ValueAssignment_1_1");
					put(grammarAccess.getNe_ComparisonAccess().getCompAssignment_1_2(), "rule__Ne_Comparison__CompAssignment_1_2");
					put(grammarAccess.getNe_ComparisonAccess().getTypeAssignment_1_3(), "rule__Ne_Comparison__TypeAssignment_1_3");
					put(grammarAccess.getNe_ComparisonAccess().getTypeSpecifierAssignment_1_4(), "rule__Ne_Comparison__TypeSpecifierAssignment_1_4");
					put(grammarAccess.getTypeSpecifierAccess().getSubtypeAssignment_0_2(), "rule__TypeSpecifier__SubtypeAssignment_0_2");
					put(grammarAccess.getTypeSpecifierAccess().getIndexAssignment_0_3_1(), "rule__TypeSpecifier__IndexAssignment_0_3_1");
					put(grammarAccess.getTypeSpecifierAccess().getIndexAssignment_1_2(), "rule__TypeSpecifier__IndexAssignment_1_2");
					put(grammarAccess.getNe_Atomic_Node_TestAccess().getRowAssignment_0_2(), "rule__Ne_Atomic_Node_Test__RowAssignment_0_2");
					put(grammarAccess.getNe_Atomic_Node_TestAccess().getColumnAssignment_0_4(), "rule__Ne_Atomic_Node_Test__ColumnAssignment_0_4");
					put(grammarAccess.getNe_Atomic_Node_TestAccess().getTokenAssignment_1_1(), "rule__Ne_Atomic_Node_Test__TokenAssignment_1_1");
					put(grammarAccess.getPath_ExpressionAccess().getRestAssignment_1_1_1(), "rule__Path_Expression__RestAssignment_1_1_1");
					put(grammarAccess.getPe_OrAccess().getRightAssignment_1_2(), "rule__Pe_Or__RightAssignment_1_2");
					put(grammarAccess.getPe_AtomicAccess().getAxesAssignment_1(), "rule__Pe_Atomic__AxesAssignment_1");
					put(grammarAccess.getPe_AtomicAccess().getNode_testAssignment_2_0_1(), "rule__Pe_Atomic__Node_testAssignment_2_0_1");
					put(grammarAccess.getPe_AtomicAccess().getPredicateAssignment_3_1(), "rule__Pe_Atomic__PredicateAssignment_3_1");
					put(grammarAccess.getCe_OrAccess().getRightAssignment_1_2(), "rule__Ce_Or__RightAssignment_1_2");
					put(grammarAccess.getCe_ListAccess().getRestAssignment_1_1(), "rule__Ce_List__RestAssignment_1_1");
					put(grammarAccess.getCe_AtomicAccess().getTokenAssignment_0_1(), "rule__Ce_Atomic__TokenAssignment_0_1");
					put(grammarAccess.getCe_AtomicAccess().getStringAssignment_1_1(), "rule__Ce_Atomic__StringAssignment_1_1");
					put(grammarAccess.getCe_ComparisonAccess().getTypeAssignment_0_0(), "rule__Ce_Comparison__TypeAssignment_0_0");
					put(grammarAccess.getCe_ComparisonAccess().getTypeSpecifierAssignment_0_1(), "rule__Ce_Comparison__TypeSpecifierAssignment_0_1");
					put(grammarAccess.getCe_ComparisonAccess().getCompAssignment_0_2(), "rule__Ce_Comparison__CompAssignment_0_2");
					put(grammarAccess.getCe_ComparisonAccess().getValueAssignment_0_3(), "rule__Ce_Comparison__ValueAssignment_0_3");
					put(grammarAccess.getCe_ComparisonAccess().getTypeAssignment_1_1(), "rule__Ce_Comparison__TypeAssignment_1_1");
					put(grammarAccess.getCe_ComparisonAccess().getTypeSpecifierAssignment_1_2(), "rule__Ce_Comparison__TypeSpecifierAssignment_1_2");
					put(grammarAccess.getCe_ComparisonAccess().getCompAssignment_1_3(), "rule__Ce_Comparison__CompAssignment_1_3");
					put(grammarAccess.getCe_ComparisonAccess().getPathAssignment_1_5(), "rule__Ce_Comparison__PathAssignment_1_5");
					put(grammarAccess.getCe_ComparisonAccess().getPathAssignment_2_1_0_1(), "rule__Ce_Comparison__PathAssignment_2_1_0_1");
					put(grammarAccess.getCe_ComparisonAccess().getValueAssignment_2_1_1(), "rule__Ce_Comparison__ValueAssignment_2_1_1");
					put(grammarAccess.getCe_ComparisonAccess().getCompAssignment_2_2(), "rule__Ce_Comparison__CompAssignment_2_2");
					put(grammarAccess.getCe_ComparisonAccess().getTypeAssignment_2_3(), "rule__Ce_Comparison__TypeAssignment_2_3");
					put(grammarAccess.getCe_ComparisonAccess().getTypeSpecifierAssignment_2_4(), "rule__Ce_Comparison__TypeSpecifierAssignment_2_4");
					put(grammarAccess.getTLVariableAccess().getNameAssignment(), "rule__TLVariable__NameAssignment");
					put(grammarAccess.getTLOutputPrimitiveAccess().getTextAssignment_0_1(), "rule__TLOutputPrimitive__TextAssignment_0_1");
					put(grammarAccess.getTLOutputPrimitiveAccess().getVariableAssignment_1_1(), "rule__TLOutputPrimitive__VariableAssignment_1_1");
					put(grammarAccess.getTLOutputPrimitiveAccess().getTypeSpecifierAssignment_1_2(), "rule__TLOutputPrimitive__TypeSpecifierAssignment_1_2");
					put(grammarAccess.getTL_Ce_ListAccess().getListAssignment_1(), "rule__TL_Ce_List__ListAssignment_1");
					put(grammarAccess.getTL_Ce_ListAccess().getListAssignment_2_1(), "rule__TL_Ce_List__ListAssignment_2_1");
					put(grammarAccess.getTL_Ce_AtomicAccess().getTokenAssignment_0_1(), "rule__TL_Ce_Atomic__TokenAssignment_0_1");
					put(grammarAccess.getTL_Ce_AtomicAccess().getStringAssignment_1_1(), "rule__TL_Ce_Atomic__StringAssignment_1_1");
					put(grammarAccess.getTLOutputAccess().getPrimitivesAssignment_2_0(), "rule__TLOutput__PrimitivesAssignment_2_0");
					put(grammarAccess.getTLOutputAccess().getPrimitivesAssignment_2_1_1(), "rule__TLOutput__PrimitivesAssignment_2_1_1");
					put(grammarAccess.getTLLoopAccess().getVariablesAssignment_3(), "rule__TLLoop__VariablesAssignment_3");
					put(grammarAccess.getTLLoopAccess().getVariablesAssignment_4_1(), "rule__TLLoop__VariablesAssignment_4_1");
					put(grammarAccess.getTLLoopAccess().getRegionAssignment_7(), "rule__TLLoop__RegionAssignment_7");
					put(grammarAccess.getTLLoopAccess().getModeAssignment_8_1(), "rule__TLLoop__ModeAssignment_8_1");
					put(grammarAccess.getTLLoopAccess().getContentExpressionAssignment_8_3(), "rule__TLLoop__ContentExpressionAssignment_8_3");
					put(grammarAccess.getTLLoopAccess().getStatementsAssignment_10(), "rule__TLLoop__StatementsAssignment_10");
					put(grammarAccess.getTLIfAccess().getConditionAssignment_2(), "rule__TLIf__ConditionAssignment_2");
					put(grammarAccess.getTLIfAccess().getIfBlockAssignment_5(), "rule__TLIf__IfBlockAssignment_5");
					put(grammarAccess.getTLIfAccess().getElseBlockAssignment_7_2(), "rule__TLIf__ElseBlockAssignment_7_2");
					put(grammarAccess.getTLBoolExprNotAccess().getExpressionAssignment_2(), "rule__TLBoolExprNot__ExpressionAssignment_2");
					put(grammarAccess.getTLBoolExprEmptyAccess().getRegionAssignment_0(), "rule__TLBoolExprEmpty__RegionAssignment_0");
					put(grammarAccess.getDelimitersAccess().getUnorderedGroup(), "rule__Delimiters__UnorderedGroup");
					put(grammarAccess.getDelimitersAccess().getUnorderedGroup_0(), "rule__Delimiters__UnorderedGroup_0");
					put(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), "rule__Type__UnorderedGroup_0_4");
					put(grammarAccess.getTypeAccess().getUnorderedGroup_1_5(), "rule__Type__UnorderedGroup_1_5");
					put(grammarAccess.getTypeAccess().getUnorderedGroup_2_3(), "rule__Type__UnorderedGroup_2_3");
					put(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), "rule__Type__UnorderedGroup_2_3_0_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.ubt.ai7.csv_validator.ui.contentassist.antlr.internal.InternalSculptParser typedParser = (de.ubt.ai7.csv_validator.ui.contentassist.antlr.internal.InternalSculptParser) parser;
			typedParser.entryRuleSculpt();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SculptGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SculptGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

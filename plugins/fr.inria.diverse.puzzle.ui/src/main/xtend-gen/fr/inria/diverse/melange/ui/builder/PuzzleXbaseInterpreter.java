package fr.inria.diverse.melange.ui.builder;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import fr.inria.diverse.melange.metamodel.melange.Aspect;
import fr.inria.diverse.melange.ui.builder.EcoreQueries;
import java.util.List;
import org.autorefactor.ui.RefactoringPatternVO;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.xtend.AnonymousClass;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.EvaluationException;
import org.eclipse.xtext.xbase.interpreter.impl.InterpreterCanceledException;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Class that go through an xbase xexpression and creates the corresponding refactoring patterns
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class PuzzleXbaseInterpreter extends XbaseInterpreter {
  @Inject
  @Extension
  private EcoreQueries _ecoreQueries;
  
  @Override
  public Object doEvaluate(final XExpression expression, final IEvaluationContext context, final CancelIndicator indicator) {
    if ((expression instanceof AnonymousClass)) {
      return this._doEvaluate(((AnonymousClass) expression), context, indicator);
    } else {
      return super.doEvaluate(expression, context, indicator);
    }
  }
  
  @Override
  public Object _doEvaluate(final XMemberFeatureCall xExpression, final IEvaluationContext context, final CancelIndicator indicator) {
    QualifiedName _create = QualifiedName.create("input");
    Object _value = context.getValue(_create);
    EOperation _input = ((EOperation) _value);
    QualifiedName _create_1 = QualifiedName.create("output");
    Object _value_1 = context.getValue(_create_1);
    EOperation _output = ((EOperation) _value_1);
    QualifiedName _create_2 = QualifiedName.create("providingClassName");
    Object _value_2 = context.getValue(_create_2);
    String providingClassName = ((String) _value_2);
    QualifiedName _create_3 = QualifiedName.create("requiringClassName");
    Object _value_3 = context.getValue(_create_3);
    String requiringClassName = ((String) _value_3);
    QualifiedName _create_4 = QualifiedName.create("aspects");
    Object _value_4 = context.getValue(_create_4);
    List<Aspect> aspects = ((List<Aspect>) _value_4);
    QualifiedName _create_5 = QualifiedName.create("refactoringPatterns");
    Object _value_5 = context.getValue(_create_5);
    final List<RefactoringPatternVO> refactoringPatterns = ((List<RefactoringPatternVO>) _value_5);
    QualifiedName _create_6 = QualifiedName.create("function");
    Object _value_6 = context.getValue(_create_6);
    final XtendFunction xtendFunction = ((XtendFunction) _value_6);
    RefactoringPatternVO refactPatternX = new RefactoringPatternVO();
    String _name = _input.getName();
    String _plus = ("(\\s\\w+)(\\." + _name);
    String _plus_1 = (_plus + ")(\\()");
    refactPatternX.setSourcePattern(_plus_1);
    String _name_1 = _output.getName();
    String _plus_2 = ((providingClassName + "Aspect.") + _name_1);
    String _plus_3 = (_plus_2 + "\\($1");
    refactPatternX.setTargetPattern(_plus_3);
    String _name_2 = _output.getName();
    String _plus_4 = (((".*" + providingClassName) + "Aspect.") + _name_2);
    String _plus_5 = (_plus_4 + "\\(.*");
    refactPatternX.setPivotPattern(_plus_5);
    boolean functionHasArguments = false;
    EList<EParameter> _eParameters = _input.getEParameters();
    int _size = _eParameters.size();
    boolean _notEquals = (_size != 0);
    if (_notEquals) {
      functionHasArguments = true;
    }
    if (functionHasArguments) {
      String _targetPattern = refactPatternX.getTargetPattern();
      String _plus_6 = (_targetPattern + ",");
      refactPatternX.setTargetPattern(_plus_6);
    }
    boolean _contains = refactoringPatterns.contains(refactPatternX);
    boolean _not = (!_contains);
    if (_not) {
      refactoringPatterns.add(refactPatternX);
    }
    return null;
  }
  
  @Override
  public Object _doEvaluate(final XAssignment xExpression, final IEvaluationContext context, final CancelIndicator indicator) {
    return null;
  }
  
  @Override
  public Object _doEvaluate(final XStringLiteral literal, final IEvaluationContext context, final CancelIndicator indicator) {
    return null;
  }
  
  @Override
  public Object _doEvaluate(final XNumberLiteral literal, final IEvaluationContext context, final CancelIndicator indicator) {
    return null;
  }
  
  @Override
  public Object _doEvaluate(final XClosure xExpression, final IEvaluationContext context, final CancelIndicator indicator) {
    XExpression _expression = xExpression.getExpression();
    boolean _notEquals = (!Objects.equal(_expression, null));
    if (_notEquals) {
      XExpression _expression_1 = xExpression.getExpression();
      this.internalEvaluate(_expression_1, context, indicator);
    }
    return null;
  }
  
  @Override
  public Object _doEvaluate(final XForLoopExpression xExpression, final IEvaluationContext context, final CancelIndicator indicator) {
    XExpression _eachExpression = xExpression.getEachExpression();
    boolean _notEquals = (!Objects.equal(_eachExpression, null));
    if (_notEquals) {
      XExpression _eachExpression_1 = xExpression.getEachExpression();
      this.internalEvaluate(_eachExpression_1, context, indicator);
    }
    XExpression _forExpression = xExpression.getForExpression();
    boolean _notEquals_1 = (!Objects.equal(_forExpression, null));
    if (_notEquals_1) {
      XExpression _forExpression_1 = xExpression.getForExpression();
      this.internalEvaluate(_forExpression_1, context, indicator);
    }
    return null;
  }
  
  @Override
  public Object _doEvaluate(final XWhileExpression xExpression, final IEvaluationContext context, final CancelIndicator indicator) {
    XExpression _predicate = xExpression.getPredicate();
    boolean _notEquals = (!Objects.equal(_predicate, null));
    if (_notEquals) {
      XExpression _predicate_1 = xExpression.getPredicate();
      this.internalEvaluate(_predicate_1, context, indicator);
    }
    XExpression _body = xExpression.getBody();
    boolean _notEquals_1 = (!Objects.equal(_body, null));
    if (_notEquals_1) {
      XExpression _body_1 = xExpression.getBody();
      this.internalEvaluate(_body_1, context, indicator);
    }
    return null;
  }
  
  @Override
  public Object _doEvaluate(final XAbstractFeatureCall xExpression, final IEvaluationContext context, final CancelIndicator indicator) {
    QualifiedName _create = QualifiedName.create("input");
    Object _value = context.getValue(_create);
    EOperation _input = ((EOperation) _value);
    QualifiedName _create_1 = QualifiedName.create("output");
    Object _value_1 = context.getValue(_create_1);
    EOperation _output = ((EOperation) _value_1);
    QualifiedName _create_2 = QualifiedName.create("providingClassName");
    Object _value_2 = context.getValue(_create_2);
    String providingClassName = ((String) _value_2);
    QualifiedName _create_3 = QualifiedName.create("requiringClassName");
    Object _value_3 = context.getValue(_create_3);
    String requiringClassName = ((String) _value_3);
    QualifiedName _create_4 = QualifiedName.create("aspects");
    Object _value_4 = context.getValue(_create_4);
    List<Aspect> aspects = ((List<Aspect>) _value_4);
    QualifiedName _create_5 = QualifiedName.create("refactoringPatterns");
    Object _value_5 = context.getValue(_create_5);
    final List<RefactoringPatternVO> refactoringPatterns = ((List<RefactoringPatternVO>) _value_5);
    if ((xExpression instanceof XUnaryOperation)) {
      XExpression _operand = ((XUnaryOperation)xExpression).getOperand();
      boolean _notEquals = (!Objects.equal(_operand, null));
      if (_notEquals) {
        XExpression _operand_1 = ((XUnaryOperation)xExpression).getOperand();
        this.internalEvaluate(_operand_1, context, indicator);
      }
    } else {
      if ((xExpression instanceof XBinaryOperation)) {
        XExpression _leftOperand = ((XBinaryOperation)xExpression).getLeftOperand();
        boolean _notEquals_1 = (!Objects.equal(_leftOperand, null));
        if (_notEquals_1) {
          XExpression _leftOperand_1 = ((XBinaryOperation)xExpression).getLeftOperand();
          this.internalEvaluate(_leftOperand_1, context, indicator);
        }
        XExpression _rightOperand = ((XBinaryOperation)xExpression).getRightOperand();
        boolean _notEquals_2 = (!Objects.equal(_rightOperand, null));
        if (_notEquals_2) {
          XExpression _rightOperand_1 = ((XBinaryOperation)xExpression).getRightOperand();
          this.internalEvaluate(_rightOperand_1, context, indicator);
        }
      }
    }
    return null;
  }
  
  @Override
  public Object _doEvaluate(final XConstructorCall xExpression, final IEvaluationContext context, final CancelIndicator indicator) {
    return null;
  }
  
  @Override
  public Object _doEvaluate(final XCastedExpression xExpression, final IEvaluationContext context, final CancelIndicator indicator) {
    Object _xifexpression = null;
    XExpression _target = xExpression.getTarget();
    boolean _notEquals = (!Objects.equal(_target, null));
    if (_notEquals) {
      XExpression _target_1 = xExpression.getTarget();
      _xifexpression = this.internalEvaluate(_target_1, context, indicator);
    }
    return _xifexpression;
  }
  
  @Override
  public Object _doEvaluate(final XIfExpression xExpression, final IEvaluationContext context, final CancelIndicator indicator) {
    XExpression _if = xExpression.getIf();
    boolean _notEquals = (!Objects.equal(_if, null));
    if (_notEquals) {
      XExpression _if_1 = xExpression.getIf();
      this.internalEvaluate(_if_1, context, indicator);
    }
    XExpression _then = xExpression.getThen();
    boolean _notEquals_1 = (!Objects.equal(_then, null));
    if (_notEquals_1) {
      XExpression _then_1 = xExpression.getThen();
      this.internalEvaluate(_then_1, context, indicator);
    }
    XExpression _else = xExpression.getElse();
    boolean _notEquals_2 = (!Objects.equal(_else, null));
    if (_notEquals_2) {
      XExpression _else_1 = xExpression.getElse();
      this.internalEvaluate(_else_1, context, indicator);
    }
    return null;
  }
  
  @Override
  public Object _doEvaluate(final XReturnExpression xExpression, final IEvaluationContext context, final CancelIndicator indicator) {
    XExpression _expression = xExpression.getExpression();
    boolean _notEquals = (!Objects.equal(_expression, null));
    if (_notEquals) {
      XExpression _expression_1 = xExpression.getExpression();
      this.internalEvaluate(_expression_1, context, indicator);
    }
    return null;
  }
  
  public Object _doEvaluate(final AnonymousClass xExpression, final IEvaluationContext context, final CancelIndicator indicator) {
    EList<XtendMember> _members = xExpression.getMembers();
    final Procedure1<XtendMember> _function = new Procedure1<XtendMember>() {
      @Override
      public void apply(final XtendMember member) {
        if ((member instanceof XtendFunction)) {
          final XtendFunction _function = ((XtendFunction) member);
          XExpression _expression = _function.getExpression();
          PuzzleXbaseInterpreter.this.internalEvaluate(_expression, context, indicator);
        }
      }
    };
    IterableExtensions.<XtendMember>forEach(_members, _function);
    return null;
  }
  
  @Override
  public Object internalEvaluate(final XExpression expression, final IEvaluationContext context, final CancelIndicator indicator) throws EvaluationException {
    boolean _isCanceled = indicator.isCanceled();
    if (_isCanceled) {
      throw new InterpreterCanceledException();
    }
    this.doEvaluate(expression, context, indicator);
    return null;
  }
  
  private String findAspectName(final String operationName, final String ownerClassName, final List<Aspect> aspects) {
    for (final Aspect _aspect : aspects) {
      JvmTypeReference _aspectTypeRef = _aspect.getAspectTypeRef();
      JvmType _type = _aspectTypeRef.getType();
      Resource _eResource = _type.eResource();
      boolean _notEquals = (!Objects.equal(_eResource, null));
      if (_notEquals) {
        JvmTypeReference _aspectTypeRef_1 = _aspect.getAspectTypeRef();
        JvmType _type_1 = _aspectTypeRef_1.getType();
        Resource _eResource_1 = _type_1.eResource();
        EList<EObject> _contents = _eResource_1.getContents();
        EObject _get = _contents.get(0);
        XtendFile xtendFile = ((XtendFile) _get);
        EList<XtendTypeDeclaration> _xtendTypes = xtendFile.getXtendTypes();
        for (final XtendTypeDeclaration _typeDeclaration : _xtendTypes) {
          {
            String _name = _typeDeclaration.getName();
            String typeDeclarationName = _name.replace("Aspect", "");
            boolean _equals = typeDeclarationName.equals(ownerClassName);
            if (_equals) {
              EList<XtendMember> _members = _typeDeclaration.getMembers();
              for (final XtendMember _member : _members) {
                boolean _and = false;
                if (!(_member instanceof XtendFunction)) {
                  _and = false;
                } else {
                  String _name_1 = ((XtendFunction) _member).getName();
                  boolean _equals_1 = _name_1.equals(operationName);
                  _and = _equals_1;
                }
                if (_and) {
                  return _typeDeclaration.getName();
                }
              }
            }
          }
        }
      }
    }
    return null;
  }
}

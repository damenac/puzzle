package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import kmLogo.Instruction;
import logo.Context;
import logo.InstructionAspectInstructionAspectProperties;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class InstructionAspect {
  public static int eval(final Instruction _self, final Context context) {
    logo.InstructionAspectInstructionAspectProperties _self_ = logo.InstructionAspectInstructionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.Forward){
    result = logo.ForwardAspect.eval((kmLogo.Forward)_self,context);
    } else  if (_self instanceof kmLogo.PenDown){
    result = logo.PenDownAspect.eval((kmLogo.PenDown)_self,context);
    } else  if (_self instanceof kmLogo.BoolLit){
    result = logo.BoolLitAspect.eval((kmLogo.BoolLit)_self,context);
    } else  if (_self instanceof kmLogo.StringLit){
    result = logo.StringLitAspect.eval((kmLogo.StringLit)_self,context);
    } else  if (_self instanceof kmLogo.IntegerLit){
    result = logo.IntegerLitAspect.eval((kmLogo.IntegerLit)_self,context);
    } else  if (_self instanceof kmLogo.Right){
    result = logo.RightAspect.eval((kmLogo.Right)_self,context);
    } else  if (_self instanceof kmLogo.ArithmeticExpression){
    result = logo.ArithmeticExpressionAspect.eval((kmLogo.ArithmeticExpression)_self,context);
    } else  if (_self instanceof kmLogo.ProcCall){
    result = logo.ProcCallAspect.eval((kmLogo.ProcCall)_self,context);
    } else  if (_self instanceof kmLogo.RelationalExpression){
    result = logo.RelationalExpressionAspect.eval((kmLogo.RelationalExpression)_self,context);
    } else  if (_self instanceof kmLogo.Back){
    result = logo.BackAspect.eval((kmLogo.Back)_self,context);
    } else  if (_self instanceof kmLogo.Clear){
    result = logo.ClearAspect.eval((kmLogo.Clear)_self,context);
    } else  if (_self instanceof kmLogo.If){
    result = logo.IfAspect.eval((kmLogo.If)_self,context);
    } else  if (_self instanceof kmLogo.ParameterCall){
    result = logo.ParameterCallAspect.eval((kmLogo.ParameterCall)_self,context);
    } else  if (_self instanceof kmLogo.Repeat){
    result = logo.RepeatAspect.eval((kmLogo.Repeat)_self,context);
    } else  if (_self instanceof kmLogo.Left){
    result = logo.LeftAspect.eval((kmLogo.Left)_self,context);
    } else  if (_self instanceof kmLogo.PenUp){
    result = logo.PenUpAspect.eval((kmLogo.PenUp)_self,context);
    } else  if (_self instanceof kmLogo.Literal){
    result = logo.LiteralAspect.eval((kmLogo.Literal)_self,context);
    } else  if (_self instanceof kmLogo.While){
    result = logo.WhileAspect.eval((kmLogo.While)_self,context);
    } else  if (_self instanceof kmLogo.Expression){
    result = logo.ExpressionAspect.eval((kmLogo.Expression)_self,context);
    } else  if (_self instanceof kmLogo.ControlStructure){
    result = logo.ControlStructureAspect.eval((kmLogo.ControlStructure)_self,context);
    } else  if (_self instanceof kmLogo.Primitive){
    result = logo.PrimitiveAspect.eval((kmLogo.Primitive)_self,context);
    } else  if (_self instanceof kmLogo.Block){
    result = logo.BlockAspect.eval((kmLogo.Block)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect._privk3_eval(_self_, (kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  protected static int _privk3_eval(final InstructionAspectInstructionAspectProperties _self_, final Instruction _self, final Context context) {
    return 0;
  }
}

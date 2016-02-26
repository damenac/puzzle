package org.eclipse.emf.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class FactoryClass_
{
  protected static String nl;
  public static synchronized FactoryClass_ create(String lineSeparator)
  {
    nl = lineSeparator;
    FactoryClass_ result = new FactoryClass_();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " */";
  protected final String TEXT_5 = NL + "package ";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = NL + "package ";
  protected final String TEXT_8 = ";";
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * The <b>Factory</b> for the model." + NL + " * It provides a create method for each non-abstract class of the model." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_12 = NL + " * @see ";
  protected final String TEXT_13 = NL + " * @generated" + NL + " */";
  protected final String TEXT_14 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model <b>Factory</b>." + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */";
  protected final String TEXT_15 = NL + "public class ";
  protected final String TEXT_16 = " extends ";
  protected final String TEXT_17 = " implements ";
  protected final String TEXT_18 = NL + "public interface ";
  protected final String TEXT_19 = " extends ";
  protected final String TEXT_20 = NL + "{";
  protected final String TEXT_21 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_22 = " copyright = ";
  protected final String TEXT_23 = ";";
  protected final String TEXT_24 = NL;
  protected final String TEXT_25 = NL + "\t/**" + NL + "\t * The singleton instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_26 = " eINSTANCE = init();" + NL;
  protected final String TEXT_27 = NL + "\t/**" + NL + "\t * The singleton instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_28 = " INSTANCE = ";
  protected final String TEXT_29 = ".eINSTANCE;" + NL;
  protected final String TEXT_30 = NL + "\t/**" + NL + "\t * The singleton instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_31 = " eINSTANCE = ";
  protected final String TEXT_32 = ".init();" + NL;
  protected final String TEXT_33 = NL + "\t/**" + NL + "\t * Creates the default factory implementation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_34 = NL + "\tpublic static ";
  protected final String TEXT_35 = " init()" + NL + "\t{" + NL + "\t\ttry" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_36 = " the";
  protected final String TEXT_37 = " = (";
  protected final String TEXT_38 = ")";
  protected final String TEXT_39 = ".Registry.INSTANCE.getEFactory(";
  protected final String TEXT_40 = ".eNS_URI);" + NL + "\t\t\tif (the";
  protected final String TEXT_41 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\treturn the";
  protected final String TEXT_42 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tcatch (Exception exception)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_43 = ".INSTANCE.log(exception);" + NL + "\t\t}" + NL + "\t\treturn new ";
  protected final String TEXT_44 = "();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Creates an instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_45 = "()" + NL + "\t{" + NL + "\t\tsuper();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_46 = NL + "\t@Override";
  protected final String TEXT_47 = NL + "\tpublic EObject create(EClass eClass)" + NL + "\t{" + NL + "\t\tswitch (eClass.getClassifierID())" + NL + "\t\t{";
  protected final String TEXT_48 = NL + "\t\t\tcase ";
  protected final String TEXT_49 = ".";
  protected final String TEXT_50 = ": return ";
  protected final String TEXT_51 = "create";
  protected final String TEXT_52 = "();";
  protected final String TEXT_53 = NL + "\t\t\tdefault:" + NL + "\t\t\t\tthrow new IllegalArgumentException(\"The class '\" + eClass.getName() + \"' is not a valid classifier\");";
  protected final String TEXT_54 = NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_55 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_56 = NL + "\t@Override";
  protected final String TEXT_57 = NL + "\tpublic Object createFromString(";
  protected final String TEXT_58 = " eDataType, String initialValue)" + NL + "\t{" + NL + "\t\tswitch (eDataType.getClassifierID())" + NL + "\t\t{";
  protected final String TEXT_59 = NL + "\t\t\tcase ";
  protected final String TEXT_60 = ".";
  protected final String TEXT_61 = ":" + NL + "\t\t\t\treturn create";
  protected final String TEXT_62 = "FromString(eDataType, initialValue);";
  protected final String TEXT_63 = NL + "\t\t\tdefault:" + NL + "\t\t\t\tthrow new IllegalArgumentException(\"The datatype '\" + eDataType.getName() + \"' is not a valid classifier\");";
  protected final String TEXT_64 = NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_65 = NL + "\t@Override";
  protected final String TEXT_66 = NL + "\tpublic String convertToString(";
  protected final String TEXT_67 = " eDataType, Object instanceValue)" + NL + "\t{" + NL + "\t\tswitch (eDataType.getClassifierID())" + NL + "\t\t{";
  protected final String TEXT_68 = NL + "\t\t\tcase ";
  protected final String TEXT_69 = ".";
  protected final String TEXT_70 = ":" + NL + "\t\t\t\treturn convert";
  protected final String TEXT_71 = "ToString(eDataType, instanceValue);";
  protected final String TEXT_72 = NL + "\t\t\tdefault:" + NL + "\t\t\t\tthrow new IllegalArgumentException(\"The datatype '\" + eDataType.getName() + \"' is not a valid classifier\");";
  protected final String TEXT_73 = NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_74 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_75 = " create";
  protected final String TEXT_76 = "()" + NL + "\t{" + NL + "\t\tthrow new UnsupportedOperationException(\"Cannot invoke element creation on a model type\");" + NL + "\t}" + NL;
  protected final String TEXT_77 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_78 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_79 = NL + "\tpublic ";
  protected final String TEXT_80 = " create";
  protected final String TEXT_81 = "(";
  protected final String TEXT_82 = "final ";
  protected final String TEXT_83 = "String ";
  protected final String TEXT_84 = "it";
  protected final String TEXT_85 = "literal";
  protected final String TEXT_86 = ")" + NL + "\t{";
  protected final String TEXT_87 = NL + "\t\t";
  protected final String TEXT_88 = NL + "\t\t";
  protected final String TEXT_89 = " result = ";
  protected final String TEXT_90 = ".get(literal);" + NL + "\t\tif (result == null) throw new IllegalArgumentException(\"The value '\" + literal + \"' is not a valid enumerator of '\" + ";
  protected final String TEXT_91 = ".getName() + \"'\");";
  protected final String TEXT_92 = NL + "\t\treturn result;";
  protected final String TEXT_93 = NL + "\t\treturn new ";
  protected final String TEXT_94 = "(create";
  protected final String TEXT_95 = "(literal));";
  protected final String TEXT_96 = NL + "\t\treturn create";
  protected final String TEXT_97 = "(literal);";
  protected final String TEXT_98 = NL + "\t\treturn new ";
  protected final String TEXT_99 = "(";
  protected final String TEXT_100 = ".create";
  protected final String TEXT_101 = "(literal));";
  protected final String TEXT_102 = NL + "\t\treturn ";
  protected final String TEXT_103 = ".create";
  protected final String TEXT_104 = "(literal);";
  protected final String TEXT_105 = NL + "\t\treturn ";
  protected final String TEXT_106 = "(";
  protected final String TEXT_107 = ")";
  protected final String TEXT_108 = ".createFromString(";
  protected final String TEXT_109 = ", literal);";
  protected final String TEXT_110 = NL + "\t\tif (literal == null) return null;" + NL + "\t\t";
  protected final String TEXT_111 = " result = new ";
  protected final String TEXT_112 = "<";
  protected final String TEXT_113 = ">";
  protected final String TEXT_114 = "();";
  protected final String TEXT_115 = NL + "\t\tfor (";
  protected final String TEXT_116 = " stringTokenizer = new ";
  protected final String TEXT_117 = "(literal); stringTokenizer.hasMoreTokens(); )";
  protected final String TEXT_118 = NL + "\t\tfor (String item : split(literal))";
  protected final String TEXT_119 = NL + "\t\t{";
  protected final String TEXT_120 = NL + "\t\t\tString item = stringTokenizer.nextToken();";
  protected final String TEXT_121 = NL + "\t\t\tresult.add(create";
  protected final String TEXT_122 = "(item));";
  protected final String TEXT_123 = NL + "\t\t\tresult.add(create";
  protected final String TEXT_124 = "FromString(";
  protected final String TEXT_125 = ", item));";
  protected final String TEXT_126 = NL + "\t\t\tresult.add(";
  protected final String TEXT_127 = ".create";
  protected final String TEXT_128 = "(item));";
  protected final String TEXT_129 = NL + "\t\t\tresult.add(";
  protected final String TEXT_130 = ".createFromString(";
  protected final String TEXT_131 = ", item));";
  protected final String TEXT_132 = NL + "\t\t}" + NL + "\t\treturn result;";
  protected final String TEXT_133 = NL + "\t\tif (literal == null) return ";
  protected final String TEXT_134 = ";" + NL + "\t\t";
  protected final String TEXT_135 = " result = ";
  protected final String TEXT_136 = ";" + NL + "\t\tRuntimeException exception = null;";
  protected final String TEXT_137 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_138 = NL + "\t\t\tresult = create";
  protected final String TEXT_139 = "(literal);";
  protected final String TEXT_140 = NL + "\t\t\tresult = (";
  protected final String TEXT_141 = ")create";
  protected final String TEXT_142 = "FromString(";
  protected final String TEXT_143 = ", literal);";
  protected final String TEXT_144 = NL + "\t\t\tresult = ";
  protected final String TEXT_145 = ".create";
  protected final String TEXT_146 = "(literal);";
  protected final String TEXT_147 = NL + "\t\t\tresult = (";
  protected final String TEXT_148 = ")";
  protected final String TEXT_149 = ".createFromString(";
  protected final String TEXT_150 = ", literal);";
  protected final String TEXT_151 = NL + "\t\t\tif (";
  protected final String TEXT_152 = "result != null && ";
  protected final String TEXT_153 = ".INSTANCE.validate(";
  protected final String TEXT_154 = ", ";
  protected final String TEXT_155 = "new ";
  protected final String TEXT_156 = "(result)";
  protected final String TEXT_157 = "result";
  protected final String TEXT_158 = ", null, null))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn result;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tcatch (RuntimeException e)" + NL + "\t\t{" + NL + "\t\t\texception = e;" + NL + "\t\t}";
  protected final String TEXT_159 = NL + "\t\tif (";
  protected final String TEXT_160 = "result != null || ";
  protected final String TEXT_161 = "exception == null) return result;" + NL + "    " + NL + "\t\tthrow exception;";
  protected final String TEXT_162 = NL + "\t\treturn (";
  protected final String TEXT_163 = ")super.createFromString(literal);";
  protected final String TEXT_164 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new ";
  protected final String TEXT_165 = "();";
  protected final String TEXT_166 = NL + "\t\treturn ((";
  protected final String TEXT_167 = ")super.createFromString(";
  protected final String TEXT_168 = ", literal)).";
  protected final String TEXT_169 = "();";
  protected final String TEXT_170 = NL + "\t\treturn ";
  protected final String TEXT_171 = "(";
  protected final String TEXT_172 = ")";
  protected final String TEXT_173 = "super.createFromString(";
  protected final String TEXT_174 = ", literal);";
  protected final String TEXT_175 = NL + "\t}" + NL;
  protected final String TEXT_176 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_177 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_178 = NL + "\tpublic ";
  protected final String TEXT_179 = " create";
  protected final String TEXT_180 = "FromString(";
  protected final String TEXT_181 = " eDataType, String initialValue)" + NL + "\t{";
  protected final String TEXT_182 = NL + "\t\treturn create";
  protected final String TEXT_183 = "(initialValue);";
  protected final String TEXT_184 = NL + "\t\t";
  protected final String TEXT_185 = " result = ";
  protected final String TEXT_186 = ".get(initialValue);" + NL + "\t\tif (result == null) throw new IllegalArgumentException(\"The value '\" + initialValue + \"' is not a valid enumerator of '\" + eDataType.getName() + \"'\");";
  protected final String TEXT_187 = NL + "\t\treturn result;";
  protected final String TEXT_188 = NL + "\t\treturn ";
  protected final String TEXT_189 = "(";
  protected final String TEXT_190 = ")";
  protected final String TEXT_191 = "create";
  protected final String TEXT_192 = "FromString(";
  protected final String TEXT_193 = ", initialValue);";
  protected final String TEXT_194 = NL + "\t\treturn ";
  protected final String TEXT_195 = "(";
  protected final String TEXT_196 = ")";
  protected final String TEXT_197 = ".createFromString(";
  protected final String TEXT_198 = ", initialValue);";
  protected final String TEXT_199 = NL + "\t\treturn create";
  protected final String TEXT_200 = "(initialValue);";
  protected final String TEXT_201 = NL + "\t\tif (initialValue == null) return null;" + NL + "\t\t";
  protected final String TEXT_202 = " result = new ";
  protected final String TEXT_203 = "<";
  protected final String TEXT_204 = ">";
  protected final String TEXT_205 = "();";
  protected final String TEXT_206 = NL + "\t\tfor (";
  protected final String TEXT_207 = " stringTokenizer = new ";
  protected final String TEXT_208 = "(initialValue); stringTokenizer.hasMoreTokens(); )";
  protected final String TEXT_209 = NL + "\t\tfor (String item : split(initialValue))";
  protected final String TEXT_210 = NL + "\t\t{";
  protected final String TEXT_211 = NL + "\t\t\tString item = stringTokenizer.nextToken();";
  protected final String TEXT_212 = NL + "\t\t\tresult.add(create";
  protected final String TEXT_213 = "FromString(";
  protected final String TEXT_214 = ", item));";
  protected final String TEXT_215 = NL + "\t\t\tresult.add(";
  protected final String TEXT_216 = "(";
  protected final String TEXT_217 = ")";
  protected final String TEXT_218 = ".createFromString(";
  protected final String TEXT_219 = ", item));";
  protected final String TEXT_220 = NL + "\t\t}" + NL + "\t\treturn result;";
  protected final String TEXT_221 = NL + "\t\treturn new ";
  protected final String TEXT_222 = "(create";
  protected final String TEXT_223 = "(initialValue));";
  protected final String TEXT_224 = NL + "\t\treturn create";
  protected final String TEXT_225 = "(initialValue);";
  protected final String TEXT_226 = NL + "\t\tif (initialValue == null) return null;" + NL + "\t\t";
  protected final String TEXT_227 = " result = null;" + NL + "\t\tRuntimeException exception = null;";
  protected final String TEXT_228 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_229 = NL + "\t\t\tresult = ";
  protected final String TEXT_230 = "(";
  protected final String TEXT_231 = ")";
  protected final String TEXT_232 = "create";
  protected final String TEXT_233 = "FromString(";
  protected final String TEXT_234 = ", initialValue);";
  protected final String TEXT_235 = NL + "\t\t\tresult = ";
  protected final String TEXT_236 = "(";
  protected final String TEXT_237 = ")";
  protected final String TEXT_238 = ".createFromString(";
  protected final String TEXT_239 = ", initialValue);";
  protected final String TEXT_240 = NL + "\t\t\tif (result != null && ";
  protected final String TEXT_241 = ".INSTANCE.validate(eDataType, result, null, null))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn result;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tcatch (RuntimeException e)" + NL + "\t\t{" + NL + "\t\t\texception = e;" + NL + "\t\t}";
  protected final String TEXT_242 = NL + "\t\tif (result != null || exception == null) return result;" + NL + "    " + NL + "\t\tthrow exception;";
  protected final String TEXT_243 = NL + "\t\treturn create";
  protected final String TEXT_244 = "(initialValue);";
  protected final String TEXT_245 = NL + "\t\treturn ";
  protected final String TEXT_246 = "(";
  protected final String TEXT_247 = ")";
  protected final String TEXT_248 = "super.createFromString(initialValue);";
  protected final String TEXT_249 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new ";
  protected final String TEXT_250 = "();";
  protected final String TEXT_251 = NL + "\t\treturn ";
  protected final String TEXT_252 = "(";
  protected final String TEXT_253 = ")";
  protected final String TEXT_254 = "super.createFromString(eDataType, initialValue);";
  protected final String TEXT_255 = NL + "\t}" + NL;
  protected final String TEXT_256 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String convert";
  protected final String TEXT_257 = "(";
  protected final String TEXT_258 = "final ";
  protected final String TEXT_259 = " ";
  protected final String TEXT_260 = "it";
  protected final String TEXT_261 = "instanceValue";
  protected final String TEXT_262 = ")" + NL + "\t{";
  protected final String TEXT_263 = NL + "\t\t";
  protected final String TEXT_264 = NL + "\t\treturn instanceValue == null ? null : instanceValue.toString();";
  protected final String TEXT_265 = NL + "\t\treturn instanceValue == null ? null : convert";
  protected final String TEXT_266 = "(instanceValue";
  protected final String TEXT_267 = ".";
  protected final String TEXT_268 = "()";
  protected final String TEXT_269 = ");";
  protected final String TEXT_270 = NL + "\t\treturn convert";
  protected final String TEXT_271 = "(instanceValue);";
  protected final String TEXT_272 = NL + "\t\treturn ";
  protected final String TEXT_273 = ".convert";
  protected final String TEXT_274 = "(instanceValue);";
  protected final String TEXT_275 = NL + "\t\treturn ";
  protected final String TEXT_276 = ".convertToString(";
  protected final String TEXT_277 = ", instanceValue);";
  protected final String TEXT_278 = NL + "\t\tif (instanceValue == null) return null;" + NL + "\t\tif (instanceValue.isEmpty()) return \"\";" + NL + "\t\t";
  protected final String TEXT_279 = " result = new ";
  protected final String TEXT_280 = "();";
  protected final String TEXT_281 = NL + "\t\tfor (";
  protected final String TEXT_282 = " i = instanceValue.iterator(); i.hasNext(); )";
  protected final String TEXT_283 = NL + "\t\tfor (";
  protected final String TEXT_284 = " item : instanceValue)";
  protected final String TEXT_285 = NL + "\t\t{";
  protected final String TEXT_286 = NL + "\t\t\tresult.append(convert";
  protected final String TEXT_287 = "((";
  protected final String TEXT_288 = ")";
  protected final String TEXT_289 = "));";
  protected final String TEXT_290 = NL + "\t\t\tresult.append(convert";
  protected final String TEXT_291 = "ToString(";
  protected final String TEXT_292 = ", ";
  protected final String TEXT_293 = "));";
  protected final String TEXT_294 = NL + "\t\t\tresult.append(";
  protected final String TEXT_295 = ".convert";
  protected final String TEXT_296 = "((";
  protected final String TEXT_297 = ")";
  protected final String TEXT_298 = "));";
  protected final String TEXT_299 = NL + "\t\t\tresult.append(";
  protected final String TEXT_300 = ".convertToString(";
  protected final String TEXT_301 = ", ";
  protected final String TEXT_302 = "));";
  protected final String TEXT_303 = NL + "\t\t\tresult.append(' ');" + NL + "\t\t}" + NL + "\t\treturn result.substring(0, result.length() - 1);";
  protected final String TEXT_304 = NL + "\t\tif (instanceValue == null) return null;";
  protected final String TEXT_305 = NL + "\t\tif (";
  protected final String TEXT_306 = ".isInstance(instanceValue))" + NL + "\t\t{" + NL + "\t\t\ttry" + NL + "\t\t\t{";
  protected final String TEXT_307 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_308 = "(instanceValue);";
  protected final String TEXT_309 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_310 = "(((";
  protected final String TEXT_311 = ")instanceValue).";
  protected final String TEXT_312 = "());";
  protected final String TEXT_313 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_314 = "((";
  protected final String TEXT_315 = ")instanceValue);";
  protected final String TEXT_316 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_317 = "ToString(";
  protected final String TEXT_318 = ", instanceValue);";
  protected final String TEXT_319 = NL + "\t\t\t\tString value = ";
  protected final String TEXT_320 = ".convert";
  protected final String TEXT_321 = "((";
  protected final String TEXT_322 = ")instanceValue);";
  protected final String TEXT_323 = NL + "\t\t\t\tString value = ";
  protected final String TEXT_324 = ".convertToString(";
  protected final String TEXT_325 = ", instanceValue);";
  protected final String TEXT_326 = NL + "\t\t\t\tif (value != null) return value;" + NL + "\t\t\t}" + NL + "\t\t\tcatch (Exception e)" + NL + "\t\t\t{" + NL + "\t\t\t\t// Keep trying other member types until all have failed." + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_327 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_328 = NL + "\t\t\tString value = convert";
  protected final String TEXT_329 = "(instanceValue);";
  protected final String TEXT_330 = NL + "\t\t\tString value = convert";
  protected final String TEXT_331 = "ToString(";
  protected final String TEXT_332 = ", ";
  protected final String TEXT_333 = "new ";
  protected final String TEXT_334 = "(instanceValue)";
  protected final String TEXT_335 = "instanceValue";
  protected final String TEXT_336 = ");";
  protected final String TEXT_337 = NL + "\t\t\tString value = ";
  protected final String TEXT_338 = ".convert";
  protected final String TEXT_339 = "(instanceValue);";
  protected final String TEXT_340 = NL + "\t\t\tString value = ";
  protected final String TEXT_341 = ".convertToString(";
  protected final String TEXT_342 = ", ";
  protected final String TEXT_343 = "new ";
  protected final String TEXT_344 = "(instanceValue)";
  protected final String TEXT_345 = "instanceValue";
  protected final String TEXT_346 = ");";
  protected final String TEXT_347 = NL + "\t\t\tif (value != null) return value;" + NL + "\t\t}" + NL + "\t\tcatch (Exception e)" + NL + "\t\t{" + NL + "\t\t\t// Keep trying other member types until all have failed." + NL + "\t\t}";
  protected final String TEXT_348 = NL + "\t\tthrow new IllegalArgumentException(\"Invalid value: '\"+instanceValue+\"' for datatype :\"+";
  protected final String TEXT_349 = ".getName());";
  protected final String TEXT_350 = NL + "\t\treturn super.convertToString(instanceValue);";
  protected final String TEXT_351 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new ";
  protected final String TEXT_352 = "();";
  protected final String TEXT_353 = NL + "\t\treturn super.convertToString(";
  protected final String TEXT_354 = ", new ";
  protected final String TEXT_355 = "(instanceValue));";
  protected final String TEXT_356 = NL + "\t\treturn super.convertToString(";
  protected final String TEXT_357 = ", instanceValue);";
  protected final String TEXT_358 = NL + "\t}" + NL;
  protected final String TEXT_359 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_360 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_361 = NL + "\tpublic String convert";
  protected final String TEXT_362 = "ToString(";
  protected final String TEXT_363 = " eDataType, Object instanceValue)" + NL + "\t{";
  protected final String TEXT_364 = NL + "\t\treturn convert";
  protected final String TEXT_365 = "((";
  protected final String TEXT_366 = ")instanceValue);";
  protected final String TEXT_367 = NL + "\t\treturn instanceValue == null ? null : instanceValue.toString();";
  protected final String TEXT_368 = NL + "\t\treturn convert";
  protected final String TEXT_369 = "ToString(";
  protected final String TEXT_370 = ", instanceValue);";
  protected final String TEXT_371 = NL + "\t\treturn ";
  protected final String TEXT_372 = ".convertToString(";
  protected final String TEXT_373 = ", instanceValue);";
  protected final String TEXT_374 = NL + "\t\treturn convert";
  protected final String TEXT_375 = "((";
  protected final String TEXT_376 = ")instanceValue);";
  protected final String TEXT_377 = NL + "\t\tif (instanceValue == null) return null;" + NL + "\t\t";
  protected final String TEXT_378 = " list = (";
  protected final String TEXT_379 = ")instanceValue;" + NL + "\t\tif (list.isEmpty()) return \"\";" + NL + "\t\t";
  protected final String TEXT_380 = " result = new ";
  protected final String TEXT_381 = "();";
  protected final String TEXT_382 = NL + "\t\tfor (";
  protected final String TEXT_383 = " i = list.iterator(); i.hasNext(); )";
  protected final String TEXT_384 = NL + "\t\tfor (";
  protected final String TEXT_385 = " item : list)";
  protected final String TEXT_386 = NL + "\t\t{";
  protected final String TEXT_387 = NL + "\t\t\tresult.append(convert";
  protected final String TEXT_388 = "ToString(";
  protected final String TEXT_389 = ", ";
  protected final String TEXT_390 = "));";
  protected final String TEXT_391 = NL + "\t\t\tresult.append(";
  protected final String TEXT_392 = ".convertToString(";
  protected final String TEXT_393 = ", ";
  protected final String TEXT_394 = "));";
  protected final String TEXT_395 = NL + "\t\t\tresult.append(' ');" + NL + "\t\t}" + NL + "\t\treturn result.substring(0, result.length() - 1);";
  protected final String TEXT_396 = NL + "\t\treturn instanceValue == null ? null : convert";
  protected final String TEXT_397 = "(((";
  protected final String TEXT_398 = ")instanceValue)";
  protected final String TEXT_399 = ".";
  protected final String TEXT_400 = "()";
  protected final String TEXT_401 = ");";
  protected final String TEXT_402 = NL + "\t\treturn convert";
  protected final String TEXT_403 = "(instanceValue);";
  protected final String TEXT_404 = NL + "\t\tif (instanceValue == null) return null;";
  protected final String TEXT_405 = NL + "\t\tif (";
  protected final String TEXT_406 = ".isInstance(instanceValue))" + NL + "\t\t{" + NL + "\t\t\ttry" + NL + "\t\t\t{";
  protected final String TEXT_407 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_408 = "ToString(";
  protected final String TEXT_409 = ", instanceValue);";
  protected final String TEXT_410 = NL + "\t\t\t\tString value = ";
  protected final String TEXT_411 = ".convertToString(";
  protected final String TEXT_412 = ", instanceValue);";
  protected final String TEXT_413 = NL + "\t\t\t\tif (value != null) return value;" + NL + "\t\t\t}" + NL + "\t\t\tcatch (Exception e)" + NL + "\t\t\t{" + NL + "\t\t\t\t// Keep trying other member types until all have failed." + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_414 = NL + "\t\tthrow new IllegalArgumentException(\"Invalid value: '\"+instanceValue+\"' for datatype :\"+eDataType.getName());";
  protected final String TEXT_415 = NL + "\t\treturn instanceValue == null ? null : convert";
  protected final String TEXT_416 = "(";
  protected final String TEXT_417 = "(";
  protected final String TEXT_418 = "(";
  protected final String TEXT_419 = ")instanceValue";
  protected final String TEXT_420 = ").";
  protected final String TEXT_421 = "()";
  protected final String TEXT_422 = ");";
  protected final String TEXT_423 = NL + "\t\treturn convert";
  protected final String TEXT_424 = "((";
  protected final String TEXT_425 = ")instanceValue);";
  protected final String TEXT_426 = NL + "\t\treturn super.convertToString(instanceValue);";
  protected final String TEXT_427 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new ";
  protected final String TEXT_428 = "();";
  protected final String TEXT_429 = NL + "\t\treturn super.convertToString(eDataType, instanceValue);";
  protected final String TEXT_430 = NL + "\t}" + NL;
  protected final String TEXT_431 = NL + "\t/**" + NL + "\t * Returns a new object of class '<em>";
  protected final String TEXT_432 = "</em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return a new object of class '<em>";
  protected final String TEXT_433 = "</em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_434 = " create";
  protected final String TEXT_435 = "();" + NL;
  protected final String TEXT_436 = NL + "\t/**" + NL + "\t * Returns an instance of data type '<em>";
  protected final String TEXT_437 = "</em>' corresponding the given literal." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param literal a literal of the data type." + NL + "\t * @return a new instance value of the data type." + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_438 = " create";
  protected final String TEXT_439 = "(String literal);" + NL + "" + NL + "\t/**" + NL + "\t * Returns a literal representation of an instance of data type '<em>";
  protected final String TEXT_440 = "</em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param instanceValue an instance value of the data type." + NL + "\t * @return a literal representation of the instance value." + NL + "\t * @generated" + NL + "\t */" + NL + "\tString convert";
  protected final String TEXT_441 = "(";
  protected final String TEXT_442 = " instanceValue);" + NL;
  protected final String TEXT_443 = NL + "\t/**" + NL + "\t * Returns the package supported by this factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the package supported by this factory." + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_444 = " get";
  protected final String TEXT_445 = "();" + NL;
  protected final String TEXT_446 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_447 = " get";
  protected final String TEXT_448 = "()" + NL + "\t{" + NL + "\t\treturn (";
  protected final String TEXT_449 = ")getEPackage();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @deprecated" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_450 = NL + "\t@Deprecated";
  protected final String TEXT_451 = NL + "\tpublic static ";
  protected final String TEXT_452 = " getPackage()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_453 = ".eINSTANCE;" + NL + "\t}" + NL;
  protected final String TEXT_454 = NL + "} //";
  protected final String TEXT_455 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * Copyright (c) 2002-2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */

    GenPackage genPackage = (GenPackage)((Object[])argument)[0]; GenModel genModel=genPackage.getGenModel(); /* Trick to import java.util.* without warnings */Iterator.class.getName();
    boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    }}
    stringBuffer.append(TEXT_4);
    if (isInterface || genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genPackage.getReflectionPackageName());
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_8);
    }
    stringBuffer.append(TEXT_9);
    if (isImplementation) {
    genModel.addPseudoImport("org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container");
    genModel.addPseudoImport("org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container.Dynamic");
    genModel.addImport("org.eclipse.emf.ecore.EClass");
    genModel.addImport("org.eclipse.emf.ecore.EObject");
    if (!genPackage.hasJavaLangConflict() && !genPackage.hasInterfaceImplConflict() && !genPackage.getClassPackageName().equals(genPackage.getInterfacePackageName())) genModel.addImport(genPackage.getInterfacePackageName() + ".*");
    }
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_10);
    if (isInterface) {
    stringBuffer.append(TEXT_11);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    }
    stringBuffer.append(TEXT_13);
    } else {
    stringBuffer.append(TEXT_14);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genPackage.getFactoryClassName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.EFactoryImpl"));
    if (!genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genPackage.getImportedFactoryInterfaceName());
    }
    } else {
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EFactory"));
    }
    }
    stringBuffer.append(TEXT_20);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_21);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_24);
    }
    if (isImplementation && (genModel.isSuppressEMFMetaData() || genModel.isSuppressInterfaces())) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genPackage.getFactoryClassName());
    stringBuffer.append(TEXT_26);
    }
    if (isInterface && genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genPackage.getQualifiedFactoryClassName());
    stringBuffer.append(TEXT_29);
    } else if (isInterface && !genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_30);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genPackage.getQualifiedFactoryClassName());
    stringBuffer.append(TEXT_32);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_33);
    String factoryType = genModel.isSuppressEMFMetaData() ? genPackage.getFactoryClassName() : genPackage.getImportedFactoryInterfaceName();
    stringBuffer.append(TEXT_34);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genPackage.getFactoryName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genPackage.getFactoryName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genPackage.getFactoryName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genPackage.getImportedFactoryClassName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genPackage.getFactoryClassName());
    stringBuffer.append(TEXT_45);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_46);
    }
    stringBuffer.append(TEXT_47);
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (!genClass.isAbstract()) {
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genClass.getClassifierID());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(!genClass.isEObjectExtension() ? "(EObject)" : "" );
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_52);
    }
    }
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_54);
    if (!genPackage.getAllGenDataTypes().isEmpty()) {
    stringBuffer.append(TEXT_55);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_56);
    }
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_58);
    for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
    if (genDataType.isSerializable()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genDataType.getClassifierID());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_62);
    }
    }
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_64);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_65);
    }
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_67);
    for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
    if (genDataType.isSerializable()) {
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genDataType.getClassifierID());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_71);
    }
    }
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_73);
    }
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (!genClass.isAbstract()) {
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genClass.getTypeParameters());
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(genClass.getInterfaceTypeArguments());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_76);
    }
    }
    for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
    if (genDataType.isSerializable()) {
    if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) { String eDataType = genDataType.getQualifiedClassifierAccessor();
    stringBuffer.append(TEXT_77);
    if (genModel.useGenerics() && genDataType.isUncheckedCast() && !genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_78);
    }
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genDataType.getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_81);
    if (genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_82);
    }
    stringBuffer.append(TEXT_83);
    if (genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_84);
    } else {
    stringBuffer.append(TEXT_85);
    }
    stringBuffer.append(TEXT_86);
    if (genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genDataType.getCreatorBody(genModel.getIndentation(stringBuffer)));
    } else if (genDataType instanceof GenEnum) {
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(genModel.getNonNLS(3));
    stringBuffer.append(TEXT_92);
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); boolean isPrimitiveConversion = !genDataType.isPrimitiveType() && genBaseType.isPrimitiveType();
    if (genBaseType.getGenPackage() == genPackage) {
    if (isPrimitiveConversion && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_95);
    } else {
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_97);
    }
    } else if (genBaseType.getGenPackage().isDataTypeConverters()) {
    if (isPrimitiveConversion && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_101);
    } else {
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_104);
    }
    } else {
    stringBuffer.append(TEXT_105);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_107);
    }
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_109);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genDataType.getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genModel.getImportedName("java.util.ArrayList"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genItemType.getObjectType().getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_113);
    }
    stringBuffer.append(TEXT_114);
    if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_117);
    } else {
    stringBuffer.append(TEXT_118);
    }
    stringBuffer.append(TEXT_119);
    if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_120);
    }
    if (genItemType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) { genItemType = genItemType.getObjectType();
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_122);
    } else {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_125);
    }
    } else {
    if (genItemType.getGenPackage().isDataTypeConverters()) { genItemType = genItemType.getObjectType();
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_128);
    } else {
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_131);
    }
    }
    stringBuffer.append(TEXT_132);
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genDataType.getStaticValue(null));
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genDataType.getStaticValue(null));
    stringBuffer.append(TEXT_136);
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_137);
    if (genMemberType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) { if (!genDataType.isPrimitiveType()) genMemberType = genMemberType.getObjectType();
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_139);
    } else {
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_143);
    }
    } else {
    if (genPackage.isDataTypeConverters()) { if (!genDataType.isPrimitiveType()) genMemberType = genMemberType.getObjectType();
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_146);
    } else {
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_150);
    }
    }
    stringBuffer.append(TEXT_151);
    if (!genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.Diagnostician"));
    stringBuffer.append(TEXT_153);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_154);
    if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_156);
    } else {
    stringBuffer.append(TEXT_157);
    }
    stringBuffer.append(TEXT_158);
    }
    stringBuffer.append(TEXT_159);
    if (!genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_160);
    }
    stringBuffer.append(TEXT_161);
    } else if (!genDataType.hasConversionDelegate() && genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
    stringBuffer.append(TEXT_162);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_163);
    } else if (!genDataType.hasConversionDelegate() && genDataType.isArrayType()) {
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_165);
    } else if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genDataType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_169);
    } else {
    stringBuffer.append(TEXT_170);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_172);
    }
    stringBuffer.append(TEXT_173);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_174);
    }
    stringBuffer.append(TEXT_175);
    }
    stringBuffer.append(TEXT_176);
    if (!genPackage.isDataTypeConverters() && genModel.useGenerics() && genDataType.isUncheckedCast() && !genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_177);
    }
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_181);
    if (genDataType instanceof GenEnum) {
    if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_183);
    } else {
    stringBuffer.append(TEXT_184);
    stringBuffer.append(((GenEnum)genDataType).getImportedInstanceClassName());
    stringBuffer.append(TEXT_185);
    stringBuffer.append(((GenEnum)genDataType).getImportedInstanceClassName());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(genModel.getNonNLS(3));
    stringBuffer.append(TEXT_187);
    }
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); 
    if (genBaseType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_188);
    if (!genDataType.getObjectInstanceClassName().equals(genBaseType.getObjectInstanceClassName())) {
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_190);
    }
    stringBuffer.append(TEXT_191);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_192);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_193);
    } else {
    stringBuffer.append(TEXT_194);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_196);
    }
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_197);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_198);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    if (genPackage.isDataTypeConverters()) {
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_200);
    } else {
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genModel.getImportedName("java.util.ArrayList"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_203);
    stringBuffer.append(genItemType.getObjectType().getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_204);
    }
    stringBuffer.append(TEXT_205);
    if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_206);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_208);
    } else {
    stringBuffer.append(TEXT_209);
    }
    stringBuffer.append(TEXT_210);
    if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_211);
    }
    if (genItemType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_214);
    } else {
    stringBuffer.append(TEXT_215);
    if (!genItemType.isObjectType()) {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genItemType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_217);
    }
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_219);
    }
    stringBuffer.append(TEXT_220);
    }
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    if (genPackage.isDataTypeConverters()) {
    if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_223);
    } else {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_225);
    }
    } else {
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_227);
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_228);
    if (genMemberType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_229);
    if (!genDataType.isObjectType() && !genDataType.getObjectInstanceClassName().equals(genMemberType.getObjectInstanceClassName())) {
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_231);
    }
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_234);
    } else {
    stringBuffer.append(TEXT_235);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_237);
    }
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_239);
    }
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.Diagnostician"));
    stringBuffer.append(TEXT_241);
    }
    stringBuffer.append(TEXT_242);
    }
    } else if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_244);
    } else if (!genDataType.hasConversionDelegate() && genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
    stringBuffer.append(TEXT_245);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_247);
    }
    stringBuffer.append(TEXT_248);
    } else if (!genDataType.hasConversionDelegate() && genDataType.isArrayType()) {
    stringBuffer.append(TEXT_249);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_250);
    } else {
    stringBuffer.append(TEXT_251);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_253);
    }
    stringBuffer.append(TEXT_254);
    }
    stringBuffer.append(TEXT_255);
    if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) { String eDataType = genDataType.getQualifiedClassifierAccessor();
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_257);
    if (genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_258);
    }
    stringBuffer.append(genDataType.getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_259);
    if (genDataType.hasConverterBody()) {
    stringBuffer.append(TEXT_260);
    } else {
    stringBuffer.append(TEXT_261);
    }
    stringBuffer.append(TEXT_262);
    if (genDataType.hasConverterBody()) {
    stringBuffer.append(TEXT_263);
    stringBuffer.append(genDataType.getConverterBody(genModel.getIndentation(stringBuffer)));
    } else if (genDataType instanceof GenEnum) {
    stringBuffer.append(TEXT_264);
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); boolean isPrimitiveConversion = !genDataType.isPrimitiveType() && genBaseType.isPrimitiveType();
    if (genBaseType.getGenPackage() == genPackage) {
    if (isPrimitiveConversion) {
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_266);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genBaseType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_268);
    }
    stringBuffer.append(TEXT_269);
    } else {
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_271);
    }
    } else if (genBaseType.getGenPackage().isDataTypeConverters()) {
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedFactoryInstanceAccessor());
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_274);
    } else {
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_277);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_280);
    String item; if (!genModel.useGenerics()) { item = "i.next()"; 
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_282);
    } else { item = "item";
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genModel.getImportedName("java.lang.Object"));
    stringBuffer.append(TEXT_284);
    }
    stringBuffer.append(TEXT_285);
    if (genItemType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) { genItemType = genItemType.getObjectType();
    stringBuffer.append(TEXT_286);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genItemType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_288);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_289);
    } else {
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_292);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_293);
    }
    } else {
    if (genItemType.getGenPackage().isDataTypeConverters()) { genItemType = genItemType.getObjectType();
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genItemType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_297);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_298);
    } else {
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_302);
    }
    }
    stringBuffer.append(TEXT_303);
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    if (!genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_304);
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_306);
    if (genMemberType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) {
    if (genMemberType.getQualifiedInstanceClassName().equals(genDataType.getQualifiedInstanceClassName())) {
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_308);
    } else if (genMemberType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genMemberType.getObjectType().getImportedInstanceClassName());
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genMemberType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_312);
    } else {
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genMemberType.getObjectType().getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_315);
    }
    } else {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_318);
    }
    } else {
    if (genMemberType.getGenPackage().isDataTypeConverters()) { genMemberType = genMemberType.getObjectType();
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genMemberType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_322);
    } else {
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_325);
    }
    }
    stringBuffer.append(TEXT_326);
    }
    } else {
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_327);
    if (genMemberType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) {
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_329);
    } else {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_332);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genMemberType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_334);
    } else {
    stringBuffer.append(TEXT_335);
    }
    stringBuffer.append(TEXT_336);
    }
    } else {
    if (genMemberType.getGenPackage().isDataTypeConverters()) {
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_339);
    } else {
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_342);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genMemberType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_344);
    } else {
    stringBuffer.append(TEXT_345);
    }
    stringBuffer.append(TEXT_346);
    }
    }
    stringBuffer.append(TEXT_347);
    }
    }
    stringBuffer.append(TEXT_348);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_349);
    } else if (!genDataType.hasConversionDelegate() && genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
    stringBuffer.append(TEXT_350);
    } else if (!genDataType.hasConversionDelegate() && genDataType.isArrayType()) {
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_352);
    } else if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_355);
    } else {
    stringBuffer.append(TEXT_356);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_357);
    }
    stringBuffer.append(TEXT_358);
    }
    stringBuffer.append(TEXT_359);
    if (genModel.useGenerics() && (genDataType.getItemType() != null || genDataType.isUncheckedCast()) && (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody())) {
    stringBuffer.append(TEXT_360);
    }
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_363);
    if (genDataType instanceof GenEnum) {
    if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) {
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_366);
    } else {
    stringBuffer.append(TEXT_367);
    }
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); 
    if (genBaseType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_370);
    } else {
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_373);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_375);
    stringBuffer.append(genDataType.getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_376);
    } else { final String singleWildcard = genModel.useGenerics() ? "<?>" : "";
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_381);
    String item; if (!genModel.useGenerics()) { item = "i.next()"; 
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_383);
    } else { item = "item";
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genModel.getImportedName("java.lang.Object"));
    stringBuffer.append(TEXT_385);
    }
    stringBuffer.append(TEXT_386);
    if (genItemType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_390);
    } else {
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_394);
    }
    stringBuffer.append(TEXT_395);
    }
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) {
    if (genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_398);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genDataType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_400);
    }
    stringBuffer.append(TEXT_401);
    } else {
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_403);
    }
    } else {
    stringBuffer.append(TEXT_404);
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_406);
    if (genMemberType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_409);
    } else {
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_412);
    }
    stringBuffer.append(TEXT_413);
    }
    stringBuffer.append(TEXT_414);
    }
    } else if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) {
    if (genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_416);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_417);
    }
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_419);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genDataType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_421);
    }
    stringBuffer.append(TEXT_422);
    } else {
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genDataType.getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_425);
    }
    } else if (!genDataType.hasConversionDelegate() && genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
    stringBuffer.append(TEXT_426);
    } else if (!genDataType.hasConversionDelegate() && genDataType.isArrayType()) {
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_428);
    } else {
    stringBuffer.append(TEXT_429);
    }
    stringBuffer.append(TEXT_430);
    }
    }
    } else {
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (genClass.hasFactoryInterfaceCreateMethod()) {
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genClass.getTypeParameters());
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(genClass.getInterfaceTypeArguments());
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_435);
    }
    }
    if (genPackage.isDataTypeConverters()) {
    for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
    if (genDataType.isSerializable()) {
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genDataType.getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genDataType.getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_442);
    }
    }
    }
    }
    if (!isImplementation && !genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_445);
    } else if (isImplementation) {
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_449);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_450);
    }
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_453);
    }
    stringBuffer.append(TEXT_454);
    stringBuffer.append(isInterface ? genPackage.getFactoryInterfaceName() : genPackage.getFactoryClassName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_455);
    return stringBuffer.toString();
  }
}

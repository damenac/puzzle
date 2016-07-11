/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.Classifier#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link CompleteDSLPckg.Classifier#isIsFinalSpecialization <em>Is Final Specialization</em>}</li>
 *   <li>{@link CompleteDSLPckg.Classifier#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link CompleteDSLPckg.Classifier#getFeature <em>Feature</em>}</li>
 *   <li>{@link CompleteDSLPckg.Classifier#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link CompleteDSLPckg.Classifier#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link CompleteDSLPckg.Classifier#getGeneral <em>General</em>}</li>
 *   <li>{@link CompleteDSLPckg.Classifier#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link CompleteDSLPckg.Classifier#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link CompleteDSLPckg.Classifier#getPowertypeExtent <em>Powertype Extent</em>}</li>
 *   <li>{@link CompleteDSLPckg.Classifier#getCollaborationUse <em>Collaboration Use</em>}</li>
 *   <li>{@link CompleteDSLPckg.Classifier#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends RedefinableElement, Namespace, Type {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClassifier_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.Classifier#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Final Specialization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final Specialization</em>' attribute.
	 * @see #setIsFinalSpecialization(boolean)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClassifier_IsFinalSpecialization()
	 * @model
	 * @generated
	 */
	boolean isIsFinalSpecialization();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.Classifier#isIsFinalSpecialization <em>Is Final Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final Specialization</em>' attribute.
	 * @see #isIsFinalSpecialization()
	 * @generated
	 */
	void setIsFinalSpecialization(boolean value);

	/**
	 * Returns the value of the '<em><b>Inherited Member</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited Member</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClassifier_InheritedMember()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getInheritedMember();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Feature}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClassifier_Feature()
	 * @see CompleteDSLPckg.Feature#getFeaturingClassifier
	 * @model opposite="featuringClassifier"
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClassifier_Attribute()
	 * @model
	 * @generated
	 */
	EList<Property> getAttribute();

	/**
	 * Returns the value of the '<em><b>Redefined Classifier</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Classifier</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClassifier_RedefinedClassifier()
	 * @model
	 * @generated
	 */
	EList<Classifier> getRedefinedClassifier();

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClassifier_General()
	 * @model
	 * @generated
	 */
	EList<Classifier> getGeneral();

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Generalization}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClassifier_Generalization()
	 * @see CompleteDSLPckg.Generalization#getSpecific
	 * @model opposite="specific" containment="true"
	 * @generated
	 */
	EList<Generalization> getGeneralization();

	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Substitution}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Substitution#getSubstitutingClassifier <em>Substituting Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClassifier_Substitution()
	 * @see CompleteDSLPckg.Substitution#getSubstitutingClassifier
	 * @model opposite="substitutingClassifier" containment="true"
	 * @generated
	 */
	EList<Substitution> getSubstitution();

	/**
	 * Returns the value of the '<em><b>Powertype Extent</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.GeneralizationSet}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.GeneralizationSet#getPowertype <em>Powertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powertype Extent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powertype Extent</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClassifier_PowertypeExtent()
	 * @see CompleteDSLPckg.GeneralizationSet#getPowertype
	 * @model opposite="powertype"
	 * @generated
	 */
	EList<GeneralizationSet> getPowertypeExtent();

	/**
	 * Returns the value of the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.CollaborationUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration Use</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration Use</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClassifier_CollaborationUse()
	 * @model containment="true"
	 * @generated
	 */
	EList<CollaborationUse> getCollaborationUse();

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' reference.
	 * @see #setRepresentation(CollaborationUse)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClassifier_Representation()
	 * @model
	 * @generated
	 */
	CollaborationUse getRepresentation();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.Classifier#getRepresentation <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(CollaborationUse value);

} // Classifier

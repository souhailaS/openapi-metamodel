/**
 */
package edu.uoc.som.openapi2.mapping.impl;

import edu.uoc.som.openapi2.OpenAPI2Package;

import edu.uoc.som.openapi2.mapping.Mapping;
import edu.uoc.som.openapi2.mapping.OpenAPI2MappingFactory;
import edu.uoc.som.openapi2.mapping.OpenAPI2MappingPackage;
import edu.uoc.som.openapi2.mapping.PropertyToParameter;
import edu.uoc.som.openapi2.mapping.PropertyToProperty;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenAPI2MappingPackageImpl extends EPackageImpl implements OpenAPI2MappingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyToParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyToPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.uoc.som.openapi2.mapping.OpenAPI2MappingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenAPI2MappingPackageImpl() {
		super(eNS_URI, OpenAPI2MappingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OpenAPI2MappingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenAPI2MappingPackage init() {
		if (isInited) return (OpenAPI2MappingPackage)EPackage.Registry.INSTANCE.getEPackage(OpenAPI2MappingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOpenAPI2MappingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OpenAPI2MappingPackageImpl theOpenAPI2MappingPackage = registeredOpenAPI2MappingPackage instanceof OpenAPI2MappingPackageImpl ? (OpenAPI2MappingPackageImpl)registeredOpenAPI2MappingPackage : new OpenAPI2MappingPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		OpenAPI2Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theOpenAPI2MappingPackage.createPackageContents();

		// Initialize created meta-data
		theOpenAPI2MappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenAPI2MappingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenAPI2MappingPackage.eNS_URI, theOpenAPI2MappingPackage);
		return theOpenAPI2MappingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyToParameter() {
		return propertyToParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyToParameter_Source() {
		return (EReference)propertyToParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyToParameter_Target() {
		return (EReference)propertyToParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyToProperty() {
		return propertyToPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyToProperty_Source() {
		return (EReference)propertyToPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyToProperty_Target() {
		return (EReference)propertyToPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_PropertyToParameterMappings() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_PropertyToPropertyMappings() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenAPI2MappingFactory getOpenAPI2MappingFactory() {
		return (OpenAPI2MappingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		propertyToParameterEClass = createEClass(PROPERTY_TO_PARAMETER);
		createEReference(propertyToParameterEClass, PROPERTY_TO_PARAMETER__SOURCE);
		createEReference(propertyToParameterEClass, PROPERTY_TO_PARAMETER__TARGET);

		propertyToPropertyEClass = createEClass(PROPERTY_TO_PROPERTY);
		createEReference(propertyToPropertyEClass, PROPERTY_TO_PROPERTY__SOURCE);
		createEReference(propertyToPropertyEClass, PROPERTY_TO_PROPERTY__TARGET);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__PROPERTY_TO_PARAMETER_MAPPINGS);
		createEReference(mappingEClass, MAPPING__PROPERTY_TO_PROPERTY_MAPPINGS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OpenAPI2Package theOpenAPI2Package = (OpenAPI2Package)EPackage.Registry.INSTANCE.getEPackage(OpenAPI2Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(propertyToParameterEClass, PropertyToParameter.class, "PropertyToParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyToParameter_Source(), theOpenAPI2Package.getProperty(), null, "source", null, 0, 1, PropertyToParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyToParameter_Target(), theOpenAPI2Package.getParameter(), null, "target", null, 0, 1, PropertyToParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyToPropertyEClass, PropertyToProperty.class, "PropertyToProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyToProperty_Source(), theOpenAPI2Package.getProperty(), null, "source", null, 0, 1, PropertyToProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyToProperty_Target(), theOpenAPI2Package.getProperty(), null, "target", null, 0, 1, PropertyToProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_PropertyToParameterMappings(), this.getPropertyToParameter(), null, "propertyToParameterMappings", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_PropertyToPropertyMappings(), this.getPropertyToProperty(), null, "propertyToPropertyMappings", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OpenAPI2MappingPackageImpl

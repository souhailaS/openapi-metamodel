/**
 */
package edu.uoc.som.openapi3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.Path#getRelativePath <em>Relative Path</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Path#getGet <em>Get</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Path#getPut <em>Put</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Path#getPost <em>Post</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Path#getDelete <em>Delete</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Path#getOptions <em>Options</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Path#getHead <em>Head</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Path#getPatch <em>Patch</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Path#getApi <em>Api</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.Path#getServers <em>Servers</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi3.Openapi3Package#getPath()
 * @model
 * @generated
 */
public interface Path extends ParameterContainer, ParameterContext {
	/**
	 * Returns the value of the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Path</em>' attribute.
	 * @see #setRelativePath(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getPath_RelativePath()
	 * @model
	 * @generated
	 */
	String getRelativePath();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Path#getRelativePath <em>Relative Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Path</em>' attribute.
	 * @see #getRelativePath()
	 * @generated
	 */
	void setRelativePath(String value);

	/**
	 * Returns the value of the '<em><b>Get</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get</em>' containment reference.
	 * @see #setGet(Operation)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getPath_Get()
	 * @model containment="true"
	 * @generated
	 */
	Operation getGet();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Path#getGet <em>Get</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get</em>' containment reference.
	 * @see #getGet()
	 * @generated
	 */
	void setGet(Operation value);

	/**
	 * Returns the value of the '<em><b>Put</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Put</em>' containment reference.
	 * @see #setPut(Operation)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getPath_Put()
	 * @model containment="true"
	 * @generated
	 */
	Operation getPut();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Path#getPut <em>Put</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Put</em>' containment reference.
	 * @see #getPut()
	 * @generated
	 */
	void setPut(Operation value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(Operation)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getPath_Post()
	 * @model containment="true"
	 * @generated
	 */
	Operation getPost();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Path#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(Operation value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference.
	 * @see #setDelete(Operation)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getPath_Delete()
	 * @model containment="true"
	 * @generated
	 */
	Operation getDelete();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Path#getDelete <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' containment reference.
	 * @see #getDelete()
	 * @generated
	 */
	void setDelete(Operation value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(Operation)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getPath_Options()
	 * @model containment="true"
	 * @generated
	 */
	Operation getOptions();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Path#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Operation value);

	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(Operation)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getPath_Head()
	 * @model containment="true"
	 * @generated
	 */
	Operation getHead();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Path#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(Operation value);

	/**
	 * Returns the value of the '<em><b>Patch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patch</em>' containment reference.
	 * @see #setPatch(Operation)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getPath_Patch()
	 * @model containment="true"
	 * @generated
	 */
	Operation getPatch();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Path#getPatch <em>Patch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patch</em>' containment reference.
	 * @see #getPatch()
	 * @generated
	 */
	void setPatch(Operation value);

	/**
	 * Returns the value of the '<em><b>Api</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.uoc.som.openapi3.API#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api</em>' container reference.
	 * @see #setApi(API)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getPath_Api()
	 * @see edu.uoc.som.openapi3.API#getPaths
	 * @model opposite="paths" transient="false"
	 * @generated
	 */
	API getApi();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.Path#getApi <em>Api</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' container reference.
	 * @see #getApi()
	 * @generated
	 */
	void setApi(API value);

	/**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.Server}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getPath_Servers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Server> getServers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Operation getOperationByHTTPMethod(String method);

} // Path

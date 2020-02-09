/**
 */
package fr.ut2j.m1ice.fsm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.ut2j.m1ice.fsm.FsmFactory
 * @model kind="package"
 * @generated
 */
public interface FsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/fsm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmPackage eINSTANCE = fr.ut2j.m1ice.fsm.impl.FsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.ut2j.m1ice.fsm.impl.FSMImpl <em>FSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ut2j.m1ice.fsm.impl.FSMImpl
	 * @see fr.ut2j.m1ice.fsm.impl.FsmPackageImpl#getFSM()
	 * @generated
	 */
	int FSM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__NAME = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__STATE = 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__TRANSITION = 2;

	/**
	 * The number of structural features of the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ut2j.m1ice.fsm.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ut2j.m1ice.fsm.impl.StateImpl
	 * @see fr.ut2j.m1ice.fsm.impl.FsmPackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The meta object id for the '{@link fr.ut2j.m1ice.fsm.impl.StateFinalImpl <em>State Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ut2j.m1ice.fsm.impl.StateFinalImpl
	 * @see fr.ut2j.m1ice.fsm.impl.FsmPackageImpl#getStateFinal()
	 * @generated
	 */
	int STATE_FINAL = 5;

	/**
	 * The meta object id for the '{@link fr.ut2j.m1ice.fsm.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ut2j.m1ice.fsm.impl.TransitionImpl
	 * @see fr.ut2j.m1ice.fsm.impl.FsmPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ut2j.m1ice.fsm.impl.StateOnImpl <em>State On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ut2j.m1ice.fsm.impl.StateOnImpl
	 * @see fr.ut2j.m1ice.fsm.impl.FsmPackageImpl#getStateOn()
	 * @generated
	 */
	int STATE_ON = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ON__NAME = STATE__NAME;

	/**
	 * The number of structural features of the '<em>State On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ON_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ON_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ut2j.m1ice.fsm.impl.StateOffImpl <em>State Off</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ut2j.m1ice.fsm.impl.StateOffImpl
	 * @see fr.ut2j.m1ice.fsm.impl.FsmPackageImpl#getStateOff()
	 * @generated
	 */
	int STATE_OFF = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OFF__NAME = STATE__NAME;

	/**
	 * The number of structural features of the '<em>State Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OFF_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OFF_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FINAL__NAME = STATE__NAME;

	/**
	 * The number of structural features of the '<em>State Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FINAL_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FINAL_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.ut2j.m1ice.fsm.FSM <em>FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM</em>'.
	 * @see fr.ut2j.m1ice.fsm.FSM
	 * @generated
	 */
	EClass getFSM();

	/**
	 * Returns the meta object for the attribute '{@link fr.ut2j.m1ice.fsm.FSM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.ut2j.m1ice.fsm.FSM#getName()
	 * @see #getFSM()
	 * @generated
	 */
	EAttribute getFSM_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ut2j.m1ice.fsm.FSM#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see fr.ut2j.m1ice.fsm.FSM#getState()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_State();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ut2j.m1ice.fsm.FSM#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see fr.ut2j.m1ice.fsm.FSM#getTransition()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_Transition();

	/**
	 * Returns the meta object for class '{@link fr.ut2j.m1ice.fsm.StateFinal <em>State Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Final</em>'.
	 * @see fr.ut2j.m1ice.fsm.StateFinal
	 * @generated
	 */
	EClass getStateFinal();

	/**
	 * Returns the meta object for class '{@link fr.ut2j.m1ice.fsm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see fr.ut2j.m1ice.fsm.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link fr.ut2j.m1ice.fsm.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.ut2j.m1ice.fsm.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for class '{@link fr.ut2j.m1ice.fsm.StateOn <em>State On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State On</em>'.
	 * @see fr.ut2j.m1ice.fsm.StateOn
	 * @generated
	 */
	EClass getStateOn();

	/**
	 * Returns the meta object for class '{@link fr.ut2j.m1ice.fsm.StateOff <em>State Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Off</em>'.
	 * @see fr.ut2j.m1ice.fsm.StateOff
	 * @generated
	 */
	EClass getStateOff();

	/**
	 * Returns the meta object for class '{@link fr.ut2j.m1ice.fsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see fr.ut2j.m1ice.fsm.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link fr.ut2j.m1ice.fsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.ut2j.m1ice.fsm.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link fr.ut2j.m1ice.fsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.ut2j.m1ice.fsm.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link fr.ut2j.m1ice.fsm.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.ut2j.m1ice.fsm.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FsmFactory getFsmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.ut2j.m1ice.fsm.impl.FSMImpl <em>FSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ut2j.m1ice.fsm.impl.FSMImpl
		 * @see fr.ut2j.m1ice.fsm.impl.FsmPackageImpl#getFSM()
		 * @generated
		 */
		EClass FSM = eINSTANCE.getFSM();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSM__NAME = eINSTANCE.getFSM_Name();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__STATE = eINSTANCE.getFSM_State();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__TRANSITION = eINSTANCE.getFSM_Transition();

		/**
		 * The meta object literal for the '{@link fr.ut2j.m1ice.fsm.impl.StateFinalImpl <em>State Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ut2j.m1ice.fsm.impl.StateFinalImpl
		 * @see fr.ut2j.m1ice.fsm.impl.FsmPackageImpl#getStateFinal()
		 * @generated
		 */
		EClass STATE_FINAL = eINSTANCE.getStateFinal();

		/**
		 * The meta object literal for the '{@link fr.ut2j.m1ice.fsm.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ut2j.m1ice.fsm.impl.StateImpl
		 * @see fr.ut2j.m1ice.fsm.impl.FsmPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '{@link fr.ut2j.m1ice.fsm.impl.StateOnImpl <em>State On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ut2j.m1ice.fsm.impl.StateOnImpl
		 * @see fr.ut2j.m1ice.fsm.impl.FsmPackageImpl#getStateOn()
		 * @generated
		 */
		EClass STATE_ON = eINSTANCE.getStateOn();

		/**
		 * The meta object literal for the '{@link fr.ut2j.m1ice.fsm.impl.StateOffImpl <em>State Off</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ut2j.m1ice.fsm.impl.StateOffImpl
		 * @see fr.ut2j.m1ice.fsm.impl.FsmPackageImpl#getStateOff()
		 * @generated
		 */
		EClass STATE_OFF = eINSTANCE.getStateOff();

		/**
		 * The meta object literal for the '{@link fr.ut2j.m1ice.fsm.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ut2j.m1ice.fsm.impl.TransitionImpl
		 * @see fr.ut2j.m1ice.fsm.impl.FsmPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

	}

} //FsmPackage

/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.parts.impl;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;
import com.misc.touse.eef.eefprimer.parts.EmployeePropertiesEditionPart;

import com.misc.touse.eef.eefprimer.providers.EefprimerMessages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class EmployeePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EmployeePropertiesEditionPart {

	protected Text name;
	protected ReferencesTable masteredSkills;
	protected List<ViewerFilter> masteredSkillsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> masteredSkillsFilters = new ArrayList<ViewerFilter>();
	// Start of user code  for CustomElementEditor Employee BirthDate widgets declarations
	
	// End of user code




	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EmployeePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence employeeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = employeeStep.addStep(EefprimerViewsRepository.Employee.Properties.class);
		propertiesStep.addStep(EefprimerViewsRepository.Employee.Properties.name);
		propertiesStep.addStep(EefprimerViewsRepository.Employee.Properties.masteredSkills);
		propertiesStep.addStep(EefprimerViewsRepository.Employee.Properties.customElementEditorEmployeeBirthDate);
		
		
		composer = new PartComposer(employeeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefprimerViewsRepository.Employee.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefprimerViewsRepository.Employee.Properties.name) {
					return createNameText(parent);
				}
				if (key == EefprimerViewsRepository.Employee.Properties.masteredSkills) {
					return createMasteredSkillsAdvancedTableComposition(parent);
				}
				// Start of user code for CustomElementEditor Employee BirthDate addToPart creation
				
				// End of user code
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EefprimerMessages.EmployeePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, EefprimerViewsRepository.Employee.Properties.name, EefprimerMessages.EmployeePropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeePropertiesEditionPartImpl.this, EefprimerViewsRepository.Employee.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeePropertiesEditionPartImpl.this, EefprimerViewsRepository.Employee.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, EefprimerViewsRepository.Employee.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.Employee.Properties.name, EefprimerViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMasteredSkillsAdvancedTableComposition(Composite parent) {
		this.masteredSkills = new ReferencesTable(getDescription(EefprimerViewsRepository.Employee.Properties.masteredSkills, EefprimerMessages.EmployeePropertiesEditionPart_MasteredSkillsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeePropertiesEditionPartImpl.this, EefprimerViewsRepository.Employee.Properties.masteredSkills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				masteredSkills.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeePropertiesEditionPartImpl.this, EefprimerViewsRepository.Employee.Properties.masteredSkills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				masteredSkills.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeePropertiesEditionPartImpl.this, EefprimerViewsRepository.Employee.Properties.masteredSkills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				masteredSkills.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeePropertiesEditionPartImpl.this, EefprimerViewsRepository.Employee.Properties.masteredSkills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				masteredSkills.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.masteredSkillsFilters) {
			this.masteredSkills.addFilter(filter);
		}
		this.masteredSkills.setHelpText(propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.Employee.Properties.masteredSkills, EefprimerViewsRepository.SWT_KIND));
		this.masteredSkills.createControls(parent);
		this.masteredSkills.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeePropertiesEditionPartImpl.this, EefprimerViewsRepository.Employee.Properties.masteredSkills, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData masteredSkillsData = new GridData(GridData.FILL_HORIZONTAL);
		masteredSkillsData.horizontalSpan = 3;
		this.masteredSkills.setLayoutData(masteredSkillsData);
		this.masteredSkills.setLowerBound(0);
		this.masteredSkills.setUpperBound(-1);
		masteredSkills.setID(EefprimerViewsRepository.Employee.Properties.masteredSkills);
		masteredSkills.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createMasteredSkillsAdvancedTableComposition

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.Employee.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(EefprimerMessages.Employee_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeePropertiesEditionPart#initMasteredSkills(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMasteredSkills(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		masteredSkills.setContentProvider(contentProvider);
		masteredSkills.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.Employee.Properties.masteredSkills);
		if (eefElementEditorReadOnlyState && masteredSkills.isEnabled()) {
			masteredSkills.setEnabled(false);
			masteredSkills.setToolTipText(EefprimerMessages.Employee_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !masteredSkills.isEnabled()) {
			masteredSkills.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeePropertiesEditionPart#updateMasteredSkills()
	 * 
	 */
	public void updateMasteredSkills() {
	masteredSkills.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeePropertiesEditionPart#addFilterMasteredSkills(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMasteredSkills(ViewerFilter filter) {
		masteredSkillsFilters.add(filter);
		if (this.masteredSkills != null) {
			this.masteredSkills.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeePropertiesEditionPart#addBusinessFilterMasteredSkills(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMasteredSkills(ViewerFilter filter) {
		masteredSkillsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeePropertiesEditionPart#isContainedInMasteredSkillsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMasteredSkillsTable(EObject element) {
		return ((ReferencesTableSettings)masteredSkills.getInput()).contains(element);
	}






	// Start of user code for CustomElementEditor Employee BirthDate specific getters and setters implementation
	
	// End of user code

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefprimerMessages.Employee_Part_Title;
	}

	@Override
	public String getBirthDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBirthDate(String newValue) {
		// TODO Auto-generated method stub
		
	}

	// Start of user code additional methods
	
	// End of user code


}

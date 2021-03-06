/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.parts.forms;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;
import com.misc.touse.eef.eefprimer.parts.EmployeePropertiesEditionPart;

import com.misc.touse.eef.eefprimer.providers.EefprimerMessages;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.dialogs.Dialog;
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
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class EmployeePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, EmployeePropertiesEditionPart {

	protected Text name;
	protected ReferencesTable masteredSkills;
	protected List<ViewerFilter> masteredSkillsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> masteredSkillsFilters = new ArrayList<ViewerFilter>();
	// Start of user code  for CustomElementEditor Employee BirthDate widgets declarations
	//protected DateTime birthDate;
	
	// End of user code

	protected Text birthDate;



	/**
	 * For {@link ISection} use only.
	 */
	public EmployeePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EmployeePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence employeeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = employeeStep.addStep(EefprimerViewsRepository.Employee.Properties.class);
		propertiesStep.addStep(EefprimerViewsRepository.Employee.Properties.name);
		propertiesStep.addStep(EefprimerViewsRepository.Employee.Properties.masteredSkills);
		propertiesStep.addStep(EefprimerViewsRepository.Employee.Properties.customElementEditorEmployeeBirthDate);
		propertiesStep.addStep(EefprimerViewsRepository.Employee.Properties.birthDate);
		
		
		composer = new PartComposer(employeeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefprimerViewsRepository.Employee.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefprimerViewsRepository.Employee.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == EefprimerViewsRepository.Employee.Properties.masteredSkills) {
					return createMasteredSkillsTableComposition(widgetFactory, parent);
				}
				// Start of user code for CustomElementEditor Employee BirthDate addToPart creation
				if (key == EefprimerViewsRepository.Employee.Properties.customElementEditorEmployeeBirthDate) {
					return createBirthDateDateTime(widgetFactory, parent);
				}
				// End of user code
				if (key == EefprimerViewsRepository.Employee.Properties.birthDate) {
					return createBirthDateText(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(EefprimerMessages.EmployeePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EefprimerViewsRepository.Employee.Properties.name, EefprimerMessages.EmployeePropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EmployeePropertiesEditionPartForm.this,
							EefprimerViewsRepository.Employee.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EmployeePropertiesEditionPartForm.this,
									EefprimerViewsRepository.Employee.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EmployeePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeePropertiesEditionPartForm.this, EefprimerViewsRepository.Employee.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, EefprimerViewsRepository.Employee.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.Employee.Properties.name, EefprimerViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMasteredSkillsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.masteredSkills = new ReferencesTable(getDescription(EefprimerViewsRepository.Employee.Properties.masteredSkills, EefprimerMessages.EmployeePropertiesEditionPart_MasteredSkillsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeePropertiesEditionPartForm.this, EefprimerViewsRepository.Employee.Properties.masteredSkills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				masteredSkills.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeePropertiesEditionPartForm.this, EefprimerViewsRepository.Employee.Properties.masteredSkills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				masteredSkills.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeePropertiesEditionPartForm.this, EefprimerViewsRepository.Employee.Properties.masteredSkills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				masteredSkills.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeePropertiesEditionPartForm.this, EefprimerViewsRepository.Employee.Properties.masteredSkills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				masteredSkills.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.masteredSkillsFilters) {
			this.masteredSkills.addFilter(filter);
		}
		this.masteredSkills.setHelpText(propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.Employee.Properties.masteredSkills, EefprimerViewsRepository.FORM_KIND));
		this.masteredSkills.createControls(parent, widgetFactory);
		this.masteredSkills.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeePropertiesEditionPartForm.this, EefprimerViewsRepository.Employee.Properties.masteredSkills, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		// Start of user code for createMasteredSkillsTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createBirthDateText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EefprimerViewsRepository.Employee.Properties.birthDate, EefprimerMessages.EmployeePropertiesEditionPart_BirthDateLabel);
		birthDate = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		birthDate.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData birthDateData = new GridData(GridData.FILL_HORIZONTAL);
		birthDate.setLayoutData(birthDateData);
		birthDate.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EmployeePropertiesEditionPartForm.this,
							EefprimerViewsRepository.Employee.Properties.birthDate,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, birthDate.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EmployeePropertiesEditionPartForm.this,
									EefprimerViewsRepository.Employee.Properties.birthDate,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, birthDate.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EmployeePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		birthDate.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeePropertiesEditionPartForm.this, EefprimerViewsRepository.Employee.Properties.birthDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, birthDate.getText()));
				}
			}
		});
		EditingUtils.setID(birthDate, EefprimerViewsRepository.Employee.Properties.birthDate);
		EditingUtils.setEEFtype(birthDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.Employee.Properties.birthDate, EefprimerViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createBirthDateText

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

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeePropertiesEditionPart#getBirthDate()
	 * 
	 */
	public String getBirthDate() {
		return birthDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeePropertiesEditionPart#setBirthDate(String newValue)
	 * 
	 */
	public void setBirthDate(String newValue) {
		if (newValue != null) {
			birthDate.setText(newValue);
		} else {
			birthDate.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.Employee.Properties.birthDate);
		if (eefElementEditorReadOnlyState && birthDate.isEnabled()) {
			birthDate.setEnabled(false);
			birthDate.setToolTipText(EefprimerMessages.Employee_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !birthDate.isEnabled()) {
			birthDate.setEnabled(true);
		}	
		
	}






	// Start of user code for CustomElementEditor Employee BirthDate specific getters and setters implementation
	/*
	@Override
	public String getBirthDateCustom() {
        int year = this.birthDate.getYear();
        int month = this.birthDate.getMonth();
        int day = this.birthDate.getDay();
        GregorianCalendar calendar = new GregorianCalendar(year, month, day); 
        Date birthDateAsDate = calendar.getTime(); 
		return String.valueOf(birthDateAsDate);
	}

	@Override
	public void setBirthDateCustom(String newValue) {
		if ( newValue!=null){
			
		Date initialDate = new Date(newValue);
		final GregorianCalendar calendarasis = new GregorianCalendar();
  	    calendarasis.setTime(initialDate);
        int year = calendarasis.get(Calendar.YEAR);
        int month = calendarasis.get(Calendar.MONTH);
        int day = calendarasis.get(Calendar.DAY_OF_MONTH);
        this.birthDate.setYear   (year);
        this.birthDate.setMonth  (month);
        this.birthDate.setDay    (day);
		}
	}
*/
	
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

	// Start of user code additional methods
	protected Composite createBirthDateDateTime(FormToolkit widgetFactory, Composite parent) {
		/*
		createDescription(parent, CustomsampleViewsRepository.Person.Properties.age, CustomsampleMessages.PersonPropertiesEditionPart_AgeLabel);
		age = new Spinner(parent, SWT.NONE); //$NON-NLS-1$
		age.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData ageData = new GridData(GridData.FILL_HORIZONTAL);
		age.setLayoutData(ageData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CustomsampleViewsRepository.Person.Properties.age, CustomsampleViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;*/
		return null;
	}
	
	// End of user code


}

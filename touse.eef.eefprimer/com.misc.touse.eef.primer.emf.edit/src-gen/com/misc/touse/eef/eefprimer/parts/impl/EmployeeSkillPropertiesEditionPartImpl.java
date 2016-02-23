/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.parts.impl;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;
import com.misc.touse.eef.eefprimer.parts.EmployeeSkillPropertiesEditionPart;

import com.misc.touse.eef.eefprimer.providers.EefprimerMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

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
public class EmployeeSkillPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EmployeeSkillPropertiesEditionPart {

	protected Text level;
	protected EObjectFlatComboViewer skill;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EmployeeSkillPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence employeeSkillStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = employeeSkillStep.addStep(EefprimerViewsRepository.EmployeeSkill.Properties.class);
		propertiesStep.addStep(EefprimerViewsRepository.EmployeeSkill.Properties.level);
		propertiesStep.addStep(EefprimerViewsRepository.EmployeeSkill.Properties.skill);
		
		
		composer = new PartComposer(employeeSkillStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefprimerViewsRepository.EmployeeSkill.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefprimerViewsRepository.EmployeeSkill.Properties.level) {
					return createLevelText(parent);
				}
				if (key == EefprimerViewsRepository.EmployeeSkill.Properties.skill) {
					return createSkillFlatComboViewer(parent);
				}
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
		propertiesGroup.setText(EefprimerMessages.EmployeeSkillPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createLevelText(Composite parent) {
		createDescription(parent, EefprimerViewsRepository.EmployeeSkill.Properties.level, EefprimerMessages.EmployeeSkillPropertiesEditionPart_LevelLabel);
		level = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData levelData = new GridData(GridData.FILL_HORIZONTAL);
		level.setLayoutData(levelData);
		level.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeeSkillPropertiesEditionPartImpl.this, EefprimerViewsRepository.EmployeeSkill.Properties.level, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, level.getText()));
			}

		});
		level.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeeSkillPropertiesEditionPartImpl.this, EefprimerViewsRepository.EmployeeSkill.Properties.level, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, level.getText()));
				}
			}

		});
		EditingUtils.setID(level, EefprimerViewsRepository.EmployeeSkill.Properties.level);
		EditingUtils.setEEFtype(level, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.EmployeeSkill.Properties.level, EefprimerViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createLevelText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSkillFlatComboViewer(Composite parent) {
		createDescription(parent, EefprimerViewsRepository.EmployeeSkill.Properties.skill, EefprimerMessages.EmployeeSkillPropertiesEditionPart_SkillLabel);
		skill = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EefprimerViewsRepository.EmployeeSkill.Properties.skill, EefprimerViewsRepository.SWT_KIND));
		skill.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		skill.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EmployeeSkillPropertiesEditionPartImpl.this, EefprimerViewsRepository.EmployeeSkill.Properties.skill, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSkill()));
			}

		});
		GridData skillData = new GridData(GridData.FILL_HORIZONTAL);
		skill.setLayoutData(skillData);
		skill.setID(EefprimerViewsRepository.EmployeeSkill.Properties.skill);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.EmployeeSkill.Properties.skill, EefprimerViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSkillFlatComboViewer

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
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeeSkillPropertiesEditionPart#getLevel()
	 * 
	 */
	public String getLevel() {
		return level.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeeSkillPropertiesEditionPart#setLevel(String newValue)
	 * 
	 */
	public void setLevel(String newValue) {
		if (newValue != null) {
			level.setText(newValue);
		} else {
			level.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.EmployeeSkill.Properties.level);
		if (eefElementEditorReadOnlyState && level.isEnabled()) {
			level.setEnabled(false);
			level.setToolTipText(EefprimerMessages.EmployeeSkill_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !level.isEnabled()) {
			level.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeeSkillPropertiesEditionPart#getSkill()
	 * 
	 */
	public EObject getSkill() {
		if (skill.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) skill.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeeSkillPropertiesEditionPart#initSkill(EObjectFlatComboSettings)
	 */
	public void initSkill(EObjectFlatComboSettings settings) {
		skill.setInput(settings);
		if (current != null) {
			skill.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.EmployeeSkill.Properties.skill);
		if (eefElementEditorReadOnlyState && skill.isEnabled()) {
			skill.setEnabled(false);
			skill.setToolTipText(EefprimerMessages.EmployeeSkill_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !skill.isEnabled()) {
			skill.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeeSkillPropertiesEditionPart#setSkill(EObject newValue)
	 * 
	 */
	public void setSkill(EObject newValue) {
		if (newValue != null) {
			skill.setSelection(new StructuredSelection(newValue));
		} else {
			skill.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.EmployeeSkill.Properties.skill);
		if (eefElementEditorReadOnlyState && skill.isEnabled()) {
			skill.setEnabled(false);
			skill.setToolTipText(EefprimerMessages.EmployeeSkill_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !skill.isEnabled()) {
			skill.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeeSkillPropertiesEditionPart#setSkillButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSkillButtonMode(ButtonsModeEnum newValue) {
		skill.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeeSkillPropertiesEditionPart#addFilterSkill(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSkill(ViewerFilter filter) {
		skill.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.EmployeeSkillPropertiesEditionPart#addBusinessFilterSkill(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSkill(ViewerFilter filter) {
		skill.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefprimerMessages.EmployeeSkill_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

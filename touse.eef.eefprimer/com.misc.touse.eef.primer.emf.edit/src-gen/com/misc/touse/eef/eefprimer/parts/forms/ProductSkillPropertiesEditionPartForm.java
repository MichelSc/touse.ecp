/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.parts.forms;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;
import com.misc.touse.eef.eefprimer.parts.ProductSkillPropertiesEditionPart;

import com.misc.touse.eef.eefprimer.providers.EefprimerMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

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
public class ProductSkillPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ProductSkillPropertiesEditionPart {

	protected Text level;
	protected EObjectFlatComboViewer skill;



	/**
	 * For {@link ISection} use only.
	 */
	public ProductSkillPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ProductSkillPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence productSkillStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = productSkillStep.addStep(EefprimerViewsRepository.ProductSkill.Properties.class);
		propertiesStep.addStep(EefprimerViewsRepository.ProductSkill.Properties.level);
		propertiesStep.addStep(EefprimerViewsRepository.ProductSkill.Properties.skill);
		
		
		composer = new PartComposer(productSkillStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefprimerViewsRepository.ProductSkill.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefprimerViewsRepository.ProductSkill.Properties.level) {
					return createLevelText(widgetFactory, parent);
				}
				if (key == EefprimerViewsRepository.ProductSkill.Properties.skill) {
					return createSkillFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(EefprimerMessages.ProductSkillPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createLevelText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EefprimerViewsRepository.ProductSkill.Properties.level, EefprimerMessages.ProductSkillPropertiesEditionPart_LevelLabel);
		level = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		level.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData levelData = new GridData(GridData.FILL_HORIZONTAL);
		level.setLayoutData(levelData);
		level.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ProductSkillPropertiesEditionPartForm.this,
							EefprimerViewsRepository.ProductSkill.Properties.level,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, level.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProductSkillPropertiesEditionPartForm.this,
									EefprimerViewsRepository.ProductSkill.Properties.level,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, level.getText()));
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
									ProductSkillPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		level.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProductSkillPropertiesEditionPartForm.this, EefprimerViewsRepository.ProductSkill.Properties.level, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, level.getText()));
				}
			}
		});
		EditingUtils.setID(level, EefprimerViewsRepository.ProductSkill.Properties.level);
		EditingUtils.setEEFtype(level, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.ProductSkill.Properties.level, EefprimerViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createLevelText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSkillFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, EefprimerViewsRepository.ProductSkill.Properties.skill, EefprimerMessages.ProductSkillPropertiesEditionPart_SkillLabel);
		skill = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EefprimerViewsRepository.ProductSkill.Properties.skill, EefprimerViewsRepository.FORM_KIND));
		widgetFactory.adapt(skill);
		skill.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData skillData = new GridData(GridData.FILL_HORIZONTAL);
		skill.setLayoutData(skillData);
		skill.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProductSkillPropertiesEditionPartForm.this, EefprimerViewsRepository.ProductSkill.Properties.skill, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSkill()));
			}

		});
		skill.setID(EefprimerViewsRepository.ProductSkill.Properties.skill);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.ProductSkill.Properties.skill, EefprimerViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see com.misc.touse.eef.eefprimer.parts.ProductSkillPropertiesEditionPart#getLevel()
	 * 
	 */
	public String getLevel() {
		return level.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductSkillPropertiesEditionPart#setLevel(String newValue)
	 * 
	 */
	public void setLevel(String newValue) {
		if (newValue != null) {
			level.setText(newValue);
		} else {
			level.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.ProductSkill.Properties.level);
		if (eefElementEditorReadOnlyState && level.isEnabled()) {
			level.setEnabled(false);
			level.setToolTipText(EefprimerMessages.ProductSkill_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !level.isEnabled()) {
			level.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductSkillPropertiesEditionPart#getSkill()
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
	 * @see com.misc.touse.eef.eefprimer.parts.ProductSkillPropertiesEditionPart#initSkill(EObjectFlatComboSettings)
	 */
	public void initSkill(EObjectFlatComboSettings settings) {
		skill.setInput(settings);
		if (current != null) {
			skill.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.ProductSkill.Properties.skill);
		if (eefElementEditorReadOnlyState && skill.isEnabled()) {
			skill.setEnabled(false);
			skill.setToolTipText(EefprimerMessages.ProductSkill_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !skill.isEnabled()) {
			skill.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductSkillPropertiesEditionPart#setSkill(EObject newValue)
	 * 
	 */
	public void setSkill(EObject newValue) {
		if (newValue != null) {
			skill.setSelection(new StructuredSelection(newValue));
		} else {
			skill.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.ProductSkill.Properties.skill);
		if (eefElementEditorReadOnlyState && skill.isEnabled()) {
			skill.setEnabled(false);
			skill.setToolTipText(EefprimerMessages.ProductSkill_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !skill.isEnabled()) {
			skill.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductSkillPropertiesEditionPart#setSkillButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSkillButtonMode(ButtonsModeEnum newValue) {
		skill.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductSkillPropertiesEditionPart#addFilterSkill(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSkill(ViewerFilter filter) {
		skill.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductSkillPropertiesEditionPart#addBusinessFilterSkill(ViewerFilter filter)
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
		return EefprimerMessages.ProductSkill_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

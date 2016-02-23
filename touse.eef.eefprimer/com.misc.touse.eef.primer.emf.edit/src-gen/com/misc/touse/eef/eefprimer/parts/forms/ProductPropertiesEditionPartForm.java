/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.parts.forms;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;
import com.misc.touse.eef.eefprimer.parts.ProductPropertiesEditionPart;

import com.misc.touse.eef.eefprimer.providers.EefprimerMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.IStructuredSelection;
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
public class ProductPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ProductPropertiesEditionPart {

	protected ReferencesTable requiredSkills;
	protected List<ViewerFilter> requiredSkillsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> requiredSkillsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable requiredMachines;
	protected List<ViewerFilter> requiredMachinesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> requiredMachinesFilters = new ArrayList<ViewerFilter>();
	protected Text name;
	protected Text productionHours;



	/**
	 * For {@link ISection} use only.
	 */
	public ProductPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ProductPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence productStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = productStep.addStep(EefprimerViewsRepository.Product.Properties.class);
		propertiesStep.addStep(EefprimerViewsRepository.Product.Properties.requiredSkills);
		propertiesStep.addStep(EefprimerViewsRepository.Product.Properties.requiredMachines);
		propertiesStep.addStep(EefprimerViewsRepository.Product.Properties.name);
		propertiesStep.addStep(EefprimerViewsRepository.Product.Properties.productionHours);
		
		
		composer = new PartComposer(productStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefprimerViewsRepository.Product.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefprimerViewsRepository.Product.Properties.requiredSkills) {
					return createRequiredSkillsTableComposition(widgetFactory, parent);
				}
				if (key == EefprimerViewsRepository.Product.Properties.requiredMachines) {
					return createRequiredMachinesReferencesTable(widgetFactory, parent);
				}
				if (key == EefprimerViewsRepository.Product.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == EefprimerViewsRepository.Product.Properties.productionHours) {
					return createProductionHoursText(widgetFactory, parent);
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
		propertiesSection.setText(EefprimerMessages.ProductPropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * @param container
	 * 
	 */
	protected Composite createRequiredSkillsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.requiredSkills = new ReferencesTable(getDescription(EefprimerViewsRepository.Product.Properties.requiredSkills, EefprimerMessages.ProductPropertiesEditionPart_RequiredSkillsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProductPropertiesEditionPartForm.this, EefprimerViewsRepository.Product.Properties.requiredSkills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				requiredSkills.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProductPropertiesEditionPartForm.this, EefprimerViewsRepository.Product.Properties.requiredSkills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				requiredSkills.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProductPropertiesEditionPartForm.this, EefprimerViewsRepository.Product.Properties.requiredSkills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				requiredSkills.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProductPropertiesEditionPartForm.this, EefprimerViewsRepository.Product.Properties.requiredSkills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				requiredSkills.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.requiredSkillsFilters) {
			this.requiredSkills.addFilter(filter);
		}
		this.requiredSkills.setHelpText(propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.Product.Properties.requiredSkills, EefprimerViewsRepository.FORM_KIND));
		this.requiredSkills.createControls(parent, widgetFactory);
		this.requiredSkills.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProductPropertiesEditionPartForm.this, EefprimerViewsRepository.Product.Properties.requiredSkills, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData requiredSkillsData = new GridData(GridData.FILL_HORIZONTAL);
		requiredSkillsData.horizontalSpan = 3;
		this.requiredSkills.setLayoutData(requiredSkillsData);
		this.requiredSkills.setLowerBound(0);
		this.requiredSkills.setUpperBound(-1);
		requiredSkills.setID(EefprimerViewsRepository.Product.Properties.requiredSkills);
		requiredSkills.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createRequiredSkillsTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRequiredMachinesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.requiredMachines = new ReferencesTable(getDescription(EefprimerViewsRepository.Product.Properties.requiredMachines, EefprimerMessages.ProductPropertiesEditionPart_RequiredMachinesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addRequiredMachines(); }
			public void handleEdit(EObject element) { editRequiredMachines(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveRequiredMachines(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromRequiredMachines(element); }
			public void navigateTo(EObject element) { }
		});
		this.requiredMachines.setHelpText(propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.Product.Properties.requiredMachines, EefprimerViewsRepository.FORM_KIND));
		this.requiredMachines.createControls(parent, widgetFactory);
		this.requiredMachines.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProductPropertiesEditionPartForm.this, EefprimerViewsRepository.Product.Properties.requiredMachines, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData requiredMachinesData = new GridData(GridData.FILL_HORIZONTAL);
		requiredMachinesData.horizontalSpan = 3;
		this.requiredMachines.setLayoutData(requiredMachinesData);
		this.requiredMachines.disableMove();
		requiredMachines.setID(EefprimerViewsRepository.Product.Properties.requiredMachines);
		requiredMachines.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createRequiredMachinesReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addRequiredMachines() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(requiredMachines.getInput(), requiredMachinesFilters, requiredMachinesBusinessFilters,
		"RequiredMachines", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProductPropertiesEditionPartForm.this, EefprimerViewsRepository.Product.Properties.requiredMachines,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				requiredMachines.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveRequiredMachines(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProductPropertiesEditionPartForm.this, EefprimerViewsRepository.Product.Properties.requiredMachines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		requiredMachines.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRequiredMachines(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProductPropertiesEditionPartForm.this, EefprimerViewsRepository.Product.Properties.requiredMachines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		requiredMachines.refresh();
	}

	/**
	 * 
	 */
	protected void editRequiredMachines(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				requiredMachines.refresh();
			}
		}
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EefprimerViewsRepository.Product.Properties.name, EefprimerMessages.ProductPropertiesEditionPart_NameLabel);
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
							ProductPropertiesEditionPartForm.this,
							EefprimerViewsRepository.Product.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProductPropertiesEditionPartForm.this,
									EefprimerViewsRepository.Product.Properties.name,
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
									ProductPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProductPropertiesEditionPartForm.this, EefprimerViewsRepository.Product.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, EefprimerViewsRepository.Product.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.Product.Properties.name, EefprimerViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createProductionHoursText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EefprimerViewsRepository.Product.Properties.productionHours, EefprimerMessages.ProductPropertiesEditionPart_ProductionHoursLabel);
		productionHours = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		productionHours.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData productionHoursData = new GridData(GridData.FILL_HORIZONTAL);
		productionHours.setLayoutData(productionHoursData);
		productionHours.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ProductPropertiesEditionPartForm.this,
							EefprimerViewsRepository.Product.Properties.productionHours,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, productionHours.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProductPropertiesEditionPartForm.this,
									EefprimerViewsRepository.Product.Properties.productionHours,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, productionHours.getText()));
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
									ProductPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		productionHours.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProductPropertiesEditionPartForm.this, EefprimerViewsRepository.Product.Properties.productionHours, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, productionHours.getText()));
				}
			}
		});
		EditingUtils.setID(productionHours, EefprimerViewsRepository.Product.Properties.productionHours);
		EditingUtils.setEEFtype(productionHours, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.Product.Properties.productionHours, EefprimerViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createProductionHoursText

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
	 * @see com.misc.touse.eef.eefprimer.parts.ProductPropertiesEditionPart#initRequiredSkills(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initRequiredSkills(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		requiredSkills.setContentProvider(contentProvider);
		requiredSkills.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.Product.Properties.requiredSkills);
		if (eefElementEditorReadOnlyState && requiredSkills.isEnabled()) {
			requiredSkills.setEnabled(false);
			requiredSkills.setToolTipText(EefprimerMessages.Product_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !requiredSkills.isEnabled()) {
			requiredSkills.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductPropertiesEditionPart#updateRequiredSkills()
	 * 
	 */
	public void updateRequiredSkills() {
	requiredSkills.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductPropertiesEditionPart#addFilterRequiredSkills(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRequiredSkills(ViewerFilter filter) {
		requiredSkillsFilters.add(filter);
		if (this.requiredSkills != null) {
			this.requiredSkills.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductPropertiesEditionPart#addBusinessFilterRequiredSkills(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRequiredSkills(ViewerFilter filter) {
		requiredSkillsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductPropertiesEditionPart#isContainedInRequiredSkillsTable(EObject element)
	 * 
	 */
	public boolean isContainedInRequiredSkillsTable(EObject element) {
		return ((ReferencesTableSettings)requiredSkills.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductPropertiesEditionPart#initRequiredMachines(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRequiredMachines(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		requiredMachines.setContentProvider(contentProvider);
		requiredMachines.setInput(settings);
		requiredMachinesBusinessFilters.clear();
		requiredMachinesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.Product.Properties.requiredMachines);
		if (eefElementEditorReadOnlyState && requiredMachines.getTable().isEnabled()) {
			requiredMachines.setEnabled(false);
			requiredMachines.setToolTipText(EefprimerMessages.Product_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !requiredMachines.getTable().isEnabled()) {
			requiredMachines.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductPropertiesEditionPart#updateRequiredMachines()
	 * 
	 */
	public void updateRequiredMachines() {
	requiredMachines.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductPropertiesEditionPart#addFilterRequiredMachines(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRequiredMachines(ViewerFilter filter) {
		requiredMachinesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductPropertiesEditionPart#addBusinessFilterRequiredMachines(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRequiredMachines(ViewerFilter filter) {
		requiredMachinesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductPropertiesEditionPart#isContainedInRequiredMachinesTable(EObject element)
	 * 
	 */
	public boolean isContainedInRequiredMachinesTable(EObject element) {
		return ((ReferencesTableSettings)requiredMachines.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.Product.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(EefprimerMessages.Product_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductPropertiesEditionPart#getProductionHours()
	 * 
	 */
	public String getProductionHours() {
		return productionHours.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ProductPropertiesEditionPart#setProductionHours(String newValue)
	 * 
	 */
	public void setProductionHours(String newValue) {
		if (newValue != null) {
			productionHours.setText(newValue);
		} else {
			productionHours.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.Product.Properties.productionHours);
		if (eefElementEditorReadOnlyState && productionHours.isEnabled()) {
			productionHours.setEnabled(false);
			productionHours.setToolTipText(EefprimerMessages.Product_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !productionHours.isEnabled()) {
			productionHours.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefprimerMessages.Product_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

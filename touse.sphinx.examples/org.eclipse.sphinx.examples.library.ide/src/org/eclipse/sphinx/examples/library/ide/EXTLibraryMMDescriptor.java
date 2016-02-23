package org.eclipse.sphinx.examples.library.ide;

import org.eclipse.sphinx.emf.metamodel.AbstractMetaModelDescriptor;

public class EXTLibraryMMDescriptor extends AbstractMetaModelDescriptor {

	private static final String ID = "org.eclipse.sphinx.examples.extlibrary"; //$NON-NLS-1$

	private static final String NAMESPACE = 
	  "http:///org/eclipse/emf/examples/library/extlibrary.ecore/1.0.0"; //$NON-NLS-1$

	private static final String NAME = "Extended Library"; //$NON-NLS-1$ 

	/**
	 * Singleton instance.
	 */
	public static final EXTLibraryMMDescriptor INSTANCE = new EXTLibraryMMDescriptor();

	/**
	 * Constructor of the class.
	 */
	protected EXTLibraryMMDescriptor() { 
	    super(ID, NAMESPACE, NAME); 
	}

	/**
	 * Returns the identifier of the default content type for the described
	 * meta-model.
	 */
	@Override
	public String getDefaultContentTypeId() {
	    return "org.eclipse.emf.examples.library.extendedLibrary";
	}
}

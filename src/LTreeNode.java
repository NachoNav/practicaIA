package Arbol;
import java.util.List;

import net.datastructures.*;

public class LTreeNode<E> implements Position<E> {
	private E element;
	private LTreeNode<E> parent;
	private List<LTreeNode<E>> children; // in the plural
	
	public LTreeNode(E e, LTreeNode<E> parent, List<LTreeNode<E>> Child) {
		this.element = e;
		this.parent = parent;
		this.children = Child;
	}
		
	public void setElement(E element) {
		this.element = element;
	}

	/** only function included in Position interface **/
	public E element() {
		return element;
	}
	
	public void setParent(LTreeNode<E> parent) {
		this.parent = parent;
	}
	
	public LTreeNode<E> getParent() {
		return parent;
	}
	
	public void setChildren(List<LTreeNode<E>> Child) {
		this.children = Child;
	}
	
	public List<LTreeNode<E>> getChildren() {
		return children;
	}
}

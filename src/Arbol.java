package Arbol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import jdd.graph.Edge;
import Grafo.*;

public class Arbol  {

	Nodo origen;
	Nodo destino;
	Grafo grafo;
	Map<String, List<Edge>> tabla;
	LTree<Elemento> arbol = new LTree<Elemento>();
	List<LTreeNode<Elemento>> posibles = new ArrayList<LTreeNode<Elemento>>();

	public Arbol(Nodo salida,Nodo llegada,Grafo grafo){
		this.grafo = grafo;
		this.origen = salida;
		this.destino = llegada;
		this.arbol.setRoot(new Elemento(0,salida.distancia(llegada),salida));
		this.arbol.root.element().setrecorrido(salida.distancia(llegada));
		this.arbol.root.setChildren(grafo.getChildren(this.arbol.root, llegada));
		addList(posibles,this.arbol.root.getChildren());
	}


	private void addList(List<LTreeNode<Elemento>> lis,List<LTreeNode<Elemento>> hijos){
		Iterator<LTreeNode<Elemento>> it = hijos.iterator();
		while(it.hasNext()){
			lis.add(it.next());
		}
	}

	public LTreeNode<Elemento> seleccionHijo(LTreeNode<Elemento>padre){
		LTreeNode<Elemento> nod = new LTreeNode<Elemento>(null,null,null);
		LTreeNode<Elemento> nodo = new LTreeNode<Elemento>(null,null,null);
		double gh = 0;
		Iterator<LTreeNode<Elemento>> iterador = posibles.iterator(); 
		nod = iterador.next();
		gh = gh(nod);
		nodo=nod;
		int j = 0;
		int i = 0;
		while(iterador.hasNext()){
			nod = iterador.next();
			j=j+1;
			if (gh>gh(nod) && 
					(nod.element().getnodo().getNombre()!= padre.element().getnodo().getNombre())){
				gh = gh(nod);
				nodo=nod;
				i = j;
			}
		}

		nodo.element().setrecorrido(gh);
		j=0;
		posibles.remove(i);
		iterador = posibles.iterator(); 
		List<Integer> borrar =new ArrayList<Integer>();
		while(iterador.hasNext()){
			if(iterador.next().element().getnodo().getNombre()==nodo.element().getnodo().getNombre())
				borrar.add(j);
			j++;
		}

		Iterator <Integer >iterad = borrar.iterator(); 
		while(iterad.hasNext()){
			posibles.remove(iterad.next());
		}

		if (nodo.getChildren() == null){
			nodo.setChildren(grafo.getChildren(nodo, destino));
			addList(posibles,nodo.getChildren());
		}
		return nodo;
	}


	public LTreeNode<Elemento> CalcularRecorrido(){
		LTreeNode<Elemento> nodo = this.arbol.root;
		if (origen.getNombre()!=destino.getNombre()){
			nodo = seleccionHijo(nodo);
			while(!estaAcabado(nodo)){
				nodo = seleccionHijo(nodo);
			}
		}
		return nodo;
	} 



	public List<Nodo> mejorRecorrido(LTreeNode<Elemento> fin){
		List<Nodo> recorrido = new ArrayList<Nodo>();
		LTreeNode<Elemento> posicion = fin;
		boolean condicion = true;
		while(condicion){
			if (posicion.getParent()==null){
				recorrido.add(((Elemento)posicion.element()).getnodo());
				condicion = false;
			}
			else{
				recorrido.add(((Elemento)posicion.element()).getnodo());
				posicion = posicion.getParent();
			}
		}
		return recorrido;
	}

	public boolean estaAcabado(LTreeNode<Elemento>fin){
		return (fin.element().getnodo().getNombre() == destino.getNombre());
	}

	public double gh (LTreeNode<Elemento> nodo){
		return nodo.getParent().element().recorridoParcial() + nodo.element().recorridoMax();
	}

}

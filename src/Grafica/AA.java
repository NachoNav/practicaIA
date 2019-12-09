package Grafica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jdd.graph.Edge;
import Arbol.Arbol;
import Grafo.*;

public class AA {

	private Grafo grafo;
	Nodo salida;
	Nodo llegada;

	public AA(String salida, String llegada) {

		grafo = new Grafo(true);

		// Creacion de la linea de metro

		// ESTACIONES
		// Compartidas
		Nodo Shinjuku = grafo.addNode("Shinjuku",0 ,7 );
		Nodo Yoyogi = grafo.addNode("Yoyogi",0 ,10 );
		Nodo Tokyo = grafo.addNode("Tokyo",11 ,11 );
		Nodo Akihabara = grafo.addNode("Akihabara",11 ,7 );
		Nodo Ochanomizu = grafo.addNode("Ochanomizu",7 ,6 );
		
		// Estaciones Yamanote Line (verde)
		Nodo Takadanobaba = grafo.addNode("Takadanobaba", 0, 2);
		Nodo Shin_Okubo = grafo.addNode("Shin_Okubo",0 ,4 );
		Nodo Harajuku = grafo.addNode("Harajuku",0 ,12 );
		Nodo Shibuya = grafo.addNode("Shibuya",0 ,13 );
		Nodo Ebisu = grafo.addNode("Ebisu",0 ,15 );
		Nodo Meguro = grafo.addNode("Meguro",2 ,16 );
		Nodo Gotanda = grafo.addNode("Gotanda",3 ,16 );
		Nodo Osaki = grafo.addNode("Osaki",5 ,16 );
		Nodo Shinagawa = grafo.addNode("Shinagawa",7 ,16 );
		Nodo Tamachi = grafo.addNode("Tamachi",8 ,15 );
		Nodo Hamamatsucho = grafo.addNode("Hamamatsucho",9 ,14 );
		Nodo Shimbashi = grafo.addNode("Shimbashi",10 ,13 );
		Nodo Yurakucho = grafo.addNode("Yurakucho",11 ,12 );
		Nodo Kanda = grafo.addNode("Kanda",11 ,10 );
		Nodo Okachimachi = grafo.addNode("Okachimachi",11 ,6 );
		Nodo Ueno = grafo.addNode("Ueno",11 ,5 );
		Nodo Uguisudani = grafo.addNode("Uguisudani",11 ,4 );
		Nodo Nippori = grafo.addNode("Nippori",11 ,3 );
		Nodo Nishi_Nippori = grafo.addNode("Nishi_Nippori",11 ,2 );
		Nodo Tabata = grafo.addNode("Tabata",10 ,1 );
		Nodo Komagome = grafo.addNode("Komagome",9 ,0 );
		Nodo Sugamo = grafo.addNode("Sugamo",8 ,0 );
		Nodo Otsuka = grafo.addNode("Otsuka",7 ,0 );
		Nodo Ikebukuro = grafo.addNode("Ikebukuro",4 ,0 );
		Nodo Mejiro = grafo.addNode("Mejiro",2 ,1 );	
		Nodo Shinjuku_Yamanote = grafo.addNode("Shinjuku_Yamanote",0 ,7 );
		Nodo Yoyogi_Yamanote = grafo.addNode("Yoyogi_Yamanote",0 ,10 );
		Nodo Tokyo_Yamanote = grafo.addNode("Tokyo_Yamanote",11 ,11 );
		Nodo Akihabara_Yamanote = grafo.addNode("Akihabara_Yamanote",11 ,7 );
			
		// Estaciones Sobu (amarilla)
		Nodo Sendagaya = grafo.addNode("Sendagaya",1 ,11 );
		Nodo Shinanomachi = grafo.addNode("Shinanomachi",2 ,11 );
		Nodo Yotsuya = grafo.addNode("Yotsuya",3 ,10 );
		Nodo Ichigaya = grafo.addNode("Ichigaya",4 ,9 );
		Nodo Iidabashi = grafo.addNode("Iidabashi",5 ,8 );
		Nodo Suidobashi = grafo.addNode("Suidobashi",6 ,7 );
		Nodo Shinjuku_Sobu = grafo.addNode("Shinjuku_Sobu",0 ,7 );
		Nodo Yoyogi_Sobu = grafo.addNode("Yoyogi_Sobu",0 ,10 );
		Nodo Akihabara_Sobu = grafo.addNode("Akihabara_Sobu",11 ,7 );
		Nodo Ochanomizu_Sobu = grafo.addNode("Ochanomizu_Sobu",7 ,6 );
				
		// Estaciones Chuo (roja) 
		Nodo Shinjuku_Chuo = grafo.addNode("Shinjuku_Chuo",0 ,7 );
		Nodo Ochanomizu_Chuo = grafo.addNode("Ochanomizu_Chuo",7 ,6 );
		Nodo Tokyo_Chuo = grafo.addNode("Tokyo_Chuo",11 ,11 );


		
		// Conexiones Yamanote Line (verde)
		// Ida
		grafo.addEdge (Tokyo_Yamanote, Yurakucho, 1, "YamanoteLine");
		grafo.addEdge (Yurakucho, Shimbashi, 2, "YamanoteLine");
		grafo.addEdge (Shimbashi, Hamamatsucho, 2, "YamanoteLine");
		grafo.addEdge (Hamamatsucho, Tamachi, 3, "YamanoteLine");
		grafo.addEdge (Tamachi, Shinagawa, 3, "YamanoteLine");
		grafo.addEdge (Shinagawa, Osaki, 3, "YamanoteLine");
		grafo.addEdge (Osaki, Gotanda, 2, "YamanoteLine");
		grafo.addEdge (Gotanda, Meguro, 2, "YamanoteLine");
		grafo.addEdge (Meguro, Ebisu, 3, "YamanoteLine");
		grafo.addEdge (Ebisu, Shibuya, 2, "YamanoteLine");
		grafo.addEdge (Shibuya, Harajuku, 2, "YamanoteLine");
		grafo.addEdge (Harajuku, Yoyogi, 2, "YamanoteLine");
		grafo.addEdge (Yoyogi, Shinjuku, 3, "YamanoteLine");
		grafo.addEdge (Shinjuku, Shin_Okubo, 2, "YamanoteLine");
		grafo.addEdge (Shin_Okubo, Takadanobaba, 2, "YamanoteLine");
		grafo.addEdge (Takadanobaba, Mejiro, 2, "YamanoteLine");
		grafo.addEdge (Mejiro, Ikebukuro, 3, "YamanoteLine");
		grafo.addEdge (Ikebukuro, Otsuka, 2, "YamanoteLine");
		grafo.addEdge (Otsuka, Sugamo, 2, "YamanoteLine");
		grafo.addEdge (Sugamo, Komagome, 2, "YamanoteLine");
		grafo.addEdge (Komagome, Tabata, 3, "YamanoteLine");
		grafo.addEdge (Tabata, Nishi_Nippori, 1, "YamanoteLine");
		grafo.addEdge (Nishi_Nippori, Nippori, 2, "YamanoteLine");
		grafo.addEdge (Nippori, Uguisudani, 1, "YamanoteLine");
		grafo.addEdge (Uguisudani, Ueno, 3, "YamanoteLine");
		grafo.addEdge (Ueno, Okachimachi, 1, "YamanoteLine");
		grafo.addEdge (Okachimachi, Akihabara_Yamanote, 2, "YamanoteLine");
		grafo.addEdge (Akihabara_Yamanote, Kanda, 1, "YamanoteLine");
		grafo.addEdge (Kanda, Tokyo_Yamanote, 2, "YamanoteLine");	
		// Vuelta
		grafo.addEdge (Tokyo_Yamanote, Kanda, 2, "YamanoteLine");
		grafo.addEdge (Kanda, Akihabara_Yamanote, 1, "YamanoteLine");
		grafo.addEdge (Akihabara_Yamanote, Okachimachi, 2, "YamanoteLine");
		grafo.addEdge (Okachimachi, Ueno, 1, "YamanoteLine");
		grafo.addEdge (Ueno, Uguisudani, 3, "YamanoteLine");
		grafo.addEdge (Uguisudani, Nippori, 1, "YamanoteLine");
		grafo.addEdge (Nippori, Nishi_Nippori, 2, "YamanoteLine");
		grafo.addEdge (Nishi_Nippori, Tabata, 1, "YamanoteLine");
		grafo.addEdge (Tabata, Komagome, 3, "YamanoteLine");
		grafo.addEdge (Komagome, Sugamo, 2, "YamanoteLine");
		grafo.addEdge (Sugamo, Otsuka, 2, "YamanoteLine");
		grafo.addEdge (Otsuka, Ikebukuro, 2, "YamanoteLine");
		grafo.addEdge (Ikebukuro, Mejiro, 3, "YamanoteLine");
		grafo.addEdge (Mejiro, Takadanobaba, 2, "YamanoteLine");
		grafo.addEdge (Takadanobaba, Shin_Okubo, 2, "YamanoteLine");
		grafo.addEdge (Shin_Okubo, Shinjuku_Yamanote, 2, "YamanoteLine");
		grafo.addEdge (Shinjuku_Yamanote, Yoyogi, 3, "YamanoteLine");
		grafo.addEdge (Yoyogi, Harajuku, 2, "YamanoteLine");
		grafo.addEdge (Harajuku, Shibuya, 2, "YamanoteLine");
		grafo.addEdge (Shibuya, Ebisu, 2, "YamanoteLine");
		grafo.addEdge (Ebisu, Meguro, 3, "YamanoteLine");
		grafo.addEdge (Meguro, Gotanda, 2, "YamanoteLine");
		grafo.addEdge (Gotanda, Osaki, 2, "YamanoteLine");
		grafo.addEdge (Osaki, Shinagawa, 3, "YamanoteLine");
		grafo.addEdge (Shinagawa, Tamachi, 3, "YamanoteLine");
		grafo.addEdge (Tamachi, Hamamatsucho, 3, "YamanoteLine");
		grafo.addEdge (Hamamatsucho, Shimbashi, 2, "YamanoteLine");
		grafo.addEdge (Shimbashi, Yurakucho, 2, "YamanoteLine");
		grafo.addEdge (Yurakucho, Tokyo_Yamanote, 1, "YamanoteLine");
		
		// Conexiones SobuLine (amarilla)
		// Ida
		grafo.addEdge (Akihabara, Ochanomizu, 2, "SobuLine");
		grafo.addEdge (Ochanomizu, Suidobashi, 4, "SobuLine");
		grafo.addEdge (Suidobashi, Iidabashi, 1, "SobuLine");
		grafo.addEdge (Iidabashi, Ichigaya, 1, "SobuLine");
		grafo.addEdge (Ichigaya, Yotsuya, 2, "SobuLine");
		grafo.addEdge (Yotsuya, Shinanomachi, 2, "SobuLine");
		grafo.addEdge (Shinanomachi, Sendagaya, 2, "SobuLine");
		grafo.addEdge (Sendagaya, Yoyogi, 1, "SobuLine");
		grafo.addEdge (Yoyogi, Shinjuku, 2, "SobuLine");
		// Vuelta
		grafo.addEdge (Shinjuku, Yoyogi, 2, "SobuLine");
		grafo.addEdge (Yoyogi, Sendagaya, 1, "SobuLine");
		grafo.addEdge (Sendagaya, Shinanomachi, 2, "SobuLine");
		grafo.addEdge (Shinanomachi, Yotsuya, 2, "SobuLine");
		grafo.addEdge (Yotsuya, Ichigaya, 2, "SobuLine");
		grafo.addEdge (Ichigaya, Iidabashi, 1, "SobuLine");
		grafo.addEdge (Iidabashi, Suidobashi, 1, "SobuLine");
		grafo.addEdge (Suidobashi, Ochanomizu, 4, "SobuLine");
		grafo.addEdge (Ochanomizu, Akihabara, 2, "SobuLine");
		
		
		// Conexiones ChuoLine (roja)
		// Ida
		grafo.addEdge (Tokyo_Chuo, Ochanomizu, 5, "ChuoLine");
		grafo.addEdge (Ochanomizu, Shinjuku, 9, "ChuoLine");
		// Vuelta
		grafo.addEdge (Shinjuku, Ochanomizu, 9, "ChuoLine");
		grafo.addEdge (Ochanomizu, Tokyo_Chuo, 5, "ChuoLine");


		// Trasbordos
		
		// Tokyo
		grafo.addEdge (Tokyo, Tokyo_Yamanote, 1, "Transbordo");
		grafo.addEdge (Tokyo_Yamanote, Tokyo, 5, "Transbordo");
		grafo.addEdge (Tokyo, Tokyo_Chuo, 1, "Transbordo");		
		grafo.addEdge (Tokyo_Chuo, Tokyo, 5, "Transbordo");
		
		// Akihabara
		grafo.addEdge (Akihabara, Akihabara_Yamanote, 1, "Transbordo");
		grafo.addEdge (Akihabara_Yamanote, Akihabara, 5, "Transbordo");
		grafo.addEdge (Akihabara, Akihabara_Sobu, 1, "Transbordo");
		grafo.addEdge (Akihabara_Sobu, Akihabara, 5, "Transbordo");
		
		// Ochanomizu
		grafo.addEdge (Ochanomizu, Ochanomizu_Sobu, 1, "Transbordo");
		grafo.addEdge (Ochanomizu_Sobu, Ochanomizu, 5, "Transbordo");
		grafo.addEdge (Ochanomizu, Ochanomizu_Chuo, 1, "Transbordo");
		grafo.addEdge (Ochanomizu_Chuo, Ochanomizu, 5, "Transbordo");
		
		// Yoyogi
		grafo.addEdge (Yoyogi, Yoyogi_Yamanote, 1, "Transbordo");
		grafo.addEdge (Yoyogi_Yamanote, Yoyogi, 5, "Transbordo");
		grafo.addEdge (Yoyogi, Yoyogi_Sobu, 1, "Transbordo");
		grafo.addEdge (Yoyogi_Sobu, Yoyogi, 5, "Transbordo");
		
		// Shinjuku
		grafo.addEdge (Shinjuku, Shinjuku_Yamanote, 1, "Transbordo");
		grafo.addEdge (Shinjuku_Yamanote, Shinjuku, 5, "Transbordo");
		grafo.addEdge (Shinjuku, Shinjuku_Sobu, 1, "Transbordo");
		grafo.addEdge (Shinjuku_Sobu, Shinjuku, 5, "Transbordo");
		grafo.addEdge (Shinjuku, Shinjuku_Chuo, 1, "Transbordo");
		grafo.addEdge (Shinjuku_Chuo, Shinjuku, 5, "Transbordo");
		
		Iterator<Edge> l = grafo.getMap().get(salida).iterator();
		boolean cond = true;
		Edge tramo;
		while(l.hasNext() && cond){
			tramo = l.next();
			if(((Nodo)tramo.n1).getNombre() == salida) {
				this.salida = (Nodo)tramo.n1;
				cond = false;
			}
		}
		

		Iterator<Edge> s = grafo.getMap().get(llegada).iterator();
		cond = true;
		while(s.hasNext() && cond){
			tramo = s.next();
			if(((Nodo)tramo.n1).getNombre() == llegada) {
				this.llegada = (Nodo)tramo.n1;
				cond = false;
			}
		}
	}

	
	public List<Pixel> recorridoOptimo() {
		String linea = "";
		String lineaA = "Linea0";
		Arbol arbol = new Arbol(salida, llegada, grafo);
		List<Nodo> camino = arbol.recorridoOptimo(arbol.CalcularRecorrido());
		List<Pixel> recorrido = new ArrayList<Pixel>();
		Iterator<Nodo> iterador = camino.iterator();
		Iterator<Nodo> iterador2 = camino.iterator();
		iterador2.next();
		while (iterador.hasNext()) {
			Nodo nodo = iterador.next();
			Nodo nodo2;
			if (iterador2.hasNext()) {
				nodo2 = iterador2.next();
				Iterator<Edge> l = grafo.getMap().get(nodo.getNombre())
						.iterator();
				boolean cond = true;
				Edge tramo;
				while (l.hasNext() && cond) {
					tramo = l.next();
					if (((Nodo) tramo.n2).getNombre() == nodo2.getNombre()) {
						if (cond && linea == lineaA) {
							linea = tramo.getLabel();
							cond = false;
						} else
							linea = tramo.getLabel();
					}
				}
				lineaA = linea;
			} else
				linea = "";
			Pixel pixel = new Pixel(nodo.getX(), nodo.getY(), nodo.getNombre(), linea);
			recorrido.add(pixel);
		}
		// Save travel time in last pixel
		if (recorrido.isEmpty()) {
			throw new RuntimeException("Empty recorrido list");
		}
		recorrido.get(recorrido.size()-1).setDistance(recordTravelTime(grafo, recorrido));
		return recorrido;
	}

	private int recordTravelTime(Grafo grafo, List<Pixel> recorrido) {
		int travelTime = 0;
		Pixel pixel;
		Pixel pixel2;
		String nameNode1;
		String nameNode2;
		for (int count = 0; count < recorrido.size()-1; count++) {
			pixel = recorrido.get(count);
			pixel2 = recorrido.get(count+1);
			nameNode1 = pixel.Nombre;
			nameNode2 = pixel2.Nombre;

			for (Edge edge : grafo.getGrafoEdges()) {
				if ((edge.n1.getLabel().equals(nameNode1) && edge.n2.getLabel().equals(nameNode2)) ||
						(edge.n2.getLabel().equals(nameNode1) && edge.n1.getLabel().equals(nameNode2))) {
					travelTime += edge.id;
				}
			}
		}
		return travelTime;
	}
}

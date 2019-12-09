package Grafica;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JScrollPane;


public class ChoiceSal extends Applet implements ItemListener {
	private static final long serialVersionUID = 1L;
	/* Declaration */
	private LayoutManager Layout;
	String [] Estaciones = new String [37];
	List Selector = new List(30,false);
	private Font Times;
	Ventana salida;

	@SuppressWarnings("deprecation")
	public ChoiceSal (Ventana salida, JScrollPane panel, Container contentpane) {
		/* Declaration */
		this.salida = salida;
		int i;

		/* Instantiation */
		Times = new Font("Arial", 15, 25);
		Layout = new FlowLayout ();
		Selector.setFont (Times);
		Selector.setBounds(40, 200, 335, 90);


		/* Decoration */
		Estaciones [0] = "*Selecione Origen*";
		Estaciones [1] = "Tokyo";
		Estaciones [2] = "Yurakucho";
		Estaciones [3] = "Shimbashi";
		Estaciones [4] = "Hamamatsucho";
		Estaciones [5] = "Tamachi";
		Estaciones [6] = "Shinagawa";
		Estaciones [7] = "Osaki";
		Estaciones [8] = "Gotanda";
		Estaciones [9] = "Meguro";
		Estaciones [10] = "Ebisu";
		Estaciones [11] = "Shibuya";
		Estaciones [12] = "Harajuku";
		Estaciones [13] = "Yoyogi";
		Estaciones [14] = "Shinjuku";
		Estaciones [15] = "Shin_Okubo";
		Estaciones [16] = "Takadanobaba";
		Estaciones [17] = "Mejiro";
		Estaciones [18] = "Ikebukuro";
		Estaciones [19] = "Otsuka";
		Estaciones [20] = "Sugamo";
		Estaciones [21] = "Komagome";
		Estaciones [22] = "Tabata";
		Estaciones [23] = "Nishi_Nippori";
		Estaciones [24] = "Nippori";
		Estaciones [25] = "Uguisudani";
		Estaciones [26] = "Ueno";
		Estaciones [27] = "Okachimachi";
		Estaciones [28] = "Akihabara";
		Estaciones [29] = "Kanda";
		Estaciones [30] = "Ochanomizu";
		Estaciones [31] = "Suidobashi";
		Estaciones [32] = "Iidabashi";
		Estaciones [33] = "Ichigaya";
		Estaciones [34] = "Yotsuya";
		Estaciones [35] = "Shinanomachi";
		Estaciones [36] = "Sendagaya";

		
		for (i = 0; i < Estaciones.length; ++i) {
			Selector.addItem(Estaciones[i],i);
		}

		setLayout (Layout);
		Selector.setBounds(40, 200, 335, 400);
		panel.add(Selector);
		contentpane.add(Selector);
		Selector.addItemListener (this);
		Selector.select (0);
	}
	
	public void itemStateChanged(ItemEvent e) {
		int Selection;
		Selection = Selector.getSelectedIndex();
		salida.setsalida(Estaciones[Selection]);
	} 

}


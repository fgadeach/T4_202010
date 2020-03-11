package controller;

import java.io.FileReader;


import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import model.data_structures.MaxColaCP;
import model.logic.Comparendos;
import model.logic.Modelo;
import view.View;

public class Controller {

	/*
	 * 
	 */
	private MaxColaCP<Comparendos> listaComparendos;

	/* Instancia del Modelo*/
	private Modelo modelo;

	/* Instancia de la Vista*/
	private View view;

	private Comparendos comparendo;

	public static final String ruta="./data/comparendos.geojson";
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller()
	{
		listaComparendos= new MaxColaCP<Comparendos>();
		view = new View();
		modelo = new Modelo();
	}

	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		Comparable<Comparendos>[] arreglos = new Comparendos[listaComparendos.darNumElementos()];
		boolean fin = false;
		Integer dato = null;
		Object datoS = null;
		String respuesta = "";


		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){

			}
		}
	}
}	
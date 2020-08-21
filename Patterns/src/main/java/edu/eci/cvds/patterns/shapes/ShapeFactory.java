package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;
public class ShapeFactory{
	public static Triangle triangulo;
	public static Quadrilateral cuadrilatero;
	public static Pentagon pentagono;
	public static Hexagon hexagono;
	public static RegularShapeType regularShapeType;

	public ShapeFactory(){
		
	}
	public static Shape create(RegularShapeType type){
		int a =0;
		if(type==regularShapeType.Triangle){a=1;}
		if(type==regularShapeType.Quadrilateral){a=2;}
		if(type==regularShapeType.Pentagon){a=3;}
		if(type==regularShapeType.Hexagon){a=4;}  	
		
		Shape tipo;
		switch(a){
			case 1: tipo = new Triangle();
			break;
			case 2:	tipo = new Quadrilateral();
			break;
			case 3: tipo = new Pentagon();
			break;
			case 4: tipo = new Hexagon();
			break;
			default: tipo = null;
			break;	

		}
		return tipo;
      	}
}
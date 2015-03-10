package pt.upt.ia.problema;
import java.util.ArrayList;

import pt.upt.ia.pesquisa.EstadoProblema;
import pt.upt.ia.pesquisa.Ramo;


public class Grafo extends EstadoProblema {

	public static int[][] t = {	
//         1           5             10             15             20             25             30
/*  1 */ {-1,10, 8,10,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
		 {-1,-1,-1,-1, 5,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
		 { 8,-1,-1,-1,-1,-1, 5,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
		 {10,-1,-1,-1,-1,-1, 7,12,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
/*  5 */ {-1,-1,-1,-1,-1,-1,-1,-1, 6, 4,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
		 {-1,-1, 6,-1,-1,-1,-1,-1,-1,-1, 9,11,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
		 {-1,-1,-1, 7,-1,-1,-1,-1,-1,-1,-1,-1,20, 4,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
		 {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,18,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
		 {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 6,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
/* 10 */ {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 8,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
		 {-1,-1,-1,-1, 2, 9,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 4,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
		 {-1,-1,-1,-1,-1,11,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 6,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
		 {-1,-1,-1,-1,-1,-1,20,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
		 {-1,-1,-1,-1,-1,-1, 4,-1,-1,-1,-1,-1,-1,-1, 5,-1,-1,-1,12,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
/* 15 */ {-1,-1,-1,-1,-1,-1,-1,18,-1,-1,-1,-1,-1, 5,-1,-1,-1,-1,-1,15, 2,-1,-1,-1,-1,-1,-1,-1,-1,-1},
		 {-1,-1,-1,-1,-1,-1,-1,-1, 6,-1,-1,-1,-1,-1,-1,-1, 6,-1,-1,-1,-1,30,-1,-1,-1,-1,-1,-1,-1,-1},
		 {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 4,-1,-1,-1,-1, 6,-1,-1,-1,-1,-1,-1,20,-1,-1,-1,-1,-1,-1,-1},
		 {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 5, 2,-1,-1,-1,-1,-1, 2,-1,-1,-1,-1,40,-1,-1,-1,-1,-1,-1},
		 {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,12,-1,-1,-1, 2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
/* 20 */ {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,15,-1,-1,-1,-1,-1,-1,-1,-1,-1, 2,-1,-1,-1,-1,-1},
		 {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 6,-1,-1,-1,-1},
		 {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,10,-1,-1,-1},
		 {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,20,-1,-1,-1,-1,-1,-1, 2,-1,-1, 8,-1,-1,-1},
		 {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 2,-1,-1,-1, 2,-1,-1,-1,-1, 2, 5,-1},
/* 25 */ {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 4,-1,-1,20,-1},
		 {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 4,-1,-1,-1,-1, 2},
		 {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,10, 8,-1,-1,-1,-1,-1,-1,-1},
		 {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 6,-1,-1,-1,-1,-1,-1,-1},
		 {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 5,20,-1,-1,-1,-1,-1},
/* 30 */ {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 2,-1,-1,-1,-1},
		};
	
	private int numero;
	
	public Grafo( int n) {
		numero = n;
	}
	
    public double h() {
    	return 0;
    }

    public int getKey() {
    	return numero;
    }

    public int hashCode() {
    	return numero;
    }

    public boolean equals( Object o) {
    	if (o == null)
    		return false;
		if (o.getClass() != Grafo.class) // classe diferente: n�o � igual
			return false;
		if (this == o) // tem a mesma refer�ncia de mem�ria: � o mesmo objeto
			return true;
		Grafo g = (Grafo) o;
    	return numero == g.getKey();
    }
    
    public ArrayList<Ramo> suc() {
    	ArrayList<Ramo> s = new ArrayList<Ramo>();
    	for (int i=0; i< t.length; i++) {
    		if (t[numero - 1][i] >= 0) {
    			s.add( new Ramo( new Grafo( i+1), t[numero - 1][i]));
    		}
    	}
    	return s;
    }

    public boolean goal() {
    	return numero == 29;		// ESTADO FINAL
    }
    
    public static ArrayList<EstadoProblema> getIniciais() {
    	ArrayList<EstadoProblema> i = new ArrayList<EstadoProblema>();
    	i.add( new Grafo(1));		// ESTADO INICIAL
    	return i;
    }
    
    public String toString() {
    	return "" + numero+ "  ";
    }
    
    public static void main( String[] args) {
        Grafo estado = new Grafo(4);
        ArrayList<Ramo> s = estado.suc();
        System.out.println("===============");
        for (Ramo r : s) {
            System.out.println("estado "+r.getEstado()+"    custo "+r.getCusto());
        }
    }

}

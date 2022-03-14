package gt.edu.umg.progra3.parcial1.pilas;


public class NotationParser {

    private Pila pila;

    public NotationParser(Pila pila) {
        this.pila = pila;
    }

    public String posFixToInfix(String expression){
    	
    	PilaImplementar letras = new PilaImplementar();
    	PilaImplementar signos = new PilaImplementar();
    	PilaImplementar sumatoria = new PilaImplementar();
		
		int contador= 0;
		String terminar = "";
		
		for (int i = 0; i < expression.length(); i++) {
			char contenido = expression.charAt(i);
			
			
			if(contenido==' ') {} 
    		else {
    			
    			if(contenido=='*'|| contenido=='+') {
        			signos.push((String.valueOf(contenido)));

        		}else {
        			
        			letras.push((String.valueOf(contenido)));
        			letras.push("x");
        			contador++;
        			contador++;
        			
        		}
    		}
		}
    	
    	
		letras.pop();
		
		for (int i = 0; i < contador-1; i++) {
			String letra=letras.pop();
			
			if(letra=="x") {
				String signo = signos.peek();
				signos.pop();
				sumatoria.push(signo);
			}else {
				sumatoria.push(letra);
			}
			
		}
		
		
		for (int i = 0; i < contador-1; i++) {
			
			if(i==contador-2) {
				terminar = terminar + sumatoria.pop();
			}else {
			terminar = terminar + sumatoria.pop()+" ";}
			
		}
    	
        return terminar;
    }



} 

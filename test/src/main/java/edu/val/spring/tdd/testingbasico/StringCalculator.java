package edu.val.spring.tdd.testingbasico;

public class StringCalculator {
	
	
	//Clase que toma dos numeros en un array de String y devuelve su suma
	//TODO definir Casos de Prueba y Métodos de test
	
	
	public static int add(String numbers) {
		int resultado = 0;
		
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length != 2) 
        	{
            	throw new RuntimeException("Máximo de 2 numeros separados por coma");
        	} 
        else 
        	{
            for (String number : numbersArray) 
            	{
                	resultado = resultado + Integer.parseInt(number); 
                }
        }
        return resultado;
    }

}

Algoritmo calificaciones 
	Escribir "Desarrolle un algoritmo que permita convertir calificaciones numericas a letras"
	nota <- 0 
	
	Si nota >= 19 O nota <= 20 Entonces
		Escribir "Tu nota es A"
	SiNo
		Si nota >= 16 o nota <=18 Entonces
			Escribir " Tu nota es B"
		SiNo
			Si nota <= 13 o nota <= 15 Entonces
				Escribir  "Tu nota es C"
			SiNo
				Si nota >= 10 o nota <= 12 Entonces
					Escribir "Tu nota es D"
				SiNo
					Si nota >= 0 o nota <= 9 Entonces
						Escribir "Tu nota es E"
					SiNo
						Escribir "no negativos"
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo

Algoritmo Ejercicio1
	Escribir "Ingrese un numero entero"
	Leer N
	pares <- 0
	impares <- 0
	Si 0 < N Entonces
		Para i<-1 Hasta N Hacer
			ale <- Aleatorio(1,100)
			par <- ale MOD(2)
			Si par = 0 Entonces
				pares = pares + 1
			SiNo
				impares = impares + 1
			FinSi
		FinPara
	SiNo
		Escribir "No es valido"
	FinSi
	Escribir "la cantidad de pares son: ", pares, " impares son: ", impares
FinAlgoritmo

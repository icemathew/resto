#RestoApplication

#Iniciar servidor

\.gradlew bootRun


#Uso llamada GET

http://localhost:8080/resto/?x=10&y=5&n=187

#Uso llamada POST

http://localhost:8080/resto

{
	x:10,
	y:5,
	n:187
}

#Lanzar tests

\.gradlew test
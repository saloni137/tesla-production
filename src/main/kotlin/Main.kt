    import kotlinx.coroutines.*
    import kotlin.system.measureTimeMillis

    fun produceCars(noOfCars : Int) = runBlocking{
        repeat(noOfCars) {
            launch {
                println("Building body of the car !!")
                delay(5000L)

                println("Painting the car!!")
                delay(5000L)

                println("Installing the drive train!!")
                delay(10000L)

                println("Installing batteries!!")
                delay(15000L)

                println("Installing the Interior!!")
                delay(15000L)
            }
        }
    }

    fun main (args : Array<String>){
        val noOfCars = args[0].toInt()

        val timeTaken = measureTimeMillis {
            produceCars(noOfCars)
        }
        println("Time taken to Build One car is ${5+5+10+15+15} Seconds")
        println("Time taken Build $noOfCars cars is ${timeTaken/1000} Seconds")
        return
    }
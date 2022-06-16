class Song(val title: String, val artist: String){
    fun play(){
        println("Playing the song $title by $artist")
    }

    fun stop(){
        println("Stopped playing $title")
    }
}

fun main(){
    val songOne = Song("Friends", "Scooter")
    val songTwo = Song("School", "Nirvana")
    val songThree = Song("Low", "Foo Fighters")

    songTwo.play()
    songTwo.stop()
    songThree.play()
}
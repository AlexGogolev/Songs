class Song(val title: String, val artist: String, btr: Int){
    fun play(){
        println("Playing the song $title by $artist")
    }

    fun stop(){
        println("Stopped playing $title")
    }

    val btr_ = btr + 10
    lateinit var abc: String
    init {
        println("Song $title has been created")
        abc = "some text"
    }

    val btr_2: Int
        get() = btr_ / 2

    var btr_3 = btr
        get() = field
        set(value){
            if (value > 200) field = value
        }

}

fun main(){
    val songOne = Song("Friends", "Scooter", 128)
    val songTwo = Song("School", "Nirvana", 360)
    val songThree = Song("Low", "Foo Fighters", 128)

    songTwo.play()
    songTwo.stop()
    songThree.play()
    println("***************")
    println("btr_ = $songOne.btr_")
    println("before btr_3 = ${songOne.btr_3}")
    songOne.btr_3 = 210
    println("after btr_3 = ${songOne.btr_3}")


}
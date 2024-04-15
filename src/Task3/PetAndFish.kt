package Task3

    abstract class Pet {
        var runSpeed = 0.0
        var swimSpeed = 0.0

        open fun getTotalSpeed(): Double {
            return runSpeed + swimSpeed
        }
    }

    interface Runnable {
        fun run()
    }

    interface Swimmable {
        fun swim()
    }

    open class Cat : Pet(), Runnable, Swimmable {
        override fun run() {
            println("I am a Cat, and I'm running")
        }

        override fun swim() {
            println("I am a Cat, and I'm swimming")
        }
    }

    open class Fish : Pet(), Swimmable {
        override fun swim() {
            println("I am a Fish, and I'm swimming")
        }
    }

    class Tiger : Cat() {
        override fun run() {
            super.run()
            println("I am a Tiger, and I'm running")
        }

        override fun swim() {
            super.swim()
            println("I am a Tiger, and I'm swimming")
        }
    }

    class Lion : Cat() {
        override fun run() {
            super.run()
            println("I am a Lion, and I'm running")
        }

        override fun swim() {
            super.swim()
            println("I am a Lion, and I'm swimming")
        }
    }

    class Salmon : Fish() {
        override fun swim() {
            super.swim()
            println("I am a Salmon, and I'm swimming")
        }
    }

    class Tuna : Fish() {
        override fun swim() {
            super.swim()
            println("I am a Tuna, and I'm swimming")
        }
    }

    fun main() {
        val tiger = Tiger()
        tiger.runSpeed = 10.0
        tiger.swimSpeed = 5.0
        tiger.run()
        tiger.swim()
        println(tiger.getTotalSpeed()) // Выведет сумму скоростей

        val salmon = Salmon()
        salmon.swimSpeed = 12.0
        salmon.swim()
        println(salmon.getTotalSpeed()) // Выведет сумму скоростей

        val lion = Lion()
        lion.runSpeed = 10.0
        lion.swimSpeed = 5.0
        lion.run()
        lion.swim()
        println(lion.getTotalSpeed()) // Выведет сумму скоростей

        val tuna = Tuna()
        tuna.swimSpeed = 12.0
        tuna.swim()
        println(tuna.getTotalSpeed()) // Выведет сумму скоростей
    }
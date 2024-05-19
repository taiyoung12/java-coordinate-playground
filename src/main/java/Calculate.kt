import kotlin.math.abs
import kotlin.math.sqrt

class Calculate() {
    companion object {
        fun xDistance(
            x1: Int,
            x2: Int,
        ): Int {
            return abs(x1 - x2)
        }

        fun yDistance(
            y1: Int,
            y2: Int,
        ): Int {
            return abs(y1 - y2)
        }

        fun distance(
            space1: Coordinate,
            space2: Coordinate,
        ): Double {
            val distanceX = this.xDistance(space1.getX(), space2.getX())
            val distanceY = this.yDistance(space1.getY(), space2.getY())

            return sqrt((distanceX * distanceX + distanceY * distanceY).toDouble())
        }
    }
}

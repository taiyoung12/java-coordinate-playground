import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import kotlin.math.sqrt

class SpaceTest {
    private val anyX: Int = 1
    private val anyY: Int = 1

    @Test
    fun `Space 객체를 생성할 수 있다`() {
        val actual = Coordinate(anyX, anyY)

        assertDoesNotThrow { actual }
    }

    @Test
    fun `Space 객체의 x좌표를 읽을 수 있다`() {
        val actual = Coordinate(anyX, anyY)

        assertEquals(actual.getX(), anyX)
    }

    @Test
    fun `Space 객체의 y좌표를 읽을 수 있다`() {
        val actual = Coordinate(anyX, anyY)

        assertEquals(actual.getY(), anyY)
    }

    @Test
    fun `두 공간 사이 x의 거리를 계산할 수 있다`() {
        val space1 = Coordinate(0, 0)
        val space2 = Coordinate(1, 0)

        val actual = Calculate.xDistance(space1.getX(), space2.getX())

        assertEquals(actual, 1)
    }

    @Test
    fun `두 동간의 위치가 변경되져도 사이의 x거리는 동일할 수 있다`() {
        val space1 = Coordinate(1, 0)
        val space2 = Coordinate(0, 0)

        val actual = Calculate.xDistance(space1.getX(), space2.getX())

        assertEquals(actual, 1)
    }

    @Test
    fun `두 공간 사이 y의 거리를 계산할 수 있다`() {
        val space1 = Coordinate(0, 0)
        val space2 = Coordinate(0, 1)

        val actual = Calculate.yDistance(space1.getY(), space2.getY())

        assertEquals(actual, 1)
    }

    @Test
    fun `두 동간의 위치가 변경되져도 사이의 y거리는 동일할 수 있다`() {
        val space1 = Coordinate(0, 1)
        val space2 = Coordinate(0, 0)

        val actual = Calculate.yDistance(space1.getY(), space2.getY())

        assertEquals(actual, 1)
    }

    @Test
    fun `y 좌표가 0인 두 공간 사이의 거리를 계산할 수 있다`() {
        val space1 = Coordinate(2, 0)
        val space2 = Coordinate(4, 0)

        val actual = Calculate.distance(space1, space2)

        assertEquals(actual, 2.0)
    }

    @Test
    fun `x좌표가 0인 두 공간 사이의 거리를 계산할 수 있다`() {
        val space1 = Coordinate(0, 1)
        val space2 = Coordinate(0, 4)

        val actual = Calculate.distance(space1, space2)

        assertEquals(actual, 3.0)
    }

    @Test
    fun `x, y 좌표가 모두 정수인 공간 사이의 거리를 계산할 수 있다`() {
        val space1 = Coordinate(3, 1)
        val space2 = Coordinate(5, 10)

        val actual = Calculate.distance(space1, space2)

        assertEquals(actual, sqrt(85.0))
    }

    @Test
    fun `음수 값을 포함한 공간 사이의 거리를 계산할 수 있다`() {
        val space1 = Coordinate(-1, 1)
        val space2 = Coordinate(5, 10)

        val actual = Calculate.distance(space1, space2)

        assertEquals(actual, sqrt(117.0))
    }
}

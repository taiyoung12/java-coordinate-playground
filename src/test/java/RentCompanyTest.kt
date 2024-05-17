import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.junit.jupiter.api.Test

class RentCompanyTest {
    private val NEW_LINE = System.getProperty("line.separator")

    @Test
    fun report() {
        val company = RentCompany.create()
        company.addCar(Sonata(150))
        company.addCar(K5(260))
        company.addCar(Sonata(120))
        company.addCar(Avante(300))
        company.addCar(K5(390))

        val report = company.generateReport()
        assertThat(report).isEqualTo(
            "Sonata : 15리터$NEW_LINE" +
                "K5 : 20리터$NEW_LINE" +
                "Sonata : 12리터$NEW_LINE" +
                "Avante : 20리터$NEW_LINE" +
                "K5 : 30리터$NEW_LINE",
        )
    }
}

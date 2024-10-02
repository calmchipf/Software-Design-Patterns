package builder;

public class UsageBuilder {
    public static void start() {
        Driver driver = new Driver.DriverBuilder()
                .withName("Johny Silverhand")
                .withCarModel("Porshe 911")
                .withLicenseNumber("XYZ12345")
                .withExperienceYears(5)
                .isAvailable(true)
                .build();

        System.out.println(driver);
    }
}

package Appointments;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppointmentsTest {
    private ArrayList<Appointments> appointmentsList;

    @BeforeEach
    void setUp() {
        appointmentsList = new ArrayList<>();
        Appointments.appointments = new ArrayList<>(); // reset the appointments list before each test because it's static, just go with it
    }

    @Test
    void testAddAppointment() {
        Appointments appointment = new Appointments("2024-04-09", "10:00", "library");
        Appointments.add(appointment);
        assertEquals(1, Appointments.appointments.size());
    }

    @Test
    void testDeleteAppointment() {
        Appointments appointment = new Appointments("2024-04-09", "10:00", "library");
        Appointments.add(appointment);
        Appointments.delete(appointment);
        assertEquals(0, Appointments.appointments.size());
    }

    @Test
    void testListApps() {
        Appointments appointment1 = new Appointments("2024-04-09", "10:00", "library");
        Appointments appointment2 = new Appointments("2024-04-10", "14:00", "counselling");
        Appointments.add(appointment1);
        Appointments.add(appointment2);
        String expectedList = "library 2024-04-09\n" + "counselling 2024-04-10\n";
        assertEquals(expectedList, appointment1.listApps());
    }

    @Test
    void testAmount() {
        Appointments appointment1 = new Appointments("2024-04-09", "10:00", "library");
        Appointments appointment2 = new Appointments("2024-04-10", "14:00", "counselling");
        Appointments.add(appointment1);
        Appointments.add(appointment2);
        assertEquals(2, appointment1.amount());
    }
}


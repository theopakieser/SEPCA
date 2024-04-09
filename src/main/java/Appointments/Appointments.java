package Appointments;
import java.util.ArrayList;

public class Appointments {
    public static ArrayList<Appointments> appointments= new ArrayList<>();

    private String date, appointmentType,  time;

    public Appointments(String  date, String  time, String appointmentType) {
        this.date = date;
        this.time = time;
        this.appointmentType = appointmentType;

    }

    public String  getDate() {
        return date;
    }

    public void setDate(String  date) {
        this.date = date;
    }

    public String  getTime() {
        return time;
    }

    public void setTime(String  time) {
        this.time = time;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(String appointmentType) {
        if(appointmentType.equalsIgnoreCase("library") || appointmentType.equalsIgnoreCase("counselling") || appointmentType.equals("maths and learning centre"));
        this.appointmentType = appointmentType;
    }

    public static void add(Appointments appointment){
        appointments.add(appointment);
    }

    public static void delete(Appointments appointment) {
        if (appointments.contains(appointment)) {
            appointments.remove(appointment);
        } else {
            System.out.println("Appointment not found.");
        }
    }


    public String listApps(){
        StringBuilder list = new StringBuilder();
        for(Appointments appointments:appointments){
            list.append(appointments.getAppointmentType()).append(" ").append(appointments.getDate()).append("\n");
        }
        return list.toString();
    }


    public int amount(){
        return appointments.size();
    }


    @Override
    public String toString() {
        return "Appointments{" +
                ", date=" + date +
                ", time=" + time +
                ", appointmentType='" + appointmentType + '\'' +
                '}';
    }


}

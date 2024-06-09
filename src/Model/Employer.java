package Model;

import java.text.MessageFormat;

public class Employer extends Person{

    private String file;
    private String workstation;
    private String status;

    public Employer(String name, String surname, Integer age,
                    Integer numberIdentify, String file, String workstation,
                    String status) {
        super(name, surname, age, numberIdentify);
        setFile(file);
        setWorkstation(workstation);
        setStatus(status);
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getWorkstation() {
        return workstation;
    }

    public void setWorkstation(String workstation) {
        this.workstation = workstation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString().concat(MessageFormat.format("Employer'{'file=''{0}'', workstation=''{1}'', status=''{2}'''}'", getFile(), getWorkstation(), getStatus()));
    }
}

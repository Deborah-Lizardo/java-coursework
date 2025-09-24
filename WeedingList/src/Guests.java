public class Guests {

    private String name;
    private Integer age;
    private String invitationStatus;  // Propriedade para o status do convite

    public Guests(String name, Integer age, String invitationStatus) {
        this.name = name;
        this.age = age;
        this.invitationStatus = invitationStatus;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getInvitationStatus() {
        return this.invitationStatus;
    }
    public void setInvitationStatus(String invitationStatus) {
        this.invitationStatus = invitationStatus;
    }
}

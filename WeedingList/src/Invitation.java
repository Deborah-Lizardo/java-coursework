public class Invitation {
    private String invitationStatus;
    private String sentDate;
    private String confirmDate;

    public Invitation(String invitationStatus, String sentDate, String confirmDate) {
        this.invitationStatus = invitationStatus;
        this.sentDate = sentDate;
        this.confirmDate = confirmDate;
    }

    public String getInvitationStatus() {
        return invitationStatus;
    }
    public void setInvitationStatus(String invitationStatus) {
        this.invitationStatus = invitationStatus;
    }

    public String getSentDate() {
        return sentDate;
    }
    public void setSentDate(String sentDate) {
        this.sentDate = sentDate;
    }

    public String getConfirmDate() {
        return confirmDate;
    }
    public void setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate;
    }
}

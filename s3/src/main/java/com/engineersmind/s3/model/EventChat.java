package com.engineersmind.s3.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.sql.Timestamp;

@Entity
@Table(name = "EventChat", schema = "dbo")
public class EventChat {

    @Id
    @Column(columnDefinition = "INT")
    private Integer EventChatID;

    @Column(columnDefinition = "INT")
    private Integer EventID;

    @Column(columnDefinition = "INT")
    private Integer CompanyID;

    @Column(columnDefinition = "INT")
    private Integer ContactID;

    @Column(columnDefinition = "NVARCHAR(MAX)")
    private String Message;

    @Column(columnDefinition = "DATETIME2")
    private Timestamp DateCreated_UTC;

    @Column(columnDefinition = "DATETIME2")
    private Timestamp LastDateUpdated_UTC;

    @Column(columnDefinition = "BIT")
    private Boolean IsDeleted;

	public Integer getEventChatID() {
		return EventChatID;
	}

	public void setEventChatID(Integer eventChatID) {
		EventChatID = eventChatID;
	}

	public Integer getEventID() {
		return EventID;
	}

	public void setEventID(Integer eventID) {
		EventID = eventID;
	}

	public Integer getCompanyID() {
		return CompanyID;
	}

	public void setCompanyID(Integer companyID) {
		CompanyID = companyID;
	}

	public Integer getContactID() {
		return ContactID;
	}

	public void setContactID(Integer contactID) {
		ContactID = contactID;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public Timestamp getDateCreated_UTC() {
		return DateCreated_UTC;
	}

	public void setDateCreated_UTC(Timestamp dateCreated_UTC) {
		DateCreated_UTC = dateCreated_UTC;
	}

	public Timestamp getLastDateUpdated_UTC() {
		return LastDateUpdated_UTC;
	}

	public void setLastDateUpdated_UTC(Timestamp lastDateUpdated_UTC) {
		LastDateUpdated_UTC = lastDateUpdated_UTC;
	}

	public Boolean getIsDeleted() {
		return IsDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		IsDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "EventChat [EventChatID=" + EventChatID + ", EventID=" + EventID + ", CompanyID=" + CompanyID
				+ ", ContactID=" + ContactID + ", Message=" + Message + ", DateCreated_UTC=" + DateCreated_UTC
				+ ", LastDateUpdated_UTC=" + LastDateUpdated_UTC + ", IsDeleted=" + IsDeleted + "]";
	}
    
    
    
  

}

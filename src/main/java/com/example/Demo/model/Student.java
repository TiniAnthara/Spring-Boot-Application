package com.example.Demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    private long id;
    private String firstName;
    private String lastName; 
    private String emailId;
    private String degree;
    private String mode;
    private String date;
    private String course;

    public  Student() {
  
    }
 
    
    public Student(long id, String firstName, String lastName, String emailId, String degree, String mode, String date,
			String course) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.degree = degree;
		this.mode = mode;
		this.date = date;
		this.course = course;
	}



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long getId() {
        return id;
	    }
	    public void setId(long id) {
	        this.id = id;
	    }
 
    @Column(name = "first_name", nullable = false)
	    public String getFirstName() {
	        return firstName;
	    }
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    
    @Column(name = "mode", nullable = false)
    public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    @Column(name = "email_address", nullable = false)
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

	
    @Column(name = "degree", nullable = false)
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree= degree;
    }
    @Column(name = "date", nullable = false)

    public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
    @Column(name = "course", nullable = false)

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
    public String toString() {
        return " Student[id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId +" degree=" + degree + " mode=" + mode + " date=" + date + "  course=" + course + "]";
    }
 
}

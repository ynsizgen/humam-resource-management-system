package project.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import antlr.collections.List;
import lombok.Data;
import project.hrms.entities.abstracts.Entities;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public abstract class User implements Entities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id",nullable = false, updatable = false)
	private int id;
	
	@Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "password",length = 25, nullable = false)
    private String password;

    @Column(name = "is_verified", nullable = false)
    private boolean isVerified;
   
    
	
}

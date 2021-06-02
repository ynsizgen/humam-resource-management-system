package project.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "cv_abilities")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cv"})
public class CvAbility {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_ability_id")
	private int cvAbilityId;
	
	@Column(name = "cv_ability_name")
	private String cvAbilityName;
	
	
	
	
	
//	@OneToMany(mappedBy="cvAbility",fetch = FetchType.LAZY)
//	private List<Cv> cvs;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "cv_id")
//	private Cv cv;
}

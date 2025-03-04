package uk.ac.belfastmet.mla.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Member {
	@JsonProperty("PersonId")
	private String personId;
	@JsonProperty("AffiliationId")
	private String affiliationId;
	@JsonProperty("MemberName")
	private String memberName;
	@JsonProperty("MemberLastName")
	private String memberLastName;
	@JsonProperty("MemberFirstName")
	private String memberFirstName;
	@JsonProperty("MemberFullDisplayName")
	private String memberFullDisplayName;
	@JsonProperty("MemberSortName")
	private String memberSortName;
	@JsonProperty("MemberTitle")
	private String memberTitle;
	@JsonProperty("PartyName")
	private String partyName;
	@JsonProperty("PartyOrganisationId")
	private String partyOrganisationId;
	@JsonProperty("ConstituencyName")
	private String constituencyName;
	@JsonProperty("ConstituencyId")
	private String constituencyId;
	@JsonProperty("MemberImgUrl")
	private String memberImgUrl;
	@JsonProperty("MemberPrefix")
	private String memberPrefix;
	@Override
	public String toString() {
		return "Member [personId=" + personId + ", affiliationId=" + affiliationId + ", memberName=" + memberName
				+ ", memberLastName=" + memberLastName + ", memberFirstName=" + memberFirstName
				+ ", memberFullDisplayName=" + memberFullDisplayName + ", memberSortName=" + memberSortName
				+ ", memberTitle=" + memberTitle + ", partyName=" + partyName + ", partyOrganisationId="
				+ partyOrganisationId + ", constituencyName=" + constituencyName + ", constituencyId=" + constituencyId
				+ ", memberImgUrl=" + memberImgUrl + ", memberPrefix=" + memberPrefix + "]";
	}
	
	

}
